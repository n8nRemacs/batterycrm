package com.avito.android.bxcontent.search_bar_promo_widget;

import Y41.p;
import Y41.q;
import com.adjust.sdk.Constants;
import com.avito.android.C36135w2;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.bxcontent.Y0;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.serp.adapter.search_bar.InterfaceC34826e;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: SearchPromoHeaderWidgetPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/e;", "Lcom/avito/android/bxcontent/search_bar_promo_widget/d;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.bxcontent.search_bar_promo_widget.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.analytics.a f112861b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f112862c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f112863d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f112864e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e2 f112865f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e2 f112866g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Z1<com.avito.android.ui.status_bar.d> f112867h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f112868i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public i f112869j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public BxContentFragment.G f112870k;

    /* compiled from: SearchPromoHeaderWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "toolbarAnimateProgress", "Lkotlin/G0;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Float, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Float f12) {
            e.this.f112863d.K5(Float.valueOf(f12.floatValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: SearchPromoHeaderWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/ui/status_bar/d;", "statusBarUpdate", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/ui/status_bar/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<com.avito.android.ui.status_bar.d, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.ui.status_bar.d dVar) {
            e.this.f112867h.K5(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchPromoHeaderWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search_bar/utils/UdfToolbarColors;", "toolbarAnimateProgress", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search_bar/utils/UdfToolbarColors;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<UdfToolbarColors, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(UdfToolbarColors udfToolbarColors) {
            e.this.f112864e.K5(udfToolbarColors);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchPromoHeaderWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "title", "buttonText", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<String, String, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            e.this.f112861b.f(str, str2);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchPromoHeaderWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/h;", "newState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bxcontent/search_bar_promo_widget/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.search_bar_promo_widget.e$e, reason: collision with other inner class name */
    public static final class C3314e extends N implements Y41.l<h, G0> {
        public C3314e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(h hVar) {
            e.this.f112866g.K5(hVar);
            return G0.f406611a;
        }
    }

    /* compiled from: SearchPromoHeaderWidgetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "title", "buttonText", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements q<DeepLink, String, String, G0> {
        public f() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(DeepLink deepLink, String str, String str2) {
            e eVar = e.this;
            eVar.f112861b.c(str, str2);
            eVar.f112865f.K5(deepLink);
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.bxcontent.analytics.a aVar, @Y61.k C36135w2 c36135w2) {
        this.f112861b = aVar;
        this.f112862c = c36135w2;
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f112863d = f2.b(0, 1, bufferOverflow, 1);
        this.f112864e = f2.b(0, 1, bufferOverflow, 1);
        this.f112865f = f2.b(0, 1, bufferOverflow, 1);
        this.f112866g = f2.b(0, 1, bufferOverflow, 1);
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f112867h = z1A;
        this.f112868i = z1A;
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    public final void G4(@Y61.k i iVar, @Y61.k BxContentFragment.G g12) {
        this.f112869j = iVar;
        this.f112870k = g12;
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    public final void d3(boolean z12) {
        i iVar = this.f112869j;
        if (iVar != null) {
            iVar.d3(z12);
        }
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f112868i;
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    @Y61.k
    public final InterfaceC43160i<UdfToolbarColors> e3() {
        return C43175k.a(this.f112864e);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    public final void f0() {
        i iVar = this.f112869j;
        if (iVar != null) {
            iVar.d();
        }
        this.f112869j = null;
        this.f112870k = null;
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    @Y61.k
    public final InterfaceC43160i<Float> f3() {
        return C43175k.a(this.f112863d);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    @Y61.k
    public final InterfaceC43160i<DeepLink> g3() {
        return C43175k.a(this.f112865f);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    @Y61.k
    public final InterfaceC43160i<h> h3() {
        return C43175k.a(this.f112866g);
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    public final void hide() {
        BxContentFragment.G g12 = this.f112870k;
        if (g12 != null) {
            BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            Y0 y0K5 = bxContentFragment.K5();
            bxContentFragment.g6();
            y0K5.XB(false);
            if (bxContentFragment.g6()) {
                bxContentFragment.Z5().accept(new InterfaceC29127b.L0(UdfToolbarStyle.SearchInputHeightType.f264073b, UdfToolbarStyle.SearchInputRightMargin.f264077b, UdfToolbarStyle.CartIconRightMargin.f264065b, 1.0f));
                return;
            }
            InterfaceC34826e interfaceC34826e = bxContentFragment.f108969X2;
            if (interfaceC34826e == null) {
                interfaceC34826e = null;
            }
            interfaceC34826e.b();
        }
    }

    @Override // com.avito.android.bxcontent.search_bar_promo_widget.d
    public final void j3(boolean z12, @Y61.k SearchPromoHeaderWidgetItem searchPromoHeaderWidgetItem, boolean z13) {
        BxContentFragment.G g12 = this.f112870k;
        if (g12 != null) {
            BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
            BxContentFragment bxContentFragment = BxContentFragment.this;
            Y0 y0K5 = bxContentFragment.K5();
            bxContentFragment.g6();
            y0K5.XB(true);
            if (bxContentFragment.g6()) {
                bxContentFragment.Z5().accept(new InterfaceC29127b.L0(UdfToolbarStyle.SearchInputHeightType.f264074c, UdfToolbarStyle.SearchInputRightMargin.f264078c, UdfToolbarStyle.CartIconRightMargin.f264066c, 0.9f));
            } else {
                InterfaceC34826e interfaceC34826e = bxContentFragment.f108969X2;
                if (interfaceC34826e == null) {
                    interfaceC34826e = null;
                }
                interfaceC34826e.f();
                bxContentFragment.f6();
                com.avito.android.bxcontent.toolbar_helper.a aVar = bxContentFragment.f108915I3;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.G(bxContentFragment.Z5().f112646N.getValue().f111141a.f112301D, null, true);
            }
        }
        i iVar = this.f112869j;
        if (iVar != null) {
            C36135w2 c36135w2 = this.f112862c;
            c36135w2.getClass();
            kotlin.reflect.n<Object> nVar = C36135w2.f327457X[31];
            iVar.c(z12, new a(), new b(), searchPromoHeaderWidgetItem.f112848g, new c(), new d(), new C3314e(), ((Boolean) c36135w2.f327459B.a().getValue()).booleanValue(), z13);
            iVar.a(searchPromoHeaderWidgetItem.f112847f);
            iVar.v1(searchPromoHeaderWidgetItem.f112846e);
            iVar.f4(searchPromoHeaderWidgetItem.f112845d);
            iVar.b(searchPromoHeaderWidgetItem.f112844c, new f());
        }
    }
}
