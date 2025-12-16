package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClassKind.kt */
/* loaded from: classes8.dex */
public final class ClassKind {

    /* renamed from: b, reason: collision with root package name */
    public static final ClassKind f407413b;

    /* renamed from: c, reason: collision with root package name */
    public static final ClassKind f407414c;

    /* renamed from: d, reason: collision with root package name */
    public static final ClassKind f407415d;

    /* renamed from: e, reason: collision with root package name */
    public static final ClassKind f407416e;

    /* renamed from: f, reason: collision with root package name */
    public static final ClassKind f407417f;

    /* renamed from: g, reason: collision with root package name */
    public static final ClassKind f407418g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ClassKind[] f407419h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407420i;

    static {
        ClassKind classKind = new ClassKind("CLASS", 0);
        f407413b = classKind;
        ClassKind classKind2 = new ClassKind("INTERFACE", 1);
        f407414c = classKind2;
        ClassKind classKind3 = new ClassKind("ENUM_CLASS", 2);
        f407415d = classKind3;
        ClassKind classKind4 = new ClassKind("ENUM_ENTRY", 3);
        f407416e = classKind4;
        ClassKind classKind5 = new ClassKind("ANNOTATION_CLASS", 4);
        f407417f = classKind5;
        ClassKind classKind6 = new ClassKind("OBJECT", 5);
        f407418g = classKind6;
        ClassKind[] classKindArr = {classKind, classKind2, classKind3, classKind4, classKind5, classKind6};
        f407419h = classKindArr;
        f407420i = kotlin.enums.c.a(classKindArr);
    }

    public ClassKind() {
        throw null;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) f407419h.clone();
    }

    public final boolean a() {
        return this == f407418g || this == f407416e;
    }
}
