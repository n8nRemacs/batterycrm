package com.avito.android.extended_profile_adverts;

import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;
import pA.b;

/* compiled from: ProfileAdvertsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LpA/b$d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_adverts.ProfileAdvertsInteractorImpl$updateItems$1", f = "ProfileAdvertsInteractor.kt", i = {0}, l = {121, 122}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super b.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150866q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150867r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f150868s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f150869t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, List<? extends SerpElement> list, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f150868s = fVar;
        this.f150869t = list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f150868s, this.f150869t, continuation);
        gVar.f150867r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super b.d> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150866q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f150867r;
            f fVar = this.f150868s;
            fVar.f150845d.f();
            SerpDisplayType serpDisplayType = SerpDisplayType.Grid;
            C41982q1 c41982q1A = fVar.f150843b.a(this.f150869t, fVar.f150844c, serpDisplayType);
            this.f150867r = interfaceC43172j;
            this.f150866q = 1;
            obj = C43292o.c(c41982q1A, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f150867r;
            C42729a0.b(obj);
        }
        b.d dVar = new b.d((List) obj);
        this.f150867r = null;
        this.f150866q = 2;
        if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
