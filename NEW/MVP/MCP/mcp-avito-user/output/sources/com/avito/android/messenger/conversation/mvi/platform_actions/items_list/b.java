package com.avito.android.messenger.conversation.mvi.platform_actions.items_list;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import com.avito.konveyor.adapter.j;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: ItemsListSheetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/items_list/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f193977a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f193978b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f193979c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f193980d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f193981e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f193982f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f193983g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Object f193984h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Object f193985i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Object f193986j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Object f193987k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Object f193988l;

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/j;", "invoke", "()Lcom/avito/konveyor/adapter/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<j> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.konveyor.a f193990m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.konveyor.a aVar) {
            super(0);
            this.f193990m = aVar;
        }

        @Override // Y41.a
        public final j invoke() {
            b bVar = b.this;
            j jVar = new j(bVar.f193977a, this.f193990m);
            bVar.j().setAdapter(jVar);
            return jVar;
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.items_list.b$b, reason: collision with other inner class name */
    public static final class C5741b extends N implements Y41.a<View> {
        public C5741b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            b bVar = b.this;
            View viewFindViewById = bVar.h().findViewById(R.id.platform_items_list_close_button);
            viewFindViewById.setOnClickListener(new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.c(bVar, 0));
            return viewFindViewById;
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            b bVar = b.this;
            View viewFindViewById = bVar.h().findViewById(R.id.platform_items_list_connection_error_indicator);
            ((TextView) viewFindViewById.findViewById(R.id.connection_error_message)).setText(R.string.messenger_recommendations_error_indicator_message);
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.connection_error_action);
            textView.setText(R.string.messenger_recommendations_error_indicator_action_name);
            textView.setOnClickListener(new com.avito.android.messenger.conversation.mvi.platform_actions.items_list.c(bVar, 1));
            return viewFindViewById;
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LayoutInflater f193993l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LayoutInflater layoutInflater) {
            super(0);
            this.f193993l = layoutInflater;
        }

        @Override // Y41.a
        public final Integer invoke() {
            View viewInflate = this.f193993l.inflate(R.layout.messenger_platform_items_list_snippet, (ViewGroup) null);
            viewInflate.measure(0, 0);
            return Integer.valueOf(viewInflate.getMeasuredHeight());
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/constraintlayout/widget/ConstraintLayout;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<ConstraintLayout> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LayoutInflater f193994l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LayoutInflater layoutInflater) {
            super(0);
            this.f193994l = layoutInflater;
        }

        @Override // Y41.a
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) this.f193994l.inflate(R.layout.messenger_platform_items_list, (ViewGroup) null);
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/spinner/Spinner;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<Spinner> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Spinner invoke() {
            return (Spinner) b.this.h().findViewById(R.id.platform_items_list_progress);
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<RecyclerView> {
        public g(Context context) {
            super(0);
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            RecyclerView recyclerView = (RecyclerView) b.this.h().findViewById(R.id.platform_items_list_recycler);
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            return recyclerView;
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LayoutInflater f193997l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LayoutInflater layoutInflater) {
            super(0);
            this.f193997l = layoutInflater;
        }

        @Override // Y41.a
        public final Integer invoke() {
            View viewInflate = this.f193997l.inflate(R.layout.messenger_platform_items_list_title, (ViewGroup) null);
            viewInflate.measure(0, 0);
            return Integer.valueOf(viewInflate.getMeasuredHeight());
        }
    }

    /* compiled from: ItemsListSheetView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<TextView> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) b.this.h().findViewById(R.id.platform_items_list_title);
        }
    }

    public b(@k Context context, @k LayoutInflater layoutInflater, @k com.avito.konveyor.adapter.a aVar, @k com.avito.konveyor.a aVar2) {
        this.f193977a = aVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f193980d = C42727D.b(lazyThreadSafetyMode, new d(layoutInflater));
        this.f193981e = C42727D.b(lazyThreadSafetyMode, new h(layoutInflater));
        this.f193982f = C42727D.b(lazyThreadSafetyMode, new e(layoutInflater));
        this.f193983g = C42727D.b(lazyThreadSafetyMode, new i());
        this.f193984h = C42727D.b(lazyThreadSafetyMode, new C5741b());
        this.f193985i = C42727D.b(lazyThreadSafetyMode, new g(context));
        this.f193986j = C42727D.b(lazyThreadSafetyMode, new a(aVar2));
        this.f193987k = C42727D.b(lazyThreadSafetyMode, new f());
        this.f193988l = C42727D.b(lazyThreadSafetyMode, new c());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a
    public final int a() {
        return ((Number) this.f193981e.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a
    @k
    public final TextView b() {
        return (TextView) this.f193983g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a
    public final void c(@l f.InterfaceC5732f.b.c cVar, @k f.InterfaceC5732f.b.c cVar2, @k ViewGroup viewGroup, int i12) {
        UV0.a<com.avito.android.messenger.conversation.mvi.platform_actions.items_list.snippet.f> aVarC;
        if (cVar == cVar2) {
            return;
        }
        D6.H((View) this.f193984h.getValue());
        b().setText(cVar2.getTitle());
        int count = cVar2.c().getCount();
        if (cVar == null || (aVarC = cVar.c()) == null || aVarC.getCount() != count) {
            int iA2 = i12 - ((a() * 2) + viewGroup.getTop());
            int iG2 = g() * count;
            k(iA2 > g() ? s.g(iG2, g(), iA2) : s.g(iG2, g(), kotlin.math.b.a(g() * 2.5d)));
        }
        this.f193977a.c(cVar2.c());
        ((RecyclerView.Adapter) this.f193986j.getValue()).notifyDataSetChanged();
        e(cVar, cVar2);
        if (L.f(h().getParent(), viewGroup)) {
            return;
        }
        D6.z(h());
        viewGroup.addView(h(), new FrameLayout.LayoutParams(-1, -2));
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.items_list.a
    public final void d(@l f.InterfaceC5732f.b.c cVar) {
        D6.z(h());
        k(g());
        e(cVar, null);
    }

    public final void e(f.InterfaceC5732f.b.c cVar, f.InterfaceC5732f.b.c cVar2) {
        if (cVar instanceof f.InterfaceC5732f.b.c.a) {
            if ((cVar2 instanceof f.InterfaceC5732f.b.c.a) || cVar2 == null) {
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.C5737b) {
                Q.b(h());
                ConstraintLayout constraintLayoutH = h();
                Q5 q52 = new Q5(new C23503n());
                q52.a(f().getId());
                Q.a(constraintLayoutH, q52.c());
                D6.H(f());
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.C5738c) {
                Q.b(h());
                ConstraintLayout constraintLayoutH2 = h();
                Q5 q53 = new Q5(new C23503n());
                q53.a(j().getId());
                q53.a(i().getId());
                Q.a(constraintLayoutH2, q53.c());
                D6.g(j());
                D6.H(i());
                return;
            }
            return;
        }
        if (cVar instanceof f.InterfaceC5732f.b.c.C5737b) {
            if (cVar2 == null) {
                Q.b(h());
                D6.w(f());
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.a) {
                Q.b(h());
                ConstraintLayout constraintLayoutH3 = h();
                Q5 q54 = new Q5(new C23503n());
                q54.a(f().getId());
                Q.a(constraintLayoutH3, q54.c());
                D6.w(f());
                return;
            }
            if ((cVar2 instanceof f.InterfaceC5732f.b.c.C5737b) || !(cVar2 instanceof f.InterfaceC5732f.b.c.C5738c)) {
                return;
            }
            Q.b(h());
            ConstraintLayout constraintLayoutH4 = h();
            Q5 q55 = new Q5(new C23503n());
            q55.a(j().getId());
            q55.a(f().getId());
            q55.a(i().getId());
            Q.a(constraintLayoutH4, q55.c());
            D6.g(j());
            D6.w(f());
            D6.H(i());
            return;
        }
        if (cVar instanceof f.InterfaceC5732f.b.c.C5738c) {
            if (cVar2 == null) {
                Q.b(h());
                D6.H(j());
                D6.g(i());
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.a) {
                Q.b(h());
                ConstraintLayout constraintLayoutH5 = h();
                Q5 q56 = new Q5(new C23503n());
                q56.a(j().getId());
                q56.a(i().getId());
                Q.a(constraintLayoutH5, q56.c());
                D6.H(j());
                D6.g(i());
                return;
            }
            if (!(cVar2 instanceof f.InterfaceC5732f.b.c.C5737b)) {
                boolean z12 = cVar2 instanceof f.InterfaceC5732f.b.c.C5738c;
                return;
            }
            Q.b(h());
            ConstraintLayout constraintLayoutH6 = h();
            Q5 q57 = new Q5(new C23503n());
            q57.a(j().getId());
            q57.a(f().getId());
            q57.a(i().getId());
            Q.a(constraintLayoutH6, q57.c());
            D6.H(j());
            D6.H(f());
            D6.g(i());
            return;
        }
        if (cVar == null) {
            if (cVar2 == null) {
                Q.b(h());
                D6.H(j());
                D6.w(f());
                D6.g(i());
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.a) {
                Q.b(h());
                ConstraintLayout constraintLayoutH7 = h();
                Q5 q58 = new Q5(new C23503n());
                q58.a(j().getId());
                q58.a(f().getId());
                q58.a(i().getId());
                Q.a(constraintLayoutH7, q58.c());
                D6.H(j());
                D6.w(f());
                D6.g(i());
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.C5737b) {
                Q.b(h());
                ConstraintLayout constraintLayoutH8 = h();
                Q5 q59 = new Q5(new C23503n());
                q59.a(j().getId());
                q59.a(f().getId());
                q59.a(i().getId());
                Q.a(constraintLayoutH8, q59.c());
                D6.H(j());
                D6.H(f());
                D6.g(i());
                return;
            }
            if (cVar2 instanceof f.InterfaceC5732f.b.c.C5738c) {
                Q.b(h());
                ConstraintLayout constraintLayoutH9 = h();
                Q5 q510 = new Q5(new C23503n());
                q510.a(j().getId());
                q510.a(f().getId());
                q510.a(i().getId());
                Q.a(constraintLayoutH9, q510.c());
                D6.g(j());
                D6.w(f());
                D6.H(i());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final View f() {
        return (View) this.f193988l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final int g() {
        return ((Number) this.f193980d.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final ConstraintLayout h() {
        return (ConstraintLayout) this.f193982f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final Spinner i() {
        return (Spinner) this.f193987k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final RecyclerView j() {
        return (RecyclerView) this.f193985i.getValue();
    }

    public final void k(int i12) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(h());
        dVar.p(R.id.platform_items_list_recycler).f44269e.f44319d0 = i12;
        dVar.p(R.id.platform_items_list_recycler).f44269e.f44315b0 = i12;
        dVar.c(h());
    }
}
