package defpackage;

/* loaded from: classes2.dex */
public final class sse implements Comparable {
    public final String a;
    public final int b;
    public static final sse c = new sse("FATAL", 9000);
    public static final sse d = new sse("ERROR", 6000);
    public static final sse o = new sse("WARNING", 5000);
    public static final sse X = new sse("NOTICE", q0f.CLOSE_SOCKET_CODE_TIMEOUT);
    public static final sse Y = new sse("INFO", 3000);
    public static final sse Z = new sse("DEBUG", 2000);

    public sse(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return fni.b(this.b, ((sse) obj).b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
