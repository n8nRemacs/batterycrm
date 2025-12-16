package defpackage;

import ru.ok.messages.photoeditor.ActPhotoEditor;

/* loaded from: classes2.dex */
public final class yub {
    public final cvb a;
    public final n95 b;
    public final ActPhotoEditor c;
    public final xa6 d;
    public bvb e;

    public yub(cvb cvbVar, n95 n95Var, ActPhotoEditor actPhotoEditor, xa6 xa6Var, l95 l95Var, boolean z, boolean z2, boolean z3) {
        this.a = cvbVar;
        this.b = n95Var;
        n95Var.b = this;
        this.c = actPhotoEditor;
        cvbVar.a.add(this);
        this.d = xa6Var;
        bvb bvbVar = new bvb(false, false, false, z, z2, false, z3);
        this.e = bvbVar;
        cvbVar.a(bvbVar);
        xa6Var.a(n95Var, l95Var, true);
        if (z && z2) {
            n95Var.a.setDrawStickerEnabled(true);
            xa6Var.a(n95Var, n95Var.a(), false);
        }
    }
}
