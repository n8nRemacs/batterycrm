package com.avito.android.favorites.adapter.advert;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.di.module.C30070i4;
import com.avito.android.remote.model.SerpDisplayType;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteAdvertItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/a;", "LTV0/b;", "Lcom/avito/android/favorites/adapter/advert/r;", "Lcom/avito/android/favorites/adapter/advert/FavoriteAdvertItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<r, FavoriteAdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f156431a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B2 f156432b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<s> f156433c;

    /* compiled from: FavoriteAdvertItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorites/adapter/advert/s;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorites/adapter/advert/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorites.adapter.advert.a$a, reason: collision with other inner class name */
    public static final class C4579a extends N implements Y41.p<ViewGroup, View, s> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.date_time_formatter.b f156434l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f156435m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4579a(com.avito.android.date_time_formatter.b bVar, a aVar) {
            super(2);
            this.f156434l = bVar;
            this.f156435m = aVar;
        }

        @Override // Y41.p
        public final s invoke(ViewGroup viewGroup, View view) {
            s sVar = new s(view, this.f156434l, this.f156435m.f156432b);
            SimpleDraweeView simpleDraweeView = sVar.f156482e;
            ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            simpleDraweeView.setAspectRatio(1.0f);
            return sVar;
        }
    }

    @Inject
    public a(@Y61.k d dVar, @C30070i4.h @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k B2 b22) {
        this.f156431a = dVar;
        this.f156432b = b22;
        this.f156433c = new g.a<>(R.layout.favorite_advert_item, new C4579a(bVar, this));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f156431a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<s> b() {
        return this.f156433c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof FavoriteAdvertItem) {
            if (((FavoriteAdvertItem) aVar).f156399K != SerpDisplayType.Vacancy) {
                return true;
            }
        }
        return false;
    }
}
