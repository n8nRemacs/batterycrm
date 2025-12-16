package com.avito.android.beduin.common.component.photo_picker;

import android.os.Parcelable;
import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin.common.component.photo_picker.p;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lj.InterfaceC43779a;

/* compiled from: BeduinPhotoPickerComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;", "photoItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.component.photo_picker.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28797c extends N implements Y41.l<com.avito.android.beduin.common.component.photo_picker.items.Photo.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28795a f101957l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28797c(C28795a c28795a) {
        super(1);
        this.f101957l = c28795a;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar) {
        C28795a c28795a = this.f101957l;
        p pVar = c28795a.f101950j;
        String f103350r = c28795a.f101947g.getF103350r();
        String f100853b = c28795a.f101951k.getF100853b();
        pVar.getClass();
        BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = aVar.f101986b;
        Parcelable parcelable = photoPickerImage.f101922d;
        if (parcelable == null) {
            parcelable = BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Loaded.f101927b;
        }
        if (parcelable instanceof BeduinPhotoPickerModel.PhotoPickerImage.LoadingState.Error) {
            p.a aVar2 = new p.a(f103350r, f100853b);
            InterfaceC43779a interfaceC43779a = pVar.f102037b.get(f103350r);
            BeduinModel beduinModelB = interfaceC43779a != null ? interfaceC43779a.b(f100853b) : null;
            BeduinPhotoPickerModel beduinPhotoPickerModel = beduinModelB instanceof BeduinPhotoPickerModel ? (BeduinPhotoPickerModel) beduinModelB : null;
            if (beduinPhotoPickerModel != null) {
                if (photoPickerImage.f101923e) {
                    pVar.e(aVar2, photoPickerImage);
                } else {
                    pVar.b(aVar2, beduinPhotoPickerModel.getImageUploadParams(), beduinPhotoPickerModel.getConstraints(), photoPickerImage);
                }
            }
        }
        return G0.f406611a;
    }
}
