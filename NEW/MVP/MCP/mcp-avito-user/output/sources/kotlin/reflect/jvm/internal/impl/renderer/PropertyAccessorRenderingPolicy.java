package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes8.dex */
public final class PropertyAccessorRenderingPolicy {

    /* renamed from: b, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f409457b;

    /* renamed from: c, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f409458c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] f409459d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409460e;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        f409457b = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy("NONE", 2);
        f409458c = propertyAccessorRenderingPolicy3;
        PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArr = {propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
        f409459d = propertyAccessorRenderingPolicyArr;
        f409460e = kotlin.enums.c.a(propertyAccessorRenderingPolicyArr);
    }

    public PropertyAccessorRenderingPolicy() {
        throw null;
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f409459d.clone();
    }
}
