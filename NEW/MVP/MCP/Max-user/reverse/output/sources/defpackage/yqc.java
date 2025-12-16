package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class yqc {
    public final String a;
    public final Rect b;

    public yqc(String str, Rect rect) {
        this.a = str;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqc)) {
            return false;
        }
        yqc yqcVar = (yqc) obj;
        return fni.a(this.a, yqcVar.a) && fni.a(this.b, yqcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QrCode(text=" + (wqi.a() ? this.a : "****") + ", boundingRect=" + this.b + ")";
    }
}
