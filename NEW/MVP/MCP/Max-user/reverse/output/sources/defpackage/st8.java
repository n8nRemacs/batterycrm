package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes2.dex */
public final class st8 extends mid implements ne8 {
    public final zg E0;
    public final rt8 F0;
    public final z10 G0;
    public final boolean H0;
    public final ynd I0;
    public final yd8 J0;
    public fce K0;
    public final SimpleDraweeView L0;
    public final ProgressBar M0;
    public final View N0;
    public boolean O0;
    public zd8 P0;

    public st8(View view, zg zgVar, MediaBarPreviewLayout mediaBarPreviewLayout, z10 z10Var, boolean z, ynd yndVar, yd8 yd8Var) {
        q1g q1gVarD;
        super(view);
        this.E0 = zgVar;
        this.F0 = mediaBarPreviewLayout;
        this.G0 = z10Var;
        this.H0 = z;
        this.I0 = yndVar;
        this.J0 = yd8Var;
        this.L0 = (SimpleDraweeView) view.findViewById(q0d.row_media_bar_selected__drawee);
        ProgressBar progressBar = (ProgressBar) view.findViewById(q0d.row_media_bar_selected__progress_bar);
        this.M0 = progressBar;
        this.N0 = view.findViewById(q0d.row_media_bar_selected__progress_background);
        f8j.d(view, 300L, new ye6(13, this));
        if (view.isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context = view.getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context);
        }
        view.setBackgroundColor(q1gVarD.m);
        cei.l(progressBar, s34.a(view.getContext(), gvd.c));
    }

    @Override // defpackage.ne8
    public final void j(boolean z) {
        this.M0.setVisibility(z ? 0 : 8);
        this.N0.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.ne8
    public final void n(pd8 pd8Var, Uri uri, int i, Uri uri2) {
        pd8 pd8Var2;
        fce fceVar = this.K0;
        if (fceVar == null || (pd8Var2 = fceVar.a) == null || pd8Var.b != pd8Var2.b) {
            return;
        }
        SimpleDraweeView simpleDraweeView = this.L0;
        if (uri == null) {
            simpleDraweeView.setController(null);
            return;
        }
        sf7 sf7VarD = sf7.d(uri);
        if (uri2 != null) {
            sf7VarD.k = new qkb(uri2);
        }
        sf7VarD.d = this.I0;
        if (i != 0) {
            sf7VarD.k = new avb(i, 0);
        }
        c2c c2cVarA = zk6.a.a();
        c2cVarA.b = sf7VarD.a();
        c2cVarA.i = simpleDraweeView.getController();
        simpleDraweeView.setController(c2cVarA.a());
    }
}
