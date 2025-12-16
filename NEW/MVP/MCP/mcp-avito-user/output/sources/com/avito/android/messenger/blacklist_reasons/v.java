package com.avito.android.messenger.blacklist_reasons;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.messenger.blacklist_reasons.e;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: BlacklistReasonsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/v;", "Lcom/avito/android/messenger/blacklist_reasons/t;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements t {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f186653q = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/blacklist_reasons/BlacklistReasonsPresenter$State;", v.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f186654b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f186655c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f186656d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f186657e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f186658f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f186659g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f186660h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f186661i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Spinner f186662j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.group.item.double_input.e f186663k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f186664l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f186665m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f186666n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f186667o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C35971x f186668p;

    /* compiled from: BlacklistReasonsView.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/v$a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.l {

        /* renamed from: b, reason: collision with root package name */
        public final int f186669b = y6.b(64);

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
            recyclerView.getClass();
            if (RecyclerView.V(view) == (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
                rect.bottom = this.f186669b;
            }
        }
    }

    /* compiled from: BlacklistReasonsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/konveyor/adapter/d;", "invoke", "()Lcom/avito/konveyor/adapter/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.konveyor.adapter.d> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.konveyor.adapter.d invoke() {
            v vVar = v.this;
            com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(vVar.f186656d, vVar.f186655c, null, 4, null);
            vVar.f186658f.setAdapter(dVar);
            return dVar;
        }
    }

    public v(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f186654b = viewGroup;
        this.f186655c = aVar;
        this.f186656d = aVar2;
        this.f186657e = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.blacklist_reasons_list);
        this.f186658f = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f186659g = C42727D.b(LazyThreadSafetyMode.f406616d, new b());
        View viewFindViewById2 = viewGroup.findViewById(R.id.blacklist_reasons_block_button_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f186660h = viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.blacklist_reasons_block_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f186661i = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.blacklist_reasons_progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f186662j = (Spinner) viewFindViewById4;
        this.f186663k = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 11);
        this.f186665m = new com.jakewharton.rxrelay3.c();
        this.f186666n = new com.jakewharton.rxrelay3.c();
        this.f186667o = new com.jakewharton.rxrelay3.c();
        this.f186668p = new C35971x();
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.l(new a(), -1);
        toolbar.setNavigationIcon(R.drawable.ic_back_24);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.blacklist_reasons.u

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f186652c;

            {
                this.f186652c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f186652c.f186665m.accept(G0.f406611a);
                        break;
                    default:
                        this.f186652c.f186667o.accept(G0.f406611a);
                        break;
                }
            }
        });
        final int i13 = 1;
        viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.blacklist_reasons.u

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f186652c;

            {
                this.f186652c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f186652c.f186665m.accept(G0.f406611a);
                        break;
                    default:
                        this.f186652c.f186667o.accept(G0.f406611a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.mvi.e
    public final e.a a(com.avito.android.mvi.e<e.a> eVar) {
        kotlin.reflect.n<Object> nVar = f186653q[0];
        return (e.a) this.f186668p.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.blacklist_reasons.e$a] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f186653q[0];
        this.f186668p.f319122b = (e.a) obj;
    }

    public final void c() {
        Q5 q52 = new Q5(new C23503n());
        q52.a(R.id.blacklist_reasons_list);
        q52.a(R.id.blacklist_reasons_progress);
        q52.a(R.id.blacklist_reasons_block_button);
        Q.a(this.f186654b, q52.c());
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<e.a> eVar, e.a aVar, e.a aVar2) {
        e.a aVar3 = aVar2;
        V2.f318762a.i("BlacklistReasonsView", "Render state: " + aVar3, null);
        if (aVar3.equals(aVar)) {
            return;
        }
        com.avito.android.lib.design.toast_bar.k kVar = this.f186664l;
        if (kVar != null) {
            kVar.f();
        }
        this.f186664l = null;
        boolean zEquals = aVar3.equals(e.a.C5475a.f186581a);
        View view = this.f186660h;
        Spinner spinner = this.f186662j;
        RecyclerView recyclerView = this.f186658f;
        ViewGroup viewGroup = this.f186654b;
        com.avito.android.inline_filters.dialog.group.item.double_input.e eVar2 = this.f186663k;
        if (zEquals) {
            viewGroup.removeCallbacks(eVar2);
            c();
            D6.g(recyclerView);
            D6.g(spinner);
            D6.w(view);
            return;
        }
        if (aVar3.equals(e.a.c.f186587a)) {
            viewGroup.postDelayed(eVar2, 300L);
            return;
        }
        if (!(aVar3 instanceof e.a.d)) {
            if (aVar3 instanceof e.a.b) {
                e.a.b bVar = (e.a.b) aVar3;
                if (bVar.f186584c) {
                    viewGroup.postDelayed(eVar2, 300L);
                    return;
                }
                viewGroup.removeCallbacks(eVar2);
                c();
                ((com.avito.konveyor.adapter.d) this.f186659g.getValue()).l(bVar.f186582a, null);
                D6.H(recyclerView);
                this.f186661i.setEnabled(bVar.f186583b);
                D6.H(view);
                D6.g(spinner);
                return;
            }
            return;
        }
        e.a.d dVar = (e.a.d) aVar3;
        viewGroup.removeCallbacks(eVar2);
        c();
        D6.g(recyclerView);
        D6.g(spinner);
        D6.w(view);
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        List listSingletonList = Collections.singletonList(new c.a.C3719a(this.f186657e.getString(R.string.messenger_blacklist_reasons_loading_error_toast_bar_retry_button), true, null, new w(this), 4, null));
        f.c.f125255c.getClass();
        this.f186664l = com.avito.android.component.toast.c.b(cVar, this.f186654b, dVar.f186588a, null, listSingletonList, null, f.c.a.a(null, dVar.f186589b), -1, ToastBarPosition.f181046d, null, false, false, null, null, 3978);
    }
}
