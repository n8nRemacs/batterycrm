package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wmd extends ymd {
    public final r7d X;
    public final n4e Y;

    public wmd(hf6 hf6Var, wg7 wg7Var, gae gaeVar, ArrayList arrayList) {
        super(hf6Var, wg7Var, gaeVar, arrayList);
        Uri.parse(((kl0) wg7Var.get(0)).a);
        long j = gaeVar.e;
        r7d r7dVar = j <= 0 ? null : new r7d(gaeVar.d, j, null);
        this.X = r7dVar;
        this.Y = r7dVar == null ? new n4e(new r7d(0L, -1L, null)) : null;
    }

    @Override // defpackage.ymd
    public final String a() {
        return null;
    }

    @Override // defpackage.ymd
    public final ud4 c() {
        return this.Y;
    }

    @Override // defpackage.ymd
    public final r7d d() {
        return this.X;
    }
}
