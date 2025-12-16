package com.avito.android.messenger.deeplink;

import android.content.Intent;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35967w2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/C;", "Lev/a;", "Lcom/avito/android/deep_linking/links/CreateChannelLink;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class C extends AbstractC40161a<CreateChannelLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f195294f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f195295g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f195296h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f195297i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.A f195298j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ru.avito.messenger.F0 f195299k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f195300l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f195301m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C25719a f195302n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_info_toast_bar.interactor.a f195303o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f195304p = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CreateChannelDeeplinkHandler.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/deeplink/C$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Throwable {
    }

    /* compiled from: CreateChannelDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C.this);
        }
    }

    /* compiled from: CreateChannelDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = ((C47918a) obj).f437156b;
            C.this.j(i12 != -1 ? i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 5 ? i12 != 41 ? i12 != 43 ? i12 != 60 ? CreateChannelLink.b.d.f133140b : CreateChannelLink.b.k.f133147b : CreateChannelLink.b.e.f133141b : CreateChannelLink.b.i.f133145b : CreateChannelLink.b.h.f133144b : CreateChannelLink.b.j.f133146b : CreateChannelLink.b.c.f133139b : CreateChannelLink.b.a.f133137b : CreateChannelLink.b.C3991b.f133138b : CreateChannelLink.b.h.f133144b);
        }
    }

    @Inject
    public C(@Y61.k com.avito.android.messenger.F f12, @Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k ru.avito.messenger.A a12, @Y61.k ru.avito.messenger.F0 f02, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C25719a c25719a, @Y61.k com.avito.android.progress_info_toast_bar.interactor.a aVar) {
        this.f195294f = f12;
        this.f195295g = bVar;
        this.f195296h = interfaceC4053a;
        this.f195297i = interfaceC47842z;
        this.f195298j = a12;
        this.f195299k = f02;
        this.f195300l = interfaceC35863o4;
        this.f195301m = interfaceC35745a5;
        this.f195302n = c25719a;
        this.f195303o = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CreateChannelLink createChannelLink = (CreateChannelLink) deepLink;
        String str2 = createChannelLink.f133131c;
        C25719a c25719a = this.f195302n;
        boolean z12 = createChannelLink.f133135g;
        if (!z12 && str2 == null) {
            c25719a.b(createChannelLink, this, null, new G(this, createChannelLink));
            return;
        }
        if (!z12 && str2 != null) {
            c25719a.b(createChannelLink, this, null, new M(this, createChannelLink, str2));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle bundleB = b();
        String string = bundleB != null ? bundleB.getString("key_disclaimer_pd") : null;
        Intent intentI = this.f195294f.i(createChannelLink.f133130b, createChannelLink.f133131c, createChannelLink.f133133e, createChannelLink.f133134f, string, createChannelLink.f133136h, Long.valueOf(jCurrentTimeMillis));
        Bundle bundleB2 = b();
        C35967w2.c(intentI, bundleB2 != null ? com.avito.android.util.H.b(bundleB2) : null);
        this.f195303o.c(createChannelLink.f133130b);
        String strE = e();
        a.InterfaceC4053a interfaceC4053a = this.f195296h;
        if (strE != null) {
            interfaceC4053a.J(intentI, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        } else {
            interfaceC4053a.R(intentI, com.avito.android.deeplink_handler.view.b.f134588l);
            j(CreateChannelLink.b.h.f133144b);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f195304p.b(this.f195295g.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f195304p.e();
    }
}
