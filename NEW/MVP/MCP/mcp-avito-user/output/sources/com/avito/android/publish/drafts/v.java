package com.avito.android.publish.drafts;

import com.avito.android.remote.model.SaveDraftResponse;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishDraftRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SaveDraftResponse;", "it", "Lio/reactivex/rxjava3/core/w;", "Lcom/avito/android/publish/drafts/I;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f235412b;

    public v(x xVar) {
        this.f235412b = xVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        I i12;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            this.f235412b.f235420e.a();
            return C41928w.f403335b;
        }
        SaveDraftResponse saveDraftResponse = (SaveDraftResponse) ((TypedResult.Success) typedResult).getResult();
        if (saveDraftResponse instanceof SaveDraftResponse.Ok) {
            SaveDraftResponse.Ok ok2 = (SaveDraftResponse.Ok) saveDraftResponse;
            i12 = new I(ok2.getDraft().getId(), ok2.getMessage(), null, 4, null);
        } else if (saveDraftResponse instanceof SaveDraftResponse.Conflict) {
            i12 = new I(null, null, ((SaveDraftResponse.Conflict) saveDraftResponse).getDialogInfo(), 3, null);
        } else {
            if (!(saveDraftResponse instanceof SaveDraftResponse.Skipped)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = new I(null, null, null, 7, null);
        }
        return io.reactivex.rxjava3.core.q.i(i12);
    }
}
