package com.avito.android.serp.adapter.sale_advert_item;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertGridSaleItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/sale_advert_item/d;", "Lcom/avito/android/serp/adapter/sale_advert_item/c;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.serp.adapter.sale_advert_item.c {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C42784z0 f271536g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<? extends InterfaceC34863v> f271537b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f271538c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C36135w2 f271539d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ImageViewportEvent.EventSource f271540e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f271541f;

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/sale_advert_item/d$a;", "", "<init>", "()V", "", "EMPTY_PAYLOADS", "Ljava/util/List;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f271543m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.serp.adapter.sale_advert_item.e f271544n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f271545o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdvertItem advertItem, int i12, com.avito.android.serp.adapter.sale_advert_item.e eVar, AdvertItem advertItem2) {
            super(0);
            this.f271543m = advertItem;
            this.f271544n = eVar;
            this.f271545o = advertItem2;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = d.this.f271537b.get();
            AdvertItem advertItem = this.f271543m;
            interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f271544n.O(com.avito.android.image_loader.b.c(advertItem.f268368A))));
            ?? r02 = this.f271545o.f268421a1;
            if (r02 != 0) {
                r02.invoke(advertItem.f268425c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f271547m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertItem advertItem) {
            super(0);
            this.f271547m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f271537b.get().Ld(this.f271547m, null);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.sale_advert_item.d$d, reason: collision with other inner class name */
    public static final class C8077d extends N implements q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {
        public C8077d() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            AsyncViewportTracker.ViewContext viewContext2 = viewContext;
            d dVar = d.this;
            InterfaceC28373a interfaceC28373a = dVar.f271538c;
            ImageViewportEvent.EventSource eventSource = dVar.f271540e;
            C28456h.a(interfaceC28373a, new ImageViewportEvent(iIntValue, iIntValue2, eventSource != null ? eventSource.f89952b : viewContext2.f430437b, null, null, null, null, 120, null));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f271550m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertItem advertItem) {
            super(0);
            this.f271550m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = d.this.f271537b.get();
            AdvertItem advertItem = this.f271550m;
            String str = advertItem.f268425c;
            Action action = advertItem.f268410V;
            if (action == null || action.getDeepLink() == null) {
                new NoMatchLink();
            }
            interfaceC34863v.getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f271552m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertItem advertItem) {
            super(0);
            this.f271552m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f271537b.get().ic(this.f271552m.f268425c);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f271554m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdvertItem advertItem) {
            super(0);
            this.f271554m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = d.this.f271537b.get();
            String str = this.f271554m.f268425c;
            interfaceC34863v.getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridSaleItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<DeepLink, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            d.this.f271537b.get().p9(deepLink);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f271536g = C42784z0.f406748b;
    }

    public d(@k h31.e<? extends InterfaceC34863v> eVar, @k InterfaceC28373a interfaceC28373a, @k C36135w2 c36135w2, @l ImageViewportEvent.EventSource eventSource) {
        this.f271537b = eVar;
        this.f271538c = interfaceC28373a;
        this.f271539d = c36135w2;
        this.f271540e = eventSource;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g2((com.avito.android.serp.adapter.sale_advert_item.e) eVar, (AdvertItem) aVar, i12, f271536g);
    }

    @Override // com.avito.android.serp.adapter.sale_advert_item.c
    public final void Q(boolean z12) {
        this.f271541f = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c6  */
    @Override // TV0.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(@Y61.k com.avito.android.serp.adapter.sale_advert_item.e r11, @Y61.k com.avito.android.serp.adapter.AdvertItem r12, int r13, @Y61.k java.util.List<? extends java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.sale_advert_item.d.g2(com.avito.android.serp.adapter.sale_advert_item.e, com.avito.android.serp.adapter.AdvertItem, int, java.util.List):void");
    }
}
