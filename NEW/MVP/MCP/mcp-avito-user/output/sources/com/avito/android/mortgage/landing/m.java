package com.avito.android.mortgage.landing;

import android.app.Activity;
import com.avito.android.util.C35835l0;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.D;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: LandingView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.LandingViewImpl$keyboardFlow$1", f = "LandingView.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class m extends SuspendLambda implements Y41.p<I0<? super Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200057q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200058r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f200059s;

    /* compiled from: LandingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H2 f200060l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H2 h22) {
            super(0);
            this.f200060l = h22;
        }

        @Override // Y41.a
        public final G0 invoke() {
            H2 h22 = this.f200060l;
            if (h22 != null) {
                h22.dispose();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LandingView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<Boolean> f200061l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super Boolean> i02) {
            super(1);
            this.f200061l = i02;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            D.c(this.f200061l, bool2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f200059s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f200059s, continuation);
        mVar.f200058r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super Boolean> i02, Continuation<? super G0> continuation) {
        return ((m) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200057q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f200058r;
            Activity activityA = C35835l0.a(this.f200059s.f200303d);
            a aVar = new a(activityA != null ? K2.a(activityA, new b(i02)) : null);
            this.f200057q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
