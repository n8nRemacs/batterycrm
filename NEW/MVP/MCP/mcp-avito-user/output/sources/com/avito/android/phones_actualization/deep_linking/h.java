package com.avito.android.phones_actualization.deep_linking;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.ActualizePhonesStatusLink;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import hD.C40806a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ActualizePhonesStatusAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/phones_actualization/deep_linking/h;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/ActualizePhonesStatusLink;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends AbstractC40161a<ActualizePhonesStatusLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f216189f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f216190g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C40806a f216191h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a f216192i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f216193j;

    /* compiled from: CoroutineExceptionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/O", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/N;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractCoroutineContextElement implements N {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f216194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N.b bVar, h hVar) {
            super(bVar);
            this.f216194b = hVar;
        }

        @Override // kotlinx.coroutines.N
        public final void handleException(@Y61.k CoroutineContext coroutineContext, @Y61.k Throwable th2) {
            V2.f318762a.b("ActualizePhonesStatusAsyncLinkHandler got " + th2, null);
            this.f216194b.j(ActualizePhonesStatusLink.b.a.f133881b);
        }
    }

    @Inject
    public h(@Y61.k j jVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C40806a c40806a, @Y61.k R0 r02) {
        this.f216189f = jVar;
        this.f216190g = aVar;
        this.f216191h = c40806a;
        a aVar2 = new a(N.f410714t2, this);
        this.f216192i = aVar2;
        this.f216193j = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()).plus(aVar2));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C40806a c40806a = this.f216191h;
        c40806a.getClass();
        kotlin.reflect.n<Object> nVar = C40806a.f397105l[5];
        if (!((Boolean) c40806a.f397111g.a().invoke()).booleanValue()) {
            j(ActualizePhonesStatusLink.b.a.f133881b);
        } else {
            C43259k.d(this.f216193j, this.f216192i, null, new g(this, null), 2);
        }
    }
}
