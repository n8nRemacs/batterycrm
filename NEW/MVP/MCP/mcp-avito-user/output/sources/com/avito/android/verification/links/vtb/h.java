package com.avito.android.verification.links.vtb;

import Y41.p;
import Y61.l;
import com.avito.android.remote.A1;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.common.VerificationRedirectResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35936s;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: VerificationVTBLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/common/VerificationRedirectResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/common/VerificationRedirectResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.links.vtb.VerificationVTBLinkInteractor$vtbFinish$2", f = "VerificationVTBLinkInteractor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super VerificationRedirectResult>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f324733q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f324734r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f324735s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f324734r = gVar;
        this.f324735s = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f324734r, this.f324735s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super VerificationRedirectResult> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) throws ApiException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f324733q;
        if (i12 == 0) {
            C42729a0.b(obj);
            A1 a12 = this.f324734r.f324730a;
            this.f324733q = 1;
            obj = a12.i(this.f324735s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return (VerificationRedirectResult) ((TypedResult.Success) typedResult).getResult();
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        throw C35936s.a(error.getError(), error.getCause());
    }
}
