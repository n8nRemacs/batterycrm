package com.avito.android.publish.slots.images_groups_recommendations.item;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImagesGroupsRecommendationsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/e;", "LTV0/b;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/j;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/ImagesGroupsRecommendationsItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.b<j, ImagesGroupsRecommendationsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f244213a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.photo_picker.a f244214b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f244215c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f244216d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f244217e = new g.a<>(R.layout.item_images_groups_recommendations, new a());

    /* compiled from: ImagesGroupsRecommendationsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/images_groups_recommendations/item/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            e eVar = e.this;
            return new k(view, new l(eVar.f244214b, eVar.f244215c, eVar.f244216d));
        }
    }

    @Inject
    public e(@Y61.k g gVar, @Y61.k com.avito.android.publish.photo_picker.a aVar, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k Q1 q12) {
        this.f244213a = gVar;
        this.f244214b = aVar;
        this.f244215c = hVar;
        this.f244216d = q12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f244213a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f244217e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ImagesGroupsRecommendationsItem;
    }
}
