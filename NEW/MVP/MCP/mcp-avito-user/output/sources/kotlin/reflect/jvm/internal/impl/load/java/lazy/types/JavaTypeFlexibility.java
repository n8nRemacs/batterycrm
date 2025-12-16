package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JavaTypeFlexibility.kt */
/* loaded from: classes8.dex */
public final class JavaTypeFlexibility {

    /* renamed from: b, reason: collision with root package name */
    public static final JavaTypeFlexibility f408266b;

    /* renamed from: c, reason: collision with root package name */
    public static final JavaTypeFlexibility f408267c;

    /* renamed from: d, reason: collision with root package name */
    public static final JavaTypeFlexibility f408268d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ JavaTypeFlexibility[] f408269e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f408270f;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        f408266b = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        f408267c = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        f408268d = javaTypeFlexibility3;
        JavaTypeFlexibility[] javaTypeFlexibilityArr = {javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
        f408269e = javaTypeFlexibilityArr;
        f408270f = kotlin.enums.c.a(javaTypeFlexibilityArr);
    }

    public JavaTypeFlexibility() {
        throw null;
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) f408269e.clone();
    }
}
