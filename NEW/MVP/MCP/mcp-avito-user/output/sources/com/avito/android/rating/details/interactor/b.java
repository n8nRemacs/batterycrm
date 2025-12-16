package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import android.net.Uri;
import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.util.A4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;

/* compiled from: RatingDetailsDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/interactor/b;", "Lcom/avito/android/rating/details/interactor/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14487a f247023a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RatingDetailsArguments.PublicProfileRating f247024b;

    public b(@Y61.k InterfaceC14487a interfaceC14487a, @Y61.k RatingDetailsArguments.PublicProfileRating publicProfileRating) {
        this.f247023a = interfaceC14487a;
        this.f247024b = publicProfileRating;
    }

    @Override // com.avito.android.rating.details.interactor.c
    @Y61.l
    public final Object a(@Y61.k Map<String, String> map, @Y61.l List<String> list, @Y61.k Continuation<? super TypedResult<RatingDetailsResult>> continuation) {
        Map<String, String> mapC;
        RatingDetailsArguments.PublicProfileRating publicProfileRating = this.f247024b;
        String str = publicProfileRating.f246415f;
        if (list != null) {
            A4.f318516a.getClass();
            mapC = A4.h(list, "requiredFilters");
        } else {
            mapC = P0.c();
        }
        return this.f247023a.k(str, publicProfileRating.f246413d, publicProfileRating.f246416g, publicProfileRating.f246417h, map, mapC, continuation);
    }

    @Override // com.avito.android.rating.details.interactor.c
    @Y61.l
    public final Object b(@Y61.k Uri uri, @Y61.k Continuation<? super TypedResult<RatingDetailsResult>> continuation) {
        return this.f247023a.q(uri.toString(), continuation);
    }
}
