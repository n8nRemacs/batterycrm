package com.avito.android.installments.form;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.compose.runtime.internal.P;
import b31.C25404c;
import com.avito.android.R;
import com.avito.android.deep_linking.links.Loader;
import com.avito.android.installments.form.InstallmentsFormActivity;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormState;
import com.avito.android.util.C35835l0;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsFormView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/p;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.web_handler.f f172805a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super ValueCallback<Uri[]>, G0> f172806b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super Uri, Boolean> f172807c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f172808d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super PowerWebViewStateChangeEvent, G0> f172809e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.p<? super String, ? super String, G0> f172810f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Loader f172811g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final v f172812h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f172813i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.installments.form.loader.b f172814j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PowerWebView f172815k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.installments.form.loader.c f172816l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f172817m;

    /* compiled from: InstallmentsFormView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            p.this.f172809e.invoke((PowerWebViewStateChangeEvent) obj);
        }
    }

    /* compiled from: InstallmentsFormView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[InstallmentsFormState.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InstallmentsFormState.Status status = InstallmentsFormState.Status.f172771b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InstallmentsFormState.Status status2 = InstallmentsFormState.Status.f172771b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: InstallmentsFormView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements com.avito.android.credits.web_logger.h, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.p f172819b;

        public c(Y41.p pVar) {
            this.f172819b = pVar;
        }

        @Override // com.avito.android.credits.web_logger.h
        public final /* synthetic */ void a(String str, String str2) {
            ((InstallmentsFormActivity.g) this.f172819b).invoke(str, str2);
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.credits.web_logger.h) && (obj instanceof D)) {
                return L.f(this.f172819b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f172819b;
        }

        public final int hashCode() {
            return this.f172819b.hashCode();
        }
    }

    public p(@Y61.k View view, @Y61.k com.avito.android.credits.web_handler.f fVar, @Y61.k Y41.l<? super ValueCallback<Uri[]>, G0> lVar, @Y61.k Y41.l<? super Uri, Boolean> lVar2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super PowerWebViewStateChangeEvent, G0> lVar3, @Y61.k Y41.p<? super String, ? super String, G0> pVar, @Y61.l Loader loader, @Y61.k v vVar, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.l Map<String, Loader> map) {
        this.f172805a = fVar;
        this.f172806b = lVar;
        this.f172807c = lVar2;
        this.f172808d = aVar;
        this.f172809e = lVar3;
        this.f172810f = pVar;
        this.f172811g = loader;
        this.f172812h = vVar;
        this.f172813i = eVar;
        this.f172814j = new com.avito.android.installments.form.loader.b(map);
        PowerWebView powerWebView = (PowerWebView) view.findViewById(R.id.web_view);
        this.f172815k = powerWebView;
        this.f172816l = new com.avito.android.installments.form.loader.c((ViewGroup) view.findViewById(R.id.overlay_container), powerWebView, aVar);
        this.f172817m = new io.reactivex.rxjava3.disposables.c();
        fVar.a(new com.avito.android.ui.view.d(powerWebView));
        fVar.f129063a.add(new c(pVar));
        powerWebView.setBackgroundColor(C35835l0.d(R.attr.transparentBlack, powerWebView.getContext()));
        powerWebView.setLayerType(2, null);
        powerWebView.setHorizontalScrollBarEnabled(false);
        powerWebView.setWebChromeClient(new q(this));
        powerWebView.a(new r(this));
        powerWebView.getSettings().setDomStorageEnabled(true);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.flush();
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar2 : eVar.a()) {
            cookieManager.setCookie(aVar2.f126169a, aVar2.f126170b);
        }
        v vVar2 = this.f172812h;
        powerWebView.setWebResourceErrorHandlerDelegate(vVar2);
        powerWebView.setSslErrorHandlerDelegate(vVar2);
        this.f172816l.a(this.f172811g);
        this.f172817m.b(C25404c.a(this.f172815k).t0(new a()));
    }
}
