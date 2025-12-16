package com.avito.android.comparison.items.disclaimer;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DisclaimerItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/items/disclaimer/b;", "LTV0/b;", "Lcom/avito/android/comparison/items/disclaimer/f;", "Lcom/avito/android/comparison/items/disclaimer/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements TV0.b<f, com.avito.android.comparison.items.disclaimer.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f123942a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f123943b = new g.a<>(R.layout.comparison_disclaimer_item_layout, a.f123944l);

    /* compiled from: DisclaimerItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/comparison/items/disclaimer/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/comparison/items/disclaimer/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f123944l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view);
        }
    }

    @Inject
    public b(@k d dVar) {
        this.f123942a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f123942a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f123943b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.comparison.items.disclaimer.a;
    }
}
