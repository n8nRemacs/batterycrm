package com.avito.android.publish.price_list.items.selected;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: SelectedPriceListItemsRe23Blueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/j;", "LTV0/b;", "Lcom/avito/android/publish/price_list/items/selected/r;", "Lcom/avito/android/publish/price_list/items/selected/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements TV0.b<r, d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f238728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f238729b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f238730c = new g.a<>(R.layout.item_selected_price_list_re23, a.f238731l);

    /* compiled from: SelectedPriceListItemsRe23Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.konveyor.adapter.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f238731l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            return new v(view);
        }
    }

    @Inject
    public j(@Y61.k l lVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar2) {
        this.f238728a = lVar;
        this.f238729b = lVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f238728a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f238730c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof d) && this.f238729b.f439745a.f439749b.b();
    }
}
