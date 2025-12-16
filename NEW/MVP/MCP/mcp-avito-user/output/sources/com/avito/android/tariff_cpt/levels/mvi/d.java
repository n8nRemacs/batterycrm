package com.avito.android.tariff_cpt.levels.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction;
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
@DebugMetadata(c = "com.avito.android.tariff_cpt.levels.mvi.TariffCptLevelsActor$process$$inlined$transform$1", f = "TariffCptLevelsActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TariffCptLevelsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f298631q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f298632r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f298633s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<TariffCptLevelsInternalAction> f298634b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.tariff_cpt.levels.mvi.TariffCptLevelsActor$process$$inlined$transform$1$1", f = "TariffCptLevelsActor.kt", i = {}, l = {221, 223}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.tariff_cpt.levels.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C9134a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f298635q;

            /* renamed from: r, reason: collision with root package name */
            public int f298636r;

            public C9134a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f298635q = obj;
                this.f298636r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f298634b = interfaceC43172j;
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
                boolean r0 = r7 instanceof com.avito.android.tariff_cpt.levels.mvi.d.a.C9134a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.tariff_cpt.levels.mvi.d$a$a r0 = (com.avito.android.tariff_cpt.levels.mvi.d.a.C9134a) r0
                int r1 = r0.f298636r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f298636r = r1
                goto L18
            L13:
                com.avito.android.tariff_cpt.levels.mvi.d$a$a r0 = new com.avito.android.tariff_cpt.levels.mvi.d$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f298635q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f298636r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L35
                if (r2 == r4) goto L31
                if (r2 != r3) goto L29
                goto L31
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                goto L66
            L35:
                kotlin.C42729a0.b(r7)
                kotlin.Q r6 = (kotlin.Q) r6
                A r7 = r6.f406619b
                com.avito.android.deep_linking.links.DeepLink r7 = (com.avito.android.deep_linking.links.DeepLink) r7
                B r6 = r6.f406620c
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                kotlinx.coroutines.flow.j<com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction> r2 = r5.f298634b
                if (r6 == 0) goto L58
                com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction$CloseWithResult r6 = new com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction$CloseWithResult
                r6.<init>(r7)
                r0.f298636r = r4
                java.lang.Object r6 = r2.emit(r6, r0)
                if (r6 != r1) goto L66
                return r1
            L58:
                com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction$HandleDeeplink r6 = new com.avito.android.tariff_cpt.levels.mvi.entity.TariffCptLevelsInternalAction$HandleDeeplink
                r6.<init>(r7)
                r0.f298636r = r3
                java.lang.Object r6 = r2.emit(r6, r0)
                if (r6 != r1) goto L66
                return r1
            L66:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff_cpt.levels.mvi.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f298633s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f298633s, continuation);
        dVar.f298632r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TariffCptLevelsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f298631q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f298632r);
            this.f298631q = 1;
            if (this.f298633s.collect(aVar, this) == coroutine_suspended) {
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
