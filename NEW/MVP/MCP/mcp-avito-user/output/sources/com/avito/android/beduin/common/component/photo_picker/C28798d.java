package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.beduin.common.component.photo_picker.BeduinPhotoPickerModel;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhotoPickerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;", "photoItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/photo_picker/items/Photo/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.beduin.common.component.photo_picker.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28798d extends N implements Y41.l<com.avito.android.beduin.common.component.photo_picker.items.Photo.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28795a f101958l;

    /* compiled from: BeduinPhotoPickerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.photo_picker.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101959a;

        static {
            int[] iArr = new int[BeduinPhotoPickerModel.ActionType.values().length];
            try {
                iArr[BeduinPhotoPickerModel.ActionType.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinPhotoPickerModel.ActionType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinPhotoPickerModel.ActionType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101959a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28798d(C28795a c28795a) {
        super(1);
        this.f101958l = c28795a;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar) {
        BeduinPhotoPickerModel.ActionType actionType;
        List<BeduinAction> listD;
        com.avito.android.beduin.common.component.photo_picker.items.Photo.a aVar2 = aVar;
        BeduinPhotoPickerModel.PhotoPickerImage photoPickerImage = aVar2.f101986b;
        BeduinPhotoPickerModel.ControlButton controlButton = photoPickerImage.getControlButton();
        C28795a c28795a = this.f101958l;
        if (controlButton != null && (listD = controlButton.d()) != null) {
            C28806b.a(c28795a.f101945e, listD);
        }
        BeduinPhotoPickerModel.ControlButton controlButton2 = photoPickerImage.getControlButton();
        if (controlButton2 != null && (actionType = controlButton2.getActionType()) != null) {
            int i12 = a.f101959a[actionType.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    p pVar = c28795a.f101950j;
                    String f103350r = c28795a.f101947g.getF103350r();
                    String f100853b = c28795a.f101951k.getF100853b();
                    Long l12 = photoPickerImage.f101921c;
                    String string = l12 != null ? l12.toString() : null;
                    if (string != null) {
                        pVar.f102036a.f102075a.b(string);
                        pVar.d(f103350r, f100853b);
                    } else {
                        pVar.getClass();
                    }
                } else if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                G0 g02 = G0.f406611a;
            } else {
                c28795a.v(aVar2);
                G0 g03 = G0.f406611a;
            }
        }
        return G0.f406611a;
    }
}
