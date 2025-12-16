package com.avito.android.beduin.common.component.payment_webview;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import b31.C25402a;
import b31.C25404c;
import com.avito.android.beduin.common.component.payment_webview.BeduinWebPaymentModel;
import com.avito.android.beduin.common.component.payment_webview.z;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.util.K2;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinWebPaymentView.kt */
@s0
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/m;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/cookie_provider/e;", "cookieProvider", "Lkotlin/G0;", "setupWebView", "(Lcom/avito/android/cookie_provider/e;)V", "Lcom/avito/android/beduin/common/component/payment_webview/z;", "handler", "setPostMessagesHandler", "(Lcom/avito/android/beduin/common/component/payment_webview/z;)V", "Lkotlin/Function1;", "", "Lcom/avito/android/beduin_models/BeduinAction;", "listener", "setOnErrorRetryButtonClick", "(LY41/l;)V", "Lcom/avito/android/beduin/common/component/payment_webview/s;", "errorHandler", "setErrorHandler", "(Lcom/avito/android/beduin/common/component/payment_webview/s;)V", "", "enable", "setWebViewEnabled", "(Z)V", "Lio/reactivex/rxjava3/core/z;", "Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "g", "Lio/reactivex/rxjava3/core/z;", "getStateChangeEvents", "()Lio/reactivex/rxjava3/core/z;", "stateChangeEvents", "Lio/reactivex/rxjava3/disposables/c;", "h", "Lio/reactivex/rxjava3/disposables/c;", "getCompositeDisposable", "()Lio/reactivex/rxjava3/disposables/c;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/d;", "i", "Lio/reactivex/rxjava3/disposables/d;", "getStartRedirectionsDisposable", "()Lio/reactivex/rxjava3/disposables/d;", "setStartRedirectionsDisposable", "(Lio/reactivex/rxjava3/disposables/d;)V", "startRedirectionsDisposable", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f101875l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PowerWebView f101876b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f101877c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.model.progress_overlay.a f101878d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f101879e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f101880f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C25402a f101881g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c compositeDisposable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public io.reactivex.rxjava3.disposables.d startRedirectionsDisposable;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.disposables.d f101884j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super List<? extends BeduinAction>, G0> f101885k;

    /* compiled from: BeduinWebPaymentView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "disposable", "Lkotlin/G0;", "invoke", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<io.reactivex.rxjava3.disposables.d, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(io.reactivex.rxjava3.disposables.d dVar) {
            io.reactivex.rxjava3.disposables.d dVar2 = dVar;
            m mVar = m.this;
            mVar.f101884j = dVar2;
            mVar.getCompositeDisposable().b(dVar2);
            return G0.f406611a;
        }
    }

    public m(@Y61.k ContextThemeWrapper contextThemeWrapper, @Y61.k PowerWebView powerWebView) {
        super(contextThemeWrapper);
        this.f101876b = powerWebView;
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        this.f101877c = frameLayout;
        this.f101878d = new com.avito.android.beduin_shared.model.progress_overlay.a(frameLayout, new l(this));
        FrameLayout frameLayout2 = new FrameLayout(contextThemeWrapper);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout2.setClickable(true);
        frameLayout2.setVisibility(8);
        this.f101880f = frameLayout2;
        this.f101881g = C25404c.a(powerWebView);
        this.compositeDisposable = new io.reactivex.rxjava3.disposables.c();
        powerWebView.setHorizontalScrollBarEnabled(false);
        powerWebView.setFailOnSslError(true);
        powerWebView.getSettings().setJavaScriptEnabled(true);
        powerWebView.getSettings().setDomStorageEnabled(true);
        powerWebView.setInterceptTouchEvent(true);
    }

    public final void a(List<? extends BeduinAction> list) {
        Y41.l<? super List<? extends BeduinAction>, G0> lVar;
        String str = this.f101879e;
        if (str != null) {
            this.f101879e = str;
            this.f101876b.loadUrl(str);
        }
        if (list == null || (lVar = this.f101885k) == null) {
            return;
        }
        lVar.invoke(list);
    }

    public final void b(@Y61.l BeduinWebPaymentModel.ErrorPlaceholder errorPlaceholder) {
        int i12 = getLayoutParams().height;
        com.avito.android.beduin_shared.model.progress_overlay.a aVar = this.f101878d;
        if (i12 == -1) {
            if (errorPlaceholder == null || errorPlaceholder.isEmpty()) {
                aVar.e(new b.a(getContext(), null, null, null, null, new i(this, 0), 30, null));
                return;
            } else {
                aVar.e(new b.a(getContext(), errorPlaceholder.getTitle(), errorPlaceholder.getSubtitle(), null, errorPlaceholder.getButtonTitle(), new j(this, errorPlaceholder, 0), 8, null));
                return;
            }
        }
        if (errorPlaceholder == null || errorPlaceholder.isEmpty()) {
            aVar.c(null, new n(this));
        } else {
            aVar.c(null, new o(errorPlaceholder, this));
        }
    }

    @Y61.k
    public final io.reactivex.rxjava3.disposables.c getCompositeDisposable() {
        return this.compositeDisposable;
    }

    @Y61.l
    public final io.reactivex.rxjava3.disposables.d getStartRedirectionsDisposable() {
        return this.startRedirectionsDisposable;
    }

    @Y61.k
    public final io.reactivex.rxjava3.core.z<PowerWebViewStateChangeEvent> getStateChangeEvents() {
        return this.f101881g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(this.f101876b);
        addView(this.f101877c);
        addView(this.f101880f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeView(this.f101876b);
        removeView(this.f101877c);
        removeView(this.f101880f);
    }

    public final void setErrorHandler(@Y61.k s errorHandler) {
        PowerWebView powerWebView = this.f101876b;
        powerWebView.setWebResourceErrorHandlerDelegate(errorHandler);
        powerWebView.setSslErrorHandlerDelegate(errorHandler);
    }

    public final void setOnErrorRetryButtonClick(@Y61.k Y41.l<? super List<? extends BeduinAction>, G0> listener) {
        this.f101885k = listener;
    }

    public final void setPostMessagesHandler(@Y61.k z handler) {
        io.reactivex.rxjava3.disposables.d dVar = this.f101884j;
        if (dVar != null) {
            dVar.dispose();
        }
        a aVar = new a();
        z.a aVar2 = new z.a(handler.f101908a);
        PowerWebView powerWebView = this.f101876b;
        powerWebView.addJavascriptInterface(aVar2, "WebPaymentPage");
        aVar.invoke(C25404c.a(powerWebView).t0(new A(powerWebView, handler)));
    }

    public final void setStartRedirectionsDisposable(@Y61.l io.reactivex.rxjava3.disposables.d dVar) {
        this.startRedirectionsDisposable = dVar;
    }

    public final void setWebViewEnabled(boolean enable) {
        K2.d(this, true);
        this.f101880f.setVisibility(!enable ? 0 : 8);
    }

    public final void setupWebView(@Y61.k com.avito.android.cookie_provider.e cookieProvider) {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.flush();
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar : cookieProvider.a()) {
            cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
        }
    }
}
