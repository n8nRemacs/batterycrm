package com.avito.android.esia_redirect_screen.mvi;

import Iz.AbstractC14178c;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EsiaRedirectBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/esia_redirect_screen/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "LIz/c;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements com.avito.android.arch.mvi.b<AbstractC14178c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.esia_redirect_screen.mvi.data_loaders.b f148079a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f148080b;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.esia_redirect_screen.mvi.data_loaders.b bVar) {
        this.f148079a = bVar;
        this.f148080b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AbstractC14178c> a() {
        return C43175k.N(this.f148079a.a(), C43175k.C(new g(this, null), C40482a.b(this.f148080b)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
