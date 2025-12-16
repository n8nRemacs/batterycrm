package com.avito.android.bxcontent.mvi;

import com.avito.android.remote.model.Location;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "location", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/Location;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getLocation$1", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class W extends SuspendLambda implements Y41.p<Location, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111493q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f111494r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(F f12, Continuation<? super W> continuation) {
        super(2, continuation);
        this.f111494r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        W w12 = new W(this.f111494r, continuation);
        w12.f111493q = obj;
        return w12;
    }

    @Override // Y41.p
    public final Object invoke(Location location, Continuation<? super kotlin.G0> continuation) {
        return ((W) create(location, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f111494r.f111300v.b(((Location) this.f111493q).getId());
        return kotlin.G0.f406611a;
    }
}
