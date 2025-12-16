package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin.common.component.photo_picker.w;
import com.avito.android.beduin.common.form.transforms.PhotoPickerTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinPhotoPickerComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTV0/a;", "item", "Lkotlin/G0;", "invoke", "(LTV0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.component.photo_picker.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28796b extends N implements Y41.l<TV0.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28795a f101956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28796b(C28795a c28795a) {
        super(1);
        this.f101956l = c28795a;
    }

    @Override // Y41.l
    public final G0 invoke(TV0.a aVar) {
        BeduinPhotoPickerModel.PhotoPickerConstraints.MaxCountConstraint maxCount;
        List<BeduinAction> listC;
        TV0.a aVar2 = aVar;
        boolean z12 = aVar2 instanceof com.avito.android.beduin.common.component.photo_picker.items.Photo.a;
        C28795a c28795a = this.f101956l;
        if (z12) {
            com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar3 = (com.avito.android.beduin.common.component.photo_picker.items.Photo.a) aVar2;
            c28795a.getClass();
            List<BeduinAction> listG = aVar3.f101986b.g();
            if (listG != null) {
                Iterator<T> it = listG.iterator();
                while (it.hasNext()) {
                    c28795a.f101945e.o((BeduinAction) it.next());
                }
            } else {
                c28795a.v(aVar3);
            }
        } else if (aVar2 instanceof com.avito.android.beduin.common.component.photo_picker.items.Placeholder.a) {
            BeduinPhotoPickerModel beduinPhotoPickerModel = c28795a.f101951k;
            com.avito.android.beduin_shared.model.utils.j.a(c28795a.f101947g, beduinPhotoPickerModel.getF100853b(), new PhotoPickerTransform.ErrorState(null));
            BeduinPhotoPickerModel beduinPhotoPickerModel2 = c28795a.f101946f;
            BeduinPhotoPickerModel.AddImageButton addImageButton = beduinPhotoPickerModel2.getAddImageButton();
            if (addImageButton != null && (listC = addImageButton.c()) != null) {
                Iterator<T> it2 = listC.iterator();
                while (it2.hasNext()) {
                    c28795a.f101945e.o((BeduinAction) it2.next());
                }
            }
            String f100853b = beduinPhotoPickerModel.getF100853b();
            c28795a.f101949i.getClass();
            String strConcat = "beduin_photo_picker_user_".concat(f100853b);
            String strConcat2 = "beduin photo picker_".concat(beduinPhotoPickerModel.getF100853b());
            BeduinPhotoPickerModel.PhotoPickerConstraints constraints = beduinPhotoPickerModel2.getConstraints();
            w.a aVar4 = new w.a(strConcat, strConcat2, 0, (constraints == null || (maxCount = constraints.getMaxCount()) == null) ? 1 : maxCount.getValue(), null, null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), 52, null);
            androidx.view.result.h<w.a> hVar = c28795a.f101952l;
            if (hVar != null) {
                hVar.b(aVar4);
            }
        }
        return G0.f406611a;
    }
}
