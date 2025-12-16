package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin.common.component.photo_picker.s;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoInteractorWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "selectedPhotos", "Lcom/avito/android/beduin/common/component/photo_picker/s$b;", "apply", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/photo_picker/s$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<BeduinPhotoPickerModel.PhotoPickerImage> f102081b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f102082c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BeduinPhotoPickerModel f102083d;

    public u(List list, LinkedHashMap linkedHashMap, BeduinPhotoPickerModel beduinPhotoPickerModel) {
        this.f102081b = list;
        this.f102082c = linkedHashMap;
        this.f102083d = beduinPhotoPickerModel;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        int iF2 = P0.f(C42745f0.q(list, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (T t12 : list) {
            linkedHashMap.put(Long.valueOf(((PhotoUpload) t12).f216300b), t12);
        }
        List<BeduinPhotoPickerModel.PhotoPickerImage> list2 = this.f102081b;
        ArrayList arrayList = new ArrayList();
        for (T t13 : list2) {
            if (!linkedHashMap.containsKey(((BeduinPhotoPickerModel.PhotoPickerImage) t13).f101921c)) {
                arrayList.add(t13);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t14 : list) {
            if (!this.f102082c.containsKey(Long.valueOf(((PhotoUpload) t14).f216300b))) {
                arrayList2.add(t14);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            PhotoUpload photoUpload = (PhotoUpload) it.next();
            Image image = ImageKt.toImage(photoUpload.f216305g);
            arrayList3.add(new BeduinPhotoPickerModel.PhotoPickerImage(null, image, null, null, this.f102083d.getDefaultControlButton(), null, null, null, image, Long.valueOf(photoUpload.f216300b), BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loading.f101928b, false, null, 6304, null));
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
        for (BeduinPhotoPickerModel.PhotoPickerImage photoPickerImageA : list2) {
            if (!linkedHashMap.containsKey(photoPickerImageA.f101921c)) {
                photoPickerImageA = BeduinPhotoPickerModel.PhotoPickerImage.a(photoPickerImageA, null, null, null, null, null, null, null, null, 6143);
            }
            arrayList4.add(photoPickerImageA);
        }
        return new s.b(C42745f0.h0(arrayList3, arrayList4), arrayList3, arrayList);
    }
}
