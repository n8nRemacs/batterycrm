package com.avito.android.remote;

import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;

/* compiled from: UserAdvertsCommonApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/q1;", "", "", "categoryId", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito-discouraged_avito-api_user-adverts-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes17.dex */
public interface q1 {
    @J81.f("1/profile/item/safety")
    @Y61.k
    io.reactivex.rxjava3.core.I<TypedResult<DetailsSheetLinkBody>> a(@J81.t("categoryId") @Y61.k String categoryId);
}
