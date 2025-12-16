package com.avito.android.advert;

import com.avito.android.advert.item.AdvertDetailsFastOpenParams;
import com.avito.android.advert.item.commercials.PositionedBannerContainer;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.remote.model.TypedResult;
import da.C39687a;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/i;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC27797i {

    /* compiled from: AdvertDetailsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.i$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<List<PositionedBannerContainer>> a();

    @Y61.l
    Object b(long j12, @Y61.k Continuation<? super TypedResult<C39687a>> continuation);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C c(@Y61.k String str, @Y61.k CvStateType cvStateType);

    @Y61.l
    Object d(@Y61.k Continuation<? super TypedResult<FP.a>> continuation);

    @Y61.k
    C41982q1 e(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, @Y61.l Map map, @Y61.l AdvertDetailsFastOpenParams.FromSpace fromSpace, @Y61.l String str4, @Y61.l Integer num2);
}
