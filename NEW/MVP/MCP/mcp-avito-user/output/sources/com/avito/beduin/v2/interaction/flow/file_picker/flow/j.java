package com.avito.beduin.v2.interaction.flow.file_picker.flow;

import Y41.p;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.interaction.flow.file_picker.flow.i;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilePickerInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.flow.file_picker.flow.FilePickerInteractionHandler$handle$1", f = "FilePickerInteractionHandler.kt", i = {0}, l = {86, 79, 80, 81}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
public final class j extends SuspendLambda implements p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC36238a f337422q;

    /* renamed from: r, reason: collision with root package name */
    public int f337423r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f337424s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f337425t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f337426u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337427v;

    /* compiled from: FilePickerInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/interaction/flow/file_picker/flow/j$a", "Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/g;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337428a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f337429b;

        public a(InterfaceC36238a interfaceC36238a, r rVar) {
            this.f337428a = interfaceC36238a;
            this.f337429b = rVar;
        }

        @Override // com.avito.beduin.v2.interaction.flow.file_picker.flow.g
        public final void a(@Y61.k h hVar) {
            InterfaceC36238a interfaceC36238a = this.f337428a;
            A a12 = new A(new Q("path", interfaceC36238a.c().e(hVar.f337406a)), new Q("extension", interfaceC36238a.c().e(hVar.f337408c)), new Q("name", interfaceC36238a.c().e(hVar.f337407b)), new Q("size", interfaceC36238a.c().c(hVar.f337409d)));
            int i12 = Z.f406624c;
            this.f337429b.resumeWith(new Q(a12, null));
        }

        @Override // com.avito.beduin.v2.interaction.flow.file_picker.flow.g
        public final void onCancel() {
            int i12 = Z.f406624c;
            this.f337429b.resumeWith(new Q(null, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, k kVar, InterfaceC36238a interfaceC36238a, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f337425t = iVar;
        this.f337426u = kVar;
        this.f337427v = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f337425t, this.f337426u, this.f337427v, continuation);
        jVar.f337424s = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337423r;
        i iVar = this.f337425t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f337424s;
            this.f337424s = interfaceC43172j;
            k kVar = this.f337426u;
            InterfaceC36238a interfaceC36238a = this.f337427v;
            this.f337422q = interfaceC36238a;
            this.f337423r = 1;
            r rVar = new r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            kVar.f337430c.b(iVar.f337410a, new a(interfaceC36238a, rVar));
            obj = rVar.o();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f337424s;
            C42729a0.b(obj);
        }
        Q q12 = (Q) obj;
        com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) q12.f406619b;
        com.avito.beduin.v2.engine.field.d dVar2 = (com.avito.beduin.v2.engine.field.d) q12.f406620c;
        if (dVar != null) {
            Object objInvoke = ((i.a.C10457a) iVar.f337411b).invoke(dVar);
            this.f337424s = null;
            this.f337423r = 2;
            if (interfaceC43172j.emit(objInvoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (dVar2 != null) {
            dU0.f fVar = (dU0.f) ((i.a.b) iVar.f337412c).invoke(dVar2);
            if (fVar != null) {
                this.f337424s = null;
                this.f337423r = 3;
                if (interfaceC43172j.emit(fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            dU0.f fVar2 = (dU0.f) ((i.a.c) iVar.f337413d).invoke();
            if (fVar2 != null) {
                this.f337424s = null;
                this.f337423r = 4;
                if (interfaceC43172j.emit(fVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
