package com.avito.android.feed_shortcuts.widget;

import Oi0.C14700d;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeedShortcutsWidgetItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/feed_shortcuts/widget/k;", "a", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f157718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14700d f157719c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f157720d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UV0.c<FeedShortcutsWidgetElementItem> f157721e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public N f157722f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f157723g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f157724h;

    /* compiled from: FeedShortcutsWidgetItemViewImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/m$a;", "", "<init>", "()V", "", "COMMON_SPANS", "I", "WIDE_SPANS", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public m(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k C14700d c14700d) {
        super(view);
        this.f157718b = hVar;
        this.f157719c = c14700d;
        View viewFindViewById = view.findViewById(R.id.feed_shortcuts_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        ArrayList arrayList = new ArrayList();
        this.f157720d = arrayList;
        this.f157721e = new UV0.c<>(arrayList);
        boolean z12 = recyclerView.getResources().getConfiguration().orientation == 2 || recyclerView.getResources().getBoolean(R.bool.is_tablet);
        com.avito.android.feed_shortcuts.widget.a aVar = new com.avito.android.feed_shortcuts.widget.a(view.getResources());
        this.f157722f = o.f157726l;
        this.f157723g = true;
        this.f157724h = new com.jakewharton.rxrelay3.c<>();
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(z12 ? 2 : 1));
        recyclerView.setAdapter(c14700d);
        recyclerView.l(aVar, -1);
        view.addOnAttachStateChangeListener(new l(this));
    }

    @Override // com.avito.android.feed_shortcuts.widget.k
    @Y61.k
    public final W V1() {
        return this.f157724h.N(new n(this));
    }

    @Override // com.avito.android.feed_shortcuts.widget.k
    @SuppressLint({"NotifyDataSetChanged"})
    public final void ae(@Y61.k List<? extends FeedShortcutsWidgetElementItem> list) {
        ArrayList arrayList = this.f157720d;
        arrayList.clear();
        arrayList.addAll(list);
        this.f157718b.f338510e = this.f157721e;
        this.f157719c.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.feed_shortcuts.widget.k
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f157722f = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f157722f.invoke();
    }
}
