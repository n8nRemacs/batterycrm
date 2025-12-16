package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class utd extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final Rect b;
    public final float c;

    public utd(Rect rect, float f, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = rect;
                this.c = f;
                break;
            default:
                this.b = rect;
                this.c = f;
                break;
        }
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(this.b, this.c);
                break;
            default:
                outline.setRoundRect(this.b, this.c);
                break;
        }
    }
}
