package com.avito.android.publish.slots.images_groups_recommendations.item;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.photo_list_view.y;
import com.avito.android.publish.slots.images_groups_recommendations.item.Recommendation;
import com.avito.android.publish.slots.images_groups_recommendations.item.photo_list_view_groups.ImageWithLabel;
import com.avito.android.remote.model.UniversalImageKt;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import of0.C44769a;
import of0.C44770b;
import of0.C44771c;

/* compiled from: ImagesGroupsRecommendationsViewHolders.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/images_groups_recommendations/item/o;", "Lcom/avito/android/publish/slots/images_groups_recommendations/item/p;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends p {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f244230e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final y.a f244231b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f244232c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageWithLabel f244233d;

    public o(@Y61.k View view, @Y61.k y.a aVar, @Y61.k com.avito.android.photo_list_view_groups.h hVar) {
        super(view);
        this.f244231b = aVar;
        this.f244232c = hVar;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.slots.images_groups_recommendations.item.photo_list_view_groups.ImageWithLabel");
        }
        this.f244233d = (ImageWithLabel) viewFindViewById;
    }

    @Override // com.avito.android.publish.slots.images_groups_recommendations.item.p
    public final void B80(@Y61.k Recommendation recommendation) {
        if (recommendation instanceof Recommendation.Content) {
            Recommendation.Content content = (Recommendation.Content) recommendation;
            C44770b c44770b = new C44770b(new C44769a(com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(content.f244196d, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext())))), new C44771c(content.f244198f.f244187b, content.f244199g, Integer.valueOf(content.f244195c)));
            ImageWithLabel imageWithLabel = this.f244233d;
            imageWithLabel.setState(c44770b);
            imageWithLabel.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(3, this, recommendation));
        }
    }
}
