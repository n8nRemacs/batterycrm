package defpackage;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import org.apache.http.HttpStatus;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class i08 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final g6 c;
    public int d;
    public boolean o;
    public final Rect b = new Rect();
    public final int a = HttpStatus.SC_BAD_REQUEST;

    public i08(ActLocalMedias actLocalMedias, g6 g6Var) {
        this.c = g6Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g6 g6Var = this.c;
        Rect rect = this.b;
        g6Var.accept(rect);
        int iHeight = rect.height();
        int i = this.d;
        if (i != 0) {
            int i2 = this.a;
            if (i > iHeight + i2) {
                this.o = true;
            } else if (i + i2 < iHeight) {
                this.o = false;
            }
        }
        this.d = iHeight;
    }
}
