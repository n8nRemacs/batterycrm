package defpackage;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class zn implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                ((ho) this.b).D();
                break;
            case 1:
                ((bq8) this.b).a();
                break;
            case 2:
                ((cm6) this.b).invoke();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
