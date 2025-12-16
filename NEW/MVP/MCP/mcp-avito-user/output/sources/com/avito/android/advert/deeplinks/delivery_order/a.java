package com.avito.android.advert.deeplinks.delivery_order;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryOrderCreateLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery_order/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryOrderCreateLink;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC40161a<DeliveryOrderCreateLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final l f68974f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25719a f68975g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f68976h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.i f68977i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f68978j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f68979k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final R0 f68980l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public N0 f68981m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C43238h f68982n;

    /* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery_order/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/advert/deeplinks/delivery_order/a$a$a;", "Lcom/avito/android/advert/deeplinks/delivery_order/a$a$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.deeplinks.delivery_order.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2162a {

        /* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery_order/a$a$a;", "Lcom/avito/android/advert/deeplinks/delivery_order/a$a;", "LJu/c$a;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.delivery_order.a$a$a, reason: collision with other inner class name */
        public static final class C2163a extends AbstractC2162a implements InterfaceC14249c.a, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C2163a f68983b = new C2163a();

            public C2163a() {
                super(null);
            }
        }

        /* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/delivery_order/a$a$b;", "Lcom/avito/android/advert/deeplinks/delivery_order/a$a;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.delivery_order.a$a$b */
        public static final class b extends AbstractC2162a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f68984b = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC2162a(C42822w c42822w) {
            this();
        }

        public AbstractC2162a() {
        }
    }

    @Inject
    public a(@Y61.k l lVar, @Y61.k C25719a c25719a, @Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        this.f68974f = lVar;
        this.f68975g = c25719a;
        this.f68976h = gVar;
        this.f68977i = iVar;
        this.f68978j = interfaceC35741a1;
        this.f68979k = aVar;
        this.f68980l = r02;
        this.f68982n = U.a(r02.a());
    }

    public static final void k(a aVar, ApiError apiError, Throwable th2) {
        a.i.C4057a.d(aVar.f68977i, InterfaceC35741a1.a.a(aVar.f68978j, th2, null, d.f68988l, 2), null, null, new f.c(apiError), 0, null, null, null, 2030);
        aVar.j(AbstractC2162a.b.f68984b);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryOrderCreateLink deliveryOrderCreateLink = (DeliveryOrderCreateLink) deepLink;
        this.f68975g.a(deliveryOrderCreateLink, this, AuthSource.f92710k, new b(this, deliveryOrderCreateLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        N0 n02 = this.f68981m;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        U.b(this.f68982n, null);
    }
}
