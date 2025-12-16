package com.avito.android.user_adverts.root_screen.adverts_host.panel_view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.PaneViewLayoutManager;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.k;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.h;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.b;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.i;
import com.avito.android.util.R0;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import com.avito.konveyor.exception.ItemNotSupportedException;
import com.google.android.material.appbar.AppBarLayout;
import i31.InterfaceC41220a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import nE.C44240b;

/* compiled from: PanelView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/f;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/f;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/PaneViewLayoutManager$a;", "a", "b", "c", "d", "e", "f", "g", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.f, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.f, PaneViewLayoutManager.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f313665a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22977J f313666b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f313667c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f313668d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AppBarLayout f313669e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final f f313670f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f313671g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public g f313672h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public N0 f313673i;

    /* compiled from: PanelView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a;", "", "a", "b", "c", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: PanelView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.panel_view.h$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9654a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PanelCardItem f313674a;

            public C9654a(@Y61.k PanelCardItem panelCardItem) {
                this.f313674a = panelCardItem;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9654a) && L.f(this.f313674a, ((C9654a) obj).f313674a);
            }

            public final int hashCode() {
                return this.f313674a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "PanelCardClicked(panel=" + this.f313674a + ')';
            }
        }

        /* compiled from: PanelView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final PanelCardItem f313675a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final PanelCardItem.b f313676b;

            public b(@Y61.k PanelCardItem panelCardItem, @Y61.k PanelCardItem.b bVar) {
                this.f313675a = panelCardItem;
                this.f313676b = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f313675a, bVar.f313675a) && L.f(this.f313676b, bVar.f313676b);
            }

            public final int hashCode() {
                return this.f313676b.hashCode() + (this.f313675a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "PanelCardTooltipClicked(panel=" + this.f313675a + ", tooltip=" + this.f313676b + ')';
            }
        }

        /* compiled from: PanelView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a$c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a f313677a;

            public c(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a aVar) {
                this.f313677a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f313677a, ((c) obj).f313677a);
            }

            public final int hashCode() {
                return this.f313677a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "PanelProgressCardClicked(panel=" + this.f313677a + ')';
            }
        }
    }

    /* compiled from: PanelView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$b;", "", "<init>", "()V", "", "SCROLL_START_DELAY", "J", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: PanelView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$c;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @Y61.k
        h a(@Y61.k View view, @Y61.l g gVar, @Y61.k C22977J c22977j, @Y61.k d dVar);
    }

    /* compiled from: PanelView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$d;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        void P2(@Y61.k a aVar);
    }

    /* compiled from: PanelView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final int f313678b;

        public e(int i12) {
            this.f313678b = i12 / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            RecyclerView.C cW2 = recyclerView.W(view);
            if (cW2 == null) {
                return;
            }
            Integer numValueOf = Integer.valueOf(cW2.getBindingAdapterPosition());
            if (numValueOf.intValue() <= -1) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : cW2.getOldPosition();
            if (iIntValue == -1) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int i12 = this.f313678b;
            int i13 = iIntValue > 0 ? i12 : 0;
            if (iIntValue >= itemCount - 1) {
                i12 = 0;
            }
            rect.set(i13, 0, i12, 0);
        }
    }

    /* compiled from: PanelView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$f;", "LTV0/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/h;", "LTV0/f;", "LTV0/e;", "LTV0/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements TV0.g<com.avito.konveyor.adapter.b>, TV0.h, TV0.f<TV0.e, TV0.a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<Integer, com.avito.android.user_adverts.root_screen.adverts_host.panel_view.d> f313679b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.a f313680c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.a f313681d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.a f313682e;

        /* compiled from: PanelView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$f$a;", "", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a.C10493a f313683a = new a.C10493a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final LinkedHashMap f313684b = new LinkedHashMap();

            @Y61.k
            public final void a(@Y61.k TV0.b bVar, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_view.d dVar) throws BlueprintCollisionException {
                this.f313683a.b(bVar);
                this.f313684b.put(Integer.valueOf(TV0.c.a(bVar)), dVar);
            }
        }

        public f() {
            throw null;
        }

        public f(com.avito.konveyor.a aVar, Map map, C42822w c42822w) {
            this.f313679b = map;
            this.f313680c = aVar;
            this.f313681d = aVar;
            this.f313682e = aVar;
        }

        @Override // TV0.h
        public final int O(@Y61.k TV0.a aVar) {
            return this.f313681d.O(aVar);
        }

        @Override // TV0.d
        public final void O5(@Y61.k TV0.e eVar, @Y61.k TV0.a aVar, int i12) throws ItemNotSupportedException {
            this.f313682e.O5(eVar, aVar, i12);
        }

        @Override // TV0.f
        public final void g2(@Y61.k TV0.e eVar, @Y61.k TV0.a aVar, int i12, @Y61.k List<? extends Object> list) throws ItemNotSupportedException {
            this.f313682e.g2(eVar, aVar, i12, list);
        }

        @Override // TV0.g
        @Y61.l
        public final com.avito.konveyor.adapter.b k(@Y61.k ViewGroup viewGroup, int i12, @Y61.k Y41.l<? super Integer, ? extends View> lVar) {
            return this.f313680c.k(viewGroup, i12, lVar);
        }
    }

    static {
        new b(null);
    }

    @i31.c
    public h(@InterfaceC41220a @Y61.k View view, @Y61.l @InterfaceC41220a g gVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k C44240b c44240b, @Y61.k b.a aVar, @Y61.k k.a aVar2, @Y61.k b.a aVar3, @Y61.k h.a aVar4, @Y61.k b.a aVar5, @Y61.k i.a aVar6, @Y61.k R0 r02, @InterfaceC41220a @Y61.k C22977J c22977j, @InterfaceC41220a @Y61.k d dVar) throws BlueprintCollisionException {
        this.f313665a = r02;
        this.f313666b = c22977j;
        this.f313667c = dVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.menu_panels_recycler);
        this.f313668d = recyclerView;
        this.f313669e = !c44240b.v().invoke().booleanValue() ? (AppBarLayout) view.findViewById(R.id.app_bar) : null;
        f.a aVar7 = new f.a();
        com.avito.android.user_adverts.root_screen.adverts_host.panel_view.b bVar = new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.b(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c(y6.b(160), y6.b(80)), new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c(y6.b(140), y6.b(108)));
        aVar7.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.b(this, null), bVar);
        aVar7.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.k(null), bVar);
        com.avito.android.user_adverts.root_screen.adverts_host.panel_view.e eVar = new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.e(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c(y6.b(150), y6.b(80)), new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c(y6.b(140), y6.b(108)));
        aVar7.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.b(null), eVar);
        aVar7.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.h(null), eVar);
        com.avito.android.user_adverts.root_screen.adverts_host.panel_view.g gVar2 = new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.g(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.c(y6.b(184), y6.b(108)));
        aVar7.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.i(null), gVar2);
        aVar7.a(new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.b(this, null), gVar2);
        f fVar = new f(aVar7.f313683a.a(), aVar7.f313684b, null);
        this.f313670f = fVar;
        com.avito.konveyor.adapter.d dVar2 = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(fVar, fVar, null, 4, null), fVar, null, 4, null);
        dVar2.setHasStableIds(false);
        this.f313671g = dVar2;
        recyclerView.setLayoutManager(new PaneViewLayoutManager(view.getContext(), this));
        recyclerView.setAdapter(dVar2);
        recyclerView.l(new e(y6.b(8)), -1);
        screenPerformanceTracker.b(recyclerView);
        if (gVar != null) {
            d(gVar);
        }
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.f
    public final void a(@Y61.k PanelCardItem panelCardItem) {
        this.f313667c.P2(new a.C9654a(panelCardItem));
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.f
    public final void b(@Y61.k PanelCardItem panelCardItem, @Y61.k PanelCardItem.b bVar) {
        this.f313667c.P2(new a.b(panelCardItem, bVar));
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.f
    public final void c(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a aVar) {
        this.f313667c.P2(new a.c(aVar));
    }

    public final void d(@Y61.k g gVar) {
        List<com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a> list = gVar.f313685a;
        this.f313671g.l(list, null);
        g gVar2 = this.f313672h;
        int i12 = gVar.f313686b;
        if (gVar2 == null || gVar2.f313686b != i12) {
            N0 n02 = this.f313673i;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            if (i12 > -1 && !list.isEmpty()) {
                this.f313673i = C43259k.d(this.f313666b, this.f313665a.b(), null, new i(this, gVar, null), 2);
            }
        }
        this.f313668d.setVisibility(!list.isEmpty() ? 0 : 8);
        this.f313672h = gVar;
    }

    /* compiled from: PanelView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/h$g;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a> f313685a;

        /* renamed from: b, reason: collision with root package name */
        public final int f313686b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts.root_screen.adverts_host.panel_view.f f313687c;

        /* JADX WARN: Multi-variable type inference failed */
        public g(@Y61.k List<? extends com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a> list, int i12) {
            this.f313685a = list;
            this.f313686b = i12;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            for (com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a aVar : list) {
                if (z12 && z13 && z14) {
                    break;
                }
                if (aVar instanceof PanelCardItem ? true : aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.j) {
                    z12 = true;
                } else if (aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.a ? true : aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.g) {
                    z13 = true;
                } else if (aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.a ? true : aVar instanceof com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.h) {
                    z14 = true;
                }
            }
            this.f313687c = new com.avito.android.user_adverts.root_screen.adverts_host.panel_view.f(z12, z13, z14);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f313685a, gVar.f313685a) && this.f313686b == gVar.f313686b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f313686b) + (this.f313685a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(panels=");
            sb2.append(this.f313685a);
            sb2.append(", scrollPosition=");
            return r.t(sb2, this.f313686b, ')');
        }

        public /* synthetic */ g(List list, int i12, int i13, C42822w c42822w) {
            this(list, (i13 & 2) != 0 ? -1 : i12);
        }
    }
}
