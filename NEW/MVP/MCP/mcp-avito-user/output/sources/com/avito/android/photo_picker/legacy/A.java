package com.avito.android.photo_picker.legacy;

import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import kotlin.Metadata;

/* compiled from: PhotoPickerView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/legacy/A;", "", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface A {

    /* compiled from: PhotoPickerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/A$a;", "Lcom/avito/android/photo_list_view/H;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends com.avito.android.photo_list_view.H {
        void D();

        void d();

        void e();

        @Y61.k
        PhotoPickerIntentFactory.PhotoPickerMode getMode();

        void n(int i12);

        void q();

        void z();
    }
}
