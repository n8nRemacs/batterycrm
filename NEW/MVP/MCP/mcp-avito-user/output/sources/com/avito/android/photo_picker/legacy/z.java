package com.avito.android.photo_picker.legacy;

import android.content.res.Resources;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenterResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/z;", "Lcom/avito/android/photo_picker/legacy/y;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f219912a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f219913b;

    public z(@Y61.k Resources resources) {
        this.f219912a = resources;
        this.f219913b = resources.getString(R.string.add_image_error);
    }

    @Override // com.avito.android.photo_picker.legacy.y
    @Y61.k
    public final String a(int i12) {
        return this.f219912a.getString(R.string.photo_limit_exceeds_message, Integer.valueOf(i12));
    }

    @Override // com.avito.android.photo_picker.legacy.y
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF219913b() {
        return this.f219913b;
    }
}
