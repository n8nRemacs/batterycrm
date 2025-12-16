package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AnnotatedCallableKind {

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotatedCallableKind f409716b;

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotatedCallableKind f409717c;

    /* renamed from: d, reason: collision with root package name */
    public static final AnnotatedCallableKind f409718d;

    /* renamed from: e, reason: collision with root package name */
    public static final AnnotatedCallableKind f409719e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AnnotatedCallableKind[] f409720f;

    static {
        AnnotatedCallableKind annotatedCallableKind = new AnnotatedCallableKind("FUNCTION", 0);
        f409716b = annotatedCallableKind;
        AnnotatedCallableKind annotatedCallableKind2 = new AnnotatedCallableKind("PROPERTY", 1);
        f409717c = annotatedCallableKind2;
        AnnotatedCallableKind annotatedCallableKind3 = new AnnotatedCallableKind("PROPERTY_GETTER", 2);
        f409718d = annotatedCallableKind3;
        AnnotatedCallableKind annotatedCallableKind4 = new AnnotatedCallableKind("PROPERTY_SETTER", 3);
        f409719e = annotatedCallableKind4;
        f409720f = new AnnotatedCallableKind[]{annotatedCallableKind, annotatedCallableKind2, annotatedCallableKind3, annotatedCallableKind4};
    }

    public AnnotatedCallableKind() {
        throw null;
    }

    public static AnnotatedCallableKind valueOf(String str) {
        return (AnnotatedCallableKind) Enum.valueOf(AnnotatedCallableKind.class, str);
    }

    public static AnnotatedCallableKind[] values() {
        return (AnnotatedCallableKind[]) f409720f.clone();
    }
}
