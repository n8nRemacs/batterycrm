package com.avito.android.credits;

import Bs.C13181a;
import com.avito.android.B;
import com.avito.android.V;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.C35793f6;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CreditBrokerAnalyticsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/b;", "Lcom/avito/android/V;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements V {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f128564b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f128565c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f128566d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f128567e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f128568f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public String f128569g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public String f128570h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public String f128571i;

    @Inject
    public b(@Y61.k @InterfaceC30174s String str, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C35793f6 c35793f6, @Y61.l @B Kundle kundle) {
        Boolean boolA;
        Boolean boolA2;
        String strG;
        this.f128564b = str;
        this.f128565c = interfaceC28373a;
        this.f128566d = (kundle == null || (strG = kundle.g("key_session")) == null) ? c35793f6.a() : strG;
        boolean zBooleanValue = false;
        this.f128567e = (kundle == null || (boolA2 = kundle.a("key_use_calc_sent")) == null) ? false : boolA2.booleanValue();
        if (kundle != null && (boolA = kundle.a("key_form_loaded_sent")) != null) {
            zBooleanValue = boolA.booleanValue();
        }
        this.f128568f = zBooleanValue;
        this.f128570h = kundle != null ? kundle.g("key_request_id") : null;
    }

    @Override // com.avito.android.credits.e
    public final void A(int i12, int i13, int i14) {
        if (this.f128568f) {
            return;
        }
        this.f128565c.c(new As.n(i12, i13, i14, this.f128569g, this.f128564b, this.f128566d));
        this.f128568f = true;
    }

    @Override // com.avito.android.V
    public final void B(int i12, int i13, int i14, boolean z12) {
        this.f128565c.c(new As.f(this.f128569g, this.f128564b, this.f128566d, i12, i13, i14, z12, this.f128571i));
    }

    @Override // com.avito.android.V
    public final void D() {
        this.f128565c.c(new Bs.b(this.f128569g, this.f128564b, this.f128571i));
    }

    @Override // com.avito.android.V
    public final void E() {
        this.f128565c.c(new Bs.c(this.f128569g, this.f128564b, this.f128571i));
    }

    @Override // com.avito.android.Y
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF128566d() {
        return this.f128566d;
    }

    @Override // com.avito.android.Z
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF128569g() {
        return this.f128569g;
    }

    @Override // com.avito.android.V
    public final void d() {
        this.f128565c.c(new As.e(this.f128569g, this.f128564b, this.f128571i, this.f128566d));
    }

    @Override // com.avito.android.V
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("key_session", this.f128566d);
        kundle.h(Boolean.valueOf(this.f128567e), "key_use_calc_sent");
        kundle.h(Boolean.valueOf(this.f128568f), "key_form_loaded_sent");
        kundle.m("key_request_id", this.f128570h);
        return kundle;
    }

    @Override // com.avito.android.V
    public final void e(boolean z12) {
        this.f128565c.c(new Bs.d(this.f128569g, this.f128564b, z12, this.f128571i));
    }

    @Override // com.avito.android.S0
    public final void f(@Y61.l String str) {
        this.f128571i = str;
    }

    @Override // com.avito.android.V
    public final void g() {
        if (this.f128567e) {
            return;
        }
        this.f128565c.c(new As.g(this.f128569g, this.f128564b, this.f128566d));
        this.f128567e = true;
    }

    @Override // com.avito.android.Z
    public final void i(@Y61.l String str) {
        this.f128569g = str;
    }

    @Override // com.avito.android.credits.e
    public final void j(@Y61.l String str) {
        this.f128570h = str;
    }

    @Override // com.avito.android.credits.e
    public final void l() {
        this.f128565c.c(new As.j(this.f128569g, this.f128564b, this.f128566d, this.f128570h));
    }

    @Override // com.avito.android.V
    public final void m() {
        this.f128565c.c(new As.d(this.f128569g, this.f128564b, this.f128566d, this.f128571i));
    }

    @Override // com.avito.android.V
    public final void o(boolean z12) {
        this.f128565c.c(new As.h(this.f128569g, this.f128564b, this.f128571i, this.f128566d));
    }

    @Override // com.avito.android.V
    public final void q() {
        this.f128565c.c(new C13181a(this.f128569g, this.f128564b, this.f128571i));
    }

    @Override // com.avito.android.V
    public final void r() {
        this.f128565c.c(new As.c(this.f128569g, this.f128564b, this.f128566d));
    }

    @Override // com.avito.android.V
    public final void s(@Y61.l String str) {
        this.f128565c.c(new Bs.e(this.f128569g, str, this.f128564b));
    }

    @Override // com.avito.android.credits.e
    public final void t(@Y61.l String str) {
        String str2 = this.f128569g;
        if (str == null) {
            str = this.f128570h;
        }
        this.f128565c.c(new As.m(str2, this.f128564b, this.f128566d, str));
    }

    @Override // com.avito.android.credits.e
    public final void v() {
        this.f128565c.c(new As.k(this.f128569g, this.f128564b, this.f128566d, this.f128570h));
    }

    @Override // com.avito.android.credits.e
    public final void w() {
        this.f128565c.c(new As.l(this.f128569g, this.f128564b, this.f128566d, this.f128570h));
    }

    @Override // com.avito.android.credits.e
    public final void z() {
        this.f128565c.c(new As.i(this.f128569g, this.f128564b, this.f128566d, this.f128570h));
    }
}
