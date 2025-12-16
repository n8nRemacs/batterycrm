package com.avito.android.cv_actualization.deeplink;

import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.cv_actualization.deeplink.JsxCvActualizationDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import ot.InterfaceC44935a;
import rv.C47918a;
import sv.C48421d;

/* compiled from: JsxCvActualizationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_actualization/deeplink/a;", "Lev/a;", "Lcom/avito/android/cv_actualization/deeplink/JsxCvActualizationDeeplink;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<JsxCvActualizationDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f131091f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC44935a f131092g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f131093h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f131094i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: JsxCvActualizationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cv_actualization.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3901a<T> implements r {
        public C3901a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: JsxCvActualizationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            a aVar = a.this;
            if (i12 != -1) {
                aVar.j(JsxCvActualizationDeeplink.b.a.f131089b);
            } else {
                Intent intent = c47918a.f437157c;
                aVar.j(new JsxCvActualizationDeeplink.b.C3900b(intent != null ? intent.getStringExtra("ACTUALIZATION_RESULT_KEY") : null));
            }
        }
    }

    @Inject
    public a(@k a.b bVar, @k InterfaceC44935a interfaceC44935a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f131091f = bVar;
        this.f131092g = interfaceC44935a;
        this.f131093h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JsxCvActualizationDeeplink jsxCvActualizationDeeplink = (JsxCvActualizationDeeplink) deepLink;
        this.f131093h.J(this.f131092g.a(jsxCvActualizationDeeplink.f131087b, jsxCvActualizationDeeplink.f131088c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f131094i.b(this.f131091f.Q().N(new C3901a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f131094i.e();
    }
}
