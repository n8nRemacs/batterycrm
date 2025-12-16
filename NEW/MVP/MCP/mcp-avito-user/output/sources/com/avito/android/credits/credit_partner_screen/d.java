package com.avito.android.credits.credit_partner_screen;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.ProgressBar;
import b31.C25402a;
import com.avito.android.R;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragment;
import com.avito.android.credits.credit_partner_screen.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zs.InterfaceC50620a;

/* compiled from: CreditPartnerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/d;", "", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f128778a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.credits.credit_partner_screen.a f128779b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.credits.web_handler.f f128780c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.credits.credit_partner_screen.webview.a f128781d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC50620a f128782e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.credits.e f128783f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l<ValueCallback<Uri[]>, G0> f128784g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final l<PowerWebViewStateChangeEvent, G0> f128785h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Y41.a<G0> f128786i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final PowerWebView f128787j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.ui.view.d f128788k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final View f128789l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ProgressBar f128790m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f128791n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f128792o;

    /* compiled from: CreditPartnerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k View view, @k com.avito.android.credits.credit_partner_screen.a aVar, @k com.avito.android.credits.web_handler.f fVar, @k com.avito.android.credits.credit_partner_screen.webview.a aVar2, @k InterfaceC50620a interfaceC50620a, @k com.avito.android.credits.e eVar, @k l<? super ValueCallback<Uri[]>, G0> lVar, @k l<? super PowerWebViewStateChangeEvent, G0> lVar2, @k Y41.a<G0> aVar3) {
        this.f128778a = view;
        this.f128779b = aVar;
        this.f128780c = fVar;
        this.f128781d = aVar2;
        this.f128782e = interfaceC50620a;
        this.f128783f = eVar;
        this.f128784g = lVar;
        this.f128785h = lVar2;
        this.f128786i = aVar3;
        View viewFindViewById = view.findViewById(R.id.web_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById;
        this.f128787j = powerWebView;
        com.avito.android.ui.view.d dVar = new com.avito.android.ui.view.d(powerWebView);
        this.f128788k = dVar;
        View viewFindViewById2 = view.findViewById(R.id.app_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f128789l = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        this.f128790m = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.credit_partner_logo);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById4;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f128792o = cVar;
        if (aVar instanceof a.c) {
            imageView.setImageDrawable(androidx.core.content.d.getDrawable(view.getContext(), R.drawable.tinkoff_credit_partner_logo));
        } else {
            D6.w(viewFindViewById2);
        }
        powerWebView.setBackgroundColor(C35835l0.d(R.attr.transparentBlack, view.getContext()));
        powerWebView.setLayerType(2, null);
        powerWebView.setHorizontalScrollBarEnabled(false);
        powerWebView.setHttpErrorHandlerDelegate(new com.avito.android.credits.credit_partner_screen.webview.e(aVar.f128770b, null, 2, null));
        powerWebView.setWebChromeClient(new e(this));
        powerWebView.setWebResourceErrorHandlerDelegate(aVar2);
        powerWebView.setSslErrorHandlerDelegate(aVar2);
        fVar.a(dVar);
        l41.g gVar = new l41.g() { // from class: com.avito.android.credits.credit_partner_screen.f
            @Override // l41.g
            public final void accept(Object obj) {
                PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
                d dVar2 = this.f128818b;
                dVar2.getClass();
                int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
                InterfaceC50620a interfaceC50620a2 = dVar2.f128782e;
                a aVar4 = dVar2.f128779b;
                if (iOrdinal == 0) {
                    interfaceC50620a2.f(aVar4.f128771c);
                } else if (iOrdinal == 1) {
                    interfaceC50620a2.b();
                    Uri uri = Uri.parse(dVar2.f128787j.getUrl());
                    dVar2.f128783f.A(a.a(uri, aVar4.f128772d), a.a(uri, aVar4.f128773e), a.a(uri, aVar4.f128774f));
                } else if (iOrdinal == 3) {
                    String str = "HTTP error: code:" + powerWebViewStateChangeEvent.f392941e + " message:" + powerWebViewStateChangeEvent.f392942f;
                    interfaceC50620a2.c(new RuntimeException(str));
                    V2.f318762a.d(aVar4.f128770b, str);
                }
                ((CreditPartnerFragment.c) dVar2.f128785h).invoke(powerWebViewStateChangeEvent);
            }
        };
        g gVar2 = new g(this);
        C25402a c25402a = dVar.f304688b;
        c25402a.getClass();
        cVar.b(c25402a.v0(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
