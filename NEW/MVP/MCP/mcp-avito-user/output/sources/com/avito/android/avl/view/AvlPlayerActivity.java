package com.avito.android.avl.view;

import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C22829k0;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.viewpager2.widget.ViewPager2;
import cU.s;
import com.avito.android.R;
import com.avito.android.advert.item.C28156p;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avl.di.d;
import com.avito.android.avl.view.q;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.component.snackbar.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.ownership.Owners;
import com.avito.android.util.D6;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.material.snackbar.Snackbar;
import cv.InterfaceC39417a;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import ob.C44742f;
import ob.InterfaceC44738b;
import z1.AbstractC50339a;
import zg.e;
import zg.g;

/* compiled from: AvlPlayerActivity.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/avl/view/AvlPlayerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/avl/view/u;", "Lob/b;", "LFV0/b;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "<init>", "()V", "a", "b", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvlPlayerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, u, InterfaceC44738b, FV0.b, com.avito.beduin.v2.interaction.detached.flow.b {

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f98291Q = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public String f98292A;

    /* renamed from: B, reason: collision with root package name */
    public int f98293B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public String f98294C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f98295D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public String f98296E;

    /* renamed from: H, reason: collision with root package name */
    public ViewPager2 f98299H;

    /* renamed from: I, reason: collision with root package name */
    public q f98300I;

    /* renamed from: J, reason: collision with root package name */
    public com.avito.android.component.snackbar.d f98301J;

    /* renamed from: K, reason: collision with root package name */
    public FrameLayout f98302K;

    /* renamed from: L, reason: collision with root package name */
    public ImageView f98303L;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public cU.s f98307P;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f98308m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.avl_analytics.a f98309n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public J80.b f98310o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public w f98311p;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.avl.features.a f98313r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.loaders.j f98314s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f98315t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public Class<?> f98316u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f98317v;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f98318w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public R0 f98319x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public Intent f98320y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public String f98321z;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final O0 f98312q = new O0(m0.f406844a.b(v.class), new j(), new i(new l()), new k());

    /* renamed from: F, reason: collision with root package name */
    public int f98297F = -1;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f98298G = new LinkedHashSet();

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f98304M = C42727D.c(new h());

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f98305N = C42727D.c(new c());

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public m f98306O = new m();

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/avito/android/avl/view/AvlPlayerActivity$a;", "", "<init>", "()V", "", "DATA_KEY", "Ljava/lang/String;", "ITEM_ID_KEY", "KEY_COMMERCIAL_STATE", "KEY_ITEM_VISIBILITY_TRACKER_STATE", "KEY_URL", "", "RECEIVER_REQUEST_CODE", "I", "SOURCE_SESSION_ID_KEY", "VIDEOS_OFFSET_TOP_BOTTOM_MARGIN", "", "VIDEO_CACHED_MAX_SIZE_BYTES", "D", "VIDEO_CACHE_CONNECTION_TIMEOUT_MS", "", "VIDEO_CACHE_MAX_SIZE_BYTES", "J", "VIDEO_CACHE_READ_TIMEOUT_MS", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl/view/AvlPlayerActivity$b;", "", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/exoplayer2/upstream/cache/a$d;", "invoke", "()Lcom/google/android/exoplayer2/upstream/cache/a$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<a.d> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final a.d invoke() {
            v.b bVar = new v.b();
            bVar.f348013c = 15000;
            bVar.f348014d = 15000;
            a.d dVar = new a.d();
            int i12 = AvlPlayerActivity.f98291Q;
            dVar.f347831a = (com.google.android.exoplayer2.upstream.cache.q) AvlPlayerActivity.this.f98304M.getValue();
            dVar.f347835e = 2;
            dVar.f347834d = bVar;
            return dVar;
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<zg.g, G0> {
        @Override // Y41.l
        public final G0 invoke(zg.g gVar) {
            int i12 = 1;
            zg.g gVar2 = gVar;
            AvlPlayerActivity avlPlayerActivity = (AvlPlayerActivity) this.receiver;
            int i13 = AvlPlayerActivity.f98291Q;
            avlPlayerActivity.getClass();
            int i14 = 0;
            if (L.f(gVar2, g.b.f444156a)) {
                ViewPager2 viewPager2 = avlPlayerActivity.f98299H;
                ViewPager2 viewPager22 = viewPager2 == null ? null : viewPager2;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                int currentItem = viewPager2.getCurrentItem();
                View childAt = viewPager22.getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(currentItem) : null;
                B b12 = (B) (cP2 instanceof B ? cP2 : null);
                if (b12 != null) {
                    int i15 = B.f98333M;
                    b12.F80(false);
                }
            } else if (L.f(gVar2, g.c.f444157a)) {
                ViewPager2 viewPager23 = avlPlayerActivity.f98299H;
                if (viewPager23 == null) {
                    viewPager23 = null;
                }
                int currentItem2 = viewPager23.getCurrentItem();
                ViewPager2 viewPager24 = avlPlayerActivity.f98299H;
                (viewPager24 != null ? viewPager24 : null).post(new RunnableC28721a(avlPlayerActivity, currentItem2, i12));
            } else if (L.f(gVar2, g.a.f444155a)) {
                int i16 = avlPlayerActivity.f98293B;
                if (i16 >= 0) {
                    while (true) {
                        avlPlayerActivity.e2(i14);
                        if (i14 == i16) {
                            break;
                        }
                        i14++;
                    }
                }
                ((com.google.android.exoplayer2.upstream.cache.q) avlPlayerActivity.f98304M.getValue()).q();
                m mVar = avlPlayerActivity.f98306O;
                if (mVar != null) {
                    ViewPager2 viewPager25 = avlPlayerActivity.f98299H;
                    if (viewPager25 == null) {
                        viewPager25 = null;
                    }
                    viewPager25.i(mVar);
                }
                avlPlayerActivity.f98306O = null;
                ViewPager2 viewPager26 = avlPlayerActivity.f98299H;
                if (viewPager26 == null) {
                    viewPager26 = null;
                }
                viewPager26.setAdapter(null);
                avlPlayerActivity.finish();
                J80.a.b(avlPlayerActivity);
            } else if (L.f(gVar2, g.d.f444158a)) {
                com.avito.android.component.snackbar.d dVar = avlPlayerActivity.f98301J;
                if (dVar == null) {
                    dVar = null;
                }
                Snackbar snackbar = dVar.f125236a;
                ViewGroup.LayoutParams layoutParams = snackbar.f357285i.getLayoutParams();
                CoordinatorLayout.g gVar3 = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
                if (gVar3 != null) {
                    gVar3.f44449c = 48;
                }
                snackbar.f357285i.setLayoutParams(gVar3);
                dVar.f125236a.f357285i.setAnimationMode(1);
                dVar.b();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<zg.h, G0> {
        @Override // Y41.l
        public final G0 invoke(zg.h hVar) {
            zg.h hVar2 = hVar;
            AvlPlayerActivity avlPlayerActivity = (AvlPlayerActivity) this.receiver;
            ScreenPerformanceTracker screenPerformanceTracker = avlPlayerActivity.f98318w;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            com.avito.konveyor.item_visibility_tracker.b bVar = avlPlayerActivity.f98317v;
            if (bVar == null) {
                bVar = null;
            }
            List<com.avito.conveyor_item.a> list = hVar2.f444161a;
            bVar.c(new UV0.c(list));
            if (list.size() > 0) {
                ViewPager2 viewPager2 = avlPlayerActivity.f98299H;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                D6.H(viewPager2);
                FrameLayout frameLayout = avlPlayerActivity.f98302K;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                D6.w(frameLayout);
            }
            avlPlayerActivity.f98293B = list.size();
            q qVar = avlPlayerActivity.f98300I;
            if (qVar == null) {
                qVar = null;
            }
            ArrayList<com.avito.conveyor_item.a> arrayList = qVar.f98409n;
            C23424o.e eVarA = C23424o.a(new q.b(arrayList, list), true);
            arrayList.clear();
            arrayList.addAll(list);
            eVarA.b(qVar);
            Iterator<com.avito.conveyor_item.a> it = list.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                }
                com.avito.conveyor_item.a next = it.next();
                if ((next instanceof BaseAvlVideoItem) && L.f(((BaseAvlVideoItem) next).getF98639d(), avlPlayerActivity.f98292A)) {
                    break;
                }
                i12++;
            }
            if (i12 != -1) {
                ViewPager2 viewPager22 = avlPlayerActivity.f98299H;
                if (viewPager22 == null) {
                    viewPager22 = null;
                }
                viewPager22.post(new RunnableC28721a(avlPlayerActivity, i12, 0));
            }
            if (!avlPlayerActivity.f98295D && (!r6.isEmpty())) {
                com.avito.android.avl_analytics.a aVar = avlPlayerActivity.f98309n;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.j();
                avlPlayerActivity.f98295D = true;
            }
            ScreenPerformanceTracker screenPerformanceTracker2 = avlPlayerActivity.f98318w;
            if (screenPerformanceTracker2 == null) {
                screenPerformanceTracker2 = null;
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
            return G0.f406611a;
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/H;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/di/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<com.avito.android.lib.beduin_v2.feature.di.H> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC39417a f98324m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC39417a interfaceC39417a) {
            super(0);
            this.f98324m = interfaceC39417a;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.di.H invoke() {
            AvlPlayerActivity avlPlayerActivity = AvlPlayerActivity.this;
            H.a aVarEd = ((H.b) C29972i.a(C29972i.b(avlPlayerActivity), H.b.class)).ed();
            ScreenPerformanceTracker screenPerformanceTracker = avlPlayerActivity.f98318w;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            return K.a(aVarEd, screenPerformanceTracker, new ZS.b(AvlScreen.f98332d, Owners.f210488g, (String) null, 4, (C42822w) null), new cv.d(this.f98324m), avlPlayerActivity.b2().f98417N.f398527c, avlPlayerActivity.b2().f98417N.f398526b, null, 32);
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f98325l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/exoplayer2/upstream/cache/q;", "invoke", "()Lcom/google/android/exoplayer2/upstream/cache/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.google.android.exoplayer2.upstream.cache.q> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.google.android.exoplayer2.upstream.cache.q invoke() {
            AvlPlayerActivity avlPlayerActivity = AvlPlayerActivity.this;
            return new com.google.android.exoplayer2.upstream.cache.q(new File(avlPlayerActivity.getCacheDir(), "media"), new com.google.android.exoplayer2.upstream.cache.m(20971520L), new com.google.android.exoplayer2.database.f(avlPlayerActivity));
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f98327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f98327l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f98327l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AvlPlayerActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AvlPlayerActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/avl/view/v;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/avl/view/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<v> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final v invoke() {
            w wVar = AvlPlayerActivity.this.f98311p;
            if (wVar == null) {
                wVar = null;
            }
            return (v) wVar.get();
        }
    }

    /* compiled from: AvlPlayerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/avl/view/AvlPlayerActivity$m", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends ViewPager2.i {
        public m() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrolled(int i12, float f12, int i13) {
            super.onPageScrolled(i12, f12, i13);
            AvlPlayerActivity avlPlayerActivity = AvlPlayerActivity.this;
            ViewPager2 viewPager2 = avlPlayerActivity.f98299H;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(i12) : null;
            if (!(cP2 instanceof B)) {
                cP2 = null;
            }
            B b12 = (B) cP2;
            if (b12 != null) {
                b12.f98363s.setAlpha(f12);
            }
            ViewPager2 viewPager22 = avlPlayerActivity.f98299H;
            if (viewPager22 == null) {
                viewPager22 = null;
            }
            int i14 = i12 - 1;
            View childAt2 = viewPager22.getChildAt(0);
            RecyclerView recyclerView2 = childAt2 instanceof RecyclerView ? (RecyclerView) childAt2 : null;
            RecyclerView.C cP3 = recyclerView2 != null ? recyclerView2.P(i14) : null;
            if (!(cP3 instanceof B)) {
                cP3 = null;
            }
            B b13 = (B) cP3;
            if (b13 != null) {
                b13.f98363s.setAlpha(1.0f - f12);
            }
            ViewPager2 viewPager23 = avlPlayerActivity.f98299H;
            if (viewPager23 == null) {
                viewPager23 = null;
            }
            int i15 = i12 + 1;
            View childAt3 = viewPager23.getChildAt(0);
            RecyclerView recyclerView3 = childAt3 instanceof RecyclerView ? (RecyclerView) childAt3 : null;
            RecyclerView.C cP4 = recyclerView3 != null ? recyclerView3.P(i15) : null;
            B b14 = (B) (cP4 instanceof B ? cP4 : null);
            if (b14 != null) {
                b14.f98363s.setAlpha(1.0f - f12);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            super.onPageSelected(i12);
            AvlPlayerActivity avlPlayerActivity = AvlPlayerActivity.this;
            if (avlPlayerActivity.f98297F == i12) {
                return;
            }
            avlPlayerActivity.f98297F = i12;
            ViewPager2 viewPager2 = avlPlayerActivity.f98299H;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(i12) : null;
            if (!(cP2 instanceof B)) {
                cP2 = null;
            }
            B b12 = (B) cP2;
            if (b12 != null) {
                if (b12.f98340G != null) {
                    TypedValue typedValue = new TypedValue();
                    b12.itemView.getContext().getTheme().resolveAttribute(((Boolean) ((r) b12.f98352h).invoke()).booleanValue() ? R.attr.ic_mute20 : R.attr.ic_unmute20, typedValue, true);
                    b12.f98335B.setImageResource(typedValue.resourceId);
                    if (b12.f98337D == null) {
                        b12.D80(avlPlayerActivity);
                    }
                    ((com.avito.android.avl.view.l) b12.f98354j).invoke(Integer.valueOf(b12.getLayoutPosition()));
                }
                com.avito.android.component.snackbar.d dVar = avlPlayerActivity.f98301J;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.a();
                ViewPager2 viewPager22 = avlPlayerActivity.f98299H;
                (viewPager22 != null ? viewPager22 : null).post(new RunnableC28721a(avlPlayerActivity, i12, 1));
            }
            for (int i13 = 1; i13 < 4; i13++) {
                avlPlayerActivity.e2(i12 - i13);
            }
            avlPlayerActivity.e2(i12 + 2);
            if (avlPlayerActivity.f98293B - i12 <= 3) {
                avlPlayerActivity.b2().accept(new e.c(avlPlayerActivity.f98321z));
            }
        }
    }

    static {
        new a(null);
    }

    @Override // ob.InterfaceC44746j
    public final void A(@Y61.k String str) {
        b2().accept(new e.b(str));
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // ob.InterfaceC44739c
    public final void C1(@Y61.k BannerInfo bannerInfo, int i12) {
        b2().accept(new e.g(bannerInfo, i12));
    }

    @Override // ob.InterfaceC44739c
    public final void J4(@Y61.k BannerInfo bannerInfo, int i12) {
        b2().accept(new e.d(bannerInfo, i12));
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.avl_player_activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.avito.android.avl.view.e] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        d.a aVarA = com.avito.android.avl.di.r.a();
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        Context applicationContext = getApplicationContext();
        String str = this.f98321z;
        AvlScreen avlScreen = AvlScreen.f98332d;
        com.avito.android.analytics.screens.r rVarA = com.avito.android.analytics.screens.s.a(this);
        BannerPageSource bannerPageSource = BannerPageSource.f87777c;
        aVarA.a(applicationContext, str, avlScreen, rVarA, this, this, bundle != null ? (Kundle) bundle.getParcelable("commercial_state") : null, new C44742f(false, null, new f(interfaceC39417aA), 3, null), bundle != null ? bundle.getBundle("key_item_visibility_tracker_state") : null, new InterfaceC41342b() { // from class: com.avito.android.avl.view.e
            @Override // iT.InterfaceC41342b
            public final InterfaceC41341a invoke() {
                int i12 = AvlPlayerActivity.f98291Q;
                return this.f98382a.b2();
            }
        }, (com.avito.android.avl.di.e) C29972i.a(C29972i.b(this), com.avito.android.avl.di.e.class), interfaceC39417aA).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f98318w;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f98318w;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<G0> aVar3) {
        com.avito.beduin.v2.theme.k kVarA;
        cU.s sVarD2 = d2();
        if (sVarD2 == null || (kVarA = sVarD2.a()) == null) {
            return new C28156p(1);
        }
        com.avito.android.beduin.v2.page.modal.a.f105171a.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(this, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new C28724d(aVarA, 0);
    }

    public final int a2(int i12) {
        q qVar = this.f98300I;
        if (qVar == null) {
            qVar = null;
        }
        int itemViewType = qVar.getItemViewType(i12 + 1);
        int i13 = 1;
        while (itemViewType != Integer.MAX_VALUE && itemViewType != -1) {
            i13++;
            q qVar2 = this.f98300I;
            if (qVar2 == null) {
                qVar2 = null;
            }
            itemViewType = qVar2.getItemViewType(i12 + i13);
        }
        if (itemViewType == -1) {
            return -1;
        }
        return i12 + i13;
    }

    public final v b2() {
        return (v) this.f98312q.getValue();
    }

    public final void c2(int i12) {
        ViewPager2 viewPager2 = this.f98299H;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(i12) : null;
        B b12 = (B) (cP2 instanceof B ? cP2 : null);
        if (b12 != null) {
            D6.w(b12.f98336C);
            b12.F80(false);
        }
    }

    public final cU.s d2() {
        cU.s sVar = this.f98307P;
        if (sVar != null) {
            return sVar;
        }
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        ScreenPerformanceTracker screenPerformanceTracker = this.f98318w;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker;
        cU.t tVarA = aVarFd.a(this, screenPerformanceTracker2, new com.avito.android.avl.view.f(0), cU.v.f57891a, b2().f98417N.f398526b.a());
        this.f98307P = tVarA;
        return tVarA;
    }

    public final void e2(int i12) {
        ViewPager2 viewPager2 = this.f98299H;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(i12) : null;
        B b12 = (B) (cP2 instanceof B ? cP2 : null);
        if (b12 != null) {
            b12.F80(true);
            b12.C80();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        b2().accept(e.a.f444133a);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        G0 g02;
        Intent intent = getIntent();
        this.f98320y = intent;
        this.f98321z = intent.getStringExtra("data_key");
        Intent intent2 = this.f98320y;
        this.f98294C = intent2 != null ? intent2.getStringExtra("item_id_key") : null;
        Intent intent3 = this.f98320y;
        this.f98296E = intent3 != null ? intent3.getStringExtra("source_session_id_key") : null;
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f98318w;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        X1();
        if (this.f98321z != null) {
            b2().accept(e.j.f444145a);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            b2().accept(new e.h(this.f98294C, this.f98296E));
        }
        com.avito.android.ui.activity.a.J1(this);
        this.f98302K = (FrameLayout) findViewById(R.id.loader_container);
        this.f98303L = (ImageView) findViewById(R.id.close_button);
        Intent intent4 = this.f98320y;
        this.f98292A = intent4 != null ? intent4.getStringExtra("player_url") : null;
        this.f98299H = (ViewPager2) findViewById(R.id.viewPagerVideos);
        com.avito.konveyor.a aVar = this.f98315t;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.avl.view.k kVar = new com.avito.android.avl.view.k(0, this, AvlPlayerActivity.class, "onBackPressed", "onBackPressed()V", 0);
        com.avito.android.avl_analytics.a aVar3 = this.f98309n;
        com.avito.android.avl_analytics.a aVar4 = aVar3 != null ? aVar3 : null;
        J80.b bVar = this.f98310o;
        J80.b bVar2 = bVar != null ? bVar : null;
        com.avito.android.avl.view.l lVar = new com.avito.android.avl.view.l(1, this, AvlPlayerActivity.class, "prepareNextVideos", "prepareNextVideos(I)V", 0);
        a.d dVar = (a.d) this.f98305N.getValue();
        com.avito.android.avl.features.a aVar5 = this.f98313r;
        this.f98300I = new q(aVar2, kVar, new com.avito.android.avl.view.m(this), aVar4, bVar2, new n(this), new o(this), lVar, dVar, aVar5 != null ? aVar5 : null);
        d.a aVar6 = com.avito.android.component.snackbar.d.f125235c;
        View viewFindViewById = findViewById(R.id.short_videos_player_root_view);
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        this.f98301J = d.a.a(aVar6, viewFindViewById, R.string.unknown_error, -1, null, resources.getColor(R.color.red, null), 760);
        ImageView imageView = this.f98303L;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28722b(this, 0));
        ViewPager2 viewPager2 = this.f98299H;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.setClipToPadding(true);
        viewPager2.setClipChildren(true);
        viewPager2.setOffscreenPageLimit(3);
        q qVar = this.f98300I;
        if (qVar == null) {
            qVar = null;
        }
        viewPager2.setAdapter(qVar);
        ViewPager2 viewPager22 = this.f98299H;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        RecyclerView recyclerView = (RecyclerView) C43033p.n(C43033p.i(new C22829k0(viewPager22), com.avito.android.avl.view.i.f98390l));
        if (recyclerView != null) {
            com.avito.konveyor.item_visibility_tracker.b bVar3 = this.f98317v;
            if (bVar3 == null) {
                bVar3 = null;
            }
            bVar3.a(recyclerView, null);
        }
        viewPager2.setPageTransformer(new C28723c());
        m mVar = this.f98306O;
        if (mVar != null) {
            viewPager2.e(mVar);
        }
        com.avito.android.arch.mvi.android.f.a(b2(), this, Lifecycle.State.f46682e, new d(1, this, AvlPlayerActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/avl/mvi/entity/AvlPlayerOneTimeEvent;)V", 0), new e(1, this, AvlPlayerActivity.class, "render", "render(Lcom/avito/android/avl/mvi/entity/AvlPlayerState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f98318w;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((com.google.android.exoplayer2.upstream.cache.q) this.f98304M.getValue()).q();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPause() {
        super.onPause();
        b2().accept(e.C12965e.f444138a);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        this.f98320y = null;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        b2().accept(e.f.f444139a);
        J80.a.a(this);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle, @Y61.k PersistableBundle persistableBundle) {
        super.onSaveInstanceState(bundle, persistableBundle);
        Kundle kundle = new Kundle();
        com.avito.android.advertising.loaders.j jVar = this.f98314s;
        if (jVar == null) {
            jVar = null;
        }
        jVar.P6(kundle);
        G0 g02 = G0.f406611a;
        bundle.putParcelable("commercial_state", kundle);
        com.avito.konveyor.item_visibility_tracker.b bVar = this.f98317v;
        bundle.putBundle("key_item_visibility_tracker_state", (bVar != null ? bVar : null).d0());
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        cU.s sVarD2 = d2();
        if (sVarD2 == null) {
            return new C28156p(1);
        }
        BaseBeduinHostFragment.DetachedBottomSheet.f104752l0.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVarD2, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getSupportFragmentManager(), "bottom-sheet");
        return new C28724d(detachedBottomSheetA, 1);
    }

    @Override // FV0.b
    @Y61.k
    public final androidx.view.n N3() {
        return this;
    }

    @Override // androidx.core.app.ActivityC22757o, FV0.d
    public final void close() {
    }
}
