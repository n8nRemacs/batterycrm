package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhotoPickerModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l {
    @Y61.k
    public static final BeduinPhotoPickerModel a(@Y61.k BeduinPhotoPickerModel beduinPhotoPickerModel, long j12, @Y61.k Y41.l<? super BeduinPhotoPickerModel.PhotoPickerImage, BeduinPhotoPickerModel.PhotoPickerImage> lVar) {
        ArrayList arrayList;
        List<BeduinPhotoPickerModel.PhotoPickerImage> listL = beduinPhotoPickerModel.l();
        if (listL != null) {
            List<BeduinPhotoPickerModel.PhotoPickerImage> list = listL;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (BeduinPhotoPickerModel.PhotoPickerImage photoPickerImageInvoke : list) {
                Long l12 = photoPickerImageInvoke.f101921c;
                if (l12 != null && l12.longValue() == j12) {
                    photoPickerImageInvoke = lVar.invoke(photoPickerImageInvoke);
                }
                arrayList.add(photoPickerImageInvoke);
            }
        } else {
            arrayList = null;
        }
        return BeduinPhotoPickerModel.d(beduinPhotoPickerModel, null, null, arrayList, null, null, null, null, 8183);
    }
}
