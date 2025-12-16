package com.avito.android.info.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.info.di.d;
import com.avito.android.remote.model.Info;
import com.avito.android.util.C35769c6;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.TypefaceType;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.flowable.C41882r1;
import io.reactivex.rxjava3.internal.operators.flowable.C41895w;
import io.reactivex.rxjava3.internal.operators.flowable.Y;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.internal.operators.observable.U;
import io.reactivex.rxjava3.internal.subscribers.n;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.o;
import xN.InterfaceC49865a;

/* compiled from: InfoPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/info/ui/g;", "Lcom/avito/android/info/ui/c;", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f170959a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49865a f170960b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f170961c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<z<Info>> f170962d = new io.reactivex.rxjava3.subjects.e<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Info f170963e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InfoActivity f170964f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public m f170965g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public n f170966h;

    /* compiled from: InfoPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g gVar = g.this;
            m mVar = gVar.f170965g;
            if (mVar != null) {
                mVar.f170974a.a("");
            }
            gVar.f170963e = null;
        }
    }

    /* compiled from: InfoPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Info;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Info;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Info info = (Info) obj;
            g gVar = g.this;
            gVar.f170963e = info;
            m mVar = gVar.f170965g;
            if (mVar == null) {
                return;
            }
            g.f(mVar, info);
        }
    }

    @Inject
    public g(@d.InterfaceC5064d @Y61.k String str, @Y61.k InterfaceC49865a interfaceC49865a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @d.c @Y61.l Bundle bundle) {
        Info info;
        this.f170959a = str;
        this.f170960b = interfaceC49865a;
        this.f170961c = interfaceC35745a5;
        if (bundle != null) {
            info = (Info) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("key_info", Info.class) : bundle.getParcelable("key_info"));
        } else {
            info = null;
        }
        this.f170963e = info;
    }

    public static void f(m mVar, Info info) {
        if (info.getUri() == null || !(info.getUri() instanceof WebViewLink)) {
            String baseUrl = info.getBaseUrl();
            String text = info.getText();
            if (text != null) {
                mVar.f170976c.loadDataWithBaseURL(baseUrl, text, "text/html", Constants.ENCODING, null);
            } else {
                mVar.getClass();
            }
            mVar.a();
            return;
        }
        WebViewLink webViewLink = (WebViewLink) info.getUri();
        WebView webView = mVar.f170976c;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl(webViewLink.getF133855b().toString());
        mVar.a();
    }

    @Override // com.avito.android.info.ui.c
    public final void a(@Y61.k Bundle bundle) {
        bundle.putParcelable("key_info", this.f170963e);
    }

    @Override // com.avito.android.info.ui.c
    public final void b(@Y61.k InfoActivity infoActivity) {
        this.f170964f = infoActivity;
    }

    @Override // com.avito.android.info.ui.k.a
    public final void c() {
        e();
    }

    @Override // com.avito.android.info.ui.c
    public final void c0() {
        this.f170964f = null;
    }

    @Override // com.avito.android.info.ui.k.a
    public final void close() {
        InfoActivity infoActivity = this.f170964f;
        if (infoActivity != null) {
            infoActivity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.info.ui.c
    public final void d(@Y61.k m mVar) {
        AbstractC41777j c41895w;
        AbstractC41777j<z<Info>> abstractC41777jG0 = this.f170962d.G0(BackpressureStrategy.f401954c);
        o oVar = d.f170956b;
        Objects.requireNonNull(oVar, "mapper is null");
        io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
        if (abstractC41777jG0 instanceof q41.e) {
            T t12 = ((q41.e) abstractC41777jG0).get();
            c41895w = t12 == 0 ? Y.f402580c : C41882r1.a(t12, oVar);
        } else {
            c41895w = new C41895w(abstractC41777jG0, oVar);
        }
        l41.g gVar = e.f170957b;
        final V2 v22 = V2.f318762a;
        l41.g<? super Throwable> gVar2 = new l41.g() { // from class: com.avito.android.info.ui.f
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        c41895w.getClass();
        this.f170966h = (n) c41895w.p(gVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c);
        this.f170965g = mVar;
        Toolbar toolbar = mVar.f170975b;
        Context context = toolbar.getContext();
        TypefaceType typefaceType = TypefaceType.f318743c;
        int i12 = C35777d6.f318863a;
        SpannableString spannableStringValueOf = SpannableString.valueOf(this.f170959a);
        spannableStringValueOf.setSpan(new C35769c6(androidx.core.content.res.i.c(C35835l0.j(R.attr.fontRegular, context), context)), 0, spannableStringValueOf.length(), 33);
        toolbar.setTitle(spannableStringValueOf);
        Info info = this.f170963e;
        if (info == null) {
            e();
        } else {
            f(mVar, info);
        }
    }

    public final void e() {
        m mVar = this.f170965g;
        if (mVar != null) {
            mVar.f170974a.k(null);
        }
        z<Info> zVarLoad = this.f170960b.load();
        InterfaceC35745a5 interfaceC35745a5 = this.f170961c;
        O oK2 = zVarLoad.j0(interfaceC35745a5.e()).x0(interfaceC35745a5.a()).I(new a()).K(new b());
        U u12 = U.f403867b;
        Objects.requireNonNull(u12, "fallback is null");
        this.f170962d.onNext(oK2.l0(io.reactivex.rxjava3.internal.functions.a.g(u12)));
    }

    @Override // com.avito.android.info.ui.c
    public final void e0() {
        n nVar = this.f170966h;
        if (nVar != null) {
            SubscriptionHelper.a(nVar);
        }
        this.f170965g = null;
        this.f170966h = null;
    }
}
