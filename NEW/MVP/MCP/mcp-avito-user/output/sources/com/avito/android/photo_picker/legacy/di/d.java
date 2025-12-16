package com.avito.android.photo_picker.legacy.di;

import com.avito.android.di.InterfaceC30272y;
import com.avito.android.photo_picker.PhotoPickerActivity;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.google.gson.Gson;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: PhotoPickerComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/d;", "Lcom/avito/android/photo_picker/gallery/di/c;", "Lcom/avito/android/photo_picker/camera/di/b;", "Lcom/avito/android/photo_picker/edit/di/c;", "a", "b", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes14.dex */
public interface d extends com.avito.android.photo_picker.gallery.di.c, com.avito.android.photo_picker.camera.di.b, com.avito.android.photo_picker.edit.di.c {

    /* compiled from: PhotoPickerComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/d$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @Y61.k
        a a(@Y61.k Gson gson);

        @h31.b
        @Y61.k
        a b(@Named("max_photo_count") int i12);

        @Y61.k
        d build();

        @Y61.k
        a c(@Y61.k e eVar);

        @Y61.k
        a d(@Y61.k f fVar);

        @h31.b
        @Y61.k
        a e(@Y61.k @Named("mode") PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode);
    }

    /* compiled from: PhotoPickerComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/di/d$b;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        static {
            new b();
        }
    }

    void gm(@Y61.k PhotoPickerActivity photoPickerActivity);
}
