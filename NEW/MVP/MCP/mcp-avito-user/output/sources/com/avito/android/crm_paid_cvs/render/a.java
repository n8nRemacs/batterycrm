package com.avito.android.crm_paid_cvs.render;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.konveyor.adapter.j;
import ht.C40982d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CvListRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/render/a;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f130655a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f130656b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f130657c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f130658d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f130659e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f130660f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.a<G0> f130661g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Y41.a<G0> f130662h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Y41.a<G0> f130663i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Y41.a<G0> f130664j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Y41.a<G0> f130665k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final l<CvListState.Tab, G0> f130666l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TabGroup f130667m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final RecyclerView f130668n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final RecyclerView f130669o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final SwipeRefreshLayout f130670p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final View f130671q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final TextView f130672r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final TextView f130673s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final Button f130674t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final C42670a f130675u;

    /* compiled from: CvListRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_paid_cvs.render.a$a, reason: collision with other inner class name */
    public static final class C3882a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f130676l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3882a(Y41.a<G0> aVar) {
            super(0);
            this.f130676l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f130676l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: CvListRenderer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/crm_paid_cvs/render/a$b", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.lib.design.tab_group.layout.b {
        public b() {
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@Y61.l d.c cVar) {
            if (cVar != null) {
                int i12 = cVar.f180792b;
                a aVar = a.this;
                if (i12 == 0) {
                    aVar.f130661g.invoke();
                } else if (i12 == 1) {
                    aVar.f130662h.invoke();
                } else if (i12 == 2) {
                    aVar.f130663i.invoke();
                }
            }
        }
    }

    /* compiled from: CvListRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f130678a;

        static {
            int[] iArr = new int[CvListState.Tab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CvListState.Tab tab = CvListState.Tab.f130509c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CvListState.Tab tab2 = CvListState.Tab.f130509c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f130678a = iArr;
            int[] iArr2 = new int[CvListState.ListState.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                CvListState.ListState listState = CvListState.ListState.f130503b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: CvListRenderer.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<View> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = a.this.f130655a.findViewById(R.id.content_container);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: CvListRenderer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<ContentPlaceholder, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ContentPlaceholder contentPlaceholder) {
            ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
            contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getText(R.string.paid_cvs_error));
            contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getText(R.string.paid_cvs_error_description));
            contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getText(R.string.paid_cvs_error_retry));
            contentPlaceholder2.setButtonOnClickListener(new h(a.this, 16));
            return G0.f406611a;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(C40982d.b((FilterItem) t12)), Integer.valueOf(C40982d.b((FilterItem) t13)));
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.f130667m.d(aVar.new b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k View view, @k com.avito.konveyor.adapter.d dVar, @k com.avito.konveyor.adapter.d dVar2, @k com.avito.konveyor.adapter.d dVar3, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3, @k Y41.a<G0> aVar4, @k Y41.a<G0> aVar5, @k Y41.a<G0> aVar6, @k l<? super CvListState.Tab, G0> lVar, @k Y41.a<G0> aVar7) {
        this.f130655a = view;
        this.f130656b = dVar;
        this.f130657c = dVar2;
        this.f130658d = dVar3;
        this.f130659e = jVar;
        this.f130660f = aVar;
        this.f130661g = aVar2;
        this.f130662h = aVar3;
        this.f130663i = aVar4;
        this.f130664j = aVar5;
        this.f130665k = aVar6;
        this.f130666l = lVar;
        View viewFindViewById = view.findViewById(R.id.cv_tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_group.TabGroup");
        }
        TabGroup tabGroup = (TabGroup) viewFindViewById;
        this.f130667m = tabGroup;
        View viewFindViewById2 = view.findViewById(R.id.navbar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById2;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cv_recycler);
        this.f130668n = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.filter_recycler);
        this.f130669o = recyclerView2;
        View viewFindViewById3 = view.findViewById(R.id.pull_to_refresh_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        this.f130670p = (SwipeRefreshLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.empty_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130671q = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.empty_view_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130672r = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.empty_view_description);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130673s = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.empty_view_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130674t = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.progress_root);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f130675u = new C42670a((ViewGroup) viewFindViewById8, new d(), 0, 4, null);
        ((O) recyclerView.getItemAnimator()).f53727g = false;
        ((O) recyclerView2.getItemAnimator()).f53727g = false;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(dVar);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView2.setAdapter(jVar);
        navBar.setState(new com.avito.android.lib.design.nav_bar.a(null, new C3882a(aVar7), false, view.getContext().getString(R.string.paid_cvs_title), null, null, null, 117, null));
        com.avito.android.lib.design.tab_group.c.a(tabGroup, C42745f0.U(new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(view.getContext().getString(R.string.paid_cvs_tab_paid)), null, false, 6, null), new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(view.getContext().getString(R.string.paid_cvs_tab_favorites)), null, false, 6, null), new com.avito.android.lib.design.tab_group.b(com.avito.android.printable_text.b.f(view.getContext().getString(R.string.paid_cvs_tab_searches)), null, false, 6, null)), 0);
        tabGroup.postDelayed(new g(), 100L);
    }

    @SuppressLint({"UdfComponentUsage", "NotifyDataSetChanged"})
    public final void a(@k CvListState cvListState) {
        Iterable iterable;
        CvListState.ListState listState = cvListState.f130495c;
        int iOrdinal = listState.ordinal();
        C42670a c42670a = this.f130675u;
        com.avito.konveyor.adapter.d dVar = this.f130658d;
        com.avito.konveyor.adapter.d dVar2 = this.f130657c;
        com.avito.konveyor.adapter.d dVar3 = this.f130656b;
        CvListState.Tab tab = cvListState.f130494b;
        if (iOrdinal == 1) {
            C42670a.d(c42670a);
            C42784z0 c42784z0 = C42784z0.f406748b;
            dVar3.l(c42784z0, null);
            dVar2.l(c42784z0, null);
            this.f130669o.A0(0);
            int iOrdinal2 = tab.ordinal();
            RecyclerView recyclerView = this.f130668n;
            if (iOrdinal2 == 0) {
                recyclerView.setAdapter(dVar3);
                return;
            } else if (iOrdinal2 == 1) {
                recyclerView.setAdapter(dVar2);
                return;
            } else {
                if (iOrdinal2 != 2) {
                    return;
                }
                recyclerView.setAdapter(dVar);
                return;
            }
        }
        if (iOrdinal == 3) {
            c42670a.c(null, new e());
            return;
        }
        c42670a.b();
        List<TV0.a> list = c.f130678a[tab.ordinal()] == 3 ? cvListState.f130497e : cvListState.f130496d;
        int iOrdinal3 = tab.ordinal();
        if (iOrdinal3 == 0) {
            dVar3.l(list, null);
        } else if (iOrdinal3 == 1) {
            dVar2.l(list, null);
        } else if (iOrdinal3 == 2) {
            dVar.l(list, null);
        }
        int iOrdinal4 = tab.ordinal();
        if (iOrdinal4 == 0) {
            iterable = cvListState.f130498f;
        } else if (iOrdinal4 == 1) {
            iterable = cvListState.f130499g;
        } else {
            if (iOrdinal4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iterable = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            FilterItem filterItem = (FilterItem) obj;
            if (!C40982d.f397441a.contains(filterItem.f130357b)) {
                if (filterItem.f130358c == FilterItem.FilterType.f130367h) {
                }
            }
            arrayList.add(obj);
        }
        this.f130660f.c(new UV0.c(C42745f0.B0(arrayList, new f())));
        this.f130659e.notifyDataSetChanged();
        boolean z12 = listState == CvListState.ListState.f130505d;
        SwipeRefreshLayout swipeRefreshLayout = this.f130670p;
        swipeRefreshLayout.setRefreshing(z12);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 9));
        D6.G(swipeRefreshLayout, !list.isEmpty());
        boolean zIsEmpty = list.isEmpty();
        View view = this.f130671q;
        D6.G(view, zIsEmpty);
        Context context = view.getContext();
        int i12 = c.f130678a[tab.ordinal()];
        TextView textView = this.f130673s;
        TextView textView2 = this.f130672r;
        Button button = this.f130674t;
        if (i12 == 3) {
            I5.a(textView2, context.getString(R.string.paid_cvs_searches_empty_title), false);
            I5.a(textView, context.getString(R.string.paid_cvs_searches_empty_description), false);
            com.avito.android.lib.design.button.b.a(button, context.getString(R.string.paid_cvs_searches_empty_button), false);
        } else {
            I5.a(textView2, context.getString(R.string.paid_cvs_empty_title), false);
            I5.a(textView, context.getString(R.string.paid_cvs_empty_description), false);
            com.avito.android.lib.design.button.b.a(button, context.getString(R.string.paid_cvs_empty_button), false);
        }
        button.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(2, this, cvListState));
    }
}
