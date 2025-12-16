package com.avito.android.geo_common.interactor;

import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mF.InterfaceC43955a;
import uF.d;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuF/d$c;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.geo_common.interactor.LocationInteractorImpl$getAddressSuggestions$1", f = "LocationInteractor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class m extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<d.c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f159358q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f159359r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f159360s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Double f159361t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Double f159362u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Double f159363v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Double f159364w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f159365x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, String str, Double d12, Double d13, Double d14, Double d15, Map<String, String> map, Continuation<? super m> continuation) {
        super(1, continuation);
        this.f159359r = yVar;
        this.f159360s = str;
        this.f159361t = d12;
        this.f159362u = d13;
        this.f159363v = d14;
        this.f159364w = d15;
        this.f159365x = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new m(this.f159359r, this.f159360s, this.f159361t, this.f159362u, this.f159363v, this.f159364w, this.f159365x, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super TypedResult<d.c>> continuation) {
        return ((m) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f159358q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43955a interfaceC43955aB = this.f159359r.b();
            this.f159358q = 1;
            obj = interfaceC43955aB.w(this.f159360s, this.f159361t, this.f159362u, this.f159363v, this.f159364w, this.f159365x, this);
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
