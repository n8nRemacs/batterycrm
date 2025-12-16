package com.avito.android.str_calendar.seller.calendar.konveyor.items.day;

import Jy0.InterfaceC14261a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerCalendarDayItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/day/f;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/day/h;", "Lcom/avito/android/str_calendar/seller/calendar/konveyor/items/day/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.f<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14261a, G0> f287642b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC14261a, G0> lVar) {
        this.f287642b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        if (!(obj instanceof d)) {
            obj = null;
        }
        d dVar = (d) obj;
        if (dVar == null) {
            k(hVar, aVar2);
            return;
        }
        String str = dVar.f287632a;
        if (str != null) {
            hVar.nF(str);
        }
        String str2 = dVar.f287634c;
        if (str2 != null) {
            hVar.Ki(str2);
        }
        Integer num = dVar.f287633b;
        if (num != null) {
            hVar.UY(num.intValue());
        }
        if (dVar.f287635d) {
            hVar.FZ(aVar2.f287623j);
        }
        if (dVar.f287636e) {
            hVar.zz(aVar2.f287624k);
        }
        if (dVar.f287637f) {
            hVar.Fs(aVar2.f287622i);
        }
        if (dVar.f287638g) {
            Integer num2 = aVar2.f287625l;
            hVar.Ft(num2, num2 != null);
        }
        if (dVar.f287639h) {
            Integer num3 = aVar2.f287626m;
            hVar.Cl(num3, num3 != null);
        }
        hVar.Vm(aVar2.f287616c);
        hVar.nQ(aVar2.f287617d);
        hVar.X(aVar2.f287620g ? new e(this, aVar2) : null);
    }

    public final void k(@k h hVar, @k a aVar) {
        hVar.Vm(aVar.f287616c);
        hVar.nQ(aVar.f287617d);
        hVar.nF(aVar.f287618e);
        hVar.Ki(aVar.f287619f);
        hVar.UY(aVar.f287621h);
        hVar.Fs(aVar.f287622i);
        hVar.FZ(aVar.f287623j);
        hVar.zz(aVar.f287624k);
        Integer num = aVar.f287625l;
        hVar.Ft(num, num != null);
        Integer num2 = aVar.f287626m;
        hVar.Cl(num2, num2 != null);
        e eVar = new e(this, aVar);
        if (!aVar.f287620g) {
            eVar = null;
        }
        hVar.X(eVar);
    }
}
