package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import Hr.InterfaceC14024a;
import Ju.InterfaceC14249c;
import android.content.res.Resources;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryOrderRealOneClickLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryOrderRealOneClickDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/order_one_click/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryOrderRealOneClickLink;", "a", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<DeliveryOrderRealOneClickLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final m f256930f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25719a f256931g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f256932h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f256933i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f256934j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.d f256935k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f256936l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Resources f256937m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f256938n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f256939o = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryOrderRealOneClickDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/order_one_click/a$a;", "", "<init>", "()V", "a", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC7706a {

        /* compiled from: DeliveryOrderRealOneClickDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/order_one_click/a$a$a;", "LJu/c$a;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.a$a$a, reason: collision with other inner class name */
        public static final class C7707a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C7707a f256940b = new C7707a();
        }

        public /* synthetic */ AbstractC7706a(C42822w c42822w) {
            this();
        }

        public AbstractC7706a() {
        }
    }

    @Inject
    public a(@Y61.k m mVar, @Y61.k C25719a c25719a, @Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC14024a interfaceC14024a, @Y61.k a.d dVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k Resources resources, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f256930f = mVar;
        this.f256931g = c25719a;
        this.f256932h = gVar;
        this.f256933i = aVar;
        this.f256934j = interfaceC14024a;
        this.f256935k = dVar;
        this.f256936l = interfaceC35741a1;
        this.f256937m = resources;
        this.f256938n = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryOrderRealOneClickLink deliveryOrderRealOneClickLink = (DeliveryOrderRealOneClickLink) deepLink;
        this.f256931g.a(deliveryOrderRealOneClickLink, this, AuthSource.f92710k, new b(this, deliveryOrderRealOneClickLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256939o.e();
    }
}
