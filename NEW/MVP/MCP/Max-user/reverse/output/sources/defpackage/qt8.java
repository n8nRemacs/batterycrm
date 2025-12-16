package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes2.dex */
public final class qt8 extends phd {
    public final z10 X;
    public final sd8 Y;
    public final yd8 Z;
    public final MediaBarPreviewLayout d;
    public final zg o;
    public final ynd s0;
    public boolean t0;

    public qt8(Context context, MediaBarPreviewLayout mediaBarPreviewLayout, zg zgVar, z10 z10Var, sd8 sd8Var, yd8 yd8Var) throws Resources.NotFoundException {
        this.d = mediaBarPreviewLayout;
        this.o = zgVar;
        this.X = z10Var;
        this.Y = sd8Var;
        this.Z = yd8Var;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(tvc.compose_view_item_height);
        this.s0 = dimensionPixelSize <= 0 ? null : new ynd(dimensionPixelSize, dimensionPixelSize);
    }

    @Override // defpackage.phd
    public final int j() {
        return this.Y.f.b();
    }

    @Override // defpackage.phd
    public final long k(int i) {
        pd8 pd8Var;
        fce fceVarI = this.Y.f.i(i);
        if (fceVarI == null || (pd8Var = fceVarI.a) == null) {
            return 0L;
        }
        return pd8Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    @Override // defpackage.phd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.mid r15, int r16) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt8.r(mid, int):void");
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new st8(LayoutInflater.from(viewGroup.getContext()).inflate(n1d.row_media_bar_selected, viewGroup, false), this.o, this.d, this.X, this.t0, this.s0, this.Z);
    }

    @Override // defpackage.phd
    public final void x(mid midVar) {
        ((st8) midVar).L0.animate().cancel();
    }
}
