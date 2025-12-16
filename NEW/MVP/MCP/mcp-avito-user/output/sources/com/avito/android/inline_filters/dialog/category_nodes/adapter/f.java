package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: NodeItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/f;", "LTV0/b;", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/k;", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/NodeItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements TV0.b<k, NodeItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f171432a;

    /* compiled from: NodeItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f171433l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view);
        }
    }

    public f(@Y61.k j jVar) {
        this.f171432a = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f171432a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.category_node_item, a.f171433l);
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof NodeItem) {
            NodeItem nodeItem = (NodeItem) aVar;
            if (nodeItem.f171411h == null && nodeItem.f171415l == null && !L.f(nodeItem.f171407d.getUri().getPath(), "/realtyAgency/search")) {
                return true;
            }
        }
        return false;
    }
}
