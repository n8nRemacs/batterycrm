package com.avito.android.libs.saved_searches.domain;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.saved_searches.model.SubscriptionResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SearchSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/domain/a;", "", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: SearchSubscriptionInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.libs.saved_searches.domain.a$a, reason: collision with other inner class name */
    public static final class C5332a {
    }

    @Y61.l
    Object a(@Y61.k SearchParams searchParams, @Y61.l Area area, @Y61.l String str, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.k Map map, boolean z12, @Y61.l Boolean bool, @Y61.k Continuation continuation);

    @Y61.l
    Object b(@Y61.k SavedSearchParams savedSearchParams, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object c(@Y61.k String str, @Y61.k Continuation<? super TypedResult<SubscriptionResult>> continuation);
}
