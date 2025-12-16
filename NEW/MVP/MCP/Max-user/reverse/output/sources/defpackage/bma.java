package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public abstract class bma {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;

    public bma(FrameLayout frameLayout, v8c v8cVar) {
        this.c = frameLayout;
        this.d = v8cVar;
    }

    public void a(Bundle bundle) {
        if (this.a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.d);
        }
        CharSequence charSequence = (CharSequence) this.c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strC = c();
        if (strC != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
    }

    public abstract void b(ggg gggVar);

    public String c() {
        return null;
    }

    public abstract View d();

    public abstract Bitmap e();

    public abstract void f();

    public abstract void g();

    public abstract void h(msf msfVar, nl nlVar);

    public void i() {
        FrameLayout frameLayout = (FrameLayout) this.c;
        View viewD = d();
        if (viewD == null || !this.a) {
            return;
        }
        v8c v8cVar = (v8c) this.d;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        v8cVar.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            gri.i("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (v8cVar.f()) {
            if (viewD instanceof TextureView) {
                ((TextureView) viewD).setTransform(v8cVar.d());
            } else {
                Display display = viewD.getDisplay();
                boolean z = false;
                boolean z2 = (!v8cVar.g || display == null || display.getRotation() == v8cVar.e) ? false : true;
                boolean z3 = v8cVar.g;
                if (!z3) {
                    if ((!z3 ? v8cVar.c : -sxi.b(v8cVar.e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    gri.b("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFE = v8cVar.e(size, layoutDirection);
            viewD.setPivotX(0.0f);
            viewD.setPivotY(0.0f);
            viewD.setScaleX(rectFE.width() / v8cVar.a.getWidth());
            viewD.setScaleY(rectFE.height() / v8cVar.a.getHeight());
            viewD.setTranslationX(rectFE.left - viewD.getLeft());
            viewD.setTranslationY(rectFE.top - viewD.getTop());
        }
    }

    public abstract ha8 j();

    public bma() {
    }
}
