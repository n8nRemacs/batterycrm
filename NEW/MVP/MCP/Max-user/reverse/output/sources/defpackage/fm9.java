package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class fm9 extends j6e {
    public final pb2 X;
    public final String Y;
    public final f7c Z;
    public final Uri c;
    public final List d;
    public final fh9 o;
    public final CharSequence s0;
    public final long t0;
    public final int u0;
    public final long v0;

    public fm9(Uri uri, List list, fh9 fh9Var, pb2 pb2Var, String str, f7c f7cVar, CharSequence charSequence, long j) {
        super(5, list);
        this.c = uri;
        this.d = list;
        this.o = fh9Var;
        this.X = pb2Var;
        this.Y = str;
        this.Z = f7cVar;
        this.s0 = charSequence;
        this.t0 = j;
        this.u0 = i1b.r;
        this.v0 = fh9Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm9)) {
            return false;
        }
        fm9 fm9Var = (fm9) obj;
        return fni.a(this.c, fm9Var.c) && fni.a(this.d, fm9Var.d) && fni.a(this.o, fm9Var.o) && fni.a(this.X, fm9Var.X) && fni.a(this.Y, fm9Var.Y) && fni.a(this.Z, fm9Var.Z) && fni.a(this.s0, fm9Var.s0) && this.t0 == fm9Var.t0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.v0;
    }

    public final int hashCode() {
        Uri uri = this.c;
        int iHashCode = (this.o.hashCode() + xrf.l(this.d, (uri == null ? 0 : uri.hashCode()) * 31, 31)) * 31;
        pb2 pb2Var = this.X;
        int iHashCode2 = (iHashCode + (pb2Var == null ? 0 : pb2Var.hashCode())) * 31;
        String str = this.Y;
        int iHashCode3 = (this.Z.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.s0;
        return Long.hashCode(this.t0) + ((iHashCode3 + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    @Override // defpackage.j6e
    public final boolean l(j6e j6eVar) {
        fm9 fm9Var = (fm9) j6eVar;
        fh9 fh9Var = fm9Var.o;
        if (!fni.a(this.c, fm9Var.c)) {
            return false;
        }
        fh9 fh9Var2 = this.o;
        return fh9Var2.c == fh9Var.c && fni.a(fh9Var2.Y, fh9Var.Y) && fh9Var2.o == fh9Var.o;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.u0;
    }

    @Override // defpackage.j6e
    public final boolean n(j6e j6eVar) {
        return this.v0 == j6eVar.getItemId();
    }

    public final String toString() {
        String strH = uog.h(this.s0);
        StringBuilder sb = new StringBuilder("MessageSearchModel(avatar=");
        sb.append(this.c);
        sb.append(", messageHighlights=");
        sb.append(this.d);
        sb.append(", message=");
        sb.append(this.o);
        sb.append(", chat=");
        sb.append(this.X);
        sb.append(", feedback=");
        sb.append(this.Y);
        sb.append(", preProcessedText=");
        sb.append(this.Z);
        sb.append(", preProcessedChatTitle=");
        sb.append((Object) strH);
        sb.append(", chatId=");
        sb.append(this.t0);
        sb.append(", viewType=");
        sb.append(this.u0);
        sb.append(", itemId=");
        return ho7.k(sb, this.v0, ")");
    }
}
