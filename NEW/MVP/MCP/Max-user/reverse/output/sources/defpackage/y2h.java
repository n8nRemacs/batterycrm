package defpackage;

import one.video.exo.error.OneVideoExoPlaybackException;

/* loaded from: classes2.dex */
public final class y2h implements jd5 {
    public final /* synthetic */ z2h a;

    public y2h(z2h z2hVar) {
        this.a = z2hVar;
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void e(OneVideoExoPlaybackException oneVideoExoPlaybackException, uch uchVar, ghb ghbVar) {
        this.a.setFixedText("ERROR: " + oneVideoExoPlaybackException);
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void i(ghb ghbVar) {
        this.a.setFixedText("VIDEO FINISH");
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void j(ghb ghbVar) {
        this.a.k(ghbVar);
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void k(vgb vgbVar, adh adhVar) {
        this.a.k(vgbVar);
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void p(ghb ghbVar) {
        this.a.k(ghbVar);
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void r(ghb ghbVar) {
        this.a.k(ghbVar);
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void v(ghb ghbVar) {
        this.a.k(ghbVar);
    }
}
