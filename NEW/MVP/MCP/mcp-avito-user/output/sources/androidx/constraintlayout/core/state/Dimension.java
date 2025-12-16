package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class Dimension {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f43370b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f43371c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Object f43372a = f43371c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f43373b = {new Type("FIXED", 0), new Type("WRAP", 1), new Type("MATCH_PARENT", 2), new Type("MATCH_CONSTRAINT", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f43373b.clone();
        }
    }
}
