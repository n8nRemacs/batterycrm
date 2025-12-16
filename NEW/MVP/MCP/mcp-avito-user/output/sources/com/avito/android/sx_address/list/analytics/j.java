package com.avito.android.sx_address.list.analytics;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.sx_address.SxAddressListParams;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressListAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/analytics/j;", "Lcom/avito/android/sx_address/list/analytics/i;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f293060a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f293061b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SxAddressListParams f293062c;

    @Inject
    public j(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k g gVar, @Y61.k SxAddressListParams sxAddressListParams) {
        this.f293060a = interfaceC28373a;
        this.f293061b = gVar;
        this.f293062c = sxAddressListParams;
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void a() {
        this.f293060a.c(new e(this.f293061b.a()));
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void b() {
        this.f293060a.c(new b(this.f293061b.a(), this.f293061b.f293059d));
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void c(@Y61.k String str) {
        InterfaceC28373a interfaceC28373a = this.f293060a;
        String strA = this.f293061b.a();
        Long l12 = this.f293061b.f293057b;
        g gVar = this.f293061b;
        if (gVar.f293058c == -1) {
            V2.f318762a.e("SxAddressListAnalytics data is not setup", null);
        }
        interfaceC28373a.c(new f(strA, l12, gVar.f293058c, str));
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void d() {
        this.f293060a.c(new a(this.f293061b.a(), ActionType.f293042b));
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void e(long j12, @l Long l12, @Y61.k String str) {
        this.f293061b.f293056a = str;
        this.f293061b.f293057b = l12;
        this.f293061b.f293058c = j12;
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void f() {
        this.f293060a.c(new d(this.f293061b.a(), this.f293062c.f292542c));
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void g() {
        this.f293060a.c(new a(this.f293061b.a(), ActionType.f293043c));
    }

    @Override // com.avito.android.sx_address.list.analytics.i
    public final void h() {
        String strA = this.f293061b.a();
        ActionType actionType = ActionType.f293042b;
        this.f293060a.c(new c(strA));
    }
}
