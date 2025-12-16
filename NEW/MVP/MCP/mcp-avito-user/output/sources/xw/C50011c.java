package xw;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DealCabinetAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxw/c;", "Lxw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xw.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C50011c implements InterfaceC50010b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f442698a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DealCabinetArguments f442699b;

    @Inject
    public C50011c(@k InterfaceC28373a interfaceC28373a, @k DealCabinetArguments dealCabinetArguments) {
        this.f442698a = interfaceC28373a;
        this.f442699b = dealCabinetArguments;
    }

    @Override // xw.InterfaceC50010b
    public final void a(@k String str) {
        this.f442698a.c(new h(str));
    }

    @Override // xw.InterfaceC50010b
    public final void b(@k String str) {
        this.f442698a.c(new C50014f(str));
    }

    @Override // xw.InterfaceC50010b
    public final void c() {
        this.f442698a.c(new C50013e(this.f442699b.f136756b));
    }

    @Override // xw.InterfaceC50010b
    public final void d(@k GetClientListRequestStage getClientListRequestStage) {
        this.f442698a.c(new C50009a(this.f442699b.f136756b, getClientListRequestStage.f136500b));
    }

    @Override // xw.InterfaceC50010b
    public final void e(@k String str) {
        this.f442698a.c(new g(str));
    }

    @Override // xw.InterfaceC50010b
    public final void f(@k String str) {
        this.f442698a.c(new i(str));
    }
}
