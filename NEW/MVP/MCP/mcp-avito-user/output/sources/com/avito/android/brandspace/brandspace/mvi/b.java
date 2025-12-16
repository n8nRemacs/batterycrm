package com.avito.android.brandspace.brandspace.mvi;

import Y41.p;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinExecuteRequestAction;
import com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.remote.error.ApiError;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import jk.AbstractC42392c;
import jk.InterfaceC42390a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BrandspaceActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/brandspace/brandspace/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Ljk/a;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Ljk/c;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC42390a, BrandspaceInternalAction, AbstractC42392c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.brandspace.interactor.d f107625a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f107626b;

    /* compiled from: BrandspaceActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.brandspace.brandspace.mvi.BrandspaceActor$process$1", f = "BrandspaceActor.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super BrandspaceInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107627q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f107628r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f107628r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BrandspaceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107627q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f107628r;
                this.f107627q = 1;
                if (b.c(b.this, interfaceC43172j, this) == coroutine_suspended) {
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

    /* compiled from: BrandspaceActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/brandspace/brandspace/mvi/entity/BrandspaceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.brandspace.brandspace.mvi.BrandspaceActor$process$2", f = "BrandspaceActor.kt", i = {0}, l = {44, 52}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.brandspace.brandspace.mvi.b$b, reason: collision with other inner class name */
    public static final class C3217b extends SuspendLambda implements p<InterfaceC43172j<? super BrandspaceInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f107630q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f107631r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42390a f107632s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AbstractC42392c f107633t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3217b(InterfaceC42390a interfaceC42390a, AbstractC42392c abstractC42392c, Continuation<? super C3217b> continuation) {
            super(2, continuation);
            this.f107632s = interfaceC42390a;
            this.f107633t = abstractC42392c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C3217b c3217b = new C3217b(this.f107632s, this.f107633t, continuation);
            c3217b.f107631r = obj;
            return c3217b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BrandspaceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3217b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Brandspace brandspace;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f107630q;
            InterfaceC42390a interfaceC42390a = this.f107632s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f107631r;
                InterfaceC42390a.C11577a c11577a = (InterfaceC42390a.C11577a) interfaceC42390a;
                BeduinAction beduinAction = c11577a.f405780a;
                if (beduinAction instanceof BeduinExecuteRequestAction) {
                    BeduinExecuteRequestAction beduinExecuteRequestAction = (BeduinExecuteRequestAction) beduinAction;
                    ApiError apiError = c11577a.f405781b;
                    AbstractC42392c abstractC42392c = this.f107633t;
                    AbstractC42392c.C11579c c11579c = abstractC42392c instanceof AbstractC42392c.C11579c ? (AbstractC42392c.C11579c) abstractC42392c : null;
                    BrandspaceInternalAction.BeduinExecuteRequestActionError beduinExecuteRequestActionError = new BrandspaceInternalAction.BeduinExecuteRequestActionError(beduinExecuteRequestAction, apiError, (c11579c == null || (brandspace = c11579c.f405791c) == null) ? null : brandspace.getOnFormFailed());
                    this.f107631r = interfaceC43172j;
                    this.f107630q = 1;
                    if (interfaceC43172j.emit(beduinExecuteRequestActionError, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f107631r;
                C42729a0.b(obj);
            }
            BrandspaceInternalAction.BeduinActionError beduinActionError = new BrandspaceInternalAction.BeduinActionError(((InterfaceC42390a.C11577a) interfaceC42390a).f405781b);
            this.f107631r = null;
            this.f107630q = 2;
            if (interfaceC43172j.emit(beduinActionError, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k com.avito.android.brandspace.interactor.d dVar, @Y61.k InterfaceC40691b interfaceC40691b) {
        this.f107625a = dVar;
        this.f107626b = interfaceC40691b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.brandspace.brandspace.mvi.b r8, kotlinx.coroutines.flow.InterfaceC43172j r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.avito.android.brandspace.brandspace.mvi.a
            if (r0 == 0) goto L16
            r0 = r10
            com.avito.android.brandspace.brandspace.mvi.a r0 = (com.avito.android.brandspace.brandspace.mvi.a) r0
            int r1 = r0.f107624u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f107624u = r1
            goto L1b
        L16:
            com.avito.android.brandspace.brandspace.mvi.a r0 = new com.avito.android.brandspace.brandspace.mvi.a
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f107622s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f107624u
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L51
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            goto L3b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.C42729a0.b(r10)
            goto L98
        L3f:
            java.lang.Object r8 = r0.f107620q
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            kotlin.C42729a0.b(r10)
            goto L7a
        L47:
            kotlinx.coroutines.flow.j r9 = r0.f107621r
            java.lang.Object r8 = r0.f107620q
            com.avito.android.brandspace.brandspace.mvi.b r8 = (com.avito.android.brandspace.brandspace.mvi.b) r8
            kotlin.C42729a0.b(r10)
            goto L66
        L51:
            kotlin.C42729a0.b(r10)
            com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction$ShowLoading r10 = new com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction$ShowLoading
            r10.<init>()
            r0.f107620q = r8
            r0.f107621r = r9
            r0.f107624u = r6
            java.lang.Object r10 = r9.emit(r10, r0)
            if (r10 != r1) goto L66
            goto Lb4
        L66:
            com.avito.android.brandspace.interactor.d r8 = r8.f107625a
            io.reactivex.rxjava3.internal.operators.single.W r8 = r8.a()
            r0.f107620q = r9
            r0.f107621r = r7
            r0.f107624u = r5
            java.lang.Object r10 = kotlinx.coroutines.rx3.C43292o.b(r8, r0)
            if (r10 != r1) goto L79
            goto Lb4
        L79:
            r8 = r9
        L7a:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L9b
            com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction$Loaded r9 = new com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction$Loaded
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            com.avito.android.brandspace.remote.model.Brandspace r10 = (com.avito.android.brandspace.remote.model.Brandspace) r10
            r9.<init>(r10)
            r0.f107620q = r7
            r0.f107624u = r4
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L98
            goto Lb4
        L98:
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto Lb4
        L9b:
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L98
            com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction$ShowError r9 = new com.avito.android.brandspace.brandspace.mvi.entity.BrandspaceInternalAction$ShowError
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r10 = r10.getError()
            r9.<init>(r10)
            r0.f107620q = r7
            r0.f107624u = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L98
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.brandspace.brandspace.mvi.b.c(com.avito.android.brandspace.brandspace.mvi.b, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new c(this, aVar, null), c43197r1);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<BrandspaceInternalAction> b(@Y61.k InterfaceC42390a interfaceC42390a, @Y61.k AbstractC42392c abstractC42392c) {
        C43210w c43210w;
        if (interfaceC42390a instanceof InterfaceC42390a.b) {
            return C43175k.w();
        }
        if (interfaceC42390a instanceof InterfaceC42390a.d ? true : interfaceC42390a instanceof InterfaceC42390a.c) {
            return C43175k.G(new a(null));
        }
        if (interfaceC42390a instanceof InterfaceC42390a.e) {
            c43210w = new C43210w(BrandspaceInternalAction.ViewPaused.f107657b);
        } else {
            if (!(interfaceC42390a instanceof InterfaceC42390a.f)) {
                if (interfaceC42390a instanceof InterfaceC42390a.C11577a) {
                    return C43175k.G(new C3217b(interfaceC42390a, abstractC42392c, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(BrandspaceInternalAction.ViewResumed.f107658b);
        }
        return c43210w;
    }
}
