package com.avito.android.vas_autoprolong.screens.autoprolong.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import com.avito.android.vas_autoprolong.screens.autoprolong.di.h;
import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction;
import eL0.InterfaceC40020a;
import fL0.InterfaceC40310a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoprolongInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/domain/b;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/domain/a;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.vas_autoprolong.screens.autoprolong.domain.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f319503a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40310a f319505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f319506d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC40020a f319507e;

    /* compiled from: AutoprolongInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_autoprolong.screens.autoprolong.domain.AutoprolongInteractorImpl$getBbipAutoprolong$1", f = "AutoprolongInteractor.kt", i = {0, 1}, l = {36, 38, 43, 44}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f319508q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f319509r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f319509r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f319508q
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
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                kotlin.C42729a0.b(r9)
                goto L96
            L22:
                java.lang.Object r1 = r8.f319509r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L5d
            L2a:
                java.lang.Object r1 = r8.f319509r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4a
            L32:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f319509r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$MainLoading r1 = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$MainLoading
                r1.<init>()
                r8.f319509r = r9
                r8.f319508q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r9
            L4a:
                com.avito.android.vas_autoprolong.screens.autoprolong.domain.b r9 = com.avito.android.vas_autoprolong.screens.autoprolong.domain.b.this
                fL0.a r5 = r9.f319505c
                r8.f319509r = r1
                r8.f319508q = r4
                long r6 = r9.f319503a
                java.lang.String r9 = r9.f319504b
                java.lang.Object r9 = r5.b(r6, r9, r8)
                if (r9 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L7c
                com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$MainContent r2 = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$MainContent
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                hL0.a r9 = (hL0.C40846a) r9
                r2.<init>(r9)
                r8.f319509r = r5
                r8.f319508q = r3
                java.lang.Object r9 = r1.emit(r2, r8)
                if (r9 != r0) goto L96
                return r0
            L7c:
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L96
                com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$MainError r3 = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$MainError
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r9 = r9.getError()
                r3.<init>(r9)
                r8.f319509r = r5
                r8.f319508q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_autoprolong.screens.autoprolong.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AutoprolongInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.vas_autoprolong.screens.autoprolong.domain.AutoprolongInteractorImpl$setBbipAutoprolong$1", f = "AutoprolongInteractor.kt", i = {0, 1}, l = {56, 58, 67, 68}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.vas_autoprolong.screens.autoprolong.domain.b$b, reason: collision with other inner class name */
    public static final class C9900b extends SuspendLambda implements p<InterfaceC43172j<? super AutoprolongInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f319511q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f319512r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f319514t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f319515u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f319516v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ long f319517w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9900b(boolean z12, long j12, long j13, long j14, Continuation<? super C9900b> continuation) {
            super(2, continuation);
            this.f319514t = z12;
            this.f319515u = j12;
            this.f319516v = j13;
            this.f319517w = j14;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C9900b c9900b = b.this.new C9900b(this.f319514t, this.f319515u, this.f319516v, this.f319517w, continuation);
            c9900b.f319512r = obj;
            return c9900b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutoprolongInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9900b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
            /*
                r18 = this;
                r12 = r18
                java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r12.f319511q
                r14 = 4
                r15 = 3
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L38
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L24
                if (r0 == r15) goto L1f
                if (r0 != r14) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1f:
                kotlin.C42729a0.b(r19)
                goto La8
            L24:
                java.lang.Object r0 = r12.f319512r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r19)
                r1 = r0
                r0 = r19
                goto L75
            L2f:
                java.lang.Object r0 = r12.f319512r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                kotlin.C42729a0.b(r19)
            L36:
                r11 = r0
                goto L4c
            L38:
                kotlin.C42729a0.b(r19)
                java.lang.Object r0 = r12.f319512r
                kotlinx.coroutines.flow.j r0 = (kotlinx.coroutines.flow.InterfaceC43172j) r0
                com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$PostLoading r3 = com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction.PostLoading.f319543b
                r12.f319512r = r0
                r12.f319511q = r2
                java.lang.Object r2 = r0.emit(r3, r12)
                if (r2 != r13) goto L36
                return r13
            L4c:
                com.avito.android.vas_autoprolong.screens.autoprolong.domain.b r0 = com.avito.android.vas_autoprolong.screens.autoprolong.domain.b.this
                eL0.a r2 = r0.f319507e
                r12.f319512r = r11
                r12.f319511q = r1
                long r7 = r12.f319516v
                long r9 = r12.f319517w
                long r3 = r0.f319503a
                java.lang.String r5 = r0.f319504b
                boolean r6 = r12.f319514t
                long r0 = r12.f319515u
                r16 = r0
                r0 = r2
                r1 = r3
                r3 = r5
                r4 = r6
                r5 = r16
                r16 = r11
                r11 = r18
                java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9, r11)
                if (r0 != r13) goto L73
                return r13
            L73:
                r1 = r16
            L75:
                eL0.a$a r0 = (eL0.InterfaceC40020a.AbstractC11070a) r0
                boolean r2 = r0 instanceof eL0.InterfaceC40020a.AbstractC11070a.b
                r3 = 0
                if (r2 == 0) goto L90
                com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$PostContent r2 = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$PostContent
                eL0.a$a$b r0 = (eL0.InterfaceC40020a.AbstractC11070a.b) r0
                com.avito.android.deep_linking.links.DeepLink r0 = r0.f395115a
                r2.<init>(r0)
                r12.f319512r = r3
                r12.f319511q = r15
                java.lang.Object r0 = r1.emit(r2, r12)
                if (r0 != r13) goto La8
                return r13
            L90:
                boolean r2 = r0 instanceof eL0.InterfaceC40020a.AbstractC11070a.C11071a
                if (r2 == 0) goto La8
                com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$PostError r2 = new com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction$PostError
                eL0.a$a$a r0 = (eL0.InterfaceC40020a.AbstractC11070a.C11071a) r0
                com.avito.android.remote.error.ApiError r0 = r0.f395114a
                r2.<init>(r0)
                r12.f319512r = r3
                r12.f319511q = r14
                java.lang.Object r0 = r1.emit(r2, r12)
                if (r0 != r13) goto La8
                return r13
            La8:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_autoprolong.screens.autoprolong.domain.b.C9900b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@h long j12, @k @com.avito.android.vas_autoprolong.screens.autoprolong.di.a String str, @k InterfaceC40310a interfaceC40310a, @k R0 r02, @k InterfaceC40020a interfaceC40020a) {
        this.f319503a = j12;
        this.f319504b = str;
        this.f319505c = interfaceC40310a;
        this.f319506d = r02;
        this.f319507e = interfaceC40020a;
    }

    @Override // com.avito.android.vas_autoprolong.screens.autoprolong.domain.a
    @k
    public final InterfaceC43160i a(long j12, long j13, long j14, boolean z12) {
        return C43175k.I(this.f319506d.a(), C43175k.G(new C9900b(z12, j12, j13, j14, null)));
    }

    @Override // com.avito.android.vas_autoprolong.screens.autoprolong.domain.a
    @k
    public final InterfaceC43160i<AutoprolongInternalAction> b() {
        return C43175k.I(this.f319506d.a(), C43175k.G(new a(null)));
    }
}
