package com.avito.android.phone_confirmation;

import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ConsultationPhoneConfirmationResult;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import s70.InterfaceC48008b;

/* compiled from: PhoneConfirmationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_confirmation/b;", "Lcom/avito/android/phone_confirmation/a;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.phone_confirmation.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33146b extends AbstractC33145a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f215897d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f215898e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48008b f215899f;

    /* compiled from: PhoneConfirmationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/SuccessResult;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.phone_confirmation.b$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f215900b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return io.reactivex.rxjava3.core.z.M(new UnknownError(((TypedResult.Error) typedResult).getError().getF244063c()));
                }
                throw new NoWhenBranchMatchedException();
            }
            ConsultationPhoneConfirmationResult consultationPhoneConfirmationResult = (ConsultationPhoneConfirmationResult) ((TypedResult.Success) typedResult).getResult();
            if (consultationPhoneConfirmationResult instanceof ConsultationPhoneConfirmationResult.Ok) {
                return io.reactivex.rxjava3.core.z.c0(new SuccessResult(null, 1, null));
            }
            if (consultationPhoneConfirmationResult instanceof ConsultationPhoneConfirmationResult.Failure) {
                return io.reactivex.rxjava3.core.z.M(C35936s.a(new ApiError.Failure(((ConsultationPhoneConfirmationResult.Failure) consultationPhoneConfirmationResult).getMessage()), null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public C33146b(@Y61.k com.avito.android.remote.r rVar, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC48008b interfaceC48008b, @Y61.k PhoneConfirmationScreenState phoneConfirmationScreenState, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        super(fVar, interfaceC48008b, phoneConfirmationScreenState, interfaceC35945t1);
        this.f215897d = rVar;
        this.f215898e = fVar;
        this.f215899f = interfaceC48008b;
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O b(@Y61.k String str, boolean z12) {
        return this.f215897d.l(str).T(C33147c.f215902b, Integer.MAX_VALUE).d0(new C33148d(this, str)).K(new C33149e(this));
    }

    @Override // com.avito.android.phone_confirmation.AbstractC33145a, com.avito.android.phone_confirmation.U
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final com.avito.android.server_time.f getF215898e() {
        return this.f215898e;
    }

    @Override // com.avito.android.phone_confirmation.U
    @Y61.k
    public final io.reactivex.rxjava3.core.z<SuccessResult> d(@Y61.k String str, @Y61.k String str2, boolean z12) {
        return this.f215897d.j(str, str2).T(a.f215900b, Integer.MAX_VALUE);
    }
}
