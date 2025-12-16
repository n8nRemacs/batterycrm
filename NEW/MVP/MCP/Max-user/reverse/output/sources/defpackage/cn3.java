package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class cn3 implements g2h {
    public final List a;
    public final long b;
    public final long c;
    public final long d;
    public final int g;
    public final int h;
    public final Uri e = Uri.EMPTY;
    public final String f = "video/mp4";
    public final int i = 2;

    public cn3(long j, List list) {
        this.a = list;
        this.b = j;
        this.c = ((bn3) list.get(0)).toString().hashCode();
        this.d = j;
        this.g = ((bn3) list.get(0)).b;
        this.h = ((bn3) list.get(0)).c;
    }

    @Override // defpackage.g2h
    public final Uri a() {
        return this.e;
    }

    @Override // defpackage.g2h
    public final long b() {
        return 0L;
    }

    @Override // defpackage.g2h
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn3)) {
            return false;
        }
        cn3 cn3Var = (cn3) obj;
        return fni.a(this.a, cn3Var.a) && this.b == cn3Var.b;
    }

    @Override // defpackage.g2h
    public final boolean g() {
        return false;
    }

    @Override // defpackage.g2h
    public final String getContentType() {
        return this.f;
    }

    @Override // defpackage.g2h
    public final long getDuration() {
        return this.b;
    }

    @Override // defpackage.g2h
    public final int getHeight() {
        return this.h;
    }

    @Override // defpackage.g2h
    public final int getType() {
        return this.i;
    }

    @Override // defpackage.g2h
    public final int getWidth() {
        return this.g;
    }

    @Override // defpackage.g2h
    public final long h() {
        return 0L;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + a9h.a(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.g2h
    public final long i() {
        return this.c;
    }

    public final String toString() {
        return "ConcatenatedMp4VideoContent(items=" + this.a + ", duration=" + this.b + ", isMute=true)";
    }
}
