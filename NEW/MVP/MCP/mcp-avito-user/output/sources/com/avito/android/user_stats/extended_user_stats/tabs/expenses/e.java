package com.avito.android.user_stats.extended_user_stats.tabs.expenses;

import RJ0.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi.entity.PaginationState;
import com.avito.android.util.D6;
import com.avito.user_stats.model.extended_user_stats.UserMessage;
import io.reactivex.rxjava3.internal.operators.observable.C;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExpensesTabView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/e;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f317661a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f317662b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f317663c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f317664d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f317665e;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f317666f;

    /* renamed from: g, reason: collision with root package name */
    public int f317667g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f317668h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C f317669i;

    /* compiled from: ExpensesTabView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_stats/extended_user_stats/tabs/expenses/e$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f317670b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f317671c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<? extends PaginationState> aVar, e eVar) {
            this.f317670b = (N) aVar;
            this.f317671c = eVar;
        }

        /* JADX WARN: Type inference failed for: r2v7, types: [Y41.l, kotlin.jvm.internal.H] */
        /* JADX WARN: Type inference failed for: r4v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            RecyclerView.Adapter adapter;
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (adapter = recyclerView.getAdapter()) == null) {
                return;
            }
            int itemCount = adapter.getItemCount();
            int iM1 = itemCount - linearLayoutManager.M1();
            PaginationState paginationState = (PaginationState) this.f317670b.invoke();
            if (itemCount <= 3 || iM1 > 1 || !(paginationState instanceof PaginationState.Loaded) || !((PaginationState.Loaded) paginationState).f318227b) {
                return;
            }
            this.f317671c.f317662b.invoke(a.b.f14312a);
        }
    }

    /* compiled from: ExpensesTabView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f317672l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f317673m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.deeplink_handler.handler.composite.a aVar, DeepLink deepLink) {
            super(0);
            this.f317672l = aVar;
            this.f317673m = deepLink;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.a.a(this.f317672l, this.f317673m, null, null, 6);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Y41.l<? super RJ0.a, G0> lVar, @Y61.k Y41.a<? extends PaginationState> aVar2, boolean z12, @Y61.k com.avito.android.util.text.a aVar3) {
        this.f317661a = aVar;
        this.f317662b = (H) lVar;
        this.f317663c = aVar3;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_tab_stats);
        this.f317664d = recyclerView;
        this.f317665e = (LinearLayout) view.findViewById(R.id.ll_tab_expenses_stats);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_expenses_part);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_chart_period);
        this.f317666f = (ConstraintLayout) view.findViewById(R.id.cl_stats_error);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        linearLayout.setVisibility(z12 ? 0 : 8);
        linearLayout2.setVisibility(z12 ? 8 : 0);
        if (aVar2.invoke() != null) {
            recyclerView.o(new a(aVar2, this));
        }
        View viewFindViewById = view.findViewById(R.id.fl_tab_stats);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.rv_tab_stats, interfaceC28373a, 0, 0, 24, null);
        this.f317668h = lVar2;
        this.f317669i = lVar2.e();
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [Y41.l, kotlin.jvm.internal.H] */
    public static void d(e eVar, List list, boolean z12, List list2, UserMessage userMessage, int i12) {
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        if ((i12 & 8) != 0) {
            userMessage = null;
        }
        eVar.getClass();
        boolean z13 = userMessage != null;
        ConstraintLayout constraintLayout = eVar.f317666f;
        RecyclerView recyclerView = eVar.f317664d;
        if (z13) {
            com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.h.a(userMessage, constraintLayout, eVar.f317663c, eVar.f317662b, null);
        } else {
            eVar.f317661a.c(new UV0.c(list));
            Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
            int i13 = (numValueOf != null && numValueOf.intValue() == 1) ? D6.i(80, recyclerView.getContext()) : (numValueOf != null && numValueOf.intValue() == 2) ? D6.i(140, recyclerView.getContext()) : 0;
            eVar.f317667g = i13;
            recyclerView.setPadding(0, 0, 0, i13);
            if (z12) {
                recyclerView.A0(0);
            }
        }
        recyclerView.setVisibility(!z13 ? 0 : 8);
        constraintLayout.setVisibility(z13 ? 0 : 8);
    }

    public final void a() {
        this.f317665e.setVisibility(8);
        this.f317664d.setVisibility(0);
        this.f317668h.j();
    }

    public final void b(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l DeepLink deepLink, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        if (attributedText == null || attributedText2 == null || deepLink == null) {
            return;
        }
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(attributedText.getText());
        f.c.f125255c.getClass();
        f.c cVarB = f.c.a.b();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181048f;
        com.avito.android.component.toast.c.b(cVar, this.f317664d, printableTextF, null, Collections.singletonList(new c.a.C3719a(attributedText2.getText(), false, null, new b(aVar, deepLink), 6, null)), null, cVarB, 0, toastBarPosition, Integer.valueOf(this.f317667g), false, false, null, null, 3882);
    }

    public final void c(@Y61.k RJ0.a aVar) {
        RecyclerView recyclerView = this.f317664d;
        Context context = recyclerView.getContext();
        String string = context.getString(R.string.user_stats_dynamic_error_refresh);
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(context.getString(R.string.user_stats_dynamic_error_data));
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, recyclerView, printableTextF, null, Collections.singletonList(new c.a.C3719a(string, false, null, new f(this, aVar), 6, null)), null, f.c.a.b(), 0, ToastBarPosition.f181045c, Integer.valueOf(this.f317667g), false, false, null, null, 3882);
    }
}
