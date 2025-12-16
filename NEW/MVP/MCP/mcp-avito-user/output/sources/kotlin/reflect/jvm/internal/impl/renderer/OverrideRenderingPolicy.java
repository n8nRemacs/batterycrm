package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes8.dex */
public final class OverrideRenderingPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final OverrideRenderingPolicy f409448b;

    /* renamed from: c, reason: collision with root package name */
    public static final OverrideRenderingPolicy f409449c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ OverrideRenderingPolicy[] f409450d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409451e;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        f409448b = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        f409449c = overrideRenderingPolicy2;
        OverrideRenderingPolicy[] overrideRenderingPolicyArr = {overrideRenderingPolicy, overrideRenderingPolicy2, new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2)};
        f409450d = overrideRenderingPolicyArr;
        f409451e = kotlin.enums.c.a(overrideRenderingPolicyArr);
    }

    public OverrideRenderingPolicy() {
        throw null;
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f409450d.clone();
    }
}
