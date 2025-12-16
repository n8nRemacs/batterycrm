package com.avito.android.recall_me.domain;

import com.avito.android.recall_me.domain.h;
import com.avito.android.remote.RecallMeError;
import com.avito.android.remote.SaveResponse;
import kotlin.Metadata;

/* compiled from: RecallMeInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/SaveResponse;", "saveResponse", "Lcom/avito/android/recall_me/domain/h$b;", "apply", "(Lcom/avito/android/remote/SaveResponse;)Lcom/avito/android/recall_me/domain/h$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f251853b;

    public k(h hVar) {
        this.f251853b = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String message;
        SaveResponse saveResponse = (SaveResponse) obj;
        boolean success = saveResponse.getSuccess();
        h hVar = this.f251853b;
        if (success) {
            return new h.b.d(hVar.f251839c.f252015i, saveResponse.getRequestId());
        }
        RecallMeError error = saveResponse.getError();
        if (error == null || (message = error.getMessage()) == null) {
            message = hVar.f251839c.f252014h;
        }
        return new h.b.C7557b(message);
    }
}
