package com.avito.android.captcha.deeplink;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.captcha.deeplink.i;
import com.avito.android.captcha.p;
import com.avito.android.captcha.q;
import com.avito.android.captcha.r;
import com.avito.android.captcha.s;
import com.avito.android.captcha.t;
import com.avito.android.captcha.w;
import com.avito.android.captcha.y;
import com.avito.android.captcha.z;
import com.avito.android.deep_linking.links.BlockedIpScreenLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.captcha.model.CaptchaDeeplink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CaptchaDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/captcha/deeplink/d;", "Lev/a;", "Lcom/avito/android/remote/captcha/model/CaptchaDeeplink;", "_avito_captcha_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC40161a<CaptchaDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f114992f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final t f114993g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final w f114994h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final R0 f114995i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.captcha.analytics.b f114996j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.g f114997k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C43238h f114998l;

    /* compiled from: CaptchaDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/captcha/y;", "token", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/captcha/y;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<y, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f114999l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f115000m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ CaptchaDeeplink f115001n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ p f115002o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, r rVar, d dVar, CaptchaDeeplink captchaDeeplink) {
            super(1);
            this.f114999l = dVar;
            this.f115000m = rVar;
            this.f115001n = captchaDeeplink;
            this.f115002o = pVar;
        }

        @Override // Y41.l
        public final G0 invoke(y yVar) {
            y yVar2 = yVar;
            r rVar = this.f115000m;
            d dVar = this.f114999l;
            C43259k.d(dVar.f114998l, null, null, new e(dVar, yVar2, new com.avito.android.captcha.deeplink.b(rVar, dVar), new com.avito.android.captcha.deeplink.c(this.f115002o, rVar, dVar, this.f115001n), null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: CaptchaDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/captcha/z;", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/captcha/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<z, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f115003l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f115004m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, d dVar) {
            super(1);
            this.f115003l = rVar;
            this.f115004m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(z zVar) {
            z zVar2 = zVar;
            this.f115003l.destroy();
            d dVar = this.f115004m;
            dVar.getClass();
            if (zVar2 instanceof z.d) {
                dVar.f114996j.a(((z.d) zVar2).f115153a);
            }
            dVar.m(i.a.f115030b);
            return G0.f406611a;
        }
    }

    /* compiled from: CaptchaDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f115005l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p f115006m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d f115007n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ CaptchaDeeplink f115008o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p pVar, r rVar, d dVar, CaptchaDeeplink captchaDeeplink) {
            super(0);
            this.f115005l = rVar;
            this.f115006m = pVar;
            this.f115007n = dVar;
            this.f115008o = captchaDeeplink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f115005l.destroy();
            p pVar = this.f115006m;
            boolean z12 = pVar instanceof p.a;
            CaptchaDeeplink captchaDeeplink = this.f115008o;
            d dVar = this.f115007n;
            if (z12) {
                C43259k.d(dVar.f114998l, null, null, new f(dVar, captchaDeeplink, (p.a) pVar, null), 3);
            } else {
                dVar.getClass();
                dVar.i(i.e.f115034b, dVar.f114992f, captchaDeeplink);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k t tVar, @k w wVar, @k R0 r02, @k com.avito.android.captcha.analytics.b bVar, @k a.g gVar) {
        this.f114992f = aVar;
        this.f114993g = tVar;
        this.f114994h = wVar;
        this.f114995i = r02;
        this.f114996j = bVar;
        this.f114997k = gVar;
        this.f114998l = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f114998l, null, null, new com.avito.android.captcha.deeplink.a(this, (CaptchaDeeplink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        l();
        U.b(this.f114998l, null);
    }

    public final void k(p pVar, CaptchaDeeplink captchaDeeplink) {
        r rVarA = this.f114994h.a(pVar);
        if (rVarA == null) {
            m(i.f.f115035b);
            return;
        }
        s sVarB = rVarA.b();
        if (sVarB instanceof s.c) {
            rVarA.c(new c(pVar, rVarA, this, captchaDeeplink), new a(pVar, rVarA, this, captchaDeeplink), new b(rVarA, this));
        } else {
            if (sVarB instanceof s.b) {
                rVarA.destroy();
                m(i.d.f115033b);
                this.f114996j.a(new q.b("Deeplink init captcha failed: no screen found", pVar.f115120a));
                return;
            }
            if (sVarB instanceof s.a) {
                rVarA.destroy();
                m(i.b.f115031b);
            } else {
                rVarA.destroy();
                m(i.g.f115036b);
            }
        }
    }

    public final void l() {
        this.f114997k.g(null, false);
    }

    public final void m(i iVar) {
        i(iVar, this.f114992f, new BlockedIpScreenLink());
    }
}
