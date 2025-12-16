package com.avito.android.photo_picker.legacy;

import android.net.Uri;
import kotlin.Metadata;

/* compiled from: SingleCachePhotoInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/photo_picker/legacy/PickerPhoto;", "it", "Landroid/net/Uri;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class L<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PickerPhoto f219600b;

    public L(PickerPhoto pickerPhoto) {
        this.f219600b = pickerPhoto;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return PickerPhoto.a(this.f219600b, null, (Uri) obj, 223);
    }
}
