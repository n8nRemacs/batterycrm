package com.avito.android.async_phone.impl_module.phone_request_link;

import Gd.InterfaceC13866a;
import Hd.AbstractC13978b;
import Hd.C13979c;
import Ju.AbstractC14250d;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import bv.C25719a;
import com.avito.android.R;
import com.avito.android.anonymous_number_dialog.AnonymousNumberDialogLink;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;
import ru.avito.component.serp.PhoneLoadingState;
import rv.C47919b;

/* compiled from: PhoneRequestLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_link/g;", "Lev/a;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestLink;", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends AbstractC40161a<PhoneRequestLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13866a f92163f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.impl_module.phone_request_link.a f92164g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C25719a f92165h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f92166i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.f f92167j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final a.g f92168k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a.d f92169l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final a.i f92170m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Resources f92171n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f92172o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f92173p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f92174q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<Boolean> f92175r = io.reactivex.rxjava3.subjects.b.N0();

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.public_module.loading_helper.a f92176s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f92177t;

    /* compiled from: PhoneRequestLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<PhoneLoadingState, G0> {
        @Override // Y41.l
        public final G0 invoke(PhoneLoadingState phoneLoadingState) {
            PhoneLoadingState phoneLoadingState2 = phoneLoadingState;
            g gVar = (g) this.receiver;
            gVar.getClass();
            gVar.f92175r.onNext(Boolean.valueOf(phoneLoadingState2 == PhoneLoadingState.f430442c));
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneRequestLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<DeepLink, G0> {
        public final void f(@Y61.k DeepLink deepLink) {
            String string;
            g gVar = (g) this.receiver;
            if (gVar.f92177t) {
                gVar.j(new AbstractC13978b.C0428b(deepLink));
                return;
            }
            PhoneRequestDeepLinkAnalyticsData phoneRequestDeepLinkAnalyticsDataK = gVar.k();
            com.avito.android.deeplink_handler.handler.composite.a aVar = gVar.f92166i;
            if (phoneRequestDeepLinkAnalyticsDataK != null && (phoneRequestDeepLinkAnalyticsDataK instanceof PhoneRequestDeepLinkAnalyticsData.Advert)) {
                Q q12 = new Q("key_advert_id", ((PhoneRequestDeepLinkAnalyticsData.Advert) phoneRequestDeepLinkAnalyticsDataK).f92254c);
                Bundle bundleB = gVar.b();
                if (bundleB == null || (string = bundleB.getString("key_source_name")) == null) {
                    string = "button";
                }
                aVar.Qb(C22777e.b(q12, new Q("key_source_name", string)));
            }
            boolean z12 = deepLink instanceof PhoneLink.Call;
            com.avito.android.async_phone.impl_module.phone_request_link.a aVar2 = gVar.f92164g;
            if (z12) {
                aVar2.a(phoneRequestDeepLinkAnalyticsDataK);
                gVar.f92169l.D0(gVar.f395444b, new com.avito.android.async_phone.impl_module.phone_request_link.h((PhoneLink.Call) deepLink));
            } else if (!(deepLink instanceof AnonymousNumberDialogLink)) {
                gVar.i(new AbstractC13978b.c(deepLink), aVar, deepLink);
            } else {
                aVar2.a(phoneRequestDeepLinkAnalyticsDataK);
                gVar.i(new AbstractC13978b.c(deepLink), aVar, deepLink);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            f(deepLink);
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneRequestLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<ApiError, G0> {
        @Override // Y41.l
        public final G0 invoke(ApiError apiError) {
            g gVar = (g) this.receiver;
            gVar.f92175r.onNext(Boolean.FALSE);
            V2.f318762a.d("PhoneRequestAsyncLinkHandler received error while load phone", apiError.toString());
            gVar.j(AbstractC14250d.b.f9170c);
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/z;", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Throwable, z<?>> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final z<?> invoke(Throwable th2) throws Resources.NotFoundException {
            g gVar = g.this;
            gVar.getClass();
            io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
            Resources resources = gVar.f92171n;
            String string = resources.getString(R.string.something_went_wrong);
            String string2 = resources.getString(R.string.try_again);
            gVar.f92175r.onNext(Boolean.FALSE);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(string);
            List listSingletonList = Collections.singletonList(new c.a.C3719a(string2, false, null, new i(eVar), 6, null));
            j jVar = new j(eVar);
            a.i.C4057a.d(gVar.f92170m, printableTextF, null, listSingletonList, f.a.f125253a, 0, ToastBarPosition.f181047e, jVar, null, 1450);
            return eVar;
        }
    }

    /* compiled from: PhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f92179b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b((DeepLink) obj);
        }
    }

    /* compiled from: PhoneRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isLoading", "Lkotlin/G0;", "accept", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g gVar = g.this;
            gVar.f92168k.g(gVar.d(), ((Boolean) obj).booleanValue());
        }
    }

    @Inject
    public g(@Y61.k InterfaceC13866a interfaceC13866a, @Y61.k com.avito.android.async_phone.impl_module.phone_request_link.a aVar, @Y61.k C25719a c25719a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k a.f fVar, @Y61.k a.g gVar, @Y61.k a.d dVar, @Y61.k a.i iVar, @Y61.k Resources resources, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar2) {
        this.f92163f = interfaceC13866a;
        this.f92164g = aVar;
        this.f92165h = c25719a;
        this.f92166i = aVar2;
        this.f92167j = fVar;
        this.f92168k = gVar;
        this.f92169l = dVar;
        this.f92170m = iVar;
        this.f92171n = resources;
        this.f92172o = interfaceC35745a5;
        this.f92173p = fVar2;
        this.f92176s = new com.avito.android.async_phone.public_module.loading_helper.a(interfaceC35745a5, fVar2);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PhoneRequestLink phoneRequestLink = (PhoneRequestLink) deepLink;
        V2.f318762a.c("PhoneRequestLinkHandler", "doHandle(deeplink=" + phoneRequestLink + ", args=" + bundle + ')', null);
        if (!phoneRequestLink.f92283d) {
            l(phoneRequestLink, bundle);
            return;
        }
        this.f92165h.a(phoneRequestLink, this, AuthSource.f92718o, new com.avito.android.async_phone.impl_module.phone_request_link.f(this, phoneRequestLink, bundle));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f92167j.l1(this.f395444b);
        l41.g gVar = new l41.g() { // from class: com.avito.android.async_phone.impl_module.phone_request_link.g.f
            @Override // l41.g
            public final void accept(Object obj) {
                g gVar2 = g.this;
                int i12 = Build.VERSION.SDK_INT;
                Bundle bundle = ((C47919b) obj).f437159b;
                PhoneLink.Call call = (PhoneLink.Call) (i12 >= 34 ? (Parcelable) bundle.getParcelable("key_result_confirmation", PhoneLink.Call.class) : bundle.getParcelable("key_result_confirmation"));
                if (call == null) {
                    gVar2.j(AbstractC13978b.a.f7560b);
                } else {
                    gVar2.f92164g.b(gVar2.k());
                    gVar2.i(new AbstractC13978b.c(call), gVar2.f92166i, call);
                }
            }
        };
        final V2 v22 = V2.f318762a;
        io.reactivex.rxjava3.disposables.d dVarV0 = wL1.v0(gVar, new l41.g() { // from class: com.avito.android.async_phone.impl_module.phone_request_link.g.g
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
        io.reactivex.rxjava3.disposables.c cVar = this.f92174q;
        cVar.b(dVarV0);
        io.reactivex.rxjava3.subjects.b<Boolean> bVar = this.f92175r;
        bVar.getClass();
        cVar.b(bVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a).K(new h()).s0());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f92174q.e();
    }

    public final PhoneRequestDeepLinkAnalyticsData k() {
        PhoneRequestDeepLinkAnalyticsData phoneRequestDeepLinkAnalyticsData;
        PhoneRequestLink phoneRequestLinkC = c();
        Bundle bundleB = b();
        if (bundleB != null) {
            PhoneRequestDeepLinkAnalyticsData.f92253b.getClass();
            phoneRequestDeepLinkAnalyticsData = (PhoneRequestDeepLinkAnalyticsData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleB.getParcelable("PhoneRequestAnalyticsData", PhoneRequestDeepLinkAnalyticsData.class) : bundleB.getParcelable("PhoneRequestAnalyticsData"));
        } else {
            phoneRequestDeepLinkAnalyticsData = null;
        }
        if (phoneRequestDeepLinkAnalyticsData != null || phoneRequestLinkC == null) {
            return phoneRequestDeepLinkAnalyticsData;
        }
        int i12 = 0;
        while (true) {
            String str = phoneRequestLinkC.f92281b;
            if (i12 >= str.length()) {
                return new PhoneRequestDeepLinkAnalyticsData.Advert(str);
            }
            if (!Character.isDigit(str.charAt(i12))) {
                return phoneRequestDeepLinkAnalyticsData;
            }
            i12++;
        }
    }

    public final void l(PhoneRequestLink phoneRequestLink, Bundle bundle) {
        C13979c.f7563a.getClass();
        String str = null;
        String string = bundle != null ? bundle.getString("PhoneRequestLink.SearchContext") : null;
        String string2 = bundle != null ? bundle.getString("PhoneRequestLink.IacOverrideScenario") : null;
        boolean z12 = false;
        if (bundle != null && bundle.getBoolean("PhoneRequestLink.ManualMode", false)) {
            z12 = true;
        }
        this.f92177t = z12;
        String str2 = phoneRequestLink.f92281b;
        String str3 = phoneRequestLink.f92282c;
        String str4 = str3 == null ? string : str3;
        String str5 = phoneRequestLink.f92286g;
        if (str5 != null) {
            if (string2 != null && !C43066x.K(string2)) {
                str = string2;
            }
            if (str == null) {
                str = str5;
            }
        }
        this.f92174q.b(this.f92176s.a(this.f92163f.a(str2, str4, phoneRequestLink.f92284e, phoneRequestLink.f92285f, str).d0(e.f92179b).p0(), new a(1, this, g.class, "updateState", "updateState(Lru/avito/component/serp/PhoneLoadingState;)V", 0), new b(1, this, g.class, "onComplete", "onComplete(Lcom/avito/android/deep_linking/links/DeepLink;)V", 0), new c(1, this, g.class, "onError", "onError(Lcom/avito/android/remote/error/ApiError;)V", 0), new d(), com.avito.android.async_phone.public_module.loading_helper.b.f92240l));
    }
}
