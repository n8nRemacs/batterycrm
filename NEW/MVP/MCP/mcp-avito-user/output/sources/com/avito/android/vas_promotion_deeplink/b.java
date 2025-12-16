package com.avito.android.vas_promotion_deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.C43259k;
import nM0.InterfaceC44292a;

/* compiled from: VasPromotionDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_promotion_deeplink/b;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/vas_promotion_deeplink/VasPromotionDeepLink;", "a", "_avito_vas-promotion-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends com.avito.android.deeplink_handler.handler.base.coroutines.a<VasPromotionDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f323061g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f323062h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final R0 f323063i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f323064j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC44292a f323065k;

    /* compiled from: VasPromotionDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_promotion_deeplink/b$a;", "", "a", "b", "Lcom/avito/android/vas_promotion_deeplink/b$a$a;", "Lcom/avito/android/vas_promotion_deeplink/b$a$b;", "_avito_vas-promotion-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: VasPromotionDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_promotion_deeplink/b$a$a;", "Lcom/avito/android/vas_promotion_deeplink/b$a;", "LJu/c$a;", "<init>", "()V", "_avito_vas-promotion-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_promotion_deeplink.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9983a implements a, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9983a f323066b = new C9983a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C9983a);
            }

            public final int hashCode() {
                return -2055594255;
            }

            @k
            public final String toString() {
                return "RedirectAfterRequest";
            }
        }

        /* compiled from: VasPromotionDeepLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_promotion_deeplink/b$a$b;", "Lcom/avito/android/vas_promotion_deeplink/b$a;", "LJu/c$b;", "<init>", "()V", "_avito_vas-promotion-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_promotion_deeplink.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C9984b implements a, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C9984b f323067b = new C9984b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C9984b);
            }

            public final int hashCode() {
                return -306349413;
            }

            @k
            public final String toString() {
                return "RequestError";
            }
        }
    }

    @Inject
    public b(@k a.i iVar, @k a.g gVar, @k R0 r02, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC44292a interfaceC44292a) {
        super(r02);
        this.f323061g = iVar;
        this.f323062h = gVar;
        this.f323063i = r02;
        this.f323064j = aVar;
        this.f323065k = interfaceC44292a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        this.f323062h.g(d(), true);
        Object objG = C43259k.g(this.f323063i.a(), new c(this, (VasPromotionDeepLink) deepLink, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
