package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import Bk.InterfaceC13157a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction;
import com.avito.android.deep_linking.links.WebViewLink;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.Util;
import rk.C47672d;
import rk.InterfaceC47669a;

/* compiled from: B2bBusinessTripSelectActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LBk/a;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "LBk/c;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13157a, B2bBusinessTripSelectInternalAction, Bk.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.btob_business_trip.screens.common.interactors.a f108196a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47669a f108197b;

    @Inject
    public a(@Y61.k com.avito.android.btob_business_trip.screens.common.interactors.a aVar, @Y61.k InterfaceC47669a interfaceC47669a) {
        this.f108196a = aVar;
        this.f108197b = interfaceC47669a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<B2bBusinessTripSelectInternalAction> b(InterfaceC13157a interfaceC13157a, Bk.c cVar) {
        InterfaceC13157a interfaceC13157a2 = interfaceC13157a;
        Bk.c cVar2 = cVar;
        if (interfaceC13157a2 instanceof InterfaceC13157a.d) {
            return new C43210w(B2bBusinessTripSelectInternalAction.NavigateBack.f108218b);
        }
        boolean z12 = interfaceC13157a2 instanceof InterfaceC13157a.b;
        InterfaceC47669a interfaceC47669a = this.f108197b;
        if (z12) {
            ArrayList arrayList = new ArrayList(cVar2.f1655d);
            InterfaceC13157a.b bVar = (InterfaceC13157a.b) interfaceC13157a2;
            long j12 = bVar.f1639a;
            if (bVar.f1640b) {
                arrayList.add(Long.valueOf(j12));
            } else {
                arrayList.remove(Long.valueOf(j12));
            }
            interfaceC47669a.a((Long[]) arrayList.toArray(new Long[0]));
            return new C43210w(new B2bBusinessTripSelectInternalAction.OnCheckedChanged(Util.toImmutableList(arrayList)));
        }
        if (interfaceC13157a2 instanceof InterfaceC13157a.C0069a) {
            List<Long> list = ((InterfaceC13157a.C0069a) interfaceC13157a2).f1638a;
            interfaceC47669a.a((Long[]) list.toArray(new Long[0]));
            return this.f108196a.a(list);
        }
        if (interfaceC13157a2 instanceof InterfaceC13157a.c) {
            return new C43210w(B2bBusinessTripSelectInternalAction.Exit.f108214b);
        }
        if (interfaceC13157a2 instanceof InterfaceC13157a.e) {
            return new C43210w(B2bBusinessTripSelectInternalAction.NavigateToSuccessScreen.f108219b);
        }
        if (!(interfaceC13157a2 instanceof InterfaceC13157a.f)) {
            return C43175k.w();
        }
        return new C43210w(new B2bBusinessTripSelectInternalAction.DeeplinkLaunch(new WebViewLink.AnyDomain(Uri.parse(((InterfaceC13157a.f) interfaceC13157a2).f1644a), null, new C47672d().f430158a, 2, null)));
    }
}
