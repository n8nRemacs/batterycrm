package com.avito.android.advert.deeplinks;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.advert.item.safedeal.S;
import com.avito.android.advert.item.safedeal.Y;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.AddItemToCartLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddItemToCartDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AddItemToCartLink;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC40161a<AddItemToCartLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.g f68882f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.i f68883g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final S f68884h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f68885i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f68886j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f68887k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C25719a f68888l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f68889m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y f68890n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f68891o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f68892p = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AddItemToCartDeepLinkHandler.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/deeplinks/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/advert/deeplinks/a$a$a;", "Lcom/avito/android/advert/deeplinks/a$a$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.deeplinks.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2158a {

        /* compiled from: AddItemToCartDeepLinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/deeplinks/a$a$a;", "Lcom/avito/android/advert/deeplinks/a$a;", "LJu/c$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.a$a$a, reason: collision with other inner class name */
        public static final class C2159a extends AbstractC2158a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C2159a f68893b = new C2159a();

            public C2159a() {
                super(null);
            }
        }

        /* compiled from: AddItemToCartDeepLinkHandler.kt */
        @P
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/deeplinks/a$a$b;", "Lcom/avito/android/advert/deeplinks/a$a;", "LJu/c$a;", "LJu/c$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert.deeplinks.a$a$b */
        public static final /* data */ class b extends AbstractC2158a implements InterfaceC14249c.a, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.remote.safedeal.a f68894b;

            public b(@Y61.k com.avito.android.remote.safedeal.a aVar) {
                super(null);
                this.f68894b = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f68894b, ((b) obj).f68894b);
            }

            public final int hashCode() {
                return this.f68894b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ItemAdded(response=" + this.f68894b + ')';
            }
        }

        public /* synthetic */ AbstractC2158a(C42822w c42822w) {
            this();
        }

        public AbstractC2158a() {
        }
    }

    @Inject
    public a(@Y61.k a.g gVar, @Y61.k a.i iVar, @Y61.k S s5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C25719a c25719a, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @Y61.k Y y12, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f68882f = gVar;
        this.f68883g = iVar;
        this.f68884h = s5;
        this.f68885i = aVar;
        this.f68886j = interfaceC35741a1;
        this.f68887k = interfaceC35745a5;
        this.f68888l = c25719a;
        this.f68889m = hVar;
        this.f68890n = y12;
        this.f68891o = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AddItemToCartLink addItemToCartLink = (AddItemToCartLink) deepLink;
        this.f68888l.a(addItemToCartLink, this, AuthSource.f92733w, new b(this, addItemToCartLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f68892p.e();
    }
}
