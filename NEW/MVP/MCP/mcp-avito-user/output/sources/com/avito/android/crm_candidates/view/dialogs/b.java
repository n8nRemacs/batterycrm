package com.avito.android.crm_candidates.view.dialogs;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.crm_candidates.features.list_filter.entity.ResetState;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.crm_candidates.view.ui.search_view.JobCrmCandidatesSearchView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmCandidatesListFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/dialogs/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f129967O = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final N f129968E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final N f129969F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final N f129970G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public y f129971H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final NavBar f129972I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public JobCrmCandidatesSearchView f129973J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public RecyclerView f129974K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public Button f129975L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public View f129976M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f129977N;

    /* compiled from: JobCrmCandidatesListFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesListFilterDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_candidates.view.dialogs.b$b, reason: collision with other inner class name */
    public static final class C3856b extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f129980m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3856b(Y41.a<G0> aVar) {
            super(1);
            this.f129980m = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.search);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.crm_candidates.view.ui.search_view.JobCrmCandidatesSearchView");
            }
            b bVar = b.this;
            bVar.f129973J = (JobCrmCandidatesSearchView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.empty_list_view);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            bVar.f129976M = viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.list);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
            recyclerView.setItemAnimator(null);
            view2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(bVar.f129977N);
            recyclerView.A0(0);
            recyclerView.o(new com.avito.android.crm_candidates.view.dialogs.c(recyclerView));
            bVar.f129974K = recyclerView;
            View viewFindViewById4 = view2.findViewById(R.id.apply_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            bVar.f129975L = (Button) viewFindViewById4;
            view2.postDelayed(new com.avito.android.crm_candidates.view.dialogs.d(this.f129980m), 50L);
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmCandidatesListFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[ResetState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ResetState resetState = ResetState.f129677b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ResetState resetState2 = ResetState.f129677b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: JobCrmCandidatesListFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            b.this.f129969F.invoke((String) obj);
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = b.this.f129974K;
            if (recyclerView != null) {
                recyclerView.setHasFixedSize(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k String str, @k Context context, @k com.avito.konveyor.a aVar, @k Y41.a<G0> aVar2, @k Y41.l<? super String, G0> lVar, @k Y41.a<G0> aVar3, @k Y41.a<G0> aVar4) {
        super(context, 0, 2, null);
        this.f129968E = (N) aVar2;
        this.f129969F = (N) lVar;
        this.f129970G = (N) aVar3;
        this.f129977N = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null), aVar, null, 4, null);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        NavBar navBar = new NavBar(context, null, 0, 6, null);
        navBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        NavBar.e(navBar, str, R.attr.textH50, 4);
        navBar.c(R.attr.ic_arrowBack24, new a());
        this.f129972I = navBar;
        H(navBar);
        C(R.layout.job_crm_list_filter_layout, new C3856b(aVar4));
    }

    public final void V(@k ResetState resetState) {
        int iOrdinal = resetState.ordinal();
        NavBar navBar = this.f129972I;
        if (iOrdinal == 0) {
            navBar.setActions(new View[0]);
            return;
        }
        if (iOrdinal == 1) {
            com.avito.android.lib.design.text_view.a aVarB = navBar.b(com.avito.android.printable_text.b.f(getContext().getString(R.string.reset_value)));
            aVarB.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
            aVarB.setEnabled(false);
            aVarB.setClickable(false);
            navBar.setActions(aVarB);
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        com.avito.android.lib.design.text_view.a aVarB2 = navBar.b(com.avito.android.printable_text.b.f(getContext().getString(R.string.reset_value)));
        aVarB2.setBackground(C35835l0.h(android.R.attr.selectableItemBackground, getContext()));
        aVarB2.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.a(this, 1));
        navBar.setActions(aVarB2);
    }

    public final void W(boolean z12) {
        z<String> inputCallbacks$_avito_job_crm_candidates_impl;
        JobCrmCandidatesSearchView jobCrmCandidatesSearchView = this.f129973J;
        if (jobCrmCandidatesSearchView != null) {
            D6.G(jobCrmCandidatesSearchView, z12);
        }
        JobCrmCandidatesSearchView jobCrmCandidatesSearchView2 = this.f129973J;
        if (jobCrmCandidatesSearchView2 != null) {
            if (!z12) {
                jobCrmCandidatesSearchView2 = null;
            }
            if (jobCrmCandidatesSearchView2 == null || (inputCallbacks$_avito_job_crm_candidates_impl = jobCrmCandidatesSearchView2.getInputCallbacks$_avito_job_crm_candidates_impl()) == null) {
                return;
            }
            io.reactivex.rxjava3.disposables.d dVarT0 = inputCallbacks$_avito_job_crm_candidates_impl.t0(new d());
            y yVar = this.f129971H;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            this.f129971H = (y) dVarT0;
        }
    }

    public final void X() {
        D6.w(this.f129974K);
        D6.H(this.f129976M);
        Button button = this.f129975L;
        if (button != null) {
            button.setText(getContext().getString(R.string.crm_close));
        }
        Button button2 = this.f129975L;
        if (button2 != null) {
            button2.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.a(this, 2));
        }
    }

    public final void Y(@l List<JobCrmListFilterItem> list) {
        D6.H(this.f129974K);
        D6.w(this.f129976M);
        Button button = this.f129975L;
        if (button != null) {
            button.setText(getContext().getString(R.string.crm_save));
        }
        Button button2 = this.f129975L;
        if (button2 != null) {
            button2.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.a(this, 0));
        }
        this.f129977N.l(list, null);
        RecyclerView recyclerView = this.f129974K;
        if (recyclerView != null) {
            recyclerView.postDelayed(new e(), 300L);
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y yVar = this.f129971H;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f129971H = null;
    }
}
