package com.avito.android.beduin.common.component.item_color_picker;

import Y61.k;
import com.avito.android.beduin.common.component.item_color_picker.BeduinItemColorPickerModel;
import com.avito.android.lib.design.item_color_picker.ItemColorPicker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeduinItemColorPickerComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/b;", "Lcom/avito/android/lib/design/item_color_picker/ItemColorPicker$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements ItemColorPicker.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.item_color_picker.a f101630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ItemColorPicker f101631b;

    /* compiled from: BeduinItemColorPickerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101632a;

        static {
            int[] iArr = new int[BeduinItemColorPickerModel.ItemColorSelectionType.values().length];
            try {
                iArr[BeduinItemColorPickerModel.ItemColorSelectionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinItemColorPickerModel.ItemColorSelectionType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinItemColorPickerModel.ItemColorSelectionType.SINGLE_OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101632a = iArr;
        }
    }

    public b(com.avito.android.beduin.common.component.item_color_picker.a aVar, ItemColorPicker itemColorPicker) {
        this.f101630a = aVar;
        this.f101631b = itemColorPicker;
    }

    @Override // com.avito.android.lib.design.item_color_picker.ItemColorPicker.c
    public final void a(@k com.avito.android.lib.design.item_color_picker.a aVar) {
        com.avito.android.beduin.common.component.item_color_picker.a aVar2 = this.f101630a;
        int i12 = a.f101632a[aVar2.f101620f.g().ordinal()];
        boolean z12 = true;
        if (i12 == 1) {
            z12 = false;
        } else if (i12 != 2 && i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.beduin.common.component.item_color_picker.a.u(aVar2, aVar, this.f101631b, z12);
    }

    @Override // com.avito.android.lib.design.item_color_picker.ItemColorPicker.c
    public final void b(@k com.avito.android.lib.design.item_color_picker.a aVar) {
        com.avito.android.beduin.common.component.item_color_picker.a.u(this.f101630a, aVar, this.f101631b, true);
    }
}
