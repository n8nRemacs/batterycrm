package com.avito.avcalls.android.call;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import xQ0.f;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$terminate$2", f = "CallSession.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331622q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f331623r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ xQ0.f f331624s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331625t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ xQ0.k f331626u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z12, xQ0.f fVar, AbstractC36187o abstractC36187o, xQ0.k kVar, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f331623r = z12;
        this.f331624s = fVar;
        this.f331625t = abstractC36187o;
        this.f331626u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t(this.f331623r, this.f331624s, this.f331625t, this.f331626u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331622q;
        AbstractC36187o abstractC36187o = this.f331625t;
        boolean z12 = this.f331623r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (z12) {
                if (kotlin.jvm.internal.L.g(this.f331624s.f442479a, f.c.f442482b.f442479a) > 0) {
                    x xVar = abstractC36187o.f331581d;
                    String str = abstractC36187o.c().f442469b;
                    String str2 = abstractC36187o.c().f442473f.f442492a;
                    this.f331622q = 1;
                    xQ0.k kVar = this.f331626u;
                    String str3 = abstractC36187o.f331578a;
                    xVar.f331638d.b();
                    if (xVar.f331637c.j(str3, str, str2, kVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        abstractC36187o.f(new f.e(this.f331626u, z12));
        U.b(abstractC36187o.f331580c, null);
        return G0.f406611a;
    }
}
