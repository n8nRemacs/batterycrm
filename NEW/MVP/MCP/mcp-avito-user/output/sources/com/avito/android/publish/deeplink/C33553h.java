package com.avito.android.publish.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.PublishIntentFactory;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import nI0.InterfaceC44261b;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AdvertPublicationDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/h;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Local;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.deeplink.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33553h extends AbstractC40161a<AdvertPublicationLink.Local> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f232568f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f232569g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final PublishIntentFactory f232570h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f232571i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232572j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AdvertPublicationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.deeplink.h$a */
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C33553h.this);
        }
    }

    /* compiled from: AdvertPublicationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.deeplink.h$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33553h.this.j(((C47918a) obj).f437156b == 0 ? AdvertPublicationLink.a.C3985a.f133009b : AdvertPublicationLink.a.b.f133010b);
        }
    }

    @Inject
    public C33553h(@Y61.k a.b bVar, @Y61.k InterfaceC44261b interfaceC44261b, @Y61.k PublishIntentFactory publishIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f232568f = bVar;
        this.f232569g = interfaceC44261b;
        this.f232570h = publishIntentFactory;
        this.f232571i = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AdvertPublicationLink.Local local = (AdvertPublicationLink.Local) deepLink;
        boolean z12 = bundle != null ? bundle.getBoolean("with_up_intent") : true;
        this.f232571i.J(this.f232570h.c(local.f132993c, local.f132992b, local.f132994d, local.f132997g, local.f132996f, local.f132998h, local.f132995e, z12), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f232572j.b(this.f232568f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f232572j.e();
    }
}
