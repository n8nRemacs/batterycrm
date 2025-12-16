package kotlin.reflect.jvm.internal.impl.resolve;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* loaded from: classes8.dex */
public interface ExternalOverridabilityCondition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Contract {

        /* renamed from: b, reason: collision with root package name */
        public static final Contract f409551b;

        /* renamed from: c, reason: collision with root package name */
        public static final Contract f409552c;

        /* renamed from: d, reason: collision with root package name */
        public static final Contract f409553d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Contract[] f409554e;

        static {
            Contract contract = new Contract("CONFLICTS_ONLY", 0);
            f409551b = contract;
            Contract contract2 = new Contract("SUCCESS_ONLY", 1);
            f409552c = contract2;
            Contract contract3 = new Contract("BOTH", 2);
            f409553d = contract3;
            f409554e = new Contract[]{contract, contract2, contract3};
        }

        public Contract() {
            throw null;
        }

        public static Contract valueOf(String str) {
            return (Contract) Enum.valueOf(Contract.class, str);
        }

        public static Contract[] values() {
            return (Contract[]) f409554e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {

        /* renamed from: b, reason: collision with root package name */
        public static final Result f409555b;

        /* renamed from: c, reason: collision with root package name */
        public static final Result f409556c;

        /* renamed from: d, reason: collision with root package name */
        public static final Result f409557d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Result[] f409558e;

        static {
            Result result = new Result("OVERRIDABLE", 0);
            f409555b = result;
            Result result2 = new Result("CONFLICT", 1);
            Result result3 = new Result("INCOMPATIBLE", 2);
            f409556c = result3;
            Result result4 = new Result(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
            f409557d = result4;
            f409558e = new Result[]{result, result2, result3, result4};
        }

        public Result() {
            throw null;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f409558e.clone();
        }
    }

    @Y61.k
    Contract a();

    @Y61.k
    Result b(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2, @Y61.l InterfaceC42851d interfaceC42851d);
}
