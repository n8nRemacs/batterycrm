package com.avito.android.photo_picker.edit.di;

import Y61.k;
import com.avito.android.di.B;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.edit.EditPhotoFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: EditPhotoComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/edit/di/b;", "", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: EditPhotoComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/di/b$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k c cVar);

        @h31.b
        @k
        a b(@k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode);

        @k
        b build();

        @h31.b
        @k
        a c(@k EditPhotoFragment editPhotoFragment);
    }

    void a(@k EditPhotoFragment editPhotoFragment);
}
