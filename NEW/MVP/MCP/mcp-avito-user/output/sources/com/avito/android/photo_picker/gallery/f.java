package com.avito.android.photo_picker.gallery;

import android.net.Uri;
import androidx.view.C23038g0;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.photo_picker.gallery.e;
import com.avito.android.photo_picker.gallery.gallery_list.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f219523b;

    public f(e eVar) {
        this.f219523b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Object next;
        String str = (String) obj;
        e eVar = this.f219523b;
        ArrayList arrayList = eVar.f219506P;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (L.f(((k) next).f219881b, str)) {
                    break;
                }
            }
        }
        k kVar = (k) next;
        if (kVar == null) {
            return;
        }
        PhotoPickerViewModel photoPickerViewModel = eVar.f219510T;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        Uri uri = kVar.f219545e;
        int iYe = photoPickerViewModel.ye(uri);
        C23038g0<e.a> c23038g0 = eVar.f219509S;
        if (iYe > 0) {
            PhotoPickerViewModel photoPickerViewModel2 = eVar.f219510T;
            (photoPickerViewModel2 != null ? photoPickerViewModel2 : null).Ee(uri);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                k kVar2 = (k) it2.next();
                int i12 = kVar2.f219548h;
                if (i12 > kVar.f219548h) {
                    kVar2.f219548h = i12 - 1;
                }
            }
            kVar.f219548h = 0;
            c23038g0.setValue(new e.a.h(eVar.le()));
        } else {
            PhotoPickerViewModel photoPickerViewModel3 = eVar.f219510T;
            int iBe = PhotoPickerViewModel.Be(photoPickerViewModel3 != null ? photoPickerViewModel3 : null, uri, PhotoSource.f216296f, str, 8);
            kVar.f219548h = iBe;
            if (iBe > 0) {
                c23038g0.setValue(new e.a.h(eVar.le()));
            }
        }
        eVar.ke();
    }
}
