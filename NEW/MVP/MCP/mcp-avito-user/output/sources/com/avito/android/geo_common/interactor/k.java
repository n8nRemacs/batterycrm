package com.avito.android.geo_common.interactor;

import com.avito.android.geo_common.model.AddressListResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mF.InterfaceC43955a;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/geo_common/model/AddressListResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.geo_common.interactor.LocationInteractorImpl$getAddressListV2$1", f = "LocationInteractor.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class k extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<AddressListResult>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159352q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f159353r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f159354s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(y yVar, String str, Continuation<? super k> continuation) {
        super(1, continuation);
        this.f159353r = yVar;
        this.f159354s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new k(this.f159353r, this.f159354s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TypedResult<AddressListResult>> continuation) {
        return ((k) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159352q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43955a interfaceC43955aB = this.f159353r.b();
            this.f159352q = 1;
            obj = interfaceC43955aB.r(this.f159354s, this);
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
