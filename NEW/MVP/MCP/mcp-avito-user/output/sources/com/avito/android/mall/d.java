package com.avito.android.mall;

import android.view.View;
import android.view.ViewGroup;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import com.avito.android.C31100l2;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.search_view.v;
import com.avito.android.util.InterfaceC35745a5;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;

/* compiled from: MallView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/d;", "Lcom/avito/android/mall/c;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f184247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f184248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PowerWebView f184249c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.view.d f184250d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f184251e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f184252f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C31100l2 f184253g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final L f184254h;

    /* compiled from: MallView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* compiled from: MallView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.mall.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C5403a {
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
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    PowerWebViewStateChangeEvent.State state3 = PowerWebViewStateChangeEvent.State.f392943b;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
            }
        }

        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
            int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
            d dVar = d.this;
            if (iOrdinal == 0) {
                String str = powerWebViewStateChangeEvent.f392939c;
                if (str == null || str.length() == 0) {
                    return;
                }
                dVar.f184251e.k(null);
                return;
            }
            if (iOrdinal == 1) {
                dVar.f184251e.j();
            } else {
                if (iOrdinal != 3) {
                    return;
                }
                dVar.f184251e.a("");
            }
        }
    }

    /* compiled from: MallView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f184256b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f184256b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f184256b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f184256b;
        }

        public final int hashCode() {
            return this.f184256b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f184256b.invoke(obj);
        }
    }

    public d(@Y61.k View view, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.search.m mVar, @Y61.k LX.a aVar, @Y61.k com.avito.android.mall.webview.a aVar2, @Y61.l String str, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.text.a aVar3) {
        this.f184247a = interfaceC22983P;
        this.f184248b = str;
        PowerWebView powerWebView = (PowerWebView) view.findViewById(R.id.web_view);
        powerWebView.a(aVar2);
        powerWebView.addJavascriptInterface(aVar, "MALL_ANDROID");
        powerWebView.getSettings().setDomStorageEnabled(true);
        this.f184249c = powerWebView;
        com.avito.android.ui.view.d dVar = new com.avito.android.ui.view.d(powerWebView);
        this.f184250d = dVar;
        this.f184251e = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), R.id.web_view, null, 0, 0, 24, null);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f184252f = cVar;
        C31100l2 c31100l2 = new C31100l2(interfaceC22983P, view.findViewById(R.id.new_redesign_search_bar), interfaceC35745a5, mVar, interfaceC28373a, aVar3);
        v vVar = c31100l2.f174866f;
        vVar.w();
        vVar.setMenu(R.menu.mall);
        this.f184253g = c31100l2;
        this.f184254h = new L(interfaceC22983P, n12, false, 4, null);
        cVar.b(dVar.f304688b.j0(interfaceC35745a5.e()).t0(new a()));
    }

    public /* synthetic */ d(View view, InterfaceC22983P interfaceC22983P, com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N n12, InterfaceC35745a5 interfaceC35745a5, com.avito.android.search.m mVar, LX.a aVar, com.avito.android.mall.webview.a aVar2, String str, InterfaceC28373a interfaceC28373a, com.avito.android.util.text.a aVar3, int i12, C42822w c42822w) {
        this(view, interfaceC22983P, n12, interfaceC35745a5, mVar, aVar, aVar2, (i12 & 128) != 0 ? null : str, interfaceC28373a, aVar3);
    }
}
