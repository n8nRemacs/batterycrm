package com.avito.android.remote.model.rating_details;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ReviewActionsResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/rating_details/ReviewActionsResult;", "", "button", "Lcom/avito/android/remote/model/rating_details/ReviewActionsButton;", "(Lcom/avito/android/remote/model/rating_details/ReviewActionsButton;)V", "getButton", "()Lcom/avito/android/remote/model/rating_details/ReviewActionsButton;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReviewActionsResult {

    @c("button")
    @k
    private final ReviewActionsButton button;

    public ReviewActionsResult(@k ReviewActionsButton reviewActionsButton) {
        this.button = reviewActionsButton;
    }

    @k
    public final ReviewActionsButton getButton() {
        return this.button;
    }
}
