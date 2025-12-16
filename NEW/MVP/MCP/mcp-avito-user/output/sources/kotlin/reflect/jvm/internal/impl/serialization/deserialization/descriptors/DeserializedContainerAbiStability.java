package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeserializedContainerSource.kt */
/* loaded from: classes8.dex */
public final class DeserializedContainerAbiStability {

    /* renamed from: b, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f409788b;

    /* renamed from: c, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f409789c;

    /* renamed from: d, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f409790d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DeserializedContainerAbiStability[] f409791e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f409792f;

    static {
        DeserializedContainerAbiStability deserializedContainerAbiStability = new DeserializedContainerAbiStability("STABLE", 0);
        f409788b = deserializedContainerAbiStability;
        DeserializedContainerAbiStability deserializedContainerAbiStability2 = new DeserializedContainerAbiStability("FIR_UNSTABLE", 1);
        f409789c = deserializedContainerAbiStability2;
        DeserializedContainerAbiStability deserializedContainerAbiStability3 = new DeserializedContainerAbiStability("IR_UNSTABLE", 2);
        f409790d = deserializedContainerAbiStability3;
        DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArr = {deserializedContainerAbiStability, deserializedContainerAbiStability2, deserializedContainerAbiStability3};
        f409791e = deserializedContainerAbiStabilityArr;
        f409792f = kotlin.enums.c.a(deserializedContainerAbiStabilityArr);
    }

    public DeserializedContainerAbiStability() {
        throw null;
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f409791e.clone();
    }
}
