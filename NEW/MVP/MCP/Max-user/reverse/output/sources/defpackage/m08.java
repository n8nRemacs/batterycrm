package defpackage;

import org.webrtc.NativeDoubleArrayConsumer;

/* loaded from: classes2.dex */
public final class m08 {
    public final boolean a;
    public final String b;
    public final NativeDoubleArrayConsumer.Consumer c;

    public m08(boolean z, String str, NativeDoubleArrayConsumer.Consumer consumer) {
        this.a = z;
        this.b = str;
        this.c = consumer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m08)) {
            return false;
        }
        m08 m08Var = (m08) obj;
        return this.a == m08Var.a && fni.a(this.b, m08Var.b) && fni.a(this.c, m08Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "KeywordSpotterParams(isEnabled=" + this.a + ", filePath=" + this.b + ", consumer=" + this.c + ")";
    }
}
