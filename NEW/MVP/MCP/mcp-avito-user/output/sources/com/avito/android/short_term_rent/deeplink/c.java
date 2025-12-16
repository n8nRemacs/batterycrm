package com.avito.android.short_term_rent.deeplink;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: StrIncreasedCashbackApplyLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/c;", "Lev/a;", "Lcom/avito/android/short_term_rent/deeplink/StrIncreasedCashbackApplyLink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC40161a<StrIncreasedCashbackApplyLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g f282255f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f282256g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f282257h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f282258i;

    @Inject
    public c(@k g gVar, @k R0 r02, @k a.i iVar, @k C25719a c25719a) {
        this.f282255f = gVar;
        this.f282256g = iVar;
        this.f282257h = c25719a;
        this.f282258i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        b bVar = new b(this);
        this.f282257h.b((StrIncreasedCashbackApplyLink) deepLink, this, null, bVar);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f282258i, null);
    }
}
