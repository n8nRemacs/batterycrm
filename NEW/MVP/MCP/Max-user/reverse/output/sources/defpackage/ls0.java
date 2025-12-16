package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class ls0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public float b;

    public /* synthetic */ ls0(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                outline.setRoundRect(0, -kti.d(this.b), view.getWidth(), view.getHeight(), this.b);
                view.setClipToOutline(true);
                break;
            case 1:
                int width = view.getWidth();
                int height = view.getHeight();
                float f = this.b;
                outline.setRoundRect(0, 0, width, height + ((int) f), f);
                view.setClipToOutline(true);
                break;
            default:
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.b);
                break;
        }
    }

    public ls0(float f) {
        this.a = 2;
        this.b = f;
    }
}
