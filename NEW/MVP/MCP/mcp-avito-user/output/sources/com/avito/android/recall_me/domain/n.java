package com.avito.android.recall_me.domain;

import com.avito.android.remote.ConfirmPhoneResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: RecallMeV2Interactor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/n;", "", "_avito_recall-me_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface n {

    /* compiled from: RecallMeV2Interactor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    String a();

    @Y61.l
    Object b(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object c(@Y61.k String str, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<ConfirmPhoneResponse>> continuation);

    @Y61.l
    Object d(@Y61.k String str, @Y61.l String str2, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object e(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object f(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k ContinuationImpl continuationImpl);
}
