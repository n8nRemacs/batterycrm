package defpackage;

/* loaded from: classes.dex */
public final class bcj {
    public final String a;
    public final int b;

    public bcj(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcj)) {
            return false;
        }
        bcj bcjVar = (bcj) obj;
        return this.a.equals(bcjVar.a) && this.b == bcjVar.b;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.a);
        sb.append(", enableFirelog=true, firelogEventType=");
        return ho7.j(sb, this.b, "}");
    }
}
