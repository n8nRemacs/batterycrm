package com.avito.android.mortgage.deeplink;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.internal.C43238h;
import t00.InterfaceC48454a;

/* compiled from: MortgageApplicationDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/c;", "Lev/a;", "Lcom/avito/android/mortgage/deeplink/MortgageApplicationLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32588c extends AbstractC40161a<MortgageApplicationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198792f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198793g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.deeplink.domain.a f198794h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f198795i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.i f198796j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C25719a f198797k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C43238h f198798l;

    @Inject
    public C32588c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a, @Y61.k com.avito.android.mortgage.deeplink.domain.a aVar, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k C25719a c25719a, @Y61.k R0 r02) {
        this.f198792f = interfaceC4053a;
        this.f198793g = interfaceC48454a;
        this.f198794h = aVar;
        this.f198795i = gVar;
        this.f198796j = iVar;
        this.f198797k = c25719a;
        this.f198798l = kotlinx.coroutines.U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MortgageApplicationLink mortgageApplicationLink = (MortgageApplicationLink) deepLink;
        this.f198797k.b(mortgageApplicationLink, this, null, new C32587b(this, mortgageApplicationLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        kotlinx.coroutines.U.b(this.f198798l, null);
    }
}
