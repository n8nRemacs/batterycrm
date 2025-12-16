package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: LayerSnapshot.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/media/ImageReader;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onImageAvailable", "(Landroid/media/ImageReader;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class q implements ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        int i12 = Z.f406624c;
        imageReader.acquireLatestImage();
        throw null;
    }
}
