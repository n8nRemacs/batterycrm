package kotlin.reflect.jvm.internal.impl.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeUsage.kt */
/* loaded from: classes8.dex */
public final class TypeUsage {

    /* renamed from: b, reason: collision with root package name */
    public static final TypeUsage f410065b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeUsage f410066c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TypeUsage[] f410067d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410068e;

    static {
        TypeUsage typeUsage = new TypeUsage("SUPERTYPE", 0);
        f410065b = typeUsage;
        TypeUsage typeUsage2 = new TypeUsage("COMMON", 1);
        f410066c = typeUsage2;
        TypeUsage[] typeUsageArr = {typeUsage, typeUsage2};
        f410067d = typeUsageArr;
        f410068e = kotlin.enums.c.a(typeUsageArr);
    }

    public TypeUsage() {
        throw null;
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f410067d.clone();
    }
}
