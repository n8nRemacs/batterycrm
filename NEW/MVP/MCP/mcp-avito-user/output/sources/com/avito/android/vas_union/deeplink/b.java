package com.avito.android.vas_union.deeplink;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import sM0.InterfaceC48073a;

/* compiled from: VasUnionContextDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/deeplink/b;", "Lev/a;", "Lcom/avito/android/vas_union/deeplink/VasUnionContextLink;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<VasUnionContextLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC48073a f323134f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.g f323135g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f323136h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f323137i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C43238h f323138j;

    @Inject
    public b(@k InterfaceC48073a interfaceC48073a, @k a.g gVar, @k a.i iVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02) {
        this.f323134f = interfaceC48073a;
        this.f323135g = gVar;
        this.f323136h = iVar;
        this.f323137i = aVar;
        this.f323138j = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f323138j, null, null, new a(bundle, this, (VasUnionContextLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f323138j, null);
    }
}
