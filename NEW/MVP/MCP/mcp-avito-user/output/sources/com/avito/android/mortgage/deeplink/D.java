package com.avito.android.mortgage.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.internal.C43238h;
import t00.InterfaceC48454a;

/* compiled from: MortgageDocumentUploadDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/D;", "Lev/a;", "Lcom/avito/android/mortgage/deeplink/MortgageDocumentUploadLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class D extends AbstractC40161a<MortgageDocumentUploadLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198677f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198678g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f198679h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.deeplink.domain.c f198680i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f198681j;

    @Inject
    public D(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a, @Y61.k a.i iVar, @Y61.k com.avito.android.mortgage.deeplink.domain.c cVar, @Y61.k R0 r02) {
        this.f198677f = interfaceC4053a;
        this.f198678g = interfaceC48454a;
        this.f198679h = iVar;
        this.f198680i = cVar;
        this.f198681j = kotlinx.coroutines.U.a(r02.d());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f198681j, null, null, new C(this, (MortgageDocumentUploadLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        kotlinx.coroutines.U.b(this.f198681j, null);
    }
}
