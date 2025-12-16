package com.avito.android.safedeal_checkout.delivery_universal_checkout.common;

import Ju.InterfaceC14249c;
import android.content.res.Resources;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliverySavedAddressCheckLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySavedAddressCheckDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliverySavedAddressCheckLink;", "a", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<DeliverySavedAddressCheckLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final i f256897f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E f256898g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f256899h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f256900i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.d f256901j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f256902k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f256903l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Resources f256904m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f256905n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f256906o = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliverySavedAddressCheckDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/a$a;", "", "<init>", "()V", "a", "b", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.common.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC7704a {

        /* compiled from: DeliverySavedAddressCheckDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/a$a$a;", "LJu/c$a;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.common.a$a$a, reason: collision with other inner class name */
        public static final class C7705a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C7705a f256907b = new C7705a();
        }

        /* compiled from: DeliverySavedAddressCheckDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/a$a$b;", "LJu/c$a;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.common.a$a$b */
        public static final class b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f256908b = new b();
        }

        public /* synthetic */ AbstractC7704a(C42822w c42822w) {
            this();
        }

        public AbstractC7704a() {
        }
    }

    @Inject
    public a(@Y61.k i iVar, @Y61.k E e12, @Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.d dVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k Resources resources, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f256897f = iVar;
        this.f256898g = e12;
        this.f256899h = gVar;
        this.f256900i = aVar;
        this.f256901j = dVar;
        this.f256902k = interfaceC28373a;
        this.f256903l = interfaceC35741a1;
        this.f256904m = resources;
        this.f256905n = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliverySavedAddressCheckLink deliverySavedAddressCheckLink = (DeliverySavedAddressCheckLink) deepLink;
        if (!this.f256898g.b()) {
            i(AbstractC7704a.C7705a.f256907b, this.f256900i, new AuthenticateLink(AuthSource.f92710k, false, (DeepLink) deliverySavedAddressCheckLink, 2, (C42822w) null));
        } else {
            ParametrizedEvent parametrizedEvent = deliverySavedAddressCheckLink.f133198d;
            if (parametrizedEvent != null) {
                this.f256902k.c(a0.a(parametrizedEvent));
            }
            this.f256906o.b(new C42023v(this.f256897f.a(deliverySavedAddressCheckLink.f133196b, deliverySavedAddressCheckLink.f133197c, deliverySavedAddressCheckLink.f133199e, deliverySavedAddressCheckLink.f133200f, deliverySavedAddressCheckLink.f133201g).s(this.f256905n.e()).j(new b(this)), new C31684n(this, 16)).x(new c(this), new d(this)));
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256906o.e();
    }
}
