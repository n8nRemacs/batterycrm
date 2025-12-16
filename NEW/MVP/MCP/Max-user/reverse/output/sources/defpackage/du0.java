package defpackage;

/* loaded from: classes2.dex */
public final class du0 {
    public final int a;

    public static final boolean a(int i) {
        return (i & 67108864) != 0;
    }

    public static String b(int i) {
        return "BubbleType(" + ((268435456 & i) != 0 ? "First" : (536870912 & i) != 0 ? "Middle" : (1073741824 & i) != 0 ? "Last" : (134217728 & i) != 0 ? "Single" : "unknown!") + " " + (a(i) ? (char) 8595 : (char) 8593) + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof du0) {
            return this.a == ((du0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
