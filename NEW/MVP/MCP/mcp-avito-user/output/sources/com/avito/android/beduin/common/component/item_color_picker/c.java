package com.avito.android.beduin.common.component.item_color_picker;

import Y41.l;
import com.avito.android.beduin.common.component.item_color_picker.BeduinItemColorPickerModel;
import com.avito.android.beduin.common.component.item_color_picker.a;
import com.avito.android.lib.design.item_color_picker.ItemColorPicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinItemColorPickerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/ItemColorChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/item_color_picker/ItemColorChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<ItemColorChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ItemColorPicker f101633l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.item_color_picker.a f101634m;

    /* compiled from: BeduinItemColorPickerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ItemColorChange.values().length];
            try {
                iArr[ItemColorChange.f101610c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemColorChange.f101611d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ItemColorChange.f101612e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.beduin.common.component.item_color_picker.a aVar, ItemColorPicker itemColorPicker) {
        super(1);
        this.f101633l = itemColorPicker;
        this.f101634m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ItemColorChange itemColorChange) {
        int iOrdinal = itemColorChange.ordinal();
        com.avito.android.beduin.common.component.item_color_picker.a aVar = this.f101634m;
        ItemColorPicker itemColorPicker = this.f101633l;
        if (iOrdinal == 0) {
            itemColorPicker.setEnabled(aVar.f101620f.isEnabled());
            BeduinItemColorPickerModel beduinItemColorPickerModel = aVar.f101620f;
            List<BeduinItemColorPickerModel.ItemColorPickerOption> options = beduinItemColorPickerModel.getOptions();
            if (options == null) {
                options = C42784z0.f406748b;
            }
            List<BeduinItemColorPickerModel.ItemColorPickerOption> list = options;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new a.C3044a(itemColorPicker.getContext(), (BeduinItemColorPickerModel.ItemColorPickerOption) it.next(), beduinItemColorPickerModel.getSelectionStrokeColor()));
            }
            itemColorPicker.setData(arrayList);
        } else if (iOrdinal == 1) {
            aVar.v(itemColorPicker, aVar.f101620f.e());
        } else if (iOrdinal == 2) {
            itemColorPicker.setError(aVar.f101620f.getErrorMessage());
        }
        return G0.f406611a;
    }
}
