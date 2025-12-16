package com.avito.android.delivery_tarifikator.presentation.main_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29804a;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29815k;
import com.avito.android.delivery_tarifikator.domain.InterfaceC29828y;
import com.avito.android.delivery_tarifikator.domain.N;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TarifikatorMainScreenInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/f;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/domain/e;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC29815k f135580a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC29828y f135581b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC29804a f135582c;

    /* compiled from: TarifikatorMainScreenInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.domain.TarifikatorMainScreenInteractorImpl$deleteCustomTariff$1", f = "TarifikatorMainScreenInteractor.kt", i = {0, 1}, l = {72, 73, 77, 82}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super TarifikatorMainInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135583q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135584r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f135586t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135586t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f135586t, continuation);
            aVar.f135584r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TarifikatorMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f135583q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto L9e
            L22:
                java.lang.Object r1 = r6.f135584r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L58
            L2a:
                java.lang.Object r1 = r6.f135584r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L47
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f135584r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TariffDeleteStarted r1 = com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction.TariffDeleteStarted.f135654b
                r6.f135584r = r7
                r6.f135583q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L46
                return r0
            L46:
                r1 = r7
            L47:
                com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f r7 = com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f.this
                com.avito.android.delivery_tarifikator.domain.a r7 = r7.f135582c
                r6.f135584r = r1
                r6.f135583q = r4
                long r4 = r6.f135586t
                java.lang.Object r7 = r7.a(r4, r6)
                if (r7 != r0) goto L58
                return r0
            L58:
                com.avito.android.delivery_tarifikator.domain.i r7 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29813i) r7
                boolean r4 = r7 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29813i.b
                r5 = 0
                if (r4 == 0) goto L80
                com.avito.android.delivery_tarifikator.domain.i$b r7 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29813i.b) r7
                java.lang.String r7 = r7.f135287a
                if (r7 == 0) goto L6a
                com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.f(r7)
                goto L71
            L6a:
                r7 = 2131953156(0x7f130604, float:1.9542775E38)
                com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.a.a(r7)
            L71:
                com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TariffDeleteSuccess r7 = com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction.TariffDeleteSuccess.c(r7)
                r6.f135584r = r5
                r6.f135583q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L9e
                return r0
            L80:
                boolean r3 = r7 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29813i.a
                if (r3 == 0) goto L9e
                com.avito.android.delivery_tarifikator.domain.i$a r7 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29813i.a) r7
                com.avito.android.util.ApiException r3 = r7.f135286a
                com.avito.android.printable_text.PrintableText r3 = Yv.C18330a.a(r3)
                com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TariffDeleteFailure r4 = new com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TariffDeleteFailure
                com.avito.android.util.ApiException r7 = r7.f135286a
                r4.<init>(r7, r3)
                r6.f135584r = r5
                r6.f135583q = r2
                java.lang.Object r7 = r1.emit(r4, r6)
                if (r7 != r0) goto L9e
                return r0
            L9e:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TarifikatorMainScreenInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.domain.TarifikatorMainScreenInteractorImpl$saveChanges$1", f = "TarifikatorMainScreenInteractor.kt", i = {0, 1, 3}, l = {52, 53, 56, 63, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super TarifikatorMainInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135587q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135588r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ List<Ov.g> f135590t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Ov.g> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f135590t = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = f.this.new b(this.f135590t, continuation);
            bVar.f135588r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TarifikatorMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f135587q
                r2 = 0
                com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f r3 = com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f.this
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r1 == 0) goto L41
                if (r1 == r8) goto L39
                if (r1 == r7) goto L31
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L23
                if (r1 != r4) goto L1b
                goto L2c
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f135588r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto La4
            L2c:
                kotlin.C42729a0.b(r10)
                goto Lbb
            L31:
                java.lang.Object r1 = r9.f135588r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L65
            L39:
                java.lang.Object r1 = r9.f135588r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L56
            L41:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f135588r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TermsSavingStarted r10 = com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction.TermsSavingStarted.f135659b
                r9.f135588r = r1
                r9.f135587q = r8
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L56
                return r0
            L56:
                com.avito.android.delivery_tarifikator.domain.y r10 = r3.f135581b
                r9.f135588r = r1
                r9.f135587q = r7
                java.util.List<Ov.g> r7 = r9.f135590t
                java.lang.Object r10 = r10.a(r7, r9)
                if (r10 != r0) goto L65
                return r0
            L65:
                com.avito.android.delivery_tarifikator.domain.x r10 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29827x) r10
                boolean r7 = r10 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.a
                if (r7 == 0) goto L85
                com.avito.android.delivery_tarifikator.domain.x$a r10 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.a) r10
                com.avito.android.util.ApiException r3 = r10.f135347a
                com.avito.android.printable_text.PrintableText r3 = Yv.C18330a.a(r3)
                com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TermsSavingFailed r4 = new com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TermsSavingFailed
                com.avito.android.util.ApiException r10 = r10.f135347a
                r4.<init>(r10, r3)
                r9.f135588r = r2
                r9.f135587q = r6
                java.lang.Object r10 = r1.emit(r4, r9)
                if (r10 != r0) goto Lbb
                return r0
            L85:
                boolean r6 = r10 instanceof com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.b
                if (r6 == 0) goto Lbb
                com.avito.android.delivery_tarifikator.domain.x$b r10 = (com.avito.android.delivery_tarifikator.domain.InterfaceC29827x.b) r10
                java.lang.String r10 = r10.f135348a
                if (r10 == 0) goto L94
                com.avito.android.printable_text.PrintableText r10 = com.avito.android.printable_text.b.f(r10)
                goto L95
            L94:
                r10 = r2
            L95:
                com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction$TermsSavingSuccess r10 = com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction.TermsSavingSuccess.c(r10)
                r9.f135588r = r1
                r9.f135587q = r5
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto La4
                return r0
            La4:
                r3.getClass()
                com.avito.android.delivery_tarifikator.presentation.main_screen.domain.g r10 = new com.avito.android.delivery_tarifikator.presentation.main_screen.domain.g
                r10.<init>(r3, r8, r2)
                kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.C43175k.G(r10)
                r9.f135588r = r2
                r9.f135587q = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto Lbb
                return r0
            Lbb:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.main_screen.domain.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@k InterfaceC29815k interfaceC29815k, @k InterfaceC29828y interfaceC29828y, @k InterfaceC29804a interfaceC29804a) {
        this.f135580a = interfaceC29815k;
        this.f135581b = interfaceC29828y;
        this.f135582c = interfaceC29804a;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e
    @k
    public final InterfaceC43160i<TarifikatorMainInternalAction> a() {
        return C43175k.G(new g(this, false, null));
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e
    @k
    public final InterfaceC43160i<TarifikatorMainInternalAction> b(long j12) {
        return C43175k.G(new a(j12, null));
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e
    @k
    public final InterfaceC43160i<TarifikatorMainInternalAction> c(@k List<Ov.g> list) {
        return C43175k.G(new b(list, null));
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e
    @k
    public final InterfaceC43160i<TarifikatorMainInternalAction> d(@k N n12) {
        C43210w c43210w;
        if (n12.equals(N.a.f135249a)) {
            return C43175k.w();
        }
        if (n12.equals(N.b.f135250a)) {
            return C43175k.G(new g(this, true, null));
        }
        boolean z12 = n12 instanceof N.c;
        InterfaceC29804a interfaceC29804a = this.f135582c;
        if (z12) {
            interfaceC29804a.c(((N.c) n12).f135251a);
            c43210w = new C43210w(TarifikatorMainInternalAction.TariffEditorSuccess.f135656b);
        } else {
            if (!(n12 instanceof N.d)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC29804a.b(((N.d) n12).f135252a);
            c43210w = new C43210w(TarifikatorMainInternalAction.TariffEditorSuccess.f135656b);
        }
        return c43210w;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e
    @k
    public final InterfaceC43160i<TarifikatorMainInternalAction> e() {
        return C43175k.G(new g(this, true, null));
    }
}
