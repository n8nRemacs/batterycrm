package com.avito.android.photo_picker.legacy;

import android.net.Uri;
import com.avito.android.photo_cache.PhotoSource;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.PhotoPickerViewModel;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.C35809h6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_picker/legacy/PickerPhoto;", PhotoParameter.TYPE, "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33256s extends kotlin.jvm.internal.N implements Y41.l<List<? extends PickerPhoto>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33245g f219843l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33256s(C33245g c33245g) {
        super(1);
        this.f219843l = c33245g;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends PickerPhoto> list) {
        List<? extends PickerPhoto> list2 = list;
        C33245g c33245g = this.f219843l;
        ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList = c33245g.f219814v;
        if (arrayList == null) {
            arrayList = null;
        }
        arrayList.clear();
        int size = list2.size();
        int i12 = c33245g.f219800h;
        List<? extends PickerPhoto> listSubList = size > i12 ? list2.subList(0, i12) : list2;
        String str = c33245g.f219809q;
        if (str == null) {
            PickerPhoto pickerPhoto = (PickerPhoto) C42745f0.G(listSubList);
            str = pickerPhoto != null ? pickerPhoto.f219613b : null;
        }
        PhotoPickerViewModel photoPickerViewModel = c33245g.f219789A;
        if (photoPickerViewModel == null) {
            photoPickerViewModel = null;
        }
        photoPickerViewModel.f218826V = !listSubList.isEmpty();
        for (PickerPhoto pickerPhoto2 : listSubList) {
            com.avito.android.photo_picker.legacy.thumbnail_list.l lVarK = C33245g.K(pickerPhoto2, str);
            ArrayList<com.avito.android.photo_picker.legacy.thumbnail_list.l> arrayList2 = c33245g.f219814v;
            if (arrayList2 == null) {
                arrayList2 = null;
            }
            arrayList2.add(lVarK);
            Uri uri = lVarK.f219906f;
            if (C35809h6.a(uri)) {
                uri = null;
            }
            if (uri == null) {
                uri = lVarK.f219905e;
            }
            if (uri != null) {
                PhotoPickerViewModel photoPickerViewModel2 = c33245g.f219789A;
                if (photoPickerViewModel2 == null) {
                    photoPickerViewModel2 = null;
                }
                if (photoPickerViewModel2.ye(uri) == 0) {
                    PhotoPickerViewModel photoPickerViewModel3 = c33245g.f219789A;
                    if (photoPickerViewModel3 == null) {
                        photoPickerViewModel3 = null;
                    }
                    photoPickerViewModel3.Ae(uri, PhotoSource.f216293c, lVarK.f219881b, pickerPhoto2.f219619h);
                }
            }
        }
        if (str != null) {
            c33245g.I(str);
        }
        c33245g.G(true);
        if (str != null) {
            c33245g.H(str, true);
        }
        if (list2.size() > i12) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list2.subList(i12, list2.size()).iterator();
            while (it.hasNext()) {
                arrayList3.add(((PickerPhoto) it.next()).f219613b);
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                c33245g.f219795c.b((String) it2.next());
            }
        }
        PhotoPickerViewModel photoPickerViewModel4 = c33245g.f219789A;
        if ((photoPickerViewModel4 == null ? null : photoPickerViewModel4).f218819O instanceof PhotoPickerIntentFactory.PhotoPickerMode.ModeCrop) {
            (photoPickerViewModel4 != null ? photoPickerViewModel4 : null).oe(str);
        }
        ArrayList arrayList4 = c33245g.f219790B;
        if (!arrayList4.isEmpty()) {
            c33245g.f219811s.b(c33245g.F(io.reactivex.rxjava3.core.I.q(arrayList4)));
        }
        c33245g.M();
        return G0.f406611a;
    }
}
