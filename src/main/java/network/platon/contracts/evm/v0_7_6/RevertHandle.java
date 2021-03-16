package network.platon.contracts.evm.v0_7_6;

import com.platon.abi.solidity.TypeReference;
import com.platon.abi.solidity.datatypes.Function;
import com.platon.abi.solidity.datatypes.Type;
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
public class RevertHandle extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50610158806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c8063852da1631461003b578063f76051e714610069575b600080fd5b6100676004803603602081101561005157600080fd5b8101908080359060200190929190505050610097565b005b6100956004803603602081101561007f57600080fd5b8101908080359060200190929190505050610111565b005b600a81111561010e576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260158152602001807f636865636b20636174636820657863657074696f6e000000000000000000000081525060200191505060405180910390fd5b50565b600a81111561011f57600080fd5b5056fea2646970667358221220001ae54dbe3e0ebefbe6d341f10aa3abdd9cbbf7cd17ee16dfbf8cb4071f6e5c64736f6c63430007060033";

    public static final String FUNC_REVERTCHECK = "revertCheck";

    public static final String FUNC_REVERTREASONCHECK = "revertReasonCheck";

    protected RevertHandle(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected RevertHandle(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> revertCheck(BigInteger param) {
        final Function function = new Function(
                FUNC_REVERTCHECK, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> revertReasonCheck(BigInteger param) {
        final Function function = new Function(
                FUNC_REVERTREASONCHECK, 
                Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(param)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<RevertHandle> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return deployRemoteCall(RevertHandle.class, web3j, credentials, contractGasProvider, BINARY,  "");
    }

    public static RemoteCall<RevertHandle> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return deployRemoteCall(RevertHandle.class, web3j, transactionManager, contractGasProvider, BINARY,  "");
    }

    public static RevertHandle load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new RevertHandle(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static RevertHandle load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new RevertHandle(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
