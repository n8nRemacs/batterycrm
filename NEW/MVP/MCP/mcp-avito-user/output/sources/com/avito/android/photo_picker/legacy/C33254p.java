package com.avito.android.photo_picker.legacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PickerPhoto;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_picker/legacy/PickerPhoto;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33254p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33245g f219833b;

    public C33254p(C33245g c33245g) {
        this.f219833b = c33245g;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PickerPhoto pickerPhoto = (PickerPhoto) obj;
        C33245g c33245g = this.f219833b;
        ArrayList arrayList = c33245g.f219790B;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = ((PickerPhoto) next).f219613b;
            String str2 = pickerPhoto.f219613b;
            if (kotlin.jvm.internal.L.f(str, str2)) {
                arrayList.remove(next);
                com.avito.android.photo_picker.legacy.thumbnail_list.l lVarK = C33245g.K(pickerPhoto, c33245g.f219809q);
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList2 = c33245g.f219814v;
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList3 = arrayList2 == null ? null : arrayList2;
                ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList4 = arrayList2 == null ? null : arrayList2;
                if (arrayList2 == null) {
                    arrayList2 = null;
                }
                arrayList3.set(arrayList4.indexOf(C33261x.a(str2, arrayList2)), lVarK);
                c33245g.G(true);
                E e12 = c33245g.f219808p;
                if (e12 != null) {
                    ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList5 = c33245g.f219814v;
                    e12.b((arrayList5 != null ? arrayList5 : null).indexOf(lVarK));
                }
                c33245g.L();
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
