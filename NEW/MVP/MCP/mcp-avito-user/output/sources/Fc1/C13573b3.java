package Fc1;

import Ba1.C13127e;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;

@kotlin.jvm.internal.s0
@j.X
/* renamed from: Fc1.b3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13573b3 implements InterfaceC13590d2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5413a;

    public C13573b3(int i12) {
        this.f5413a = i12;
    }

    @Override // Fc1.InterfaceC13590d2
    @Y61.k
    public final Bitmap a(@Y61.k Bitmap bitmap) {
        Bitmap bitmapWrapHardwareBuffer;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        RenderNode renderNodeI = C13127e.i();
        renderNodeI.setPosition(0, 0, imageReaderNewInstance.getWidth(), imageReaderNewInstance.getHeight());
        float f12 = this.f5413a / 4.0f;
        renderNodeI.setRenderEffect(RenderEffect.createBlurEffect(f12, f12, Shader.TileMode.MIRROR));
        renderNodeI.beginRecording().drawBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true), 0.0f, 0.0f, (Paint) null);
        renderNodeI.endRecording();
        HardwareRenderer hardwareRendererF = C13127e.f();
        hardwareRendererF.setSurface(imageReaderNewInstance.getSurface());
        hardwareRendererF.setContentRoot(renderNodeI);
        hardwareRendererF.createRenderRequest().setWaitForPresent(true).syncAndDraw();
        Image imageAcquireNextImage = imageReaderNewInstance.acquireNextImage();
        if (imageAcquireNextImage != null) {
            HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
            if (hardwareBuffer != null) {
                bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
                hardwareBuffer.close();
            } else {
                bitmapWrapHardwareBuffer = null;
            }
            imageAcquireNextImage.close();
            if (bitmapWrapHardwareBuffer != null) {
                bitmap = bitmapWrapHardwareBuffer;
            }
        }
        imageReaderNewInstance.close();
        renderNodeI.discardDisplayList();
        hardwareRendererF.destroy();
        return bitmap;
    }
}
