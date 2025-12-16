package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Ld91/i;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ru.avito.messenger.MessengerClientFacadeImpl$history$forceAlternativeImpl$1$3", f = "MessengerClientFacade.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class M extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<d91.i>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D f430673q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f430674r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Integer f430675s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(D d12, String str, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f430673q = d12;
        this.f430674r = str;
        this.f430675s = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new M(this.f430673q, this.f430674r, this.f430675s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<d91.i>> continuation) {
        M m12 = (M) create(t12, continuation);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        m12.invokeSuspend(g02);
        return g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f430673q.f430604b.get();
        Boxing.boxLong(this.f430675s.intValue());
        throw null;
    }
}
