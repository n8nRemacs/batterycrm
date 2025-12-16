package com.avito.android.messenger.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.CreateChannelWithAvitoLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CreateChannelWithAvitoLinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/O;", "Lev/a;", "Lcom/avito/android/deep_linking/links/CreateChannelWithAvitoLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class O extends AbstractC40161a<CreateChannelWithAvitoLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195381f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f195382g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195383h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195384i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CreateChannelWithAvitoLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(O.this);
        }
    }

    /* compiled from: CreateChannelWithAvitoLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = ((C47918a) obj).f437156b;
            O.this.j(i12 != -1 ? i12 != 0 ? i12 != 1 ? i12 != 41 ? i12 != 43 ? CreateChannelWithAvitoLink.c.C3992c.f133154b : CreateChannelWithAvitoLink.c.d.f133155b : CreateChannelWithAvitoLink.c.f.f133157b : CreateChannelWithAvitoLink.c.a.f133152b : CreateChannelWithAvitoLink.c.b.f133153b : CreateChannelWithAvitoLink.c.e.f133156b);
        }
    }

    @Inject
    public O(@Y61.k com.avito.android.messenger.F f12, @Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f195381f = f12;
        this.f195382g = bVar;
        this.f195383h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CreateChannelWithAvitoLink createChannelWithAvitoLink = (CreateChannelWithAvitoLink) deepLink;
        Intent intentD = this.f195381f.d(Long.valueOf(System.currentTimeMillis()), createChannelWithAvitoLink.f133149c, createChannelWithAvitoLink.f133150d, createChannelWithAvitoLink.f133151e);
        a.InterfaceC4053a interfaceC4053a = this.f195383h;
        if (str != null) {
            interfaceC4053a.J(intentD, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.R(intentD, com.avito.android.deeplink_handler.view.b.f134588l);
            j(CreateChannelWithAvitoLink.c.e.f133156b);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f195384i.b(this.f195382g.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195384i.e();
    }
}
