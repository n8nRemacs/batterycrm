package com.avito.android.publish;

import com.avito.android.remote.model.AIDescription;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AutoDescriptionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33513a {
    @Y61.l
    Object f(@Y61.l CategoryParameters categoryParameters, long j12, @Y61.k Continuation<? super TypedResult<String>> continuation);

    @Y61.k
    io.reactivex.rxjava3.core.I<AIDescription> i(@Y61.l CategoryParameters categoryParameters, @Y61.l String str, @Y61.l String str2);
}
