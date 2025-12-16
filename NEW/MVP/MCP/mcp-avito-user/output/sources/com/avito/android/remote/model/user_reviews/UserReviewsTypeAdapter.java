package com.avito.android.remote.model.user_reviews;

import Y61.k;
import com.avito.android.remote.model.item_reviews.BuyerReviewEntry;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.d;

/* compiled from: UserReviewsTypeAdapter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/user_reviews/UserReviewsTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/user_reviews/ReviewElement;", "()V", "mapping", "", "", "Ljava/lang/reflect/Type;", "getMapping", "()Ljava/util/Map;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserReviewsTypeAdapter extends RuntimeTypeAdapter<ReviewElement> {

    @k
    private final Map<String, Type> mapping;

    public UserReviewsTypeAdapter() {
        super(null, null, null, 7, null);
        d dVar = new d();
        dVar.put("seller", RatingElement.class);
        dVar.put("model", ModelRatingElement.class);
        dVar.put("buyer", BuyerReviewEntry.class);
        this.mapping = dVar.b();
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public Map<String, Type> getMapping() {
        return this.mapping;
    }
}
