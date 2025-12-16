package com.avito.android.publish.price_list.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
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
@DebugMetadata(c = "com.avito.android.publish.price_list.mvi.SelectPriceListActor$transformToInternalAction$$inlined$transform$1", f = "SelectPriceListActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
public final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectPriceListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238782q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f238783r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f238784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f238785t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.publish.price_list.mvi.entity.f f238786u;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<SelectPriceListInternalAction> f238787b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f238788c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.price_list.mvi.entity.f f238789d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.publish.price_list.mvi.SelectPriceListActor$transformToInternalAction$$inlined$transform$1$1", f = "SelectPriceListActor.kt", i = {}, l = {220, 223, 241}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.publish.price_list.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C7173a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f238790q;

            /* renamed from: r, reason: collision with root package name */
            public int f238791r;

            public C7173a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f238790q = obj;
                this.f238791r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, h hVar, com.avito.android.publish.price_list.mvi.entity.f fVar) {
            this.f238788c = hVar;
            this.f238789d = fVar;
            this.f238787b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r9, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.avito.android.publish.price_list.mvi.e.a.C7173a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.publish.price_list.mvi.e$a$a r0 = (com.avito.android.publish.price_list.mvi.e.a.C7173a) r0
                int r1 = r0.f238791r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f238791r = r1
                goto L18
            L13:
                com.avito.android.publish.price_list.mvi.e$a$a r0 = new com.avito.android.publish.price_list.mvi.e$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f238790q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f238791r
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L34
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                goto L34
            L2c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L34:
                kotlin.C42729a0.b(r10)
                goto Lb8
            L39:
                kotlin.C42729a0.b(r10)
                ve0.a r9 = (ve0.AbstractC49316a) r9
                ve0.a$b r10 = ve0.AbstractC49316a.b.f440914a
                boolean r10 = kotlin.jvm.internal.L.f(r9, r10)
                kotlinx.coroutines.flow.j<com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction> r2 = r8.f238787b
                if (r10 == 0) goto L53
                com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction$NavigateToNextStep r9 = com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction.NavigateToNextStep.f238803b
                r0.f238791r = r5
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto Lb8
                return r1
            L53:
                boolean r10 = r9 instanceof ve0.AbstractC49316a.C12785a
                if (r10 == 0) goto L6d
                com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction$ShowErrorMessage r10 = new com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction$ShowErrorMessage
                ve0.a$a r9 = (ve0.AbstractC49316a.C12785a) r9
                java.lang.String r9 = r9.f440913a
                if (r9 != 0) goto L61
                java.lang.String r9 = ""
            L61:
                r10.<init>(r9)
                r0.f238791r = r4
                java.lang.Object r9 = r2.emit(r10, r0)
                if (r9 != r1) goto Lb8
                return r1
            L6d:
                boolean r10 = r9 instanceof ve0.AbstractC49316a.c
                if (r10 == 0) goto Lb8
                com.avito.android.publish.price_list.mvi.h r10 = r8.f238788c
                com.avito.android.publish.price_list.domain.use_case.a r4 = r10.f238881k
                r5 = r9
                ve0.a$c r5 = (ve0.AbstractC49316a.c) r5
                java.util.Map<java.lang.String, com.avito.android.remote.model.PretendErrorValue> r5 = r5.f440916b
                com.avito.android.publish.price_list.domain.c r6 = r4.f238580a
                com.avito.android.remote.model.category_parameters.ObjectsParameter r6 = r6.getF238532a()
                com.avito.android.remote.model.category_parameters.SimpleParametersTree r7 = new com.avito.android.remote.model.category_parameters.SimpleParametersTree
                java.util.List r6 = java.util.Collections.singletonList(r6)
                r7.<init>(r6)
                r7.applyPretendResult(r5)
                com.avito.android.publish.C0 r4 = r4.f238581b
                com.avito.android.remote.model.category_parameters.CategoryParameters r4 = r4.f231873k0
                if (r4 == 0) goto L95
                r4.applyPretendResult(r5)
            L95:
                com.avito.android.publish.price_list.mvi.entity.f r4 = r8.f238789d
                java.util.Set<java.lang.String> r4 = r4.f238860k
                com.avito.android.publish.price_list.domain.use_case.o r5 = r10.f238875e
                kotlinx.coroutines.flow.i r4 = r5.a(r4)
                com.avito.android.publish.price_list.mvi.g r5 = new com.avito.android.publish.price_list.mvi.g
                r5.<init>(r4)
                com.avito.android.publish.price_list.mvi.f r4 = new com.avito.android.publish.price_list.mvi.f
                r6 = 0
                r4.<init>(r2, r9, r10, r6)
                kotlinx.coroutines.flow.r1 r9 = new kotlinx.coroutines.flow.r1
                r9.<init>(r4, r5)
                r0.f238791r = r3
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r0, r9, r2)
                if (r9 != r1) goto Lb8
                return r1
            Lb8:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.price_list.mvi.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC43160i interfaceC43160i, Continuation continuation, h hVar, com.avito.android.publish.price_list.mvi.entity.f fVar) {
        super(2, continuation);
        this.f238784s = interfaceC43160i;
        this.f238785t = hVar;
        this.f238786u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f238784s, continuation, this.f238785t, this.f238786u);
        eVar.f238783r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectPriceListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238782q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f238783r, this.f238785t, this.f238786u);
            this.f238782q = 1;
            if (this.f238784s.collect(aVar, this) == coroutine_suspended) {
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
