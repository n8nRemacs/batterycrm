package com.avito.android.photo_picker.legacy;

import android.graphics.Bitmap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimplePhotoResizer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/H;", "Lcom/avito/android/photo_camera_view/F;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class H implements com.avito.android.photo_camera_view.F {
    @Inject
    public H() {
    }

    @Override // com.avito.android.photo_camera_view.F
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Bitmap> a(@Y61.k byte[] bArr, @Y61.k u80.c cVar, float f12) {
        return io.reactivex.rxjava3.core.z.W(new G(bArr, this));
    }
}
