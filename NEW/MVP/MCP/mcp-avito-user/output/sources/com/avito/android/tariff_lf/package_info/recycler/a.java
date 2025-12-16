package com.avito.android.tariff_lf.package_info.recycler;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.tariff_lf.package_info.di.q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffPackageBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/a;", "LTV0/b;", "Lcom/avito/android/tariff_lf/package_info/recycler/d;", "Lcom/avito/android/tariff_lf/package_info/recycler/c;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<d, c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f299231a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f299232b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f299233c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f299234d = new g.a<>(R.layout.tariff_package_info_item, new C9148a());

    /* compiled from: TariffPackageBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff_lf/package_info/recycler/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff_lf/package_info/recycler/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff_lf.package_info.recycler.a$a, reason: collision with other inner class name */
    public static final class C9148a extends N implements p<ViewGroup, View, e> {
        public C9148a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new e(view, aVar.f299232b, aVar.f299233c);
        }
    }

    @Inject
    public a(@k f fVar, @q @k com.avito.konveyor.a aVar, @com.avito.android.tariff_lf.package_info.di.p @k com.avito.konveyor.adapter.a aVar2) {
        this.f299231a = fVar;
        this.f299232b = aVar;
        this.f299233c = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f299231a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f299234d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof c;
    }
}
