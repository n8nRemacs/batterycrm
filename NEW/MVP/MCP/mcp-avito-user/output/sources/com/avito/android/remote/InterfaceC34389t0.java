package com.avito.android.remote;

import com.avito.android.remote.model.OnboardingResult;
import com.avito.android.remote.model.OnboardingStepsResult;
import com.avito.android.remote.model.SearchDeepLinkResult;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: OnboardingApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/t0;", "", "", "label", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/OnboardingStepsResult;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", SearchParamsConverterKt.LOCATION_ID, "context", "Lcom/avito/android/remote/model/OnboardingResult;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selected", "Lcom/avito/android/remote/model/SearchDeepLinkResult;", "c", "_avito-discouraged_avito-api_onboarding"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: com.avito.android.remote.t0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public interface InterfaceC34389t0 {
    @J81.k({"X-Geo-required: true"})
    @J81.f("1/onboarding/close")
    @Y61.l
    Object a(@Y61.l @J81.t("id") String str, @Y61.l @J81.t("context") String str2, @Y61.k Continuation<? super TypedResult<kotlin.G0>> continuation);

    @J81.k({"X-Geo-required: true"})
    @J81.f("1/onboarding")
    @Y61.l
    Object b(@Y61.l @J81.t("id") String str, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str2, @Y61.l @J81.t("context") String str3, @Y61.k Continuation<? super TypedResult<OnboardingResult>> continuation);

    @J81.k({"X-Geo-required: true"})
    @J81.f("1/onboarding/search")
    @Y61.l
    Object c(@Y61.l @J81.t("id") String str, @Y61.l @J81.t("selected") String str2, @Y61.l @J81.t(SearchParamsConverterKt.LOCATION_ID) String str3, @Y61.k Continuation<? super TypedResult<SearchDeepLinkResult>> continuation);

    @J81.f("1/informing/{label}")
    @Y61.l
    Object d(@J81.s("label") @Y61.k String str, @Y61.k Continuation<? super TypedResult<OnboardingStepsResult>> continuation);
}
