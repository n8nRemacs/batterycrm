package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class hwg implements es8, sk3 {
    public final /* synthetic */ jwg a;

    public /* synthetic */ hwg(jwg jwgVar, int i) {
        switch (i) {
            case 1:
                break;
            default:
                vvg vvgVar = vvg.UNKNOWN;
                break;
        }
        this.a = jwgVar;
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        List list;
        jwg jwgVar = this.a;
        wqi.c("jwg", "getUploadsWithStatus: uploadStatus=" + vvg.UPLOADING, new Object[0]);
        synchronized (jwgVar) {
            list = (List) ((gwg) jwgVar.b.getValue()).g().a();
        }
        if (rr8Var.e()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            rr8Var.b();
        } else {
            rr8Var.a(list);
        }
    }

    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        jwg jwgVar = this.a;
        wqi.c("jwg", "clear: ", new Object[0]);
        synchronized (jwgVar) {
            jwgVar.a.clear().c(((gwg) jwgVar.b.getValue()).clear()).a();
        }
        if (jk3Var.e()) {
            return;
        }
        jk3Var.b();
    }
}
