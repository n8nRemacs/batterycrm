package com.avito.android.service_booking_calendar.flexible.content.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import gt0.InterfaceC40733a;
import gt0.InterfaceC40734b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalendarContentActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/content/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lgt0/a;", "Lgt0/b;", "Lgt0/d;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC40733a, InterfaceC40734b, gt0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.ux_feedback.h f275662a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f275663b = C42727D.c(new a());

    /* compiled from: CalendarContentActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<DeepLink> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final DeepLink invoke() {
            return d.this.f275662a.a();
        }
    }

    @Inject
    public d(@Y61.k com.avito.android.service_booking_utils.ux_feedback.h hVar) {
        this.f275662a = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC40734b> b(InterfaceC40733a interfaceC40733a, gt0.d dVar) {
        C43210w c43210w;
        InterfaceC40733a interfaceC40733a2 = interfaceC40733a;
        gt0.d dVar2 = dVar;
        if (interfaceC40733a2 instanceof InterfaceC40733a.h) {
            return new C43210w(new InterfaceC40734b.f(((InterfaceC40733a.h) interfaceC40733a2).f396903a));
        }
        if (interfaceC40733a2 instanceof InterfaceC40733a.i) {
            c43210w = new C43210w(InterfaceC40734b.g.f396912a);
        } else {
            if (interfaceC40733a2 instanceof InterfaceC40733a.g) {
                return new C43210w(new InterfaceC40734b.h(((InterfaceC40733a.g) interfaceC40733a2).f396902a));
            }
            if (interfaceC40733a2 instanceof InterfaceC40733a.c) {
                c43210w = new C43210w(InterfaceC40734b.g.f396912a);
            } else {
                if (!(interfaceC40733a2 instanceof InterfaceC40733a.b)) {
                    if (interfaceC40733a2 instanceof InterfaceC40733a.d) {
                        return C43175k.G(new com.avito.android.service_booking_calendar.flexible.content.mvi.a(interfaceC40733a2, dVar2, null));
                    }
                    if (interfaceC40733a2 instanceof InterfaceC40733a.f) {
                        return new C43210w(new InterfaceC40734b.d(((InterfaceC40733a.f) interfaceC40733a2).f396901a));
                    }
                    if (interfaceC40733a2 instanceof InterfaceC40733a.e) {
                        return C43175k.G(new b(interfaceC40733a2, this, null));
                    }
                    if (interfaceC40733a2 instanceof InterfaceC40733a.C11232a) {
                        return C43175k.G(new c(dVar2, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(InterfaceC40734b.a.f396905a);
            }
        }
        return c43210w;
    }
}
