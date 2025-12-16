package com.avito.android.campaigns_sale.konveyor.editBlock;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import gm.C40705b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SaleEditBlockItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/konveyor/editBlock/b;", "LTV0/b;", "Lcom/avito/android/campaigns_sale/konveyor/editBlock/p;", "Lgm/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b implements TV0.b<p, C40705b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f113971a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f113972b = new g.a<>(R.layout.campaigns_sale_edit_block, a.f113973l);

    /* compiled from: SaleEditBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/campaigns_sale/konveyor/editBlock/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/campaigns_sale/konveyor/editBlock/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f113973l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view);
        }
    }

    @Inject
    public b(@Y61.k k kVar) {
        this.f113971a = kVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f113971a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f113972b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof C40705b) && ((C40705b) aVar).f396782k;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f113971a, ((b) obj).f113971a);
    }

    public final int hashCode() {
        return this.f113971a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "SaleEditBlockItemBlueprint(presenter=" + this.f113971a + ')';
    }
}
