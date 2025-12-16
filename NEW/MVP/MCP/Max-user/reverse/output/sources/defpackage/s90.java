package defpackage;

import android.hardware.camera2.CaptureRequest;

/* loaded from: classes.dex */
public final class s90 {
    public final String a;
    public final Class b;
    public final Object c;

    public s90(String str, Class cls, CaptureRequest.Key key) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s90) {
            s90 s90Var = (s90) obj;
            String str = s90Var.a;
            Object obj3 = s90Var.c;
            if (this.a.equals(str) && this.b.equals(s90Var.b) && ((obj2 = this.c) != null ? obj2.equals(obj3) : obj3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
