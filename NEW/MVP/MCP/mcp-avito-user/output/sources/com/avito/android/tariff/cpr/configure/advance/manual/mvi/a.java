package com.avito.android.tariff.cpr.configure.advance.manual.mvi;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction;
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
@DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.mvi.CprConfigureAdvanceManualActor$process$$inlined$transform$1", f = "CprConfigureAdvanceManualActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class a extends SuspendLambda implements p<InterfaceC43172j<? super CprConfigureAdvanceManualInternalAction.HandleDeeplink>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295395q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f295396r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f295397s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.mvi.a$a, reason: collision with other inner class name */
    public static final class C8984a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CprConfigureAdvanceManualInternalAction.HandleDeeplink> f295398b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.manual.mvi.CprConfigureAdvanceManualActor$process$$inlined$transform$1$1", f = "CprConfigureAdvanceManualActor.kt", i = {}, l = {220}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.tariff.cpr.configure.advance.manual.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C8985a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f295399q;

            /* renamed from: r, reason: collision with root package name */
            public int f295400r;

            public C8985a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f295399q = obj;
                this.f295400r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C8984a.this.emit(null, this);
            }
        }

        public C8984a(InterfaceC43172j interfaceC43172j) {
            this.f295398b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.tariff.cpr.configure.advance.manual.mvi.a.C8984a.C8985a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.tariff.cpr.configure.advance.manual.mvi.a$a$a r0 = (com.avito.android.tariff.cpr.configure.advance.manual.mvi.a.C8984a.C8985a) r0
                int r1 = r0.f295400r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f295400r = r1
                goto L18
            L13:
                com.avito.android.tariff.cpr.configure.advance.manual.mvi.a$a$a r0 = new com.avito.android.tariff.cpr.configure.advance.manual.mvi.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f295399q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f295400r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L4b
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                kotlin.Q r5 = (kotlin.Q) r5
                A r5 = r5.f406619b
                com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction$HandleDeeplink r6 = new com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction$HandleDeeplink
                r2 = 0
                r6.<init>(r5, r2)
                r0.f295400r = r3
                kotlinx.coroutines.flow.j<com.avito.android.tariff.cpr.configure.advance.manual.mvi.entity.CprConfigureAdvanceManualInternalAction$HandleDeeplink> r5 = r4.f295398b
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L4b
                return r1
            L4b:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpr.configure.advance.manual.mvi.a.C8984a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f295397s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f295397s, continuation);
        aVar.f295396r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CprConfigureAdvanceManualInternalAction.HandleDeeplink> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295395q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C8984a c8984a = new C8984a((InterfaceC43172j) this.f295396r);
            this.f295395q = 1;
            if (this.f295397s.collect(c8984a, this) == coroutine_suspended) {
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
