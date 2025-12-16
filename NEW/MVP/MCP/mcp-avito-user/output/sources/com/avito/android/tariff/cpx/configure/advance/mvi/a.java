package com.avito.android.tariff.cpx.configure.advance.mvi;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance.mvi.CpxConfigureAdvanceActor$process$$inlined$transform$1", f = "CpxConfigureAdvanceActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements p<InterfaceC43172j<? super CpxConfigureAdvanceInternalAction.HandleDeepLink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295733q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f295734r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f295735s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff.cpx.configure.advance.mvi.a$a, reason: collision with other inner class name */
    public static final class C8996a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CpxConfigureAdvanceInternalAction.HandleDeepLink> f295736b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.tariff.cpx.configure.advance.mvi.CpxConfigureAdvanceActor$process$$inlined$transform$1$1", f = "CpxConfigureAdvanceActor.kt", i = {}, l = {220}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.tariff.cpx.configure.advance.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C8997a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f295737q;

            /* renamed from: r, reason: collision with root package name */
            public int f295738r;

            public C8997a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f295737q = obj;
                this.f295738r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C8996a.this.emit(null, this);
            }
        }

        public C8996a(InterfaceC43172j interfaceC43172j) {
            this.f295736b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.tariff.cpx.configure.advance.mvi.a.C8996a.C8997a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.tariff.cpx.configure.advance.mvi.a$a$a r0 = (com.avito.android.tariff.cpx.configure.advance.mvi.a.C8996a.C8997a) r0
                int r1 = r0.f295738r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f295738r = r1
                goto L18
            L13:
                com.avito.android.tariff.cpx.configure.advance.mvi.a$a$a r0 = new com.avito.android.tariff.cpx.configure.advance.mvi.a$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f295737q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f295738r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L4c
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                kotlin.Q r6 = (kotlin.Q) r6
                A r6 = r6.f406619b
                com.avito.android.deep_linking.links.DeepLink r6 = (com.avito.android.deep_linking.links.DeepLink) r6
                com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction$HandleDeepLink r7 = new com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction$HandleDeepLink
                r2 = 2
                r4 = 0
                r7.<init>(r6, r4, r2, r4)
                r0.f295738r = r3
                kotlinx.coroutines.flow.j<com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction$HandleDeepLink> r6 = r5.f295736b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L4c
                return r1
            L4c:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpx.configure.advance.mvi.a.C8996a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f295735s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f295735s, continuation);
        aVar.f295734r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CpxConfigureAdvanceInternalAction.HandleDeepLink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295733q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C8996a c8996a = new C8996a((InterfaceC43172j) this.f295734r);
            this.f295733q = 1;
            if (this.f295735s.collect(c8996a, this) == coroutine_suspended) {
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
