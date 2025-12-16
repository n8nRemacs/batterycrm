package com.avito.android.tariff_lf.edit_info.item.edit_package.regular;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.tariff_lf.edit_info.di.m;
import com.avito.android.tariff_lf.edit_info.di.n;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegularEditPackageItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/b;", "LTV0/b;", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/h;", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<h, com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f298970a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f298971b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f298972c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f298973d = new g.a<>(R.layout.regular_edit_package_item, new a());

    /* compiled from: RegularEditPackageItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff_lf/edit_info/item/edit_package/regular/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new i(view, bVar.f298972c, bVar.f298971b);
        }
    }

    @Inject
    public b(@k d dVar, @m @k com.avito.konveyor.adapter.a aVar, @k @n com.avito.konveyor.a aVar2) {
        this.f298970a = dVar;
        this.f298971b = aVar;
        this.f298972c = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f298970a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f298973d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.tariff_lf.edit_info.item.edit_package.regular.a;
    }
}
