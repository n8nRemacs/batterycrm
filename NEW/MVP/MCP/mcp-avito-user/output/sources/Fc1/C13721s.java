package Fc1;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.PixelCopy;
import android.view.Window;
import androidx.compose.ui.graphics.C22263l;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import javax.inject.Inject;

/* renamed from: Fc1.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13721s implements V7 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L3 f5806a;

    @Inject
    public C13721s(@Y61.k L3 l32) {
        this.f5806a = l32;
    }

    @Override // Fc1.V7
    @Y61.k
    public final Bitmap a() {
        L3 l32 = this.f5806a;
        C13703p7 c13703p7 = new C13703p7(l32);
        c13703p7.a().getWindowVisibleDisplayFrame(new Rect());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c13703p7.a().getWidth(), c13703p7.a().getHeight(), Bitmap.Config.ARGB_8888);
        int[] iArr = new int[2];
        c13703p7.a().getLocationInWindow(iArr);
        try {
            Window window = l32.b().getWindow();
            int i12 = iArr[0];
            Rect rect = new Rect(i12, iArr[1], c13703p7.a().getWidth() + i12, iArr[1] + c13703p7.a().getHeight());
            PixelCopyOnPixelCopyFinishedListenerC13673m4 pixelCopyOnPixelCopyFinishedListenerC13673m4 = new PixelCopyOnPixelCopyFinishedListenerC13673m4();
            synchronized (pixelCopyOnPixelCopyFinishedListenerC13673m4) {
                PixelCopy.request(window, rect, bitmapCreateBitmap, pixelCopyOnPixelCopyFinishedListenerC13673m4, pixelCopyOnPixelCopyFinishedListenerC13673m4.f5674a);
                try {
                    pixelCopyOnPixelCopyFinishedListenerC13673m4.wait(500L);
                } catch (InterruptedException unused) {
                    throw new IllegalStateException("PixelCopy request didn't complete within 500ms");
                }
            }
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException unused2) {
            int i13 = InterfaceC22280q0.f39746a;
            return C22263l.a(O4.a());
        }
    }
}
