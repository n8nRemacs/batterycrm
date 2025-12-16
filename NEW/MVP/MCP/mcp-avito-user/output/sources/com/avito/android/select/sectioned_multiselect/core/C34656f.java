package com.avito.android.select.sectioned_multiselect.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SectionedMultiselectCoreView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/f;", "Lcom/avito/android/select/sectioned_multiselect/core/d;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.select.sectioned_multiselect.core.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34656f implements InterfaceC34654d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f266640a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f266641b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Button f266642c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final TextView f266643d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f266644e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f266645f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f266646g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f266647h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f266648i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayout f266649j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Input f266650k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public C34658h f266651l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.b f266652m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C42670a f266653n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f266654o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f266655p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f266656q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f266657r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f266658s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f266659t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f266660u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f266661v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f266662w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f266663x;

    /* compiled from: SectionedMultiselectCoreView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/core/f$a;", "", "<init>", "()V", "", "TOAST_BAR_DURATION", "I", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select.sectioned_multiselect.core.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SectionedMultiselectCoreView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select.sectioned_multiselect.core.f$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return C34656f.this.f266640a.findViewById(R.id.search_list);
        }
    }

    static {
        new a(null);
    }

    public C34656f(@Y61.k View view, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.l Button button, @Y61.l TextView textView) {
        this.f266640a = view;
        this.f266641b = cVar;
        this.f266642c = button;
        this.f266643d = textView;
        Context context = view.getContext();
        this.f266644e = context != null ? Integer.valueOf(C35835l0.d(R.attr.blue, context)) : null;
        Context context2 = view.getContext();
        this.f266645f = context2 != null ? Integer.valueOf(C35835l0.d(R.attr.gray28, context2)) : null;
        this.f266646g = (FrameLayout) view.findViewById(R.id.fragment_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.search_list);
        this.f266647h = recyclerView;
        View viewFindViewById = view.findViewById(android.R.id.empty);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f266648i = viewFindViewById;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.select_dialog_search_view_container);
        this.f266649j = linearLayout;
        this.f266650k = linearLayout != null ? (Input) linearLayout.findViewById(R.id.select_dialog_search_view) : null;
        C42670a c42670a = new C42670a((ViewGroup) view.findViewById(R.id.search_container), new b(), 0, 4, null);
        this.f266653n = c42670a;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f266654o = cVar2;
        com.jakewharton.rxrelay3.c<G0> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f266655p = cVar3;
        com.jakewharton.rxrelay3.c<String> cVar4 = new com.jakewharton.rxrelay3.c<>();
        this.f266656q = cVar4;
        com.jakewharton.rxrelay3.c<G0> cVar5 = new com.jakewharton.rxrelay3.c<>();
        this.f266657r = cVar5;
        com.jakewharton.rxrelay3.c<G0> cVar6 = new com.jakewharton.rxrelay3.c<>();
        this.f266658s = cVar6;
        this.f266659t = new C41981q0(cVar2);
        this.f266660u = new C41981q0(cVar3);
        this.f266661v = new C41981q0(cVar4);
        this.f266662w = new C41981q0(cVar5);
        this.f266663x = new C41981q0(cVar6);
        if (button != null) {
            button.setOnClickListener(null);
            D6.w(button);
        }
        D6.w(viewFindViewById);
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(jVar);
        }
        c42670a.a(new ViewOnClickListenerC34655e(this, 3));
    }

    public final void a(boolean z12) {
        D6.G(this.f266646g, z12);
    }

    public final void b(boolean z12) {
        D6.G(this.f266648i, z12);
    }

    public final void c(boolean z12) {
        C42670a c42670a = this.f266653n;
        if (z12) {
            C42670a.d(c42670a);
        } else {
            c42670a.b();
        }
    }
}
