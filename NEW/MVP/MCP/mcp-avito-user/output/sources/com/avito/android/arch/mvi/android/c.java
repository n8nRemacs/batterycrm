package com.avito.android.arch.mvi.android;

import Y41.p;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: ConfigurationEagerlyAndWhileSubscribed.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/arch/mvi/android/c;", "Lkotlinx/coroutines/flow/i2;", "_common_mvi-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements i2 {

    /* renamed from: b, reason: collision with root package name */
    public final long f91845b;

    /* renamed from: c, reason: collision with root package name */
    public final long f91846c;

    /* compiled from: ConfigurationEagerlyAndWhileSubscribed.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.EagerlyAndWhileSubscribed$command$1", f = "ConfigurationEagerlyAndWhileSubscribed.kt", i = {0}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SharingCommand>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91847q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f91848r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n2<Integer> f91850t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2<Integer> n2Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f91850t = n2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f91850t, continuation);
            aVar.f91848r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SharingCommand> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91847q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f91848r;
                SharingCommand sharingCommand = SharingCommand.f411255b;
                this.f91848r = interfaceC43172j;
                this.f91847q = 1;
                if (interfaceC43172j.emit(sharingCommand, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f91848r;
                C42729a0.b(obj);
            }
            i2.a aVar = i2.f411430a;
            c cVar = c.this;
            long j12 = cVar.f91845b;
            aVar.getClass();
            InterfaceC43160i<SharingCommand> interfaceC43160iA = i2.a.a(j12, cVar.f91846c).a(this.f91850t);
            this.f91848r = null;
            this.f91847q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    public c() {
        this(0L, 0L, 3, null);
    }

    @Override // kotlinx.coroutines.flow.i2
    @Y61.k
    public final InterfaceC43160i<SharingCommand> a(@Y61.k n2<Integer> n2Var) {
        return C43175k.G(new a(n2Var, null));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f91845b == cVar.f91845b && this.f91846c == cVar.f91846c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91846c) + (Long.hashCode(this.f91845b) * 31);
    }

    @Y61.k
    public final String toString() {
        return "EagerlyAndWhileSubscribed";
    }

    public c(long j12, long j13, int i12, C42822w c42822w) {
        j12 = (i12 & 1) != 0 ? 0L : j12;
        j13 = (i12 & 2) != 0 ? Long.MAX_VALUE : j13;
        this.f91845b = j12;
        this.f91846c = j13;
    }
}
