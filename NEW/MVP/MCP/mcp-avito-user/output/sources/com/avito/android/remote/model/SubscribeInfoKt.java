package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SubscribeResult;
import com.avito.android.remote.model.UnsubscribeResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SubscribeInfo.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006¨\u0006\u0007"}, d2 = {"toProfileCounter", "Lcom/avito/android/remote/model/ProfileCounter;", "Lcom/avito/android/remote/model/FavoriteSellerCounter;", "toSubscribeInfo", "Lcom/avito/android/remote/model/SubscribeInfo;", "Lcom/avito/android/remote/model/SubscribeResult;", "Lcom/avito/android/remote/model/UnsubscribeResult;", "_avito-discouraged_avito-api_tns-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SubscribeInfoKt {
    private static final ProfileCounter toProfileCounter(FavoriteSellerCounter favoriteSellerCounter) {
        return new ProfileCounter(favoriteSellerCounter.getTitle(), favoriteSellerCounter.getSubtitle(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final SubscribeInfo toSubscribeInfo(@k SubscribeResult subscribeResult) throws ApiException {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (subscribeResult instanceof SubscribeResult.SubscribeSuccess) {
            Boolean bool = Boolean.TRUE;
            SubscribeResult.SubscribeSuccess subscribeSuccess = (SubscribeResult.SubscribeSuccess) subscribeResult;
            Boolean isNotificationsActivated = subscribeSuccess.getIsNotificationsActivated();
            FavoriteSellerCounter subscribers = subscribeSuccess.getSubscribers();
            ProfileCounter profileCounter = subscribers != null ? toProfileCounter(subscribers) : null;
            FavoriteSellerCounter subscriptions = subscribeSuccess.getSubscriptions();
            return new SubscribeInfo(bool, isNotificationsActivated, profileCounter, subscriptions != null ? toProfileCounter(subscriptions) : null);
        }
        int i12 = 2;
        if (subscribeResult instanceof SubscribeResult.SubscribeErrorDialog) {
            throw new ApiException(new ApiError.ErrorDialog(((SubscribeResult.SubscribeErrorDialog) subscribeResult).getUserDialog()), objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
        }
        if (!(subscribeResult instanceof SubscribeResult.SubscribeErrorAction)) {
            throw new NoWhenBranchMatchedException();
        }
        SubscribeResult.SubscribeErrorAction subscribeErrorAction = (SubscribeResult.SubscribeErrorAction) subscribeResult;
        DeepLink action = subscribeErrorAction.getAction();
        String message = subscribeErrorAction.getMessage();
        if (message == null) {
            message = "";
        }
        throw new ApiException(new ApiError.ErrorAction(action, message), objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final SubscribeInfo toSubscribeInfo(@k UnsubscribeResult unsubscribeResult) throws ApiException {
        Throwable th2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (unsubscribeResult instanceof UnsubscribeResult.UnsubscribeSuccess) {
            Boolean bool = Boolean.FALSE;
            UnsubscribeResult.UnsubscribeSuccess unsubscribeSuccess = (UnsubscribeResult.UnsubscribeSuccess) unsubscribeResult;
            FavoriteSellerCounter subscribers = unsubscribeSuccess.getSubscribers();
            ProfileCounter profileCounter = subscribers != null ? toProfileCounter(subscribers) : null;
            FavoriteSellerCounter subscriptions = unsubscribeSuccess.getSubscriptions();
            return new SubscribeInfo(bool, null, profileCounter, subscriptions != null ? toProfileCounter(subscriptions) : null);
        }
        int i12 = 2;
        if (!(unsubscribeResult instanceof UnsubscribeResult.UnsubscribeErrorDialog)) {
            if (!(unsubscribeResult instanceof UnsubscribeResult.UnsubscribeErrorAction)) {
                throw new NoWhenBranchMatchedException();
            }
            UnsubscribeResult.UnsubscribeErrorAction unsubscribeErrorAction = (UnsubscribeResult.UnsubscribeErrorAction) unsubscribeResult;
            DeepLink action = unsubscribeErrorAction.getAction();
            String message = unsubscribeErrorAction.getMessage();
            if (message == null) {
                message = "";
            }
            throw new ApiException(new ApiError.ErrorAction(action, message), th2, i12, objArr3 == true ? 1 : 0);
        }
        throw new ApiException(new ApiError.ErrorDialog(((UnsubscribeResult.UnsubscribeErrorDialog) unsubscribeResult).getUserDialog()), objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
    }
}
