package com.avito.android.rating_form.interactor;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e2;

/* compiled from: RatingFormInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/interactor/i;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface i {

    /* compiled from: RatingFormInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    e2 F();

    @Y61.l
    Object a(int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k Map map, @Y61.k List list, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object b(@Y61.k List list, @Y61.l Integer num, @Y61.l StepIdentifier stepIdentifier, @Y61.k LinkedHashMap linkedHashMap, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object c(int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k FieldIdentifier fieldIdentifier, @Y61.l RatingFormField.ValueType valueType, boolean z12, @Y61.k LinkedHashMap linkedHashMap, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object d(@Y61.k Continuation<? super G0> continuation);

    @Y61.l
    Object e(boolean z12, @Y61.k SuspendLambda suspendLambda);

    @Y61.l
    Object f(int i12, @Y61.k StepIdentifier stepIdentifier, @Y61.k String str, @Y61.k Continuation<? super G0> continuation);
}
