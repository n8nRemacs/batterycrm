package com.avito.android.campaigns_sale.konveyor.viewBlock;

import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import gm.C40705b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SaleViewBlockItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/konveyor/viewBlock/a;", "LTV0/b;", "Lcom/avito/android/campaigns_sale/konveyor/viewBlock/f;", "Lgm/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements TV0.b<f, C40705b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f114029a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f114030b = new g.a<>(R.layout.campaigns_sale_view_block, C3337a.f114031l);

    /* compiled from: SaleViewBlockItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/campaigns_sale/konveyor/viewBlock/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/campaigns_sale/konveyor/viewBlock/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.campaigns_sale.konveyor.viewBlock.a$a, reason: collision with other inner class name */
    public static final class C3337a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3337a f114031l = new C3337a();

        public C3337a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f114029a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f114029a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f114030b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof C40705b) && !((C40705b) aVar).f396782k;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f114029a, ((a) obj).f114029a);
    }

    public final int hashCode() {
        return this.f114029a.hashCode();
    }

    @k
    public final String toString() {
        return "SaleViewBlockItemBlueprint(presenter=" + this.f114029a + ')';
    }
}
