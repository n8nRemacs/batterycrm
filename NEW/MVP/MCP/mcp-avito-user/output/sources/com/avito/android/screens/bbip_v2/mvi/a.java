package com.avito.android.screens.bbip_v2.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import hh.InterfaceC40933a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import up0.InterfaceC49091c;
import vp0.C49366c;
import vp0.InterfaceC49364a;

/* compiled from: BbipV2Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lvp0/a;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lvp0/c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49364a, BbipV2InternalAction, C49366c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f261500a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip_v2.domain.a f261501b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49091c f261502c;

    /* compiled from: BbipV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.mvi.BbipV2Actor$process$1", f = "BbipV2Actor.kt", i = {1}, l = {75, 77, 83}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.screens.bbip_v2.mvi.a$a, reason: collision with other inner class name */
    public static final class C7825a extends SuspendLambda implements p<InterfaceC43172j<? super BbipV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261503q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f261504r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49364a f261505s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f261506t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C49366c f261507u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7825a(InterfaceC49364a interfaceC49364a, a aVar, C49366c c49366c, Continuation<? super C7825a> continuation) {
            super(2, continuation);
            this.f261505s = interfaceC49364a;
            this.f261506t = aVar;
            this.f261507u = c49366c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7825a c7825a = new C7825a(this.f261505s, this.f261506t, this.f261507u, continuation);
            c7825a.f261504r = obj;
            return c7825a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7825a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f261503q
                vp0.a r2 = r7.f261505s
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                goto L24
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r1 = r7.f261504r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5b
            L24:
                kotlin.C42729a0.b(r8)
                goto L7f
            L28:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f261504r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                r8 = r2
                vp0.a$b r8 = (vp0.InterfaceC49364a.b) r8
                boolean r6 = r8.f440972b
                if (r6 == 0) goto L49
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ShowInfo r2 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ShowInfo
                com.avito.android.screens.bbip_v2.ui.items.budget.b$a r8 = r8.f440971a
                com.avito.android.printable_text.PrintableText r8 = r8.f261580h
                r2.<init>(r8)
                r7.f261503q = r5
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L7f
                return r0
            L49:
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$BudgetClicked r5 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$BudgetClicked
                com.avito.android.screens.bbip_v2.ui.items.budget.b$a r8 = r8.f440971a
                r5.<init>(r8)
                r7.f261504r = r1
                r7.f261503q = r4
                java.lang.Object r8 = r1.emit(r5, r7)
                if (r8 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.screens.bbip_v2.mvi.a r8 = r7.f261506t
                up0.c r4 = r8.f261502c
                vp0.c r5 = r7.f261507u
                java.lang.String r6 = r5.f440991f
                vp0.a$b r2 = (vp0.InterfaceC49364a.b) r2
                com.avito.android.screens.bbip_v2.ui.items.budget.b$a r2 = r2.f440971a
                com.avito.android.screens.bbip_v2.ui.items.duration.b$a r5 = r5.f440993h
                up0.b r2 = r4.d(r6, r2, r5)
                com.avito.android.screens.bbip_v2.domain.a r8 = r8.f261501b
                kotlinx.coroutines.flow.i r8 = r8.b(r2)
                r2 = 0
                r7.f261504r = r2
                r7.f261503q = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto L7f
                return r0
            L7f:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_v2.mvi.a.C7825a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BbipV2Actor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screens.bbip_v2.mvi.BbipV2Actor$process$2", f = "BbipV2Actor.kt", i = {1}, l = {89, 91, 97}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super BbipV2InternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f261508q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f261509r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49364a f261510s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f261511t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C49366c f261512u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC49364a interfaceC49364a, a aVar, C49366c c49366c, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f261510s = interfaceC49364a;
            this.f261511t = aVar;
            this.f261512u = c49366c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f261510s, this.f261511t, this.f261512u, continuation);
            bVar.f261509r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BbipV2InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f261508q
                vp0.a r2 = r7.f261510s
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L28
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                goto L24
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r1 = r7.f261509r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5b
            L24:
                kotlin.C42729a0.b(r8)
                goto L7f
            L28:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f261509r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                r8 = r2
                vp0.a$c r8 = (vp0.InterfaceC49364a.c) r8
                boolean r6 = r8.f440974b
                if (r6 == 0) goto L49
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ShowInfo r2 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$ShowInfo
                com.avito.android.screens.bbip_v2.ui.items.duration.b$a r8 = r8.f440973a
                com.avito.android.printable_text.PrintableText r8 = r8.f261625g
                r2.<init>(r8)
                r7.f261508q = r5
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto L7f
                return r0
            L49:
                com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$DurationClicked r5 = new com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction$DurationClicked
                com.avito.android.screens.bbip_v2.ui.items.duration.b$a r8 = r8.f440973a
                r5.<init>(r8)
                r7.f261509r = r1
                r7.f261508q = r4
                java.lang.Object r8 = r1.emit(r5, r7)
                if (r8 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.screens.bbip_v2.mvi.a r8 = r7.f261511t
                up0.c r4 = r8.f261502c
                vp0.c r5 = r7.f261512u
                java.lang.String r6 = r5.f440991f
                vp0.a$c r2 = (vp0.InterfaceC49364a.c) r2
                com.avito.android.screens.bbip_v2.ui.items.duration.b$a r2 = r2.f440973a
                com.avito.android.screens.bbip_v2.ui.items.budget.b$a r5 = r5.f440992g
                up0.b r2 = r4.d(r6, r5, r2)
                com.avito.android.screens.bbip_v2.domain.a r8 = r8.f261501b
                kotlinx.coroutines.flow.i r8 = r8.b(r2)
                r2 = 0
                r7.f261509r = r2
                r7.f261508q = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto L7f
                return r0
            L7f:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.screens.bbip_v2.mvi.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@InterfaceC40933a @Y61.k String str, @Y61.k com.avito.android.screens.bbip_v2.domain.a aVar, @Y61.k InterfaceC49091c interfaceC49091c) {
        this.f261500a = str;
        this.f261501b = aVar;
        this.f261502c = interfaceC49091c;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new c(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.screens.bbip_v2.mvi.b.f261513l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BbipV2InternalAction> b(@Y61.k InterfaceC49364a interfaceC49364a, @Y61.k C49366c c49366c) {
        ButtonAction button;
        if (interfaceC49364a instanceof InterfaceC49364a.C12792a) {
            return new C43210w(BbipV2InternalAction.CloseScreen.f261531b);
        }
        boolean z12 = interfaceC49364a instanceof InterfaceC49364a.f;
        String str = c49366c.f440991f;
        com.avito.android.screens.bbip_v2.domain.a aVar = this.f261501b;
        if (z12) {
            if (c49366c.f440995j) {
                return C43175k.w();
            }
            if (str == null) {
                str = this.f261500a;
            }
            return aVar.a(str);
        }
        boolean z13 = interfaceC49364a instanceof InterfaceC49364a.g;
        InterfaceC49091c interfaceC49091c = this.f261502c;
        b.a aVar2 = c49366c.f440993h;
        b.a aVar3 = c49366c.f440992g;
        if (z13) {
            return aVar.b(interfaceC49091c.d(str, aVar3, aVar2));
        }
        if (interfaceC49364a instanceof InterfaceC49364a.d) {
            uZ.e eVar = c49366c.f440987b;
            if (eVar != null && (button = eVar.getButton()) != null) {
                deeplink = button.getDeeplink();
            }
            return new C43210w(new BbipV2InternalAction.HandleDeeplink(deeplink));
        }
        if (interfaceC49364a instanceof InterfaceC49364a.h) {
            ButtonAction buttonAction = c49366c.f440989d;
            return new C43210w(new BbipV2InternalAction.HandleDeeplink(buttonAction != null ? buttonAction.getDeeplink() : null));
        }
        if (interfaceC49364a instanceof InterfaceC49364a.e) {
            return c49366c.f440997l ? C43175k.w() : aVar.c(interfaceC49091c.e(str, aVar3, aVar2));
        }
        if (interfaceC49364a instanceof InterfaceC49364a.b) {
            return C43175k.G(new C7825a(interfaceC49364a, this, c49366c, null));
        }
        if (interfaceC49364a instanceof InterfaceC49364a.c) {
            return C43175k.G(new b(interfaceC49364a, this, c49366c, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
