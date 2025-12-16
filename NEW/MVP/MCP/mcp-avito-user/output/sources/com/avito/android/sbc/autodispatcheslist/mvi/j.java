package com.avito.android.sbc.autodispatcheslist.mvi;

import Ro0.c;
import Ro0.d;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.sbc.autodispatcheslist.AutoDispatchListInfo;
import com.avito.android.sbc.autodispatcheslist.adapter.DispatchViewStatus;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchItemOut;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SbcAutoDispatchesListReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LRo0/c;", "LRo0/d;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<Ro0.c, Ro0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.g f259138b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.h f259139c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sbc.utils.a f259140d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AutoDispatchListInfo f259141e;

    /* compiled from: SbcAutoDispatchesListReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f259142a;

        static {
            int[] iArr = new int[AutoDispatchOut.Status.values().length];
            try {
                iArr[AutoDispatchOut.Status.Created.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoDispatchOut.Status.Inactive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AutoDispatchOut.Status.Active.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f259142a = iArr;
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.sbc.utils.g gVar, @Y61.k com.avito.android.sbc.utils.h hVar, @Y61.k com.avito.android.sbc.utils.a aVar, @Y61.k AutoDispatchListInfo autoDispatchListInfo) {
        this.f259138b = gVar;
        this.f259139c = hVar;
        this.f259140d = aVar;
        this.f259141e = autoDispatchListInfo;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ro0.d a(Ro0.c cVar, Ro0.d dVar) {
        Ro0.d cVar2;
        Ro0.d c0983d;
        Ro0.c cVar3;
        Ro0.d dVar2;
        Iterator it;
        DispatchViewStatus dispatchViewStatus;
        com.avito.android.sbc.utils.a aVar;
        String strR;
        Ro0.c cVar4 = cVar;
        Ro0.d dVar3 = dVar;
        int i12 = 1;
        if (!(cVar4 instanceof c.a)) {
            if (!(cVar4 instanceof c.e)) {
                cVar2 = dVar3;
                if (cVar4 instanceof c.d) {
                    c0983d = new d.e(cVar2.a());
                } else if (cVar4 instanceof c.C0982c) {
                    c0983d = new d.C0983d(cVar2.a());
                }
                return c0983d;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = dVar3.a().iterator();
            while (it2.hasNext()) {
                com.avito.android.sbc.autodispatcheslist.adapter.f fVar = (com.avito.android.sbc.autodispatcheslist.adapter.f) it2.next();
                long j12 = ((c.e) cVar4).f14645a.f259043b;
                long j13 = fVar.f259043b;
                if (j12 == j13) {
                    it = it2;
                    cVar3 = cVar4;
                    dVar2 = dVar3;
                    arrayList.add(new com.avito.android.sbc.autodispatcheslist.adapter.f(j13, fVar.f259044c, fVar.f259045d, !fVar.f259046e, fVar.f259047f, fVar.f259048g, fVar.f259049h, fVar.f259050i, fVar.f259051j, fVar.f259052k, fVar.f259053l));
                } else {
                    cVar3 = cVar4;
                    dVar2 = dVar3;
                    it = it2;
                    arrayList.add(fVar);
                }
                it2 = it;
                cVar4 = cVar3;
                dVar3 = dVar2;
            }
            cVar2 = dVar3;
            if (cVar2 instanceof d.C0983d) {
                return new d.C0983d(arrayList);
            }
            if (cVar2 instanceof d.e) {
                return new d.e(arrayList);
            }
            if (cVar2 instanceof d.c) {
                cVar2 = new d.c(arrayList, ((d.c) cVar2).f14650b);
            }
            return cVar2;
        }
        c.a aVar2 = (c.a) cVar4;
        List<AutoDispatchOut> list = aVar2.f14640a;
        int i13 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            AutoDispatchOut autoDispatchOut = (AutoDispatchOut) it3.next();
            Iterator<T> it4 = autoDispatchOut.f().iterator();
            long chatsOpened = 0;
            long messagesSent = 0;
            while (it4.hasNext()) {
                messagesSent += ((AutoDispatchItemOut) it4.next()).getMessagesSent();
            }
            Iterator<T> it5 = autoDispatchOut.f().iterator();
            while (it5.hasNext()) {
                chatsOpened += ((AutoDispatchItemOut) it5.next()).getChatsOpened();
            }
            long id2 = autoDispatchOut.getId();
            int i14 = a.f259142a[autoDispatchOut.getStatus().ordinal()];
            if (i14 == i12) {
                dispatchViewStatus = DispatchViewStatus.f259024c;
            } else if (i14 == 2) {
                dispatchViewStatus = DispatchViewStatus.f259025d;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dispatchViewStatus = DispatchViewStatus.f259023b;
            }
            DispatchViewStatus dispatchViewStatus2 = dispatchViewStatus;
            List<AutoDispatchItemOut> listF = autoDispatchOut.f();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listF, i13));
            Iterator it6 = listF.iterator();
            while (true) {
                boolean zHasNext = it6.hasNext();
                aVar = this.f259140d;
                if (!zHasNext) {
                    break;
                }
                AutoDispatchItemOut autoDispatchItemOut = (AutoDispatchItemOut) it6.next();
                Iterator it7 = it3;
                ArrayList arrayList4 = arrayList2;
                Iterator it8 = it6;
                arrayList3.add(new com.avito.android.sbc.autodispatcheslist.adapter.a(autoDispatchItemOut.getImg(), autoDispatchItemOut.getName(), aVar.a(autoDispatchItemOut.getPrice()), autoDispatchItemOut.getStatus() != AutoDispatchItemOut.Status.Inactive, null, 16, null));
                it6 = it8;
                it3 = it7;
                arrayList2 = arrayList4;
            }
            Iterator it9 = it3;
            ArrayList arrayList5 = arrayList2;
            long createdAt = autoDispatchOut.getCreatedAt();
            com.avito.android.sbc.utils.g gVar = this.f259138b;
            LocalDate localDateF = gVar.f(createdAt);
            LocalDate localDateF2 = gVar.f(autoDispatchOut.getExpiresAt());
            int year = localDateF.getYear();
            int year2 = localDateF2.getYear();
            InterfaceC42726C interfaceC42726C = gVar.f260187c;
            if (year == year2 && localDateF.getMonth() == localDateF2.getMonth()) {
                strR = localDateF.getDayOfMonth() + " — " + com.avito.android.sbc.utils.g.a(localDateF2.format((DateTimeFormatter) interfaceC42726C.getValue()));
            } else {
                strR = r.r(com.avito.android.sbc.utils.g.a(localDateF.format((DateTimeFormatter) interfaceC42726C.getValue())), " — ", com.avito.android.sbc.utils.g.a(localDateF2.format((DateTimeFormatter) interfaceC42726C.getValue())));
            }
            String str = strR;
            String offer = autoDispatchOut.getOffer();
            com.avito.android.sbc.utils.h hVar = this.f259139c;
            arrayList2 = arrayList5;
            arrayList2.add(new com.avito.android.sbc.autodispatcheslist.adapter.f(id2, dispatchViewStatus2, arrayList3, false, str, offer, hVar.f260189a.format(messagesSent), hVar.f260189a.format(chatsOpened), aVar.a(autoDispatchOut.getBudgetTotal()), aVar.a(autoDispatchOut.getBudgetTotal() - autoDispatchOut.getBudgetLeft()), autoDispatchOut.getCreatedAt()));
            it3 = it9;
            i12 = 1;
            i13 = 10;
        }
        return aVar2.f14641b ? new d.c(arrayList2, !this.f259141e.f258987b) : new d.C0983d(arrayList2);
    }
}
