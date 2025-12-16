package com.avito.android.reputation.ui;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.AbstractC40048c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements InterfaceC43160i<AbstractC40048c> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f254802b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.reputation.ui.a$a, reason: collision with other inner class name */
    public static final class C7622a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f254803b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.reputation.ui.ReputationFragment$createDependencies$1$invoke$$inlined$map$1$2", f = "ReputationFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.reputation.ui.a$a$a, reason: collision with other inner class name */
        public static final class C7623a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f254804q;

            /* renamed from: r, reason: collision with root package name */
            public int f254805r;

            public C7623a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f254804q = obj;
                this.f254805r |= BeduinInputModel.MIN_TEXT_VERSION;
                return C7622a.this.emit(null, this);
            }
        }

        public C7622a(InterfaceC43172j interfaceC43172j) {
            this.f254803b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.reputation.ui.a.C7622a.C7623a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.reputation.ui.a$a$a r0 = (com.avito.android.reputation.ui.a.C7622a.C7623a) r0
                int r1 = r0.f254805r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f254805r = r1
                goto L18
            L13:
                com.avito.android.reputation.ui.a$a$a r0 = new com.avito.android.reputation.ui.a$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f254804q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f254805r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L51
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                Rm0.c r5 = (Rm0.c) r5
                boolean r6 = r5 instanceof Rm0.c.a
                if (r6 == 0) goto L3d
                Rm0.c$a r5 = (Rm0.c.a) r5
                goto L3e
            L3d:
                r5 = 0
            L3e:
                if (r5 == 0) goto L44
                eT.c r5 = r5.f14611b
                if (r5 != 0) goto L46
            L44:
                eT.c$c r5 = kotlin.AbstractC40048c.C11084c.f395217b
            L46:
                r0.f254805r = r3
                kotlinx.coroutines.flow.j r6 = r4.f254803b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L51
                return r1
            L51:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.reputation.ui.a.C7622a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public a(n2 n2Var) {
        this.f254802b = n2Var;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super AbstractC40048c> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f254802b.collect(new C7622a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
