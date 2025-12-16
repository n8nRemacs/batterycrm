package com.avito.android.mortgage.pre_approval.form.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.domain.NavigationInteractor$navigateNext$$inlined$transform$1", f = "NavigationInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class d extends SuspendLambda implements p<InterfaceC43172j<? super PreApprovalFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201888q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201889r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43210w f201890s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f201891t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ R00.b f201892u;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<PreApprovalFormInternalAction> f201893b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f201894c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ R00.b f201895d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.mortgage.pre_approval.form.mvi.domain.NavigationInteractor$navigateNext$$inlined$transform$1$1", f = "NavigationInteractor.kt", i = {0, 0, 0}, l = {219, 228}, m = "emit", n = {"this", "action", "$this$navigateNext_u24lambda_u241"}, s = {"L$0", "L$1", "L$2"})
        /* renamed from: com.avito.android.mortgage.pre_approval.form.mvi.domain.d$a$a, reason: collision with other inner class name */
        public static final class C5989a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f201896q;

            /* renamed from: r, reason: collision with root package name */
            public int f201897r;

            /* renamed from: t, reason: collision with root package name */
            public a f201899t;

            /* renamed from: u, reason: collision with root package name */
            public PreApprovalFormInternalAction f201900u;

            /* renamed from: v, reason: collision with root package name */
            public InterfaceC43172j f201901v;

            public C5989a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f201896q = obj;
                this.f201897r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, e eVar, R00.b bVar) {
            this.f201894c = eVar;
            this.f201895d = bVar;
            this.f201893b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.avito.android.mortgage.pre_approval.form.mvi.domain.d.a.C5989a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.mortgage.pre_approval.form.mvi.domain.d$a$a r0 = (com.avito.android.mortgage.pre_approval.form.mvi.domain.d.a.C5989a) r0
                int r1 = r0.f201897r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f201897r = r1
                goto L18
            L13:
                com.avito.android.mortgage.pre_approval.form.mvi.domain.d$a$a r0 = new com.avito.android.mortgage.pre_approval.form.mvi.domain.d$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f201896q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f201897r
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L3f
                if (r2 == r3) goto L35
                if (r2 != r4) goto L2d
                kotlin.C42729a0.b(r9)
                goto Lb5
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L35:
                kotlinx.coroutines.flow.j r8 = r0.f201901v
                com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction r2 = r0.f201900u
                com.avito.android.mortgage.pre_approval.form.mvi.domain.d$a r3 = r0.f201899t
                kotlin.C42729a0.b(r9)
                goto L57
            L3f:
                kotlin.C42729a0.b(r9)
                r2 = r8
                com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction r2 = (com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction) r2
                r0.f201899t = r7
                r0.f201900u = r2
                kotlinx.coroutines.flow.j<com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction> r8 = r7.f201893b
                r0.f201901v = r8
                r0.f201897r = r3
                java.lang.Object r9 = r8.emit(r2, r0)
                if (r9 != r1) goto L56
                return r1
            L56:
                r3 = r7
            L57:
                boolean r9 = r2 instanceof com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction.UpdateValidationResult
                r5 = 0
                if (r9 == 0) goto L5f
                com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction$UpdateValidationResult r2 = (com.avito.android.mortgage.pre_approval.form.mvi.entity.PreApprovalFormInternalAction.UpdateValidationResult) r2
                goto L60
            L5f:
                r2 = r5
            L60:
                if (r2 == 0) goto L65
                java.util.LinkedHashMap r9 = r2.f201936b
                goto L69
            L65:
                java.util.Map r9 = kotlin.collections.P0.c()
            L69:
                boolean r2 = r9.isEmpty()
                r6 = 0
                if (r2 == 0) goto L71
                goto L94
            L71:
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
            L79:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L94
                java.lang.Object r2 = r9.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r2 = r2.getValue()
                P00.a r2 = (P00.a) r2
                com.avito.android.printable_text.PrintableText r2 = r2.getF12771b()
                if (r2 == 0) goto L79
                int r6 = r6 + 1
                goto L79
            L94:
                if (r6 != 0) goto Lb5
                com.avito.android.mortgage.pre_approval.form.mvi.domain.e r9 = r3.f201894c
                r9.getClass()
                com.avito.android.mortgage.pre_approval.form.mvi.domain.c r2 = new com.avito.android.mortgage.pre_approval.form.mvi.domain.c
                R00.b r3 = r3.f201895d
                r2.<init>(r3, r9, r5)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.C43175k.G(r2)
                r0.f201899t = r5
                r0.f201900u = r5
                r0.f201901v = r5
                r0.f201897r = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r0, r9, r8)
                if (r8 != r1) goto Lb5
                return r1
            Lb5:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.pre_approval.form.mvi.domain.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C43210w c43210w, Continuation continuation, e eVar, R00.b bVar) {
        super(2, continuation);
        this.f201890s = c43210w;
        this.f201891t = eVar;
        this.f201892u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f201890s, continuation, this.f201891t, this.f201892u);
        dVar.f201889r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PreApprovalFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201888q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f201889r, this.f201891t, this.f201892u);
            this.f201888q = 1;
            if (this.f201890s.collect(aVar, this) == coroutine_suspended) {
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
