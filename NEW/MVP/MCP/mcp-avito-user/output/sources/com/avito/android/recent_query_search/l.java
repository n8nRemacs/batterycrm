package com.avito.android.recent_query_search;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.internal.operators.observable.W;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RecentQuerySearchItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recent_query_search/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/recent_query_search/k;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f252262k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f252263b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f252264c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f252265d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f252266e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f252267f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f252268g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public N f252269h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f252270i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f252271j;

    /* compiled from: RecentQuerySearchItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f252273l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.search_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f252263b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.widget_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f252264c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.query);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f252265d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.search_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f252266e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.search_action);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f252267f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.close_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f252268g = viewFindViewById6;
        this.f252269h = b.f252273l;
        this.f252270i = true;
        this.f252271j = new com.jakewharton.rxrelay3.c<>();
        view.addOnAttachStateChangeListener(new a());
    }

    @Override // com.avito.android.recent_query_search.k
    public final void CJ(@Y61.k Y41.a<G0> aVar) {
        this.f252268g.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(26, aVar));
    }

    @Override // com.avito.android.recent_query_search.k
    public final void O50(@Y61.k String str) {
        this.f252267f.setText(str);
    }

    @Override // com.avito.android.recent_query_search.k
    public final void Sp(@Y61.k String str) {
        this.f252265d.setText(str);
    }

    @Override // com.avito.android.recent_query_search.k
    @Y61.k
    public final W V1() {
        return this.f252271j.N(new m(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recent_query_search.k
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f252269h = (N) aVar;
    }

    @Override // com.avito.android.recent_query_search.k
    public final void hQ(@Y61.k Y41.a<G0> aVar) {
        this.f252263b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(27, aVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f252269h.invoke();
    }

    @Override // com.avito.android.recent_query_search.k
    public final void qZ(@Y61.k String str) {
        this.f252266e.setText(str);
    }

    @Override // com.avito.android.recent_query_search.k
    public final void sf(int i12) {
        this.f252266e.setMaxLines(i12);
    }

    @Override // com.avito.android.recent_query_search.k
    public final boolean t20() {
        return D6.y(this.f252264c);
    }

    @Override // com.avito.android.recent_query_search.k
    public final void vR(@Y61.l String str) {
        I5.a(this.f252264c, str, false);
    }

    /* compiled from: RecentQuerySearchItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/recent_query_search/l$a", "Landroid/view/View$OnAttachStateChangeListener;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            l.this.f252271j.accept(G0.f406611a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
        }
    }
}
