package com.avito.android.bundles.ui.recycler.item.skip_button;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BundleSkipButtonItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/skip_button/b;", "LTV0/b;", "Lcom/avito/android/bundles/ui/recycler/item/skip_button/h;", "Lcom/avito/android/bundles/ui/recycler/item/skip_button/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<h, com.avito.android.bundles.ui.recycler.item.skip_button.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f108431a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f108432b = new g.a<>(R.layout.vas_bundle_skip_button_item, a.f108433l);

    /* compiled from: BundleSkipButtonItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/bundles/ui/recycler/item/skip_button/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/bundles/ui/recycler/item/skip_button/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f108433l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f108431a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f108431a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f108432b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.bundles.ui.recycler.item.skip_button.a;
    }
}
