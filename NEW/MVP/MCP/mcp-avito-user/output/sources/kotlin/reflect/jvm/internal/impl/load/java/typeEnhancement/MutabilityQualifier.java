package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* loaded from: classes8.dex */
public final class MutabilityQualifier {

    /* renamed from: b, reason: collision with root package name */
    public static final MutabilityQualifier f408307b;

    /* renamed from: c, reason: collision with root package name */
    public static final MutabilityQualifier f408308c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ MutabilityQualifier[] f408309d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f408310e;

    static {
        MutabilityQualifier mutabilityQualifier = new MutabilityQualifier("READ_ONLY", 0);
        f408307b = mutabilityQualifier;
        MutabilityQualifier mutabilityQualifier2 = new MutabilityQualifier("MUTABLE", 1);
        f408308c = mutabilityQualifier2;
        MutabilityQualifier[] mutabilityQualifierArr = {mutabilityQualifier, mutabilityQualifier2};
        f408309d = mutabilityQualifierArr;
        f408310e = kotlin.enums.c.a(mutabilityQualifierArr);
    }

    public MutabilityQualifier() {
        throw null;
    }

    public static MutabilityQualifier valueOf(String str) {
        return (MutabilityQualifier) Enum.valueOf(MutabilityQualifier.class, str);
    }

    public static MutabilityQualifier[] values() {
        return (MutabilityQualifier[]) f408309d.clone();
    }
}
