package com.avito.android.photo_picker.legacy;

import kotlin.Metadata;
import m80.C43924a;

/* compiled from: SingleCachePhotoInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PickerPhoto;", "photo", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_picker/legacy/PickerPhoto;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f219599b;

    public K(X x12) {
        this.f219599b = x12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PickerPhoto pickerPhoto = (PickerPhoto) obj;
        X x12 = this.f219599b;
        com.avito.android.photo_info.a aVarA = x12.f219637k.a(pickerPhoto.f219614c);
        if (aVarA != null) {
            x12.f219633g.a(new C43924a(String.valueOf(pickerPhoto.f219616e), aVarA.f218042a, aVarA.f218043b, aVarA.f218044c, aVarA.f218045d));
        }
    }
}
