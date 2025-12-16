package com.avito.android.photo_picker.camera;

import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: CameraFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_photo-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {
    @Y61.k
    public static final CameraFragment a(@Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, boolean z12) {
        CameraFragment cameraFragment = new CameraFragment();
        C35966w1.a(cameraFragment, -1, new C33229c(photoPickerMode, z12));
        return cameraFragment;
    }
}
