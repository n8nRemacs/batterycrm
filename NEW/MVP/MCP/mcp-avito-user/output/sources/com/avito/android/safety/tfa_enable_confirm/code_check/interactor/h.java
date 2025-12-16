package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import To.InterfaceC15383a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import com.avito.android.safety.tfa_enable_confirm.code_check.TfaEnableConfirmDeeplinkResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oo0.InterfaceC44834b;

/* compiled from: TfaEnableCodeCheckCodeConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckCodeConfirmInteractorImpl$confirm$1", f = "TfaEnableCodeCheckCodeConfirmInteractor.kt", i = {0, 1}, l = {45, 48, UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public i f258156q;

    /* renamed from: r, reason: collision with root package name */
    public int f258157r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f258158s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f258159t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f258160u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f258161v;

    /* compiled from: TfaEnableCodeCheckCodeConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loo0/b;", "confirmResult", "LTo/a;", "<anonymous>", "(Loo0/b;)LTo/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckCodeConfirmInteractorImpl$confirm$1$result$1", f = "TfaEnableCodeCheckCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC44834b, Continuation<? super InterfaceC15383a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f258162q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ i f258163r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f258164s;

        /* compiled from: TfaEnableCodeCheckCodeConfirmInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", "deeplinkFlow", "Lcom/avito/android/code_check_public/a;", "invoke", "(Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.h$a$a, reason: collision with other inner class name */
        public static final class C7751a extends N implements Y41.l<InterfaceC43160i<? extends DeepLink>, InterfaceC43160i<? extends com.avito.android.code_check_public.a>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ EmptyDeepLink f258165l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ i f258166m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ String f258167n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC44834b f258168o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7751a(EmptyDeepLink emptyDeepLink, i iVar, String str, InterfaceC44834b interfaceC44834b) {
                super(1);
                this.f258165l = emptyDeepLink;
                this.f258166m = iVar;
                this.f258167n = str;
                this.f258168o = interfaceC44834b;
            }

            @Override // Y41.l
            public final InterfaceC43160i<? extends com.avito.android.code_check_public.a> invoke(InterfaceC43160i<? extends DeepLink> interfaceC43160i) {
                return new g(interfaceC43160i, this.f258165l, this.f258166m, this.f258167n, this.f258168o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f258163r = iVar;
            this.f258164s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f258163r, this.f258164s, continuation);
            aVar.f258162q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC44834b interfaceC44834b, Continuation<? super InterfaceC15383a> continuation) {
            return ((a) create(interfaceC44834b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC44834b interfaceC44834b = (InterfaceC44834b) this.f258162q;
            if (interfaceC44834b instanceof InterfaceC44834b.c) {
                return new InterfaceC15383a.C1082a(new To.b(new TfaEnableConfirmDeeplinkResult(((InterfaceC44834b.c) interfaceC44834b).getIsEnabled())));
            }
            if (interfaceC44834b instanceof InterfaceC44834b.a) {
                String code = ((InterfaceC44834b.a) interfaceC44834b).getMessages().getCode();
                return new InterfaceC15383a.d.b(code != null ? com.avito.android.printable_text.b.f(code) : com.avito.android.code_check_public.k.a());
            }
            if (!(interfaceC44834b instanceof InterfaceC44834b.C12197b)) {
                throw new NoWhenBranchMatchedException();
            }
            EmptyDeepLink emptyDeepLink = new EmptyDeepLink();
            EmptyDeepLink emptyDeepLink2 = new EmptyDeepLink();
            i iVar = this.f258163r;
            return new InterfaceC15383a.g(new com.avito.android.code_check_public.i(new androidx.camera.camera2.internal.compat.workaround.v(iVar, interfaceC44834b, emptyDeepLink, emptyDeepLink2, 3), new C7751a(emptyDeepLink, iVar, this.f258164s, interfaceC44834b)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, String str2, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f258159t = iVar;
        this.f258160u = str;
        this.f258161v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f258159t, this.f258160u, this.f258161v, continuation);
        hVar.f258158s = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
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
            int r1 = r9.f258157r
            java.lang.String r2 = r9.f258160u
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.i r3 = r9.f258159t
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L34
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            kotlin.C42729a0.b(r10)
            goto L74
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.f258158s
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L67
        L2a:
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.i r1 = r9.f258156q
            java.lang.Object r6 = r9.f258158s
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            kotlin.C42729a0.b(r10)
            goto L4f
        L34:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f258158s
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            io0.a r1 = r3.f258171c
            r9.f258158s = r10
            r9.f258156q = r3
            r9.f258157r = r6
            java.lang.String r6 = r9.f258161v
            java.lang.Object r1 = r1.a(r2, r6, r9)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            r6 = r10
            r10 = r1
            r1 = r3
        L4f:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.h$a r8 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.h$a
            r8.<init>(r3, r2, r7)
            r9.f258158s = r6
            r9.f258156q = r7
            r9.f258157r = r5
            r1.getClass()
            java.lang.Object r10 = com.avito.android.code_check_public.screen.c.b.b(r10, r8, r9)
            if (r10 != r0) goto L66
            return r0
        L66:
            r1 = r6
        L67:
            To.a r10 = (To.InterfaceC15383a) r10
            r9.f258158s = r7
            r9.f258157r = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
