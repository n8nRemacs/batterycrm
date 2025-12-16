package com.avito.android.remote;

import com.avito.android.remote.model.DealConfirmationFeedbackResult;
import com.avito.android.remote.model.DealConfirmationSheetInfoResult;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;

/* compiled from: DealConfirmationApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ9\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/y;", "", "", "itemId", SearchParamsConverterKt.SOURCE, "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/DealConfirmationSheetInfoResult;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "action", "Lcom/avito/android/remote/model/DealConfirmationFeedbackResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_deal-confirmation"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.y, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34398y {
    @J81.o("1/dealConfirmation/feedback")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<DealConfirmationFeedbackResult>> a(@J81.c("action") @Y61.k String action, @J81.c("itemId") @Y61.k String itemId, @J81.c(SearchParamsConverterKt.SOURCE) @Y61.k String source);

    @J81.o("1/dealConfirmation/show")
    @J81.e
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<DealConfirmationSheetInfoResult>> b(@J81.c("itemId") @Y61.k String itemId, @J81.c(SearchParamsConverterKt.SOURCE) @Y61.k String source);
}
