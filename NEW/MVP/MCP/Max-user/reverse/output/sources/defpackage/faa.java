package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class faa implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iaa b;

    public /* synthetic */ faa(iaa iaaVar, int i) {
        this.a = i;
        this.b = iaaVar;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                iaa iaaVar = this.b;
                iaaVar.P0(new gaa(iaaVar, 0));
                break;
            case 1:
                f2h f2hVar = (f2h) obj;
                iaa iaaVar2 = this.b;
                iaaVar2.c.k(f2hVar, iaaVar2);
                iaaVar2.P0(new s32(2, f2hVar));
                ((yaa) ((oaa) iaaVar2.b)).X.a(iaaVar2);
                break;
            case 2:
                Throwable th = (Throwable) obj;
                FrgLocalVideo frgLocalVideo = this.b.Y;
                if (frgLocalVideo != null) {
                    frgLocalVideo.I0(th);
                    break;
                }
                break;
            default:
                iaa iaaVar3 = this.b;
                xs8 xs8Var = iaaVar3.w0;
                if (xs8Var != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) xs8Var;
                    if (actLocalMedias.c1.P0.isFocused() && actLocalMedias.d1.b.o) {
                    }
                }
                iaaVar3.P0(new dk0(15));
                FrgLocalVideo frgLocalVideo2 = iaaVar3.Y;
                if (frgLocalVideo2 != null) {
                    frgLocalVideo2.F0(false);
                    break;
                }
                break;
        }
    }
}
