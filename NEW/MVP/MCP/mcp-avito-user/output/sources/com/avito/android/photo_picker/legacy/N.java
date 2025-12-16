package com.avito.android.photo_picker.legacy;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SingleCachePhotoInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PickerPhoto;", "photo", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_picker/legacy/PickerPhoto;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class N<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f219602b;

    public N(X x12) {
        this.f219602b = x12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PickerPhoto pickerPhoto = (PickerPhoto) obj;
        X x12 = this.f219602b;
        Iterator it = x12.f219638l.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (kotlin.jvm.internal.L.f(((PickerPhoto) it.next()).f219613b, pickerPhoto.f219613b)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            x12.f219638l.add(pickerPhoto);
        } else {
            x12.f219638l.set(i12, pickerPhoto);
        }
    }
}
