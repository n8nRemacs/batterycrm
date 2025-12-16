package e11;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.appset.zzr;

/* loaded from: classes7.dex */
public final class Y1 extends AbstractC39860d0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f394517b = false;

    @j.l0
    public final void g(@j.N Context context) {
        int i12;
        if (m2.b() || this.f394517b) {
            return;
        }
        this.f394517b = true;
        r2 r2VarA = r2.a(context);
        String strC = r2VarA.c("asid");
        try {
            i12 = r2VarA.f394776a.getInt("asis", -1);
        } catch (Throwable th2) {
            th2.toString();
            i12 = 0;
        }
        if (!TextUtils.isEmpty(strC)) {
            a("asid", strC);
        }
        if (i12 != -1) {
            a("asis", String.valueOf(i12));
        }
        try {
            new zzr(context).getAppSetIdInfo().h(m2.f394684a, new androidx.media3.exoplayer.analytics.n(i12, this, 3, r2VarA, strC));
        } catch (Throwable unused) {
        }
    }
}
