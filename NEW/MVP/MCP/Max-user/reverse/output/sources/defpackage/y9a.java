package defpackage;

import ru.ok.messages.media.mediabar.FrgLocalMedia;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class y9a implements dn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eaa b;

    public /* synthetic */ y9a(eaa eaaVar, int i) {
        this.a = i;
        this.b = eaaVar;
    }

    @Override // defpackage.dn6
    public final Object apply(Object obj) {
        le8 le8Var = (le8) obj;
        switch (this.a) {
            case 0:
                zub zubVar = this.b.t0;
                le8Var.m = (zubVar == null || zubVar.d == null) ? false : true;
                break;
            case 1:
                eaa eaaVar = this.b;
                boolean z = eaaVar.A0;
                le8Var.e = z;
                le8Var.g = false;
                le8Var.h = false;
                le8Var.a = z;
                FrgLocalMedia frgLocalMediaO = eaaVar.c.O();
                le8Var.f = frgLocalMediaO != null ? frgLocalMediaO instanceof FrgLocalVideo : false;
                break;
            case 2:
                boolean z2 = this.b.A0;
                le8Var.g = z2;
                le8Var.h = z2;
                le8Var.e = false;
                break;
            case 3:
                eaa eaaVar2 = this.b;
                dce dceVar = eaaVar2.v0;
                int iG = dceVar.g(eaaVar2.o);
                le8Var.j = iG > 0 || dceVar.c().size() < 100;
                le8Var.k = iG;
                break;
            default:
                zub zubVar2 = this.b.t0;
                le8Var.l = (zubVar2 == null || zubVar2.b == null) ? false : true;
                break;
        }
        return le8Var;
    }
}
