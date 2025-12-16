package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vmd extends xmd {
    public final q7d X;
    public final w7c Y;

    public vmd(gf6 gf6Var, wg7 wg7Var, fae faeVar, ArrayList arrayList) {
        super(gf6Var, wg7Var, faeVar, arrayList);
        Uri.parse(((jl0) wg7Var.get(0)).a);
        long j = faeVar.e;
        q7d q7dVar = j <= 0 ? null : new q7d(faeVar.d, j, null);
        this.X = q7dVar;
        this.Y = q7dVar == null ? new w7c(new q7d(0L, -1L, null)) : null;
    }

    @Override // defpackage.xmd
    public final String a() {
        return null;
    }

    @Override // defpackage.xmd
    public final td4 c() {
        return this.Y;
    }

    @Override // defpackage.xmd
    public final q7d d() {
        return this.X;
    }
}
