package com.avito.android.profile.edit.adapter;

import TV0.g;
import Y41.p;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.profile.edit.refactoring.adapter.item.LocationItem;
import com.avito.android.profile.edit.refactoring.adapter.u;
import com.avito.android.profile.edit.refactoring.adapter.v;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/adapter/g;", "LTV0/b;", "Lcom/avito/android/profile/edit/refactoring/adapter/v;", "Lcom/avito/android/profile/edit/refactoring/adapter/item/LocationItem;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements TV0.b<v, LocationItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f222034a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f222035b = new g.a<>(R.layout.selectable_single_line, a.f222036l);

    /* compiled from: LocationItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/profile/edit/refactoring/adapter/u;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/profile/edit/refactoring/adapter/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, u> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f222036l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final u invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            int dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.standard_padding);
            D6.f(view2, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
            return new u(view2);
        }
    }

    public g(@Y61.k h hVar) {
        this.f222034a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f222034a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f222035b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof LocationItem;
    }
}
