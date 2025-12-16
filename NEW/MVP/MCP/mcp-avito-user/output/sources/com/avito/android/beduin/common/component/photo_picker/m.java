package com.avito.android.beduin.common.component.photo_picker;

import Ui.InterfaceC15523b;
import android.content.res.Resources;
import com.avito.android.beduin.common.action.BeduinToastAction;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import qj.InterfaceC47406a;

/* compiled from: BeduinPhotoPickerModelPreparer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/m;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/photo_picker/BeduinPhotoPickerModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements InterfaceC47406a<BeduinPhotoPickerModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f102030a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102031b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Resources f102032c;

    @Inject
    public m(@Y61.k s sVar, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k Resources resources) {
        this.f102030a = sVar;
        this.f102031b = interfaceC15523b;
        this.f102032c = resources;
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) {
        BeduinPhotoPickerModel.PhotoPickerConstraints.MinCountConstraint minCountConstraint;
        BeduinPhotoPickerModel.PhotoPickerConstraints.MaxCountConstraint maxCountConstraint;
        BeduinPhotoPickerModel beduinPhotoPickerModelD = (BeduinPhotoPickerModel) beduinModel;
        if (beduinPhotoPickerModelD.f101913c == null) {
            BeduinPhotoPickerModel.PhotoPickerConstraints constraints = beduinPhotoPickerModelD.getConstraints();
            if (constraints == null || (minCountConstraint = constraints.getMinCount()) == null) {
                minCountConstraint = new BeduinPhotoPickerModel.PhotoPickerConstraints.MinCountConstraint(beduinPhotoPickerModelD.getPickerSettings().d(), null, 2, null);
            }
            BeduinPhotoPickerModel.PhotoPickerConstraints constraints2 = beduinPhotoPickerModelD.getConstraints();
            if (constraints2 == null || (maxCountConstraint = constraints2.getMaxCount()) == null) {
                maxCountConstraint = new BeduinPhotoPickerModel.PhotoPickerConstraints.MaxCountConstraint(beduinPhotoPickerModelD.getPickerSettings().c(), null, 2, null);
            }
            BeduinPhotoPickerModel.PhotoPickerConstraints constraints3 = beduinPhotoPickerModelD.getConstraints();
            BeduinPhotoPickerModel.PhotoPickerConstraints photoPickerConstraints = new BeduinPhotoPickerModel.PhotoPickerConstraints(minCountConstraint, maxCountConstraint, constraints3 != null ? constraints3.getMinSize() : null);
            s sVar = this.f102030a;
            sVar.getClass();
            String strConcat = "beduin photo picker_".concat(beduinPhotoPickerModelD.getId());
            sVar.f102075a.d(strConcat);
            String strConcat2 = "beduin_photo_picker_static_".concat(beduinPhotoPickerModelD.getId());
            List<BeduinPhotoPickerModel.PhotoPickerImage> listK = beduinPhotoPickerModelD.k();
            if (listK == null) {
                listK = C42784z0.f406748b;
            }
            ArrayList arrayListA = sVar.a(strConcat, strConcat2, listK);
            String strConcat3 = "beduin_photo_picker_user_".concat(beduinPhotoPickerModelD.getId());
            List<BeduinPhotoPickerModel.PhotoPickerImage> listL = beduinPhotoPickerModelD.l();
            if (listL == null) {
                listL = C42784z0.f406748b;
            }
            beduinPhotoPickerModelD = BeduinPhotoPickerModel.d(beduinPhotoPickerModelD, null, arrayListA, sVar.a(strConcat, strConcat3, listL), photoPickerConstraints, null, UUID.randomUUID().toString(), null, 5619);
        }
        BeduinPhotoPickerModel beduinPhotoPickerModel = beduinPhotoPickerModelD;
        Integer num = beduinPhotoPickerModel.f101912b;
        if (num == null) {
            return beduinPhotoPickerModel;
        }
        this.f102031b.o(new BeduinToastAction(BeduinComponentTheme.AVITO_LOOK_AND_FEEL, BeduinToastAction.Style.ERROR, this.f102032c.getString(num.intValue()), null, null, null, null, null, null, null, 1008, null));
        return BeduinPhotoPickerModel.d(beduinPhotoPickerModel, null, null, null, null, null, null, null, 7167);
    }
}
