package com.avito.android.di.module;

import com.avito.android.remote.model.item_reviews.ItemReviews;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.avito.android.remote.model.item_reviews.RatingAttributedTextEntry;
import com.avito.android.remote.model.user_contacts.UserContactResultElement;
import com.avito.android.remote.model.user_reviews.ReviewElement;
import com.avito.android.remote.model.user_reviews.UserReviewsTypeAdapter;
import com.avito.android.remote.parse.adapter.AttributedTextAdapter;
import com.avito.android.remote.parse.adapter.ItemReviewsDeserializer;
import com.avito.android.remote.parse.adapter.ItemReviewsEntryTypeAdapter;
import com.avito.android.remote.parse.adapter.RatingAttributedTextDeserializer;
import com.avito.android.remote.parse.adapter.UserContactResultElementAdapter;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RatingJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/d7;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.d7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30018d7 implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C30018d7 f144268a = new C30018d7();

    @Override // javax.inject.Provider
    public final Object get() {
        C29996b7.f144237a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(UserContactResultElement.class, new UserContactResultElementAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ReviewElement.class, new UserReviewsTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ItemReviewsEntry.class, new ItemReviewsEntryTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ItemReviews.class, new ItemReviewsDeserializer()));
        linkedHashSet.add(new com.avito.android.util.X5(RatingAttributedTextEntry.class, new RatingAttributedTextDeserializer(new AttributedTextAdapter(null, 1, null))));
        return linkedHashSet;
    }
}
