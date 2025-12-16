package com.avito.android.di.module;

import com.avito.android.remote.model.rating_details.ReviewActionsButton;
import com.avito.android.remote.model.rating_details_legacy.RatingDetailsElement;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsEntry;
import com.avito.android.remote.model.rating_details_mvi.ReviewActionsResult;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import com.avito.android.remote.parse.adapter.LegacyRatingDetailsElementTypeAdapter;
import com.avito.android.remote.parse.adapter.RatingDetailsElementTypeAdapter;
import com.avito.android.remote.parse.adapter.RatingDetailsEntryTypeAdapter;
import com.avito.android.remote.parse.adapter.ReviewActionsButtonTypeAdapter;
import com.avito.android.remote.parse.adapter.ReviewActionsButtonTypeMviAdapter;
import com.avito.android.remote.parse.adapter.SearchParametersBlockDeserializer;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RatingDetailsJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/a7;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.a7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29985a7 implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C29985a7 f144229a = new C29985a7();

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = Z6.f144221a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(RatingDetailsElement.class, new LegacyRatingDetailsElementTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(com.avito.android.remote.model.rating_details.RatingDetailsElement.class, new RatingDetailsElementTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(RatingDetailsEntry.class, new RatingDetailsEntryTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ReviewActionsButton.class, new ReviewActionsButtonTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(ReviewActionsResult.ReviewActionsButton.class, new ReviewActionsButtonTypeMviAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(SearchParametersEntry.SearchParametersBlock.class, new SearchParametersBlockDeserializer()));
        return linkedHashSet;
    }
}
