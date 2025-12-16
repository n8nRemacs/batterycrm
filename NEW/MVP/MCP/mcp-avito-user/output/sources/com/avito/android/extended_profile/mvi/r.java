package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$searchActiveAdverts$1", f = "ExtendedProfileActor.kt", i = {0, 0}, l = {849, 850}, m = "invokeSuspend", n = {"$this$flow", "newSearchState"}, s = {"L$0", "L$1"})
/* loaded from: classes13.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public a.C4397a f150369q;

    /* renamed from: r, reason: collision with root package name */
    public int f150370r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f150371s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.C4397a f150372t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C30451a f150373u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f150374v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a.C4397a c4397a, C30451a c30451a, boolean z12, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f150372t = c4397a;
        this.f150373u = c30451a;
        this.f150374v = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f150372t, this.f150373u, this.f150374v, continuation);
        rVar.f150371s = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        a.C4397a c4397a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150370r;
        C30451a c30451a = this.f150373u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f150371s;
            a.C4397a c4397aA = a.C4397a.a(this.f150372t, false, false, null, null, null, null, null, false, null, null, null, C42784z0.f406748b, 977919);
            C43152f0 c43152f0C = c30451a.f150072f.c(c4397aA, this.f150374v);
            this.f150371s = interfaceC43172j2;
            this.f150369q = c4397aA;
            this.f150370r = 1;
            if (C43175k.u(this, c43152f0C, interfaceC43172j2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
            c4397a = c4397aA;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            c4397a = this.f150369q;
            interfaceC43172j = (InterfaceC43172j) this.f150371s;
            C42729a0.b(obj);
        }
        C43152f0 c43152f0A = c30451a.f150072f.a(c4397a);
        this.f150371s = null;
        this.f150369q = null;
        this.f150370r = 2;
        if (C43175k.u(this, c43152f0A, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
