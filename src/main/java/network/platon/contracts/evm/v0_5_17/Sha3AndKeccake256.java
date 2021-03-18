package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.abi.solidity.datatypes.generated.Uint256;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.protocol.core.methods.response.TransactionReceipt;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class Sha3AndKeccake256 extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610223806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063598a717b1461003b5780638f9e1a5d14610059575b600080fd5b610043610114565b6040518082815260200191505060405180910390f35b6101126004803603602081101561006f57600080fd5b810190808035906020019064010000000081111561008c57600080fd5b82018360208201111561009e57600080fd5b803590602001918460018302840111640100000000831117156100c057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050919291929050505061011d565b005b60008054905090565b80816040516020018083805190602001908083835b602083106101555780518252602082019150602081019050602083039250610132565b6001836020036101000a03801982511681845116808217855250505050505090500182805190602001908083835b602083106101a65780518252602082019150602081019050602083039250610183565b6001836020036101000a038019825116818451168082178552505050505050905001925050506040516020818303038152906040528051906020012060001c6000819055505056fea265627a7a72315820245e1aa8c0f9415377dd8e6531b4862a2149312ba906a06e8be97d70dcf33d5164736f6c63430005110032";

    public static final String FUNC_GETKECCAK256VALUE = "getKeccak256Value";

    public static final String FUNC_KECCAK = "keccak";

    protected Sha3AndKeccake256(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Sha3AndKeccake256(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<BigInteger> getKeccak256Value() {
        final Function function = new Function(FUNC_GETKECCAK256VALUE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> keccak(String sha256value) {
        final Function function = new Function(
                FUNC_KECCAK, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.Utf8String(sha256value)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Sha3AndKeccake256> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(Sha3AndKeccake256.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<Sha3AndKeccake256> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(Sha3AndKeccake256.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static Sha3AndKeccake256 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Sha3AndKeccake256(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Sha3AndKeccake256 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Sha3AndKeccake256(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
