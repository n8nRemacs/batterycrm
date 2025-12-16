package com.avito.android.bx_beduin_native_items.info;

import Gk.InterfaceC13891a;
import Gk.InterfaceC13892b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.bx_beduin_native_items.info.ContinuousTrackInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: ContinuousTrackInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bx_beduin_native_items.info.ContinuousTrackInfo$startTracking$1", f = "ContinuousTrackInfo.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f108841q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13892b f108842r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContinuousTrackInfo f108843s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC13892b interfaceC13892b, ContinuousTrackInfo continuousTrackInfo, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f108842r = interfaceC13892b;
        this.f108843s = continuousTrackInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f108842r, this.f108843s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        InterfaceC13891a interfaceC13891a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f108841q;
        if (i12 == 0) {
            C42729a0.b(obj);
            long jH2 = this.f108842r.h();
            this.f108841q = 1;
            if (C43131e0.b(jH2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        ContinuousTrackInfo continuousTrackInfo = this.f108843s;
        ContinuousTrackInfo.b bVar = continuousTrackInfo.f108825d;
        if (bVar != null && (interfaceC13891a = continuousTrackInfo.f108824c) != null) {
            interfaceC13891a.c(bVar.f108828c, bVar.f108827b);
        }
        return G0.f406611a;
    }
}
