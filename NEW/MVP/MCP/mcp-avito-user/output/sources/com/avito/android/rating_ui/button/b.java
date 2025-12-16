package com.avito.android.rating_ui.button;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingButtonItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/button/b;", "LTV0/b;", "Lcom/avito/android/rating_ui/button/h;", "Lcom/avito/android/rating_ui/button/BaseRatingButtonItem;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<h, BaseRatingButtonItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f249987a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<i> f249988b = new g.a<>(R.layout.review_item_button, a.f249989l);

    /* compiled from: RatingButtonItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "v", "Lcom/avito/android/rating_ui/button/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_ui/button/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f249989l = new a();

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
        this.f249987a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f249987a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f249988b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof BaseRatingButtonItem) && !((BaseRatingButtonItem) aVar).j0();
    }
}
