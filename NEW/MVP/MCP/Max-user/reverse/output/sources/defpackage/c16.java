package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class c16 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ c16(View view, Runnable runnable, int i) {
        this.a = i;
        this.b = view;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.removeCallbacks(this.c);
                break;
            default:
                this.b.removeCallbacks(this.c);
                break;
        }
    }
}
