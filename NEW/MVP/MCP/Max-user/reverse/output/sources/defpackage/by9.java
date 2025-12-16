package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class by9 {
    public final RecyclerView a;
    public final cw9 b;
    public final i3e c;
    public final jr9 d;
    public final ds9 e;
    public final String f = by9.class.getName();
    public boolean g = true;

    public by9(EndlessRecyclerView2 endlessRecyclerView2, cw9 cw9Var, i3e i3eVar, jr9 jr9Var, ds9 ds9Var) {
        this.a = endlessRecyclerView2;
        this.b = cw9Var;
        this.c = i3eVar;
        this.d = jr9Var;
        this.e = ds9Var;
    }

    public final boolean a(long j) {
        LinearLayoutManager linearLayoutManagerE = x7j.e(this.a);
        if (linearLayoutManagerE == null) {
            throw new IllegalStateException("Only linear layout is supported");
        }
        int iU0 = linearLayoutManagerE.U0();
        jr9 jr9Var = this.d;
        MessageModel messageModelM = jr9Var.M(iU0);
        if (messageModelM != null) {
            long j2 = messageModelM.c;
            MessageModel messageModelM2 = jr9Var.M(linearLayoutManagerE.Y0());
            if (messageModelM2 != null) {
                long j3 = messageModelM2.c;
                if (j2 <= j && j <= j3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by9.b():boolean");
    }
}
