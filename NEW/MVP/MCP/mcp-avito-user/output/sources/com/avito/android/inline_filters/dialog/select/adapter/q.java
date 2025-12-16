package com.avito.android.inline_filters.dialog.select.adapter;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineFiltersDialogMultiselectCandyBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/q;", "LTV0/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements TV0.b<m, i> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f172124a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.candy.e f172125b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f172126c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f172127d = new g.a<>(R.layout.checkable_candy_item, new a());

    /* compiled from: InlineFiltersDialogMultiselectCandyBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.konveyor.adapter.b> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            q qVar = q.this;
            return new s(view, qVar.f172125b, qVar.f172126c);
        }
    }

    @Inject
    public q(@Y61.k j jVar, @Y61.k com.avito.android.candy.e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f172124a = jVar;
        this.f172125b = eVar;
        this.f172126c = interfaceC35745a5;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f172124a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f172127d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof i) {
            if (((i) aVar).f172095f == InlineItemType.f172056c) {
                return true;
            }
        }
        return false;
    }
}
