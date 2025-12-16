package com.avito.android.phone_confirmation;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ConsultationPhoneConfirmationStatus;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneConfirmationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationStatus;", "it", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.phone_confirmation.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33147c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C33147c<T, R> f215902b = new C33147c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return io.reactivex.rxjava3.core.z.M(new UnknownError(""));
            }
            throw new NoWhenBranchMatchedException();
        }
        ConsultationPhoneConfirmationStatus consultationPhoneConfirmationStatus = (ConsultationPhoneConfirmationStatus) ((TypedResult.Success) typedResult).getResult();
        if (consultationPhoneConfirmationStatus instanceof ConsultationPhoneConfirmationStatus.Ok) {
            return io.reactivex.rxjava3.core.z.c0(Long.valueOf(((ConsultationPhoneConfirmationStatus.Ok) consultationPhoneConfirmationStatus).getTimer()));
        }
        if (consultationPhoneConfirmationStatus instanceof ConsultationPhoneConfirmationStatus.Failure) {
            return io.reactivex.rxjava3.core.z.M(C35936s.a(new ApiError.Failure(((ConsultationPhoneConfirmationStatus.Failure) consultationPhoneConfirmationStatus).getMessage()), null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
