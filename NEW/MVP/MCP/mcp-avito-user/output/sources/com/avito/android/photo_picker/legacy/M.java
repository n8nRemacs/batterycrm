package com.avito.android.photo_picker.legacy;

import android.net.Uri;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.photo_storage.SharedPhotosStorage;
import kotlin.Metadata;

/* compiled from: SingleCachePhotoInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PickerPhoto;", "photo", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/photo_picker/legacy/PickerPhoto;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class M<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f219601b;

    public M(X x12) {
        this.f219601b = x12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.I iQ2;
        PickerPhoto pickerPhoto = (PickerPhoto) obj;
        X x12 = this.f219601b;
        SharedPhotosStorage sharedPhotosStorage = x12.f219628b;
        Uri uri = pickerPhoto.f219614c;
        if (sharedPhotosStorage.d(uri)) {
            iQ2 = io.reactivex.rxjava3.core.I.q(uri);
        } else {
            iQ2 = x12.f219629c.a(uri, new ImageConvertOptions(2400, 3200, 95, Integer.MAX_VALUE)).K(new P(x12)).S().r(Q.f219621b);
        }
        return iQ2.r(new L(pickerPhoto));
    }
}
