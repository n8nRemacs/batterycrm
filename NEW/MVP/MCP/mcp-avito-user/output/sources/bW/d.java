package Bw;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealRoomAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBw/d;", "LBw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements InterfaceC13195c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f1800a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DealRoomArguments f1801b;

    @Inject
    public d(@k InterfaceC28373a interfaceC28373a, @k DealRoomArguments dealRoomArguments) {
        this.f1800a = interfaceC28373a;
        this.f1801b = dealRoomArguments;
    }

    @Override // Bw.InterfaceC13195c
    public final void a(@k GetDealRoomInfoResponse.Deal.Progress.State state, @k String str) {
        this.f1800a.c(new f(this.f1801b.getF137569d(), str, state.f136513b));
    }

    @Override // Bw.InterfaceC13195c
    public final void b(@k String str) {
        this.f1800a.c(new h(str));
    }

    @Override // Bw.InterfaceC13195c
    public final void c(@k String str) {
        this.f1800a.c(new g(str));
    }

    @Override // Bw.InterfaceC13195c
    public final void d(@k String str) {
        this.f1800a.c(new C13193a(str));
    }

    @Override // Bw.InterfaceC13195c
    public final void e(@k String str, @k String str2) {
        this.f1800a.c(new C13194b(str, str2));
    }

    @Override // Bw.InterfaceC13195c
    public final void f(@k String str, @k String str2) {
        this.f1800a.c(new i(str, str2));
    }
}
