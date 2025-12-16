package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* loaded from: classes8.dex */
public final class NullabilityQualifier {

    /* renamed from: b, reason: collision with root package name */
    public static final NullabilityQualifier f408311b;

    /* renamed from: c, reason: collision with root package name */
    public static final NullabilityQualifier f408312c;

    /* renamed from: d, reason: collision with root package name */
    public static final NullabilityQualifier f408313d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ NullabilityQualifier[] f408314e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f408315f;

    static {
        NullabilityQualifier nullabilityQualifier = new NullabilityQualifier("FORCE_FLEXIBILITY", 0);
        f408311b = nullabilityQualifier;
        NullabilityQualifier nullabilityQualifier2 = new NullabilityQualifier("NULLABLE", 1);
        f408312c = nullabilityQualifier2;
        NullabilityQualifier nullabilityQualifier3 = new NullabilityQualifier("NOT_NULL", 2);
        f408313d = nullabilityQualifier3;
        NullabilityQualifier[] nullabilityQualifierArr = {nullabilityQualifier, nullabilityQualifier2, nullabilityQualifier3};
        f408314e = nullabilityQualifierArr;
        f408315f = kotlin.enums.c.a(nullabilityQualifierArr);
    }

    public NullabilityQualifier() {
        throw null;
    }

    public static NullabilityQualifier valueOf(String str) {
        return (NullabilityQualifier) Enum.valueOf(NullabilityQualifier.class, str);
    }

    public static NullabilityQualifier[] values() {
        return (NullabilityQualifier[]) f408314e.clone();
    }
}
