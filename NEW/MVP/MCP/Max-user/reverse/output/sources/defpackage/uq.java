package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class uq implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ uq(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                if (((rq) obj).a == 2) {
                    str = "https://play.google.com/store/apps/details?id=ru.oneme.app";
                } else {
                    tq.a.getClass();
                    str = sq.b;
                }
                e6j.c(this.b, str);
                return qqg.a;
            default:
                return Boolean.valueOf(((WeakReference) obj).get() == this.b);
        }
    }
}
