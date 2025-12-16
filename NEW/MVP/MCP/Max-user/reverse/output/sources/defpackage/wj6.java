package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class wj6 extends tj6 {
    public final df7 f;
    public final lv4 g;
    public hd8 h;
    public lkd i;

    public wj6(m0g m0gVar, yi5 yi5Var, df7 df7Var, lv4 lv4Var) {
        super(m0gVar, yi5Var);
        this.f = df7Var;
        this.g = lv4Var;
    }

    @Override // defpackage.tj6
    public final void a(f2h f2hVar, int i, int i2) {
        super.a(f2hVar, i, i2);
        Uri uriA = ((ml0) f2hVar).a();
        int i3 = xxg.a;
        String scheme = uriA.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme);
        yi5 yi5Var = this.b;
        m0g m0gVar = this.a;
        if (zIsEmpty || "file".equals(scheme)) {
            if (this.h == null) {
                this.h = new hd8(m0gVar, yi5Var, this.g);
            }
            this.h.a(f2hVar, i, i2);
        } else {
            if (this.i == null) {
                this.i = new lkd(m0gVar, yi5Var, this.f);
            }
            this.i.a(f2hVar, i, i2);
        }
    }

    public final boolean b() {
        f2h f2hVar = this.e;
        if (f2hVar == null) {
            wqi.e("wj6", "You should call setVideoContent before prepare!", null);
            return false;
        }
        Uri uriA = ((ml0) f2hVar).a();
        int i = xxg.a;
        String scheme = uriA.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            f2h f2hVar2 = this.i.e;
            return (f2hVar2 == null || ((ml0) f2hVar2).e == null) ? false : true;
        }
        f2h f2hVar3 = this.h.e;
        if (f2hVar3 == null) {
            return false;
        }
        Uri uriA2 = ((ml0) f2hVar3).a();
        int i2 = xxg.a;
        String scheme2 = uriA2.getScheme();
        return TextUtils.isEmpty(scheme2) || "file".equals(scheme2);
    }
}
