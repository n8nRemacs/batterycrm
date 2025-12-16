package com.avito.android.publish.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.util.C35967w2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import nI0.InterfaceC44261b;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AdvertPublicationDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AdvertPublicationLink$Public;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33551f extends AbstractC40161a<AdvertPublicationLink.Public> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f232555f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f232556g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final PublishIntentFactory f232557h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f232558i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C25719a f232559j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f232560k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AdvertPublicationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.deeplink.f$a */
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C33551f.this);
        }
    }

    /* compiled from: AdvertPublicationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.deeplink.f$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33551f.this.j(((C47918a) obj).f437156b == 0 ? AdvertPublicationLink.a.C3985a.f133009b : AdvertPublicationLink.a.b.f133010b);
        }
    }

    @Inject
    public C33551f(@Y61.k a.b bVar, @Y61.k InterfaceC44261b interfaceC44261b, @Y61.k PublishIntentFactory publishIntentFactory, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k C25719a c25719a) {
        this.f232555f = bVar;
        this.f232556g = interfaceC44261b;
        this.f232557h = publishIntentFactory;
        this.f232558i = interfaceC4053a;
        this.f232559j = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AdvertPublicationLink.Public r13 = (AdvertPublicationLink.Public) deepLink;
        Boolean bool = r13.f133007j;
        boolean z12 = true;
        if (bool != null) {
            if (bool.booleanValue()) {
                z12 = false;
            }
        } else if (bundle != null) {
            z12 = bundle.getBoolean("with_up_intent");
        }
        boolean z13 = z12;
        if (kotlin.jvm.internal.L.f(bool, Boolean.TRUE)) {
            this.f232559j.a(r13, this, AuthSource.f92683R, new C33550e(this, r13, z13, bundle));
            return;
        }
        Intent intentAddFlags = r13.f133001d ? InterfaceC44261b.a.a(this.f232556g, null, null, AdvertPublicationLink.Public.a(r13, null, 1019), null, 27).addFlags(603979776) : this.f232557h.e(r13.f132999b, r13.f133000c, z13, r13.f133002e, r13.f133003f, r13.f133004g, r13.f133005h, r13.f133006i, r13.f133008k);
        C35967w2.c(intentAddFlags, bundle != null ? com.avito.android.util.H.b(bundle) : null);
        this.f232558i.J(intentAddFlags, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f232560k.b(this.f232555f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f232560k.e();
    }
}
