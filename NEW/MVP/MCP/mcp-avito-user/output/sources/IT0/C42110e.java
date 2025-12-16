package it0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TooltipStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lit0/e;", "Lit0/d;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: it0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42110e implements InterfaceC42109d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f405350a;

    @Inject
    public C42110e(@k l lVar) {
        this.f405350a = lVar;
    }

    public static String c(InterfaceC42106a interfaceC42106a) {
        if (interfaceC42106a instanceof C42108c) {
            return "flexible_calendar.tooltip." + ((C42108c) interfaceC42106a).f405348d;
        }
        if (interfaceC42106a instanceof C42107b) {
            return "flexible_calendar.tooltip.schedule_btn";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // it0.InterfaceC42109d
    public final boolean a(@k InterfaceC42106a interfaceC42106a) {
        return this.f405350a.c(c(interfaceC42106a));
    }

    @Override // it0.InterfaceC42109d
    public final void b(@k InterfaceC42106a interfaceC42106a) {
        this.f405350a.putBoolean(c(interfaceC42106a), true);
    }
}
