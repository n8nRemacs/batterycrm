package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class mef implements tca {
    public final /* synthetic */ nef a;

    public mef(nef nefVar) {
        this.a = nefVar;
    }

    @Override // defpackage.tca
    public final void onFailed(Throwable th) {
        nef nefVar = this.a;
        nefVar.a(nefVar.f, th);
    }

    @Override // defpackage.tca
    public final void onFinished(String str, File file, String str2) {
        ((g4b) this.a.c.getValue()).c().execute(new zcd(this, file, str2, 9));
    }
}
