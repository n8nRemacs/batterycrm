package com.avito.android.geo_common.interactor;

import com.avito.android.geo_common.model.AddressListResult;
import com.avito.android.remote.model.TypedResult;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LocationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/geo_common/interactor/t"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.geo_common.interactor.LocationInteractorImpl$observableFlow$1", f = "LocationInteractor.kt", i = {}, l = {JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST0}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
public final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<AddressListResult>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159349q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f159350r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l f159351s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Y41.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f159351s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f159351s, continuation);
        jVar.f159350r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<AddressListResult>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159349q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f159350r;
            this.f159350r = interfaceC43172j;
            this.f159349q = 1;
            obj = ((k) this.f159351s).invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f159350r;
            C42729a0.b(obj);
        }
        this.f159350r = null;
        this.f159349q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
