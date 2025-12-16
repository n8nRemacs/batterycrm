package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rsf extends bma {
    public SurfaceView e;
    public final qsf f;

    public rsf(FrameLayout frameLayout, v8c v8cVar) {
        super(frameLayout, v8cVar);
        this.f = new qsf(this);
    }

    @Override // defpackage.bma
    public final View d() {
        return this.e;
    }

    @Override // defpackage.bma
    public final Bitmap e() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: psf
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    gri.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    gri.b("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                gri.b("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            gri.c("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.bma
    public final void f() {
    }

    @Override // defpackage.bma
    public final void g() {
    }

    @Override // defpackage.bma
    public final void h(msf msfVar, nl nlVar) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals((Size) this.b, msfVar.b);
        if (surfaceView == null || !zEquals) {
            Size size = msfVar.b;
            this.b = size;
            FrameLayout frameLayout = (FrameLayout) this.c;
            size.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorD = z7.d(this.e.getContext());
        msfVar.k.a(new bee(16, nlVar), executorD);
        this.e.post(new zcd(this, msfVar, nlVar, 11));
    }

    @Override // defpackage.bma
    public final ha8 j() {
        return ag7.c;
    }
}
