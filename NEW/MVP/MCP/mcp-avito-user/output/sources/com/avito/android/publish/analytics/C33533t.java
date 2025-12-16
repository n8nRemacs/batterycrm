package com.avito.android.publish.analytics;

import Cd0.C13280p;
import Cd0.C13282q;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishDeliveryEventTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/analytics/t;", "Lcom/avito/android/publish/analytics/s;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33533t implements InterfaceC33532s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f232275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f232276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f232277c;

    @Inject
    public C33533t(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f232275a = interfaceC28373a;
        this.f232276b = c50213a;
        this.f232277c = aVar;
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void J0(boolean z12) {
        this.f232275a.c(new Cd0.N("Avito.Delivery / Вкл-Выкл ПВЗ доставки для объявления на подаче", 5152, 0, this.f232276b.c(), this.f232277c.a(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void K0(boolean z12) {
        this.f232275a.c(new Cd0.P(this.f232277c.a(), this.f232276b.c(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void M0(@Y61.k String str) {
        this.f232275a.c(new Cd0.S(str, this.f232276b.c()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void V(boolean z12) {
        this.f232275a.c(new Cd0.M("Avito.Delivery / Вкл-Выкл ПВЗ доставки в постаматы для объявления на подаче", 5555, 0, this.f232276b.c(), this.f232277c.a(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void a0(boolean z12) {
        this.f232275a.c(new C13282q(this.f232276b.c(), z12));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void f() {
        this.f232275a.c(new Cd0.T(this.f232277c.a(), this.f232276b.c()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void k() {
        this.f232275a.c(new C13280p(this.f232276b.c()));
    }

    @Override // com.avito.android.publish.analytics.InterfaceC33532s
    public final void m0(boolean z12) {
        this.f232275a.c(new Cd0.K("Avito.Delivery / Вкл-Выкл курьерской доставки для объявления на подаче", 5163, 0, this.f232276b.c(), this.f232277c.a(), z12));
    }
}
