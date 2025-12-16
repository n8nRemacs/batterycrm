package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import com.avito.android.messenger.conversation.mvi.deeplinks.review.b;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: RequestReviewInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/messenger/RequestReviewResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f190652b;

    public c(d dVar) {
        this.f190652b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Success;
        d dVar = this.f190652b;
        if (z12) {
            dVar.f190654b.accept(b.a.c.f190651a);
        } else if (typedResult instanceof TypedResult.Error) {
            dVar.f190654b.accept(b.a.C5639b.f190650a);
        }
    }
}
