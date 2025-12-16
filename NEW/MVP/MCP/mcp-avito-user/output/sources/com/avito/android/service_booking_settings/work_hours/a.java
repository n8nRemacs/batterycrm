package com.avito.android.service_booking_settings.work_hours;

import Ut0.g;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.N0;
import java.util.ArrayList;
import java.util.List;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingWorkHoursFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUt0/h;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LUt0/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.l<Ut0.h, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingWorkHoursFragment f277920l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment) {
        super(1);
        this.f277920l = serviceBookingWorkHoursFragment;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(Ut0.h hVar) {
        int i12 = 3;
        Ut0.h hVar2 = hVar;
        boolean z12 = hVar2.f16740b;
        ServiceBookingWorkHoursFragment serviceBookingWorkHoursFragment = this.f277920l;
        if (z12) {
            h hVar3 = serviceBookingWorkHoursFragment.f277907x0;
            C42670a.d((hVar3 != null ? hVar3 : null).f277940f.f278147f);
        } else if (hVar2.f16741c != null) {
            h hVar4 = serviceBookingWorkHoursFragment.f277907x0;
            if (hVar4 == null) {
                hVar4 = null;
            }
            hVar4.f277940f.f278147f.c(null, new i(hVar4));
        } else {
            h hVar5 = serviceBookingWorkHoursFragment.f277907x0;
            if (hVar5 == null) {
                hVar5 = null;
            }
            hVar5.f277940f.f278147f.b();
            List listV = C42745f0.V(hVar2.f16749k);
            ArrayList arrayListB = C42756l.B(new com.avito.conveyor_item.a[]{hVar2.f16748j, hVar2.f16747i, hVar2.f16751m});
            h hVar6 = serviceBookingWorkHoursFragment.f277907x0;
            h hVar7 = hVar6 != null ? hVar6 : null;
            ArrayList arrayListH0 = C42745f0.h0(arrayListB, C42745f0.h0(hVar2.f16744f, listV));
            hVar7.getClass();
            hVar7.f277937c.c(new UV0.c(arrayListH0));
            w wVar = hVar7.f277940f;
            wVar.f278142a.setTitle(hVar2.f16742d);
            ?? r42 = wVar.f278148g;
            Ut0.g gVar = hVar2.f16750l;
            if (gVar == null || !gVar.f16735f) {
                com.avito.android.lib.design.modal.a aVar = wVar.f278149h;
                if (aVar != null) {
                    N0.a(aVar);
                }
            } else {
                com.avito.android.lib.design.modal.a aVarC = wVar.f278149h;
                if (aVarC == null) {
                    com.avito.android.service_booking_utils.save_schedule_modal.f fVar = (com.avito.android.service_booking_utils.save_schedule_modal.f) r42.getValue();
                    fVar.f278393c = gVar.f16730a;
                    fVar.f278394d = gVar.f16731b;
                    g.a aVar2 = gVar.f16732c;
                    fVar.a(aVar2.f16736a, aVar2.f16737b, new j(hVar7));
                    g.a aVar3 = gVar.f16733d;
                    fVar.b(aVar3.f16736a, aVar3.f16737b, new k(hVar7));
                    aVarC = fVar.c();
                }
                wVar.f278149h = aVarC;
                com.avito.android.lib.util.g.a(aVarC);
                com.avito.android.lib.design.modal.a aVar4 = wVar.f278149h;
                if (aVar4 != null) {
                    aVar4.setOnShowListener(new Da1.b(i12, hVar7, gVar));
                }
            }
            Button button = wVar.f278143b;
            com.avito.android.lib.design.button.b.a(button, hVar2.f16743e, false);
            Ut0.f fVar2 = hVar2.f16746h;
            D6.G(wVar.f278144c, fVar2.f16728a);
            com.avito.android.service_booking_utils.save_schedule_modal.b bVar = (com.avito.android.service_booking_utils.save_schedule_modal.b) ((com.avito.android.service_booking_utils.save_schedule_modal.f) r42.getValue()).f278392b.getValue();
            boolean z13 = fVar2.f16729b;
            bVar.setViewLoading(z13);
            button.setLoading(z13);
            boolean z14 = !z13;
            button.setClickable(z14);
            D6.F(wVar.f278145d, z14);
        }
        return G0.f406611a;
    }
}
