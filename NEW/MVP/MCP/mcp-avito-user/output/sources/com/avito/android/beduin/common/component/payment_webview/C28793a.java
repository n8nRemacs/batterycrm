package com.avito.android.beduin.common.component.payment_webview;

import Ru.b;
import Ui.InterfaceC15523b;
import android.content.Context;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.BeduinLayoutParams;
import com.avito.android.beduin.common.component.model.BeduinLayoutSize;
import com.avito.android.beduin.common.utils.C28805a;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.BeduinWebPaymentResultLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_events.events.DeeplinkHandlingResultStatus;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.json.JSONObject;

/* compiled from: BeduinWebPaymentComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/payment_webview/BeduinWebPaymentModel;", "Lcom/avito/android/beduin/common/component/payment_webview/m;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.component.payment_webview.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28793a extends com.avito.android.beduin.common.component.h<BeduinWebPaymentModel, m> {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final C3055a f101835o = new C3055a(null);

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final List<String> f101836p = Collections.singletonList("webPayment");

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Class<BeduinWebPaymentModel> f101837q = BeduinWebPaymentModel.class;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinWebPaymentModel f101838e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f101839f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f101840g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f101841h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f101842i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Gson f101843j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_events.registry.d f101844k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cookie_provider.e f101845l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final p f101846m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f101847n = true;

    /* compiled from: BeduinWebPaymentComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_webview/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$a, reason: collision with other inner class name */
    public static final class C3055a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3055a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<BeduinWebPaymentModel> S() {
            return C28793a.f101837q;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return C28793a.f101836p;
        }

        public C3055a() {
        }
    }

    /* compiled from: BeduinWebPaymentComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PowerWebViewStateChangeEvent.State state2 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: BeduinWebPaymentComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/beduin_models/BeduinAction;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$c */
    public static final class c extends N implements Y41.l<List<? extends BeduinAction>, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends BeduinAction> list) {
            InterfaceC15523b<BeduinAction> interfaceC15523b = C28793a.this.f101839f;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                interfaceC15523b.o((BeduinAction) it.next());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinWebPaymentComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$d */
    public /* synthetic */ class d extends H implements Y41.l<Uri, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(Uri uri) {
            boolean z12;
            Iterable iterable;
            C28793a c28793a = (C28793a) this.receiver;
            DeepLink deepLinkE = c28793a.f101841h.e(uri);
            if (deepLinkE instanceof NoMatchLink) {
                z12 = false;
            } else {
                if (deepLinkE instanceof BeduinWebPaymentResultLink) {
                    BeduinWebPaymentResultLink beduinWebPaymentResultLink = (BeduinWebPaymentResultLink) deepLinkE;
                    try {
                        Gson gson = c28793a.f101843j;
                        String str = beduinWebPaymentResultLink.f133047b;
                        Type type = new C28794b().getType();
                        iterable = (List) gson.e(str, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                    } catch (Exception e12) {
                        V2.f318762a.f(e12);
                        iterable = C42784z0.f406748b;
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        c28793a.f101839f.o((BeduinAction) it.next());
                    }
                    DeeplinkHandlingResultStatus deeplinkHandlingResultStatus = DeeplinkHandlingResultStatus.f134138c;
                    c28793a.f101844k.b(new b.a(beduinWebPaymentResultLink));
                } else {
                    b.a.a(c28793a.f101842i, deepLinkE, null, null, 6);
                }
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: BeduinWebPaymentComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$e */
    public /* synthetic */ class e extends H implements Y41.q<Integer, String, String, G0> {
        @Override // Y41.q
        public final G0 invoke(Integer num, String str, String str2) {
            C28793a c28793a = (C28793a) this.receiver;
            C3055a c3055a = C28793a.f101835o;
            c28793a.getClass();
            c28793a.f101838e.putExtractionParams(new Q("err", num), new Q("errors_detailed", str), new Q(ContextActionHandler.Link.URL, str2));
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinWebPaymentComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$f */
    public static final class f<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f101850c;

        public f(m mVar) {
            this.f101850c = mVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C3055a c3055a = C28793a.f101835o;
            C28793a c28793a = C28793a.this;
            c28793a.getClass();
            int iOrdinal = ((PowerWebViewStateChangeEvent) obj).f392937a.ordinal();
            m mVar = this.f101850c;
            if (iOrdinal != 0) {
                InterfaceC15523b<BeduinAction> interfaceC15523b = c28793a.f101839f;
                BeduinWebPaymentModel beduinWebPaymentModel = c28793a.f101838e;
                if (iOrdinal == 1) {
                    mVar.f101878d.b();
                    List<BeduinAction> onSuccessActions = beduinWebPaymentModel.getOnSuccessActions();
                    if (onSuccessActions != null) {
                        Iterator<T> it = onSuccessActions.iterator();
                        while (it.hasNext()) {
                            interfaceC15523b.o((BeduinAction) it.next());
                        }
                        G0 g02 = G0.f406611a;
                        return;
                    }
                    return;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.b(beduinWebPaymentModel.getErrorPlaceholder());
                    List<BeduinAction> onErrorActions = beduinWebPaymentModel.getOnErrorActions();
                    if (onErrorActions != null) {
                        Iterator<T> it2 = onErrorActions.iterator();
                        while (it2.hasNext()) {
                            interfaceC15523b.o((BeduinAction) it2.next());
                        }
                        G0 g03 = G0.f406611a;
                        return;
                    }
                    return;
                }
            }
            C42670a.d(mVar.f101878d);
            G0 g04 = G0.f406611a;
        }
    }

    /* compiled from: BeduinWebPaymentComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.payment_webview.a$g */
    public /* synthetic */ class g extends H implements Y41.l<String, G0> {
        @Override // Y41.l
        public final G0 invoke(String str) {
            List<BeduinAction> list;
            String str2 = str;
            C28793a c28793a = (C28793a) this.receiver;
            Map<String, List<BeduinAction>> messageTypeToActionsMap = c28793a.f101838e.getMessageTypeToActionsMap();
            if (messageTypeToActionsMap != null && (list = messageTypeToActionsMap.get(str2)) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    c28793a.f101839f.o((BeduinAction) it.next());
                }
            }
            return G0.f406611a;
        }
    }

    public C28793a(@Y61.k BeduinWebPaymentModel beduinWebPaymentModel, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k Gson gson, @Y61.k com.avito.android.deeplink_events.registry.d dVar, @Y61.k com.avito.android.cookie_provider.e eVar, @Y61.k p pVar) {
        this.f101838e = beduinWebPaymentModel;
        this.f101839f = interfaceC15523b;
        this.f101840g = interfaceC35745a5;
        this.f101841h = xVar;
        this.f101842i = aVar;
        this.f101843j = gson;
        this.f101844k = dVar;
        this.f101845l = eVar;
        this.f101846m = pVar;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101838e;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102604m() {
        return this.f101847n;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        BeduinWebPaymentModel beduinWebPaymentModel = (BeduinWebPaymentModel) beduinModel;
        y.f101906b.getClass();
        Map map = (Map) C28805a.a(beduinWebPaymentModel.getPostMessageParams(), this.f101838e.getPostMessageParams());
        y yVar = new y(map);
        if (map == null || map.isEmpty()) {
            yVar = null;
        }
        return yVar == null ? beduinWebPaymentModel : yVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        Context context = viewGroup.getContext();
        BeduinWebPaymentModel beduinWebPaymentModel = this.f101838e;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.avito.android.beduin.common.component.a.a(beduinWebPaymentModel.getTheme()));
        String f102944b = beduinWebPaymentModel.getF102944b();
        p pVar = this.f101846m;
        HashMap<String, PowerWebView> map = pVar.f101892c;
        PowerWebView powerWebView = map.get(f102944b);
        if (powerWebView == null) {
            powerWebView = new PowerWebView(pVar.f101890a);
            map.put(f102944b, powerWebView);
        }
        m mVar = new m(contextThemeWrapper, powerWebView);
        mVar.setId(R.id.beduin_web_payment);
        BeduinLayoutParams layoutParams2 = beduinWebPaymentModel.getLayoutParams();
        if (layoutParams2 == null) {
            BeduinLayoutSize.MatchParent matchParent = BeduinLayoutSize.MatchParent.INSTANCE;
            layoutParams2 = new BeduinLayoutParams(matchParent, matchParent, null, null, null, null, 60, null);
        }
        I.d(mVar, layoutParams2, layoutParams);
        return mVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(View view, List list) {
        m mVar = (m) view;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof y) {
                obj = obj2;
            }
        }
        if (!(obj instanceof y)) {
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar == null) {
            q(mVar);
            return;
        }
        io.reactivex.rxjava3.disposables.d startRedirectionsDisposable = mVar.getStartRedirectionsDisposable();
        if (startRedirectionsDisposable != null) {
            startRedirectionsDisposable.dispose();
        }
        Map<String, Object> map = yVar.f101907a;
        if (map != null) {
            mVar.f101876b.evaluateJavascript("window.postMessage(" + new JSONObject(map).toString().replace('\"', '\'') + ", '*')", null);
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = mVar.getStateChangeEvents().N(com.avito.android.beduin.common.component.payment_webview.c.f101851b).z0(1L).j0(this.f101840g.e()).t0(new com.avito.android.beduin.common.component.payment_webview.d(this, mVar));
        mVar.getCompositeDisposable().b(dVarT0);
        mVar.setStartRedirectionsDisposable(dVarT0);
    }

    @Override // com.avito.android.beduin.common.component.h
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q(@Y61.k m mVar) {
        BeduinWebPaymentModel beduinWebPaymentModel = this.f101838e;
        mVar.setTag(beduinWebPaymentModel.getF102944b());
        mVar.getCompositeDisposable().e();
        if (beduinWebPaymentModel.getMessageTypeKey() != null && beduinWebPaymentModel.getMessageTypeToActionsMap() != null) {
            mVar.setPostMessagesHandler(new z(beduinWebPaymentModel.getMessageTypeKey(), new g(1, this, C28793a.class, "handlePostMessage", "handlePostMessage(Ljava/lang/String;)V", 0)));
        }
        Boolean boolIsEnabled = beduinWebPaymentModel.isEnabled();
        mVar.setWebViewEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
        BeduinLayoutParams layoutParams = beduinWebPaymentModel.getLayoutParams();
        if (layoutParams == null) {
            BeduinLayoutSize.MatchParent matchParent = BeduinLayoutSize.MatchParent.INSTANCE;
            layoutParams = new BeduinLayoutParams(matchParent, matchParent, null, null, null, null, 60, null);
        }
        I.d(mVar, layoutParams, mVar.getLayoutParams());
        BeduinLayoutParams layoutParams2 = beduinWebPaymentModel.getLayoutParams();
        J.b(mVar, layoutParams2 != null ? layoutParams2.getMargin() : null);
        BeduinLayoutParams layoutParams3 = beduinWebPaymentModel.getLayoutParams();
        I.e(mVar, layoutParams3 != null ? layoutParams3.getPadding() : null);
        mVar.setOnErrorRetryButtonClick(new c());
        PowerWebView powerWebView = mVar.f101876b;
        powerWebView.f392926d.clear();
        powerWebView.a(new k(new d(1, this, C28793a.class, "interceptUrl", "interceptUrl(Landroid/net/Uri;)Z", 0)));
        mVar.setErrorHandler(new s(new e(3, this, C28793a.class, "handleWebViewError", "handleWebViewError(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", 0)));
        mVar.getCompositeDisposable().b(mVar.getStateChangeEvents().j0(this.f101840g.e()).t0(new f(mVar)));
        Boolean boolIsLoading = beduinWebPaymentModel.isLoading();
        Boolean bool = Boolean.TRUE;
        boolean zF2 = L.f(boolIsLoading, bool);
        com.avito.android.beduin_shared.model.progress_overlay.a aVar = mVar.f101878d;
        if (zF2) {
            C42670a.d(aVar);
        } else if (L.f(beduinWebPaymentModel.getShowErrorPlaceholder(), bool)) {
            mVar.b(beduinWebPaymentModel.getErrorPlaceholder());
        }
        p pVar = this.f101846m;
        if (L.f(pVar.f101891b, beduinWebPaymentModel.getUrl()) || beduinWebPaymentModel.getUrl().length() <= 0) {
            return;
        }
        mVar.setupWebView(this.f101845l);
        C42670a.d(aVar);
        String url = beduinWebPaymentModel.getUrl();
        mVar.f101879e = url;
        powerWebView.loadUrl(url);
        pVar.f101891b = beduinWebPaymentModel.getUrl();
    }
}
