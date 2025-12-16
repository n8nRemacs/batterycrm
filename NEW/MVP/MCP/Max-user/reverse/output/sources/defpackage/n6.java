package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class n6 implements iu3 {
    public final /* synthetic */ ActLocalMedias a;

    public n6(ActLocalMedias actLocalMedias) {
        this.a = actLocalMedias;
    }

    @Override // defpackage.iu3
    public final void accept(Object obj) {
        gsc gscVar = (gsc) obj;
        eaa eaaVar = this.a.f1;
        eaaVar.getClass();
        wqi.c("eaa", "onQualitySelected: %s", gscVar.toString());
        u10 u10VarA = eaaVar.s0.a();
        u10VarA.c = gscVar;
        eaaVar.s0 = new p2h(u10VarA);
        eaaVar.O0();
        eaaVar.P0(new t12(1, gscVar));
        eaaVar.P0(new y9a(eaaVar, 3));
        eaaVar.u0.f("VIDEO_UPLOAD_QUALITY_SELECTED", eaaVar.s0.a.name());
    }
}
