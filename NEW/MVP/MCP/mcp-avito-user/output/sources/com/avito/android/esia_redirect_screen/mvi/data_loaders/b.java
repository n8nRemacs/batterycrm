package com.avito.android.esia_redirect_screen.mvi.data_loaders;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: EsiaRedirectContentLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/esia_redirect_screen/mvi/data_loaders/b;", "", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f148069a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.esia_redirect_screen.domain.a f148070b;

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.esia_redirect_screen.domain.a aVar2) {
        this.f148069a = aVar;
        this.f148070b = aVar2;
    }

    @k
    public final C43197r1 a() {
        return new C43197r1(new a(this, null), this.f148070b.a());
    }
}
