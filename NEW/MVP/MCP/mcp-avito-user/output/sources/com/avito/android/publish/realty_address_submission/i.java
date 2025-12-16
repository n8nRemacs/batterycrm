package com.avito.android.publish.realty_address_submission;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: RealtyAddressSubmissionViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;", "response", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Ok;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class i<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f239061b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return (RealtyAddressSubmissionResult) ((TypedResult.Success) typedResult).getResult();
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        return error.getError() instanceof ApiError.NetworkIOError ? RealtyAddressSubmissionResult.NetworkError.INSTANCE : new RealtyAddressSubmissionResult.Error(error.getError().getF244063c());
    }
}
