package com.avito.android.inline_filters.dialog.category_nodes;

import com.avito.android.inline_filters.category_nodes.CategoryTreeLink;
import com.avito.android.remote.model.search.WidgetType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryNodesDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryTreeLink f171475l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C31009d f171476m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WidgetType f171477n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CategoryTreeLink categoryTreeLink, C31009d c31009d, WidgetType widgetType) {
        super(0);
        this.f171475l = categoryTreeLink;
        this.f171476m = c31009d;
        this.f171477n = widgetType;
    }

    @Override // Y41.a
    public final G0 invoke() {
        CategoryTreeLink categoryTreeLink = this.f171475l;
        if (categoryTreeLink != null) {
            this.f171476m.g(categoryTreeLink, this.f171477n);
        }
        return G0.f406611a;
    }
}
