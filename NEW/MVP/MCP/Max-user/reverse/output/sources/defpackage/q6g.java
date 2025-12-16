package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class q6g implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ r6g a;

    public q6g(r6g r6gVar) {
        this.a = r6gVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        gri.a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
        r6g r6gVar = this.a;
        r6gVar.f = surfaceTexture;
        if (r6gVar.g == null) {
            r6gVar.k();
            return;
        }
        r6gVar.h.getClass();
        gri.a("TextureViewImpl", "Surface invalidated " + r6gVar.h);
        r6gVar.h.l.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        r6g r6gVar = this.a;
        r6gVar.f = null;
        wu1 wu1Var = r6gVar.g;
        if (wu1Var == null) {
            gri.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        wsf.b(wu1Var, new xpb(this, surfaceTexture, false, 12), z7.d(r6gVar.e.getContext()));
        r6gVar.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        gri.a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        tu1 tu1Var = (tu1) this.a.k.getAndSet(null);
        if (tu1Var != null) {
            tu1Var.b(null);
        }
    }
}
