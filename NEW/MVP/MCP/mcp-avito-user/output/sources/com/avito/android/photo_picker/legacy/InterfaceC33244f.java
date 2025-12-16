package com.avito.android.photo_picker.legacy;

import com.avito.android.photo_picker.PhotoPickerActivity;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.legacy.A;
import com.avito.android.photo_picker.legacy.thumbnail_list.d;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/f;", "Lcom/avito/android/photo_picker/legacy/A$a;", "Lcom/avito/android/photo_picker/legacy/thumbnail_list/d$a;", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_picker.legacy.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC33244f extends A.a, d.a {

    /* compiled from: PhotoPickerPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/f$a;", "", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_picker.legacy.f$a */
    public interface a {
    }

    void a();

    void c0();

    void e0();

    @Y61.k
    PhotoPickerPresenterState getState();

    boolean h();

    void i(@Y61.k ArrayList arrayList);

    void j(@Y61.k ArrayList arrayList);

    void m(@Y61.k PhotoPickerViewModel photoPickerViewModel);

    void s();

    void t(@Y61.k PhotoPickerActivity photoPickerActivity);

    void v(@Y61.k E e12);

    void y(@Y61.k String str);
}
