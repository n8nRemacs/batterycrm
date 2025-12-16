package com.avito.android.date_time_picker;

import Y41.l;
import com.avito.android.R;
import com.avito.android.date_time_picker.DateTimeWheel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.util.D6;
import java.util.EnumMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lu.InterfaceC43831a;

/* compiled from: DateTimePicker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "wheelValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements l<com.avito.android.lib.design.picker.k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f132666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DateTimeWheel.Type f132667m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Picker f132668n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, DateTimeWheel.Type type, Picker picker) {
        super(1);
        this.f132666l = aVar;
        this.f132667m = type;
        this.f132668n = picker;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar) {
        com.avito.android.lib.design.picker.k<?> kVar2 = kVar;
        a aVar = this.f132666l;
        EnumMap enumMap = aVar.f132657H;
        if (enumMap == null) {
            enumMap = null;
        }
        InterfaceC43831a interfaceC43831a = (InterfaceC43831a) enumMap.get(this.f132667m);
        if (interfaceC43831a != null) {
            interfaceC43831a.b(kVar2, aVar.f132656G);
        }
        DateTimeWheel.Type type = DateTimeWheel.Type.f132593b;
        Picker picker = this.f132668n;
        com.avito.android.lib.design.picker.k<?> kVarV = aVar.V(picker, type);
        com.avito.android.lib.design.picker.k<?> kVarV2 = aVar.V(picker, DateTimeWheel.Type.f132594c);
        com.avito.android.lib.design.picker.k<?> kVarV3 = aVar.V(picker, DateTimeWheel.Type.f132595d);
        if (kVarV != null && kVarV2 != null && kVarV3 != null) {
            com.avito.android.lib.design.picker.k.f180042c.getClass();
            if (k.a.a(kVarV, kVarV2, kVarV3)) {
                Button button = aVar.f132658I;
                if (button == null) {
                    button = null;
                }
                button.setText(aVar.f132654E.f132665g.k0(aVar.getContext()));
                Button button2 = aVar.f132658I;
                D6.k(button2 != null ? button2 : null);
            } else {
                Button button3 = aVar.f132658I;
                if (button3 == null) {
                    button3 = null;
                }
                button3.setText(aVar.getContext().getString(R.string.dialog_date_error));
                Button button4 = aVar.f132658I;
                D6.h(button4 != null ? button4 : null);
            }
        }
        return G0.f406611a;
    }
}
