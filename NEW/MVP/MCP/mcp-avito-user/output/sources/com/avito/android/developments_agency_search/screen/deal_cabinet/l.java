package com.avito.android.developments_agency_search.screen.deal_cabinet;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import zw.b;

/* compiled from: DealCabinetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/l;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/j;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f136991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f136992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<zw.b, G0> f136993c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.item_visibility_tracker.b f136994d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f136995e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f136996f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FloatingContainer f136997g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f136998h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f136999i;

    /* compiled from: DealCabinetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeyboardVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            l lVar = l.this;
            lVar.f136996f = zBooleanValue;
            lVar.a(true);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            l.this.f136993c.invoke(b.m.f444365a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            l.this.f136993c.invoke(b.o.f444367a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealCabinetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/deal_cabinet/l$d", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.r {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            if (i13 != 0) {
                l.this.a(i13 < 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k Y41.l<? super zw.b, G0> lVar, @Y61.k com.avito.konveyor.item_visibility_tracker.b bVar) {
        this.f136991a = jVar;
        this.f136992b = aVar;
        this.f136993c = lVar;
        this.f136994d = bVar;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.deal_cabinet.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f136990c;

            {
                this.f136990c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f136990c.f136993c.invoke(b.t.f444372a);
                        break;
                    default:
                        this.f136990c.f136993c.invoke(b.h.f444358a);
                        break;
                }
            }
        });
        View viewFindViewById = view.findViewById(R.id.footer_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.floating_container.FloatingContainer");
        }
        FloatingContainer floatingContainer = (FloatingContainer) viewFindViewById;
        final int i13 = 1;
        floatingContainer.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_agency_search.screen.deal_cabinet.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f136990c;

            {
                this.f136990c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f136990c.f136993c.invoke(b.t.f444372a);
                        break;
                    default:
                        this.f136990c.f136993c.invoke(b.h.f444358a);
                        break;
                }
            }
        });
        this.f136997g = floatingContainer;
        View viewFindViewById2 = view.findViewById(R.id.recyclerView);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.setAdapter(jVar);
        recyclerView.o(new Ow.b((LinearLayoutManager) recyclerView.getLayoutManager(), new c()));
        bVar.a(recyclerView, null);
        recyclerView.o(new d());
        this.f136998h = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.progress_overlay_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, R.id.recyclerView, null, 0, 0, 28, null);
        lVar2.f231600j = new b();
        this.f136999i = lVar2;
        K2.b(view, new a());
    }

    public final void a(boolean z12) {
        boolean z13 = this.f136995e;
        FloatingContainer floatingContainer = this.f136997g;
        if (!z13 || this.f136996f || !z12) {
            D6.o(floatingContainer, 100L);
            return;
        }
        if (!D6.y(floatingContainer)) {
            this.f136993c.invoke(b.i.f444359a);
        }
        D6.n(floatingContainer, 100L);
    }
}
