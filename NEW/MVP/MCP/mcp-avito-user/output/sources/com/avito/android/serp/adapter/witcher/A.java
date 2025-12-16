package com.avito.android.serp.adapter.witcher;

import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.ja;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem;
import com.avito.android.serp.adapter.witcher.C34883b;
import com.avito.android.util.Kundle;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: WitcherItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/A;", "Lcom/avito/android/serp/adapter/witcher/r;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A implements r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34891j f273734b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f273735c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final M f273736d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C34883b f273737e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC34885d f273738f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Kundle f273739g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public WitcherItem f273740h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f273741i;

    /* compiled from: WitcherItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/witcher/WitcherSelectionType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<WitcherSelectionType> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final WitcherSelectionType invoke() {
            WitcherItem witcherItem = A.this.f273740h;
            if (witcherItem != null) {
                return witcherItem.f273814e;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Inject
    public A(@Y61.l @ja.b Kundle kundle, @Y61.k InterfaceC34891j interfaceC34891j, @Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k M m12, @Y61.k C34883b c34883b) {
        this.f273734b = interfaceC34891j;
        this.f273735c = eVar;
        this.f273736d = m12;
        this.f273737e = c34883b;
        this.f273739g = kundle == null ? new Kundle() : kundle;
        this.f273741i = C42727D.c(new a());
    }

    @Override // com.avito.android.serp.adapter.witcher.r
    public final void F0(boolean z12) {
        this.f273734b.F0(z12);
    }

    @Override // com.avito.android.serp.adapter.witcher.r
    public final void I0(@Y61.l Parcelable parcelable, int i12) {
        this.f273739g.j(parcelable, "WITCHER_SAVED_STATE_KEY " + i12);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.util.List<com.avito.android.serp.adapter.PersistableSerpItem>] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        D d12 = (D) eVar;
        WitcherItem witcherItem = (WitcherItem) aVar;
        this.f273740h = witcherItem;
        C34883b c34883b = this.f273737e;
        c34883b.getClass();
        int i13 = C34883b.a.f273847a[witcherItem.f273821l.ordinal()];
        InterfaceC28373a interfaceC28373a = c34883b.f273846b;
        com.avito.android.serp.analytics.widgets_tracker.g gVar = c34883b.f273845a;
        InterfaceC34885d c34882a = i13 == 1 ? new C34882a(gVar, interfaceC28373a, witcherItem, i12) : new C34886e(gVar, interfaceC28373a, witcherItem, i12);
        this.f273738f = c34882a;
        c34882a.b(witcherItem.f273814e.name());
        d12.L4();
        d12.setTitle(witcherItem.f273816g);
        d12.f(witcherItem.f273817h);
        d12.Hu(witcherItem.f273818i, witcherItem.f273819j);
        InterfaceC42726C interfaceC42726C = this.f273741i;
        d12.SK();
        d12.Z5(((WitcherSelectionType) interfaceC42726C.getValue()).f273839b);
        this.f273734b.G0(d12, witcherItem, (WitcherSelectionType) interfaceC42726C.getValue());
        l0.h hVar = new l0.h();
        hVar.f406842b = witcherItem.f273815f;
        M m12 = this.f273736d;
        if (m12.getF273791i()) {
            hVar.f406842b = C42745f0.E0((Iterable) hVar.f406842b, m12.getF273784b());
        }
        for (PersistableSerpItem persistableSerpItem : (Iterable) hVar.f406842b) {
            if (persistableSerpItem instanceof AdvertItem) {
                AdvertItem advertItem = (AdvertItem) persistableSerpItem;
                InterfaceC34885d interfaceC34885d = this.f273738f;
                advertItem.f268421a1 = new s(1, interfaceC34885d == null ? null : interfaceC34885d, InterfaceC34885d.class, "trackItemClicked", "trackItemClicked(Ljava/lang/String;)V", 0);
            } else if (persistableSerpItem instanceof DevelopmentItem) {
                DevelopmentItem developmentItem = (DevelopmentItem) persistableSerpItem;
                InterfaceC34885d interfaceC34885d2 = this.f273738f;
                developmentItem.f270911t = new t(1, interfaceC34885d2 == null ? null : interfaceC34885d2, InterfaceC34885d.class, "trackItemClicked", "trackItemClicked(Ljava/lang/String;)V", 0);
            } else if (persistableSerpItem instanceof SerpConstructorAdvertItem) {
                SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) persistableSerpItem;
                InterfaceC34885d interfaceC34885d3 = this.f273738f;
                serpConstructorAdvertItem.setItemClickListener(new u(1, interfaceC34885d3 == null ? null : interfaceC34885d3, InterfaceC34885d.class, "trackItemClicked", "trackItemClicked(Ljava/lang/String;)V", 0));
            }
        }
        d12.t(new v(hVar));
        UV0.c cVar = new UV0.c((List) hVar.f406842b);
        d12.xc(cVar, witcherItem.hashCode(), witcherItem.f273822m);
        d12.ce(cVar);
        d12.zb(cVar);
        d12.W4(this.f273739g.d(AK.c.g(witcherItem.hashCode(), "WITCHER_SAVED_STATE_KEY ")));
        d12.A1().u0(new w(this, witcherItem), x.f273897b);
        d12.Y9().u0(new y(this, witcherItem), z.f273900b);
    }

    @Override // com.avito.android.serp.adapter.witcher.r
    public final void R1() {
        InterfaceC34885d interfaceC34885d = this.f273738f;
        if (interfaceC34885d == null) {
            interfaceC34885d = null;
        }
        interfaceC34885d.c();
    }

    @Override // com.avito.android.serp.adapter.witcher.r
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final Kundle getF273739g() {
        return this.f273739g;
    }

    public /* synthetic */ A(Kundle kundle, InterfaceC34891j interfaceC34891j, h31.e eVar, M m12, C34883b c34883b, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : kundle, interfaceC34891j, eVar, m12, c34883b);
    }
}
