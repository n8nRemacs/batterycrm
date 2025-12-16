package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import i00.InterfaceC41203a;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import m00.C43854a;
import m00.C43855b;

/* compiled from: SelectBanksTabUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lm00/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.domain.SelectBanksTabUseCaseImpl$invoke$2", f = "SelectBanksTabUseCase.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class H extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C43854a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f202995q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I f202996r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f202997s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f202998t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i12, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f202996r = i12;
        this.f202997s = str;
        this.f202998t = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new H(this.f202996r, this.f202997s, this.f202998t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C43854a>> continuation) {
        return ((H) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f202995q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC41203a interfaceC41203a = this.f202996r.f202999a.get();
            C43855b c43855b = new C43855b(this.f202998t);
            this.f202995q = 1;
            obj = interfaceC41203a.b(this.f202997s, c43855b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
