package com.avito.android.select.new_metro.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.SelectMetroParams;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import gq0.InterfaceC40721a;
import iq0.InterfaceC42091a;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectMetroActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Liq0/a;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC42091a, SelectMetroInternalAction, SelectMetroState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SelectMetroParams f266228a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40721a f266229b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ItemsHolder f266230c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.new_metro.o f266231d;

    @Inject
    public e(@Y61.k SelectMetroParams selectMetroParams, @Y61.k InterfaceC40721a interfaceC40721a, @Y61.k ItemsHolder itemsHolder, @Y61.k com.avito.android.select.new_metro.o oVar) {
        this.f266228a = selectMetroParams;
        this.f266229b = interfaceC40721a;
        this.f266230c = itemsHolder;
        this.f266231d = oVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SelectMetroInternalAction> b(InterfaceC42091a interfaceC42091a, SelectMetroState selectMetroState) {
        InterfaceC43160i<SelectMetroInternalAction> c43152f0;
        InterfaceC42091a interfaceC42091a2 = interfaceC42091a;
        SelectMetroState selectMetroState2 = selectMetroState;
        if (interfaceC42091a2 instanceof InterfaceC42091a.e) {
            return new C43210w(new SelectMetroInternalAction.KeyboardVisibilityChanged(((InterfaceC42091a.e) interfaceC42091a2).f405259a));
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.g) {
            return new C43210w(new SelectMetroInternalAction.NewOutputTypeSelected(((InterfaceC42091a.g) interfaceC42091a2).f405261a));
        }
        boolean z12 = interfaceC42091a2 instanceof InterfaceC42091a.C11537a;
        SelectMetroParams selectMetroParams = this.f266228a;
        InterfaceC40721a interfaceC40721a = this.f266229b;
        if (z12) {
            C43210w c43210w = new C43210w(SelectMetroInternalAction.Cancel.f266232b);
            interfaceC40721a.e(selectMetroParams.f265942d, selectMetroParams.f265943e, false, selectMetroState2.c());
            return c43210w;
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.f) {
            return new C43210w(new SelectMetroInternalAction.MetroLineItemChanged(((InterfaceC42091a.f) interfaceC42091a2).f405260a));
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.i) {
            return C43175k.G(new b(interfaceC42091a2, selectMetroState2, null));
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.k) {
            MetroStationItem metroStationItem = ((InterfaceC42091a.k) interfaceC42091a2).f405265a;
            SelectMetroInternalAction.StationItemChanged stationItemChanged = new SelectMetroInternalAction.StationItemChanged(metroStationItem);
            c(metroStationItem.f266202e, metroStationItem.f266204g);
            return new C43210w(stationItemChanged);
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.d) {
            MetroFilterItem metroFilterItem = ((InterfaceC42091a.d) interfaceC42091a2).f405258a;
            SelectMetroInternalAction.FilterItemChanged filterItemChanged = new SelectMetroInternalAction.FilterItemChanged(metroFilterItem);
            c(metroFilterItem.f266179e, metroFilterItem.f266180f);
            return new C43210w(filterItemChanged);
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.j) {
            return new C43210w(new SelectMetroInternalAction.SelectedStationsItemChanged(((InterfaceC42091a.j) interfaceC42091a2).f405264a));
        }
        if (interfaceC42091a2 instanceof InterfaceC42091a.c) {
            ArrayList arrayListC = selectMetroState2.c();
            ArrayList arrayList = new ArrayList();
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                MetroStationItem metroStationItem2 = this.f266230c.c6().get(Integer.valueOf(((Number) it.next()).intValue()));
                if (metroStationItem2 != null) {
                    arrayList.add(metroStationItem2);
                }
            }
            SelectMetroInternalAction.ConfirmClicked confirmClicked = new SelectMetroInternalAction.ConfirmClicked(arrayList);
            if (selectMetroParams.f265945g) {
                interfaceC40721a.h(selectMetroParams.f265944f);
            } else {
                interfaceC40721a.e(selectMetroParams.f265942d, selectMetroParams.f265943e, true, selectMetroState2.c());
            }
            c43152f0 = new C43210w(confirmClicked);
        } else if (interfaceC42091a2 instanceof InterfaceC42091a.b) {
            SelectMetroInternalAction.Clear clear = SelectMetroInternalAction.Clear.f266233b;
            if (selectMetroParams.f265945g) {
                interfaceC40721a.b(selectMetroParams.f265944f);
            }
            c43152f0 = new C43210w(clear);
        } else {
            if (!(interfaceC42091a2 instanceof InterfaceC42091a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            c43152f0 = new C43152f0(new C43137a0(new d(2, null), C43175k.G(new c(this, null))), new a(this, null));
        }
        return c43152f0;
    }

    public final void c(int i12, boolean z12) {
        SelectMetroParams selectMetroParams = this.f266228a;
        if (selectMetroParams.f265945g) {
            String str = selectMetroParams.f265944f;
            InterfaceC40721a interfaceC40721a = this.f266229b;
            if (z12) {
                interfaceC40721a.a(str, String.valueOf(i12));
            } else {
                interfaceC40721a.j(str, String.valueOf(i12));
            }
        }
    }
}
