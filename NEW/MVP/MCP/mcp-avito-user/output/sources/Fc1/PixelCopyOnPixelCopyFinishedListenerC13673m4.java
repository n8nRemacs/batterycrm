package Fc1;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;

@j.X
/* renamed from: Fc1.m4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class PixelCopyOnPixelCopyFinishedListenerC13673m4 implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Handler f5674a;

    public PixelCopyOnPixelCopyFinishedListenerC13673m4() {
        HandlerThread handlerThread = new HandlerThread("PixelCopyHelper");
        handlerThread.start();
        this.f5674a = new Handler(handlerThread.getLooper());
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i12) {
        synchronized (this) {
            notify();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }
}
