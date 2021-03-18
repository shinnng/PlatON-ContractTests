package network.platon.contracts.evm.v0_5_17;

import com.platon.abi.solidity.FunctionEncoder;
import com.platon.abi.solidity.datatypes.Type;
import com.platon.crypto.Credentials;
import com.platon.protocol.Web3j;
import com.platon.protocol.core.RemoteCall;
import com.platon.tx.Contract;
import com.platon.tx.TransactionManager;
import com.platon.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.platon.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.15.1.7.
 */
public class InheritContractBase extends Contract {
    private static final String BINARY = "608060405260008055348015601357600080fd5b506040516097380380609783398181016040526020811015603357600080fd5b81019080805190602001909291905050508060008190555050603e8060596000396000f3fe6080604052600080fdfea265627a7a723158206d6cc8f148a72d65e7fa409bffb04ef51c9aff11856ce0defc2a0ad28e70cd3664736f6c63430005110032";

    protected InheritContractBase(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected InheritContractBase(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<InheritContractBase> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger x) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x)));
        return deployRemoteCall(InheritContractBase.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<InheritContractBase> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger x) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new com.platon.abi.solidity.datatypes.generated.Uint256(x)));
        return deployRemoteCall(InheritContractBase.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    public static InheritContractBase load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new InheritContractBase(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static InheritContractBase load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new InheritContractBase(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
