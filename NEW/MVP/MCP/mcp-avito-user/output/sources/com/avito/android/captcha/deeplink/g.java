package com.avito.android.captcha.deeplink;

import Y61.k;
import com.avito.android.captcha.o;
import com.avito.android.captcha.t;
import com.avito.android.captcha.w;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ym.C50266b;

/* compiled from: CaptchaDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/deeplink/g;", "Ldagger/internal/h;", "Lcom/avito/android/captcha/deeplink/d;", "a", "_avito_captcha_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f115023g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f115024a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f115025b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C50266b f115026c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f115027d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.captcha.analytics.d f115028e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final dv.b f115029f;

    /* compiled from: CaptchaDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/deeplink/g$a;", "", "<init>", "()V", "_avito_captcha_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k dagger.internal.f fVar, @k o oVar, @k C50266b c50266b, @k Provider provider, @k com.avito.android.captcha.analytics.d dVar, @k dv.b bVar) {
        this.f115024a = fVar;
        this.f115025b = oVar;
        this.f115026c = c50266b;
        this.f115027d = provider;
        this.f115028e = dVar;
        this.f115029f = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f115024a.get();
        t tVar = (t) this.f115025b.get();
        w wVar = (w) this.f115026c.get();
        R0 r02 = this.f115027d.get();
        com.avito.android.captcha.analytics.b bVar = (com.avito.android.captcha.analytics.b) this.f115028e.get();
        a.g gVar = (a.g) this.f115029f.get();
        f115023g.getClass();
        return new d(aVar, tVar, wVar, r02, bVar, gVar);
    }
}
