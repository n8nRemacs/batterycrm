package com.avito.android.serp.adapter;

import com.avito.android.C36135w2;
import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.ImageKt;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertGridItemPresenter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/d;", "Lcom/avito/android/serp/adapter/c;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34727d implements InterfaceC34689c {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C42784z0 f269785h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends InterfaceC34863v> f269786b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f269787c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f269788d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ImageViewportEvent.EventSource f269789e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.h f269790f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f269791g;

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/d$a;", "", "<init>", "()V", "", "EMPTY_PAYLOADS", "Ljava/util/List;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f269793m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34729e f269794n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f269795o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdvertItem advertItem, int i12, InterfaceC34729e interfaceC34729e, AdvertItem advertItem2) {
            super(0);
            this.f269793m = advertItem;
            this.f269794n = interfaceC34729e;
            this.f269795o = advertItem2;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC34863v interfaceC34863v = C34727d.this.f269786b.get();
            AdvertItem advertItem = this.f269793m;
            interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f269794n.O(com.avito.android.image_loader.b.c(advertItem.f268368A))));
            ?? r02 = this.f269795o.f268421a1;
            if (r02 != 0) {
                r02.invoke(advertItem.f268425c);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f269797m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertItem advertItem) {
            super(0);
            this.f269797m = advertItem;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C34727d.this.f269786b.get().Ld(this.f269797m, null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$d, reason: collision with other inner class name */
    public static final class C8045d extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, kotlin.G0> {
        public C8045d() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            AsyncViewportTracker.ViewContext viewContext2 = viewContext;
            C34727d c34727d = C34727d.this;
            InterfaceC28373a interfaceC28373a = c34727d.f269787c;
            ImageViewportEvent.EventSource eventSource = c34727d.f269789e;
            C28456h.a(interfaceC28373a, new ImageViewportEvent(iIntValue, iIntValue2, eventSource != null ? eventSource.f89952b : viewContext2.f430437b, null, null, null, null, 120, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f269800m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertItem advertItem) {
            super(0);
            this.f269800m = advertItem;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC34863v interfaceC34863v = C34727d.this.f269786b.get();
            AdvertItem advertItem = this.f269800m;
            String str = advertItem.f268425c;
            Action action = advertItem.f268410V;
            if (action == null || action.getDeepLink() == null) {
                new NoMatchLink();
            }
            interfaceC34863v.getClass();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f269802m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertItem advertItem) {
            super(0);
            this.f269802m = advertItem;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C34727d.this.f269786b.get().ic(this.f269802m.f268425c);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f269804m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdvertItem advertItem) {
            super(0);
            this.f269804m = advertItem;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            InterfaceC34863v interfaceC34863v = C34727d.this.f269786b.get();
            String str = this.f269804m.f268425c;
            interfaceC34863v.getClass();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.d$h */
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<DeepLink, kotlin.G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(DeepLink deepLink) {
            C34727d.this.f269786b.get().p9(deepLink);
            return kotlin.G0.f406611a;
        }
    }

    static {
        new a(null);
        f269785h = C42784z0.f406748b;
    }

    public C34727d(@Y61.k h31.e<? extends InterfaceC34863v> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C36135w2 c36135w2, @Y61.l ImageViewportEvent.EventSource eventSource, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.h hVar) {
        this.f269786b = eVar;
        this.f269787c = interfaceC28373a;
        this.f269788d = c36135w2;
        this.f269789e = eventSource;
        this.f269790f = hVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g2((InterfaceC34729e) eVar, (AdvertItem) aVar, i12, f269785h);
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34689c
    public final void Q(boolean z12) {
        this.f269791g = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    @Override // TV0.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(@Y61.k com.avito.android.serp.adapter.InterfaceC34729e r17, @Y61.k com.avito.android.serp.adapter.AdvertItem r18, int r19, @Y61.k java.util.List<? extends java.lang.Object> r20) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.C34727d.g2(com.avito.android.serp.adapter.e, com.avito.android.serp.adapter.AdvertItem, int, java.util.List):void");
    }
}
