package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes8.dex */
public final class ParameterNameRenderingPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f409452b;

    /* renamed from: c, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f409453c;

    /* renamed from: d, reason: collision with root package name */
    public static final ParameterNameRenderingPolicy f409454d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ParameterNameRenderingPolicy[] f409455e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409456f;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        f409452b = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        f409453c = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy("NONE", 2);
        f409454d = parameterNameRenderingPolicy3;
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArr = {parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
        f409455e = parameterNameRenderingPolicyArr;
        f409456f = kotlin.enums.c.a(parameterNameRenderingPolicyArr);
    }

    public ParameterNameRenderingPolicy() {
        throw null;
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) f409455e.clone();
    }
}
