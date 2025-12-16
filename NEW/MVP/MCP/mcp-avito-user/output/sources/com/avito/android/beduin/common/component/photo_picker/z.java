package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: PhotoPickerParametersExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/z;", "Loj/a;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z implements InterfaceC44784a<BeduinPhotoPickerModel> {
    @Inject
    public z() {
    }

    public static Map l(List list) {
        Map mapP = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = (BeduinPhotoPickerModel.PhotoPickerImage) it.next();
                Q q12 = (photoPickerImage.getId() == null && photoPickerImage.h() == null) ? null : new Q(photoPickerImage.getId(), photoPickerImage.h());
                if (q12 != null) {
                    arrayList.add(q12);
                }
            }
            mapP = P0.p(arrayList);
        }
        return mapP == null ? P0.c() : mapP;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinPhotoPickerModel beduinPhotoPickerModel = (BeduinPhotoPickerModel) beduinModel;
        return Collections.singletonMap(beduinPhotoPickerModel.getId(), P0.k(l(beduinPhotoPickerModel.k()), l(beduinPhotoPickerModel.l())));
    }
}
