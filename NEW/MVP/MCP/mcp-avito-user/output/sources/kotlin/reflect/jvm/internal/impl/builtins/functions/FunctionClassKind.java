package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes8.dex */
public final class FunctionClassKind {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f407197b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ FunctionClassKind[] f407198c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407199d;

    /* compiled from: FunctionClassKind.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        FunctionClassKind[] functionClassKindArr = {new FunctionClassKind("Function", 0), new FunctionClassKind("SuspendFunction", 1), new FunctionClassKind("KFunction", 2), new FunctionClassKind("KSuspendFunction", 3), new FunctionClassKind(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4)};
        f407198c = functionClassKindArr;
        f407199d = kotlin.enums.c.a(functionClassKindArr);
        f407197b = new a(null);
    }

    public FunctionClassKind() {
        throw null;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) f407198c.clone();
    }
}
