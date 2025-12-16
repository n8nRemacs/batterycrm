package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class r6g extends bma {
    public TextureView e;
    public SurfaceTexture f;
    public wu1 g;
    public msf h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public nl l;

    @Override // defpackage.bma
    public final View d() {
        return this.e;
    }

    @Override // defpackage.bma
    public final Bitmap e() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // defpackage.bma
    public final void f() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // defpackage.bma
    public final void g() {
        this.i = true;
    }

    @Override // defpackage.bma
    public final void h(msf msfVar, nl nlVar) {
        Size size = msfVar.b;
        this.b = size;
        this.l = nlVar;
        FrameLayout frameLayout = (FrameLayout) this.c;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new q6g(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        msf msfVar2 = this.h;
        if (msfVar2 != null) {
            msfVar2.d();
        }
        this.h = msfVar;
        Executor executorD = z7.d(this.e.getContext());
        msfVar.k.a(new aee(this, 25, msfVar), executorD);
        k();
    }

    @Override // defpackage.bma
    public final ha8 j() {
        return ixi.a(new u4e(27, this));
    }

    public final void k() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
        Surface surface = new Surface(this.f);
        msf msfVar = this.h;
        wu1 wu1VarA = ixi.a(new c5g(this, 1, surface));
        this.g = wu1VarA;
        wu1VarA.b.d(new u02(this, surface, wu1VarA, msfVar, 20), z7.d(this.e.getContext()));
        this.a = true;
        i();
    }
}
