package com.avito.android.recommendation_items_loader_impl.screen;

import Cd.C13243a;
import Li0.InterfaceC14400a;
import Mi0.C14495d;
import Mi0.InterfaceC14492a;
import Mi0.InterfaceC14494c;
import Y61.k;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.progress_overlay.l;
import com.avito.android.recommendation_items_loader_impl.screen.RecommendationLoaderActivityArgument;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: RecommendationLoaderActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RecommendationLoaderActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f252287r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.recommendation_items_loader_impl.screen.c f252288m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f252289n = new O0(m0.f406844a.b(com.avito.android.recommendation_items_loader_impl.screen.b.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f252290o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f252291p;

    /* renamed from: q, reason: collision with root package name */
    public l f252292q;

    /* compiled from: RecommendationLoaderActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/RecommendationLoaderActivity$a;", "", "<init>", "()V", "", "ARG_KEY_BLOCKS", "Ljava/lang/String;", "ARG_KEY_ITEMS", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecommendationLoaderActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC14494c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14494c interfaceC14494c) {
            InterfaceC14494c interfaceC14494c2 = interfaceC14494c;
            RecommendationLoaderActivity recommendationLoaderActivity = (RecommendationLoaderActivity) this.receiver;
            a aVar = RecommendationLoaderActivity.f252287r;
            recommendationLoaderActivity.getClass();
            if (interfaceC14494c2 instanceof InterfaceC14494c.a) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = recommendationLoaderActivity.f252291p;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                InterfaceC14494c.a aVar3 = (InterfaceC14494c.a) interfaceC14494c2;
                Bundle bundle = new Bundle();
                bundle.putParcelable("analytic_params", aVar3.f10999b);
                G0 g02 = G0.f406611a;
                b.a.a(aVar2, aVar3.f10998a, null, bundle, 2);
                recommendationLoaderActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RecommendationLoaderActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMi0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LMi0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C14495d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C14495d c14495d) {
            a aVar = RecommendationLoaderActivity.f252287r;
            RecommendationLoaderActivity recommendationLoaderActivity = RecommendationLoaderActivity.this;
            if (c14495d.f11000a) {
                l lVar = recommendationLoaderActivity.f252292q;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else {
                l lVar2 = recommendationLoaderActivity.f252292q;
                (lVar2 != null ? lVar2 : null).a(recommendationLoaderActivity.getString(R.string.recommendation_items_loading_error));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RecommendationLoaderActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = RecommendationLoaderActivity.f252287r;
            ((com.avito.android.recommendation_items_loader_impl.screen.b) RecommendationLoaderActivity.this.f252289n.getValue()).accept(InterfaceC14492a.C0698a.f10992a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f252295l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f252295l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f252295l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return RecommendationLoaderActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return RecommendationLoaderActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: RecommendationLoaderActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/recommendation_items_loader_impl/screen/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.recommendation_items_loader_impl.screen.b> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.recommendation_items_loader_impl.screen.b invoke() {
            com.avito.android.recommendation_items_loader_impl.screen.c cVar = RecommendationLoaderActivity.this.f252288m;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.recommendation_items_loader_impl.screen.b) cVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_recommendation_items_loader;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        RecommendationLoaderActivityArgument recommendationLoaderActivityArgument = (RecommendationLoaderActivityArgument.RecommendationItemsLoaderArgument) getIntent().getParcelableExtra("com.avito.android.recommendation_items_loader_impl.screen.argument_items");
        if (recommendationLoaderActivityArgument == null && (recommendationLoaderActivityArgument = (RecommendationLoaderActivityArgument.RecommendationBlocksLoaderArgument) getIntent().getParcelableExtra("com.avito.android.recommendation_items_loader_impl.screen.argument_blocks")) == null) {
            finish();
            return;
        }
        ((InterfaceC14400a.b) C29972i.a(C29972i.b(this), InterfaceC14400a.b.class)).w8().a(this, s.a(this), recommendationLoaderActivityArgument, cv.c.c(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f252290o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f252290o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        O0 o02 = this.f252289n;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.recommendation_items_loader_impl.screen.b) o02.getValue(), this, Lifecycle.State.f46682e, new b(1, this, RecommendationLoaderActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/recommendation_items_loader_impl/screen/mvi/entity/RecommendationLoaderOneTimeEvent;)V", 0), new c());
        l lVar = new l((ViewGroup) findViewById(R.id.content_container), 0, null, 0, 0, 30, null);
        this.f252292q = lVar;
        lVar.f231600j = new d();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f252290o;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        ((com.avito.android.recommendation_items_loader_impl.screen.b) o02.getValue()).accept(InterfaceC14492a.b.f10993a);
    }
}
