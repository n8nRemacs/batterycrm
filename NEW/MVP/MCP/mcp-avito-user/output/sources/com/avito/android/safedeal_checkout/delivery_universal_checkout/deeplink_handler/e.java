package com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler;

import Y61.k;
import Zn0.C19579a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryCourierOrderPaymentFailureLink;
import com.avito.android.deep_linking.links.DeliveryOrderPaymentFailureLink;
import com.avito.android.deep_linking.links.DeliveryUniversalPayDeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.delivery.DeliveryFlowPaymentStatus;
import com.avito.android.payment.data.DialogInfo;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import com.google.gson.Gson;
import ev.AbstractC40161a;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: DeliveryUniversalPayDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/deeplink_handler/e;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC40161a<DeliveryUniversalPayDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f256981f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC36134w1 f256982g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f256983h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f256984i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final a.i f256985j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final E f256986k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC28373a f256987l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final h31.e<Gson> f256988m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Context f256989n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f256990o = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryUniversalPayDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(e.this);
        }
    }

    /* compiled from: DeliveryUniversalPayDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Bundle bundle;
            String str;
            String str2;
            List list;
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            e eVar = e.this;
            list = null;
            List list2 = null;
            if (i12 == 0) {
                DeliveryUniversalPayDeepLink deliveryUniversalPayDeepLinkC = eVar.c();
                if (deliveryUniversalPayDeepLinkC != null && (str2 = deliveryUniversalPayDeepLinkC.f133229d) != null) {
                    try {
                        Gson gson = eVar.f256988m.get();
                        Type type = new f().getType();
                        list = (List) gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                    } catch (Exception e12) {
                        V2.f318762a.f(e12);
                        list = C42784z0.f406748b;
                    }
                    list2 = list;
                }
                eVar.j(new DeliveryUniversalPayDeepLink.c.a(list2));
                return;
            }
            Intent intent = c47918a.f437157c;
            DeepLink deepLink = intent != null ? (DeepLink) intent.getParcelableExtra("web_payment_final_deeplink_extra") : null;
            if (!(deepLink == null ? true : deepLink instanceof DeliveryCourierOrderPaymentFailureLink ? true : deepLink instanceof DeliveryOrderPaymentFailureLink)) {
                DeliveryUniversalPayDeepLink deliveryUniversalPayDeepLinkC2 = eVar.c();
                Object[] objArr = deliveryUniversalPayDeepLinkC2 != null && deliveryUniversalPayDeepLinkC2.f133232g;
                eVar.i(DeliveryUniversalPayDeepLink.c.C3994c.f133236b, eVar.f256984i, deepLink);
                com.avito.android.deeplink_handler.handler.bundle.a aVarD = eVar.d();
                boolean z12 = (aVarD == null || (bundle = aVarD.f134522c) == null) ? false : bundle.getBoolean("legacy_checkout", false);
                boolean z13 = (deepLink instanceof BeduinUniversalPageLink) && L.f(((BeduinUniversalPageLink) deepLink).f133040d, "NativePaymentPage");
                if (z12 || z13 || objArr == true) {
                    return;
                }
                eVar.f256981f.X(-1, new Intent().putExtra("delivery_payment_status", DeliveryFlowPaymentStatus.f134746b));
                return;
            }
            DeliveryUniversalPayDeepLink deliveryUniversalPayDeepLinkC3 = eVar.c();
            String str3 = deliveryUniversalPayDeepLinkC3 != null ? deliveryUniversalPayDeepLinkC3.f133231f : null;
            PrintableText printableTextF = deepLink instanceof DeliveryCourierOrderPaymentFailureLink ? com.avito.android.printable_text.b.f(((DeliveryCourierOrderPaymentFailureLink) deepLink).f133182b) : (!(deepLink instanceof DeliveryOrderPaymentFailureLink) || (str = ((DeliveryOrderPaymentFailureLink) deepLink).f133189c) == null) ? str3 != null ? com.avito.android.printable_text.b.f(str3) : com.avito.android.printable_text.b.c(R.string.universal_checkout_payment_error_title, new Serializable[0]) : com.avito.android.printable_text.b.f(str);
            f.c.f125255c.getClass();
            a.i.C4057a.d(eVar.f256985j, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
            String strA = eVar.f256986k.a();
            DeliveryUniversalPayDeepLink deliveryUniversalPayDeepLinkC4 = eVar.c();
            String str4 = deliveryUniversalPayDeepLinkC4 != null ? deliveryUniversalPayDeepLinkC4.f133228c : null;
            if (str4 == null) {
                str4 = "";
            }
            Context context = eVar.f256989n;
            eVar.f256987l.c(new C19579a(y6.e(C35835l0.i(context).heightPixels), y6.e(C35835l0.i(context).widthPixels), strA, str4));
            eVar.j(DeliveryUniversalPayDeepLink.c.b.f133235b);
        }
    }

    @Inject
    public e(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC36134w1 interfaceC36134w1, @k a.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.i iVar, @k E e12, @k InterfaceC28373a interfaceC28373a, @k h31.e<Gson> eVar, @k Context context) {
        this.f256981f = interfaceC4053a;
        this.f256982g = interfaceC36134w1;
        this.f256983h = bVar;
        this.f256984i = aVar;
        this.f256985j = iVar;
        this.f256986k = e12;
        this.f256987l = interfaceC28373a;
        this.f256988m = eVar;
        this.f256989n = context;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryUniversalPayDeepLink deliveryUniversalPayDeepLink = (DeliveryUniversalPayDeepLink) deepLink;
        String str2 = deliveryUniversalPayDeepLink.f133230e;
        DialogInfo dialogInfo = null;
        Object objE = null;
        if (str2 != null) {
            Gson gson = this.f256988m.get();
            try {
                Type type = new d().getType();
                objE = gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
            }
            dialogInfo = (DialogInfo) objE;
        }
        this.f256981f.J(this.f256982g.j(deliveryUniversalPayDeepLink.f133227b, (14 & 2) != 0 ? null : deliveryUniversalPayDeepLink.f133228c, (14 & 4) != 0 ? null : dialogInfo, (14 & 8) != 0 ? null : null, (14 & 16) != 0 ? null : deliveryUniversalPayDeepLink.f133233h), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f256990o.b(this.f256983h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256990o.e();
    }
}
