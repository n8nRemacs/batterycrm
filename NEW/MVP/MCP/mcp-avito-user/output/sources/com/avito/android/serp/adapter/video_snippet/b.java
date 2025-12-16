package com.avito.android.serp.adapter.video_snippet;

import Xt.InterfaceC17045a;
import Y41.p;
import Y41.q;
import Y41.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.constructor_advert.ui.serp.constructor.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.p1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mc.C44048a;
import ru.avito.component.serp.AsyncViewportTracker;
import sN0.InterfaceC48080b;

/* compiled from: AdvertGridItemWithVideoPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/video_snippet/b;", "Lcom/avito/android/serp/adapter/video_snippet/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.serp.adapter.video_snippet.a {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final C42784z0 f273654k;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<? extends InterfaceC34863v> f273655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f273656c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f273657d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ImageViewportEvent.EventSource f273658e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.video_snippets.g f273659f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48080b f273660g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.h f273661h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f273662i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final p1 f273663j;

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/video_snippet/b$a;", "", "<init>", "()V", "", "EMPTY_PAYLOADS", "Ljava/util/List;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.video_snippet.b$b, reason: collision with other inner class name */
    public static final class C8121b extends N implements Y41.l<DeepLink, G0> {
        public C8121b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            b.this.f273655b.get().p9(deepLink);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273666m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.serp.adapter.video_snippet.c f273667n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273668o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertItem advertItem, int i12, com.avito.android.serp.adapter.video_snippet.c cVar, AdvertItem advertItem2) {
            super(0);
            this.f273666m = advertItem;
            this.f273667n = cVar;
            this.f273668o = advertItem2;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = b.this.f273655b.get();
            AdvertItem advertItem = this.f273666m;
            interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f273667n.O(com.avito.android.image_loader.b.c(advertItem.f268368A))));
            ?? r02 = this.f273668o.f268421a1;
            if (r02 != 0) {
                r02.invoke(advertItem.f268425c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f273669l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273670m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdvertItem advertItem, b bVar) {
            super(0);
            this.f273669l = bVar;
            this.f273670m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f273669l.f273655b.get().Ld(this.f273670m, null);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f273671l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273672m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertItem advertItem, b bVar) {
            super(0);
            this.f273671l = bVar;
            this.f273672m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.video_snippets.g gVar = this.f273671l.f273659f;
            if (gVar != null) {
                gVar.c(this.f273672m.f268425c);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273673l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f273674m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdvertItem advertItem, b bVar) {
            super(0);
            this.f273673l = advertItem;
            this.f273674m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            List<String> list = this.f273673l.f268445k0;
            if (list != null) {
                this.f273674m.f273660g.c(list);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f273675l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {
        public h() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            AsyncViewportTracker.ViewContext viewContext2 = viewContext;
            b bVar = b.this;
            InterfaceC28373a interfaceC28373a = bVar.f273656c;
            ImageViewportEvent.EventSource eventSource = bVar.f273658e;
            C28456h.a(interfaceC28373a, new ImageViewportEvent(iIntValue, iIntValue2, eventSource != null ? eventSource.f89952b : viewContext2.f430437b, null, null, null, null, 120, null));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f273677l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273678m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AdvertItem advertItem, b bVar) {
            super(0);
            this.f273677l = bVar;
            this.f273678m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = this.f273677l.f273655b.get();
            AdvertItem advertItem = this.f273678m;
            String str = advertItem.f268425c;
            Action action = advertItem.f268410V;
            if (action == null || action.getDeepLink() == null) {
                new NoMatchLink();
            }
            interfaceC34863v.getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f273679l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273680m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AdvertItem advertItem, b bVar) {
            super(0);
            this.f273679l = bVar;
            this.f273680m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f273679l.f273655b.get().ic(this.f273680m.f268425c);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f273681l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273682m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AdvertItem advertItem, b bVar) {
            super(0);
            this.f273681l = bVar;
            this.f273682m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = this.f273681l.f273655b.get();
            String str = this.f273682m.f268425c;
            interfaceC34863v.getClass();
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "videoUrl", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273684m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f273685n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AdvertItem advertItem, int i12) {
            super(1);
            this.f273684m = advertItem;
            this.f273685n = i12;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            b bVar = b.this;
            InterfaceC28373a interfaceC28373a = bVar.f273656c;
            AdvertItem advertItem = this.f273684m;
            String f220326i = bVar.f273662i.getF220326i();
            Integer numValueOf = Integer.valueOf(this.f273685n);
            bVar.f273663j.getClass();
            interfaceC28373a.c(new mc.e(str2, advertItem.f268425c, f220326i, numValueOf, null, null, null, 96, null));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "videoUrl", "", "duration", "playbackPosition", "Lcom/avito/android/analytics/event/native_video/VideoStopReason;", "videoStopReason", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;DDLcom/avito/android/analytics/event/native_video/VideoStopReason;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements r<String, Double, Double, VideoStopReason, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273687m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f273688n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(AdvertItem advertItem, int i12) {
            super(4);
            this.f273687m = advertItem;
            this.f273688n = i12;
        }

        @Override // Y41.r
        public final G0 invoke(String str, Double d12, Double d13, VideoStopReason videoStopReason) {
            double dDoubleValue = d12.doubleValue();
            double dDoubleValue2 = d13.doubleValue();
            b bVar = b.this;
            InterfaceC28373a interfaceC28373a = bVar.f273656c;
            AdvertItem advertItem = this.f273687m;
            String f220326i = bVar.f273662i.getF220326i();
            Double dValueOf = Double.valueOf(dDoubleValue);
            Double dValueOf2 = Double.valueOf(dDoubleValue2);
            Integer numValueOf = Integer.valueOf(this.f273688n);
            bVar.f273663j.getClass();
            interfaceC28373a.c(new mc.g(str, advertItem.f268425c, f220326i, dValueOf, dValueOf2, numValueOf, null, videoStopReason, null, 256, null));
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertGridItemWithVideoPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "videoUrl", "errorMessage", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements p<String, String, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f273690m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f273691n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AdvertItem advertItem, int i12) {
            super(2);
            this.f273690m = advertItem;
            this.f273691n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            b bVar = b.this;
            InterfaceC28373a interfaceC28373a = bVar.f273656c;
            AdvertItem advertItem = this.f273690m;
            interfaceC28373a.c(new C44048a(str3, advertItem.f268425c, bVar.f273662i.getF220326i(), str4, Integer.valueOf(this.f273691n)));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f273654k = C42784z0.f406748b;
    }

    public b(@Y61.k h31.e<? extends InterfaceC34863v> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C36135w2 c36135w2, @Y61.l ImageViewportEvent.EventSource eventSource, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k InterfaceC48080b interfaceC48080b, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.h hVar, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k p1 p1Var) {
        this.f273655b = eVar;
        this.f273656c = interfaceC28373a;
        this.f273657d = c36135w2;
        this.f273658e = eventSource;
        this.f273659f = gVar;
        this.f273660g = interfaceC48080b;
        this.f273661h = hVar;
        this.f273662i = aVar;
        this.f273663j = p1Var;
    }

    public final void O(List<? extends InterfaceC17045a> list, com.avito.android.serp.adapter.video_snippet.c cVar, AdvertItem advertItem, t tVar, boolean z12, int i12) {
        cVar.w8(true);
        cVar.Fd(0, list);
        cVar.Zc(tVar.f125830a, tVar.f125831b, tVar.f125832c);
        cVar.Id(z12);
        cVar.R0(new l(advertItem, i12));
        cVar.a1(new m(advertItem, i12));
        cVar.Q3(new n(advertItem, i12));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g2((com.avito.android.serp.adapter.video_snippet.c) eVar, (AdvertItem) aVar, i12, f273654k);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7  */
    @Override // TV0.f
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(@Y61.k com.avito.android.serp.adapter.video_snippet.c r18, @Y61.k com.avito.android.serp.adapter.AdvertItem r19, int r20, @Y61.k java.util.List<? extends java.lang.Object> r21) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.video_snippet.b.g2(com.avito.android.serp.adapter.video_snippet.c, com.avito.android.serp.adapter.AdvertItem, int, java.util.List):void");
    }
}
