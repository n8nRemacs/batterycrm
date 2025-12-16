package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class dv6 implements t98 {
    public final Uri X;
    public final gx3 Y;
    public final List Z;
    public final long a;
    public final String b;
    public final f7c c;
    public final f7c d;
    public final boolean o;
    public final int s0 = u1b.r;
    public final long t0;

    public dv6(long j, String str, f7c f7cVar, f7c f7cVar2, boolean z, Uri uri, gx3 gx3Var, List list) {
        this.a = j;
        this.b = str;
        this.c = f7cVar;
        this.d = f7cVar2;
        this.o = z;
        this.X = uri;
        this.Y = gx3Var;
        this.Z = list;
        this.t0 = j;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.t0;
    }

    @Override // defpackage.t98
    public final int m() {
        return this.s0;
    }
}
