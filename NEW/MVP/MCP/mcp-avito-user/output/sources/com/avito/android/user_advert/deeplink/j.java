package com.avito.android.user_advert.deeplink;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.advert.InterfaceC35391g;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import rv.C47919b;

/* compiled from: MyAdvertDeactivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/deeplink/j;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$DeactivateV2;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends AbstractC40161a<MyAdvertLink.DeactivateV2> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35391g f310733f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310734g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f310735h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.d f310736i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.f f310737j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310738k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f310739l = "soa_with_price_dialog_fragment" + this.f395444b;

    /* compiled from: MyAdvertDeactivateLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_advert/deeplink/j$a;", "", "<init>", "()V", "", "SOA_WITH_PRICE_DIALOG_TAG", "Ljava/lang/String;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MyAdvertDeactivateLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SoaWithPriceResult.f311845a2.getClass();
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            SoaWithPriceResult soaWithPriceResult = (SoaWithPriceResult) (i12 >= 34 ? (Parcelable) bundle.getParcelable("key_soa_with_price_result", SoaWithPriceResult.class) : bundle.getParcelable("key_soa_with_price_result"));
            boolean z12 = soaWithPriceResult instanceof SoaWithPriceResult.Cancel;
            j jVar = j.this;
            if (z12) {
                jVar.j(MyAdvertLink.DeactivateV2.b.a.f133482b);
                return;
            }
            if (!(soaWithPriceResult instanceof SoaWithPriceResult.Success)) {
                jVar.j(MyAdvertLink.DeactivateV2.b.a.f133482b);
                return;
            }
            SoaWithPriceResult.Success success = (SoaWithPriceResult.Success) soaWithPriceResult;
            String str = success.f311847b;
            InterfaceC35745a5 interfaceC35745a5 = jVar.f310734g;
            String str2 = success.f311849d;
            CloseReason closeReason = success.f311848c;
            InterfaceC35391g interfaceC35391g = jVar.f310733f;
            jVar.f310738k.b(str2 == null ? interfaceC35391g.i(closeReason.getId(), str).s(interfaceC35745a5.e()).x(new k(jVar, str), io.reactivex.rxjava3.internal.functions.a.f401996f) : io.reactivex.rxjava3.core.I.G(interfaceC35391g.e(str, str2), interfaceC35391g.i(closeReason.getId(), str), new l41.c() { // from class: com.avito.android.user_advert.deeplink.l
                @Override // l41.c
                public final Object apply(Object obj2, Object obj3) {
                    return new Q((P2) obj2, (P2) obj3);
                }
            }).s(interfaceC35745a5.e()).x(new m(jVar, str), io.reactivex.rxjava3.internal.functions.a.f401996f));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k InterfaceC35391g interfaceC35391g, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k a.d dVar, @Y61.k a.f fVar) {
        this.f310733f = interfaceC35391g;
        this.f310734g = interfaceC35745a5;
        this.f310735h = interfaceC28373a;
        this.f310736i = dVar;
        this.f310737j = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((MyAdvertLink.DeactivateV2) deepLink).f133481c;
        this.f310738k.b(this.f310733f.b(str2).j0(this.f310734g.e()).t0(new n(this, str2)));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f310738k.b(this.f310737j.l1(this.f310739l).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310738k.e();
    }
}
