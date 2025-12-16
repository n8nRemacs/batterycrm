package com.avito.android.service_booking_common.blueprints.date.timeslot_list;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.lib.design.button.Button;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_booking_common.blueprints.date.m;
import com.avito.android.util.C35835l0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import qt0.C47440d;

/* compiled from: SbTimeslotListItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/g;", "Lcom/avito/android/service_booking_common/blueprints/date/timeslot_list/d;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276401b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        k((i) eVar, (C47440d.a) aVar);
    }

    @Override // com.avito.android.service_booking_common.blueprints.date.timeslot_list.d
    /* renamed from: f, reason: from getter */
    public final e2 getF276401b() {
        return this.f276401b;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) throws Resources.NotFoundException {
        i iVar = (i) eVar;
        C47440d.a aVar2 = (C47440d.a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof m) {
                obj = obj2;
            }
        }
        m mVar = (m) (obj instanceof m ? obj : null);
        if (mVar == null) {
            k(iVar, aVar2);
        } else if (mVar.f276366a != null) {
            iVar.getClass();
            iVar.f276405c.setAppearance(C35835l0.j(aVar2.f429418e ? iVar.f276407e : iVar.f276408f, iVar.f276406d));
            iVar.itemView.setOnClickListener(new A(6, new f(this, aVar2)));
        }
    }

    public final void k(@k i iVar, @k C47440d.a aVar) throws Resources.NotFoundException {
        e eVar = new e(this, aVar);
        String strA = iVar.f276404b.a(Long.valueOf(aVar.f429417d.getTime()));
        Button button = iVar.f276405c;
        button.setText(strA);
        button.setAppearance(C35835l0.j(aVar.f429418e ? iVar.f276407e : iVar.f276408f, iVar.f276406d));
        iVar.itemView.setOnClickListener(new A(6, eVar));
    }
}
