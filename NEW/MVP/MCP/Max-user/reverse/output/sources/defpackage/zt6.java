package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* loaded from: classes2.dex */
public final class zt6 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final String i = zt6.class.getName();

    public zt6(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
        this.h = k18Var8;
    }

    public final Context a() {
        return (Context) this.a.getValue();
    }

    public final Object b(erc ercVar, boolean z, int i, dtf dtfVar) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i2 = a().getResources().getDisplayMetrics().widthPixels;
        imb imbVar = QrCodeGenerator.f;
        if (fni.a(imbVar != null ? (erc) imbVar.a : null, ercVar) && !z) {
            imb imbVar2 = QrCodeGenerator.f;
            xqc xqcVar = imbVar2 != null ? (xqc) imbVar2.b : null;
            if (xqcVar != null && (bitmap2 = xqcVar.b) != null && bitmap2.getWidth() == i2) {
                return xqcVar;
            }
            String str = this.i;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, wmf.d("\n                Try to return cached qr code, but it has incorrect width.\n                Qr width=" + ((xqcVar == null || (bitmap = xqcVar.b) == null) ? null : new Integer(bitmap.getWidth())) + "; Correct width = " + i2 + ";\n                Recreate it.\n                "), null);
                }
            }
        }
        return svi.i(((q2b) ((lzf) this.f.getValue())).b(), new yt6(ercVar, this, i2, i, null), dtfVar);
    }
}
