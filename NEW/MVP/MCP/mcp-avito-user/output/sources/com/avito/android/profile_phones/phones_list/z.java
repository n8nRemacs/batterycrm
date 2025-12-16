package com.avito.android.profile_phones.phones_list;

import android.view.View;
import com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "clickedView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class z extends kotlin.jvm.internal.N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhonesListFragment f228334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f228335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScheduleOption f228336n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PhonesListFragment phonesListFragment, ArrayList arrayList, ScheduleOption scheduleOption) {
        super(1);
        this.f228334l = phonesListFragment;
        this.f228335m = arrayList;
        this.f228336n = scheduleOption;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
        PhonesListFragment phonesListFragment = this.f228334l;
        for (ListItemCheckmark listItemCheckmark : this.f228335m) {
            listItemCheckmark.setState((kV.b) new kV.d(listItemCheckmark.getTitle(), listItemCheckmark.getSubtitle(), null, null, null, false, null, new ToggleState(null, false, false, false, kotlin.jvm.internal.L.f(view2, listItemCheckmark) ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 15, null), false, false, 892, null));
        }
        phonesListFragment.D5().accept(new InterfaceC49590a.o(this.f228336n));
        com.avito.android.lib.design.bottom_sheet.d dVar = phonesListFragment.f227389I0;
        if (dVar != null) {
            dVar.dismiss();
        }
        return G0.f406611a;
    }
}
