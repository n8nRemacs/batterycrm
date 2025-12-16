package com.avito.android.brandspace.beduin_v2;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.remote.model.BrandspaceAdjustParameters;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: BrandspaceBeduinV2ViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2ViewModel$handleAnalyticsDeeplinks$1", f = "BrandspaceBeduinV2ViewModel.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f107558q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f107559r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f107559r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f107559r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f107558q;
        b bVar = this.f107559r;
        if (i12 == 0) {
            C42729a0.b(obj);
            Brandspace.BeduinV2 beduinV2 = bVar.f107527R;
            if (beduinV2 == null) {
                beduinV2 = null;
            }
            b.le(bVar, beduinV2.getOnLoadedDeeplinks());
            BrandspaceAdjustParameters brandspaceAdjustParameters = bVar.f107526Q;
            if (brandspaceAdjustParameters == null) {
                brandspaceAdjustParameters = null;
            }
            Duration durationOf = Duration.of(brandspaceAdjustParameters.getVisitDuration(), ChronoUnit.SECONDS);
            this.f107558q = 1;
            Object objB = C43131e0.b(durationOf.compareTo(Duration.ZERO) <= 0 ? 0L : durationOf.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (durationOf.getSeconds() < 9223372036854775L || (durationOf.getSeconds() == 9223372036854775L && durationOf.getNano() < 807000000)) ? durationOf.toMillis() : Long.MAX_VALUE, this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = G0.f406611a;
            }
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Brandspace.BeduinV2 beduinV22 = bVar.f107527R;
        b.le(bVar, (beduinV22 != null ? beduinV22 : null).getOnVisitedDeeplinks());
        return G0.f406611a;
    }
}
