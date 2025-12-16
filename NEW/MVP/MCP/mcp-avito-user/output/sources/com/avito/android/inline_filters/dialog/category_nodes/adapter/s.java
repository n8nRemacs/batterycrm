package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import com.avito.android.inline_filters.dialog.category_nodes.t;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchNodeItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/s;", "Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/q;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f171451b;

    public s(@Y61.k t tVar) {
        this.f171451b = tVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        UniversalImage universalImage;
        k kVar = (k) eVar;
        NodeItem nodeItem = (NodeItem) aVar;
        kVar.setTitle(nodeItem.f171410g);
        String str = nodeItem.f171411h;
        if (str != null) {
            kVar.f(str);
        }
        kVar.setChecked(nodeItem.f171413j);
        kVar.a(new r(this, nodeItem));
        kVar.yZ(nodeItem.f171414k);
        String str2 = nodeItem.f171419p;
        if (str2 == null || (universalImage = nodeItem.f171418o) == null) {
            kVar.CQ();
        } else {
            kVar.mW(universalImage, str2);
        }
    }
}
