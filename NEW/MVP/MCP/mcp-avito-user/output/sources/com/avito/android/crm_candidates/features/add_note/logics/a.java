package com.avito.android.crm_candidates.features.add_note.logics;

import Ls.C14434a;
import Ns.InterfaceC14606a;
import Y41.p;
import com.avito.android.crm_candidates.features.add_note.entity.JobCrmAddNoteInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmAddNoteActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_candidates/features/add_note/entity/JobCrmAddNoteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.add_note.logics.JobCrmAddNoteActor$process$1", f = "JobCrmAddNoteActor.kt", i = {}, l = {48, 62, 67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super JobCrmAddNoteInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129432q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129433r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14606a f129434s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f129435t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC14606a interfaceC14606a, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f129434s = interfaceC14606a;
        this.f129435t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f129434s, this.f129435t, continuation);
        aVar.f129433r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JobCrmAddNoteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f129432q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f129433r;
            InterfaceC14606a interfaceC14606a = this.f129434s;
            boolean z12 = interfaceC14606a instanceof InterfaceC14606a.c;
            c cVar = this.f129435t;
            if (z12) {
                InterfaceC14606a.c cVar2 = (InterfaceC14606a.c) interfaceC14606a;
                cVar.f129443b.c(new C14434a(cVar.f129444c.a(), cVar.f129447f, cVar.f129448g, cVar.f129445d, cVar2.f11775a));
                String str = cVar2.f11775a;
                this.f129432q = 1;
                if (c.c(cVar, interfaceC43172j, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC14606a instanceof InterfaceC14606a.C0766a) {
                cVar.f129443b.c(new Ls.n(cVar.f129444c.a(), cVar.f129447f, cVar.f129448g, cVar.f129445d));
                this.f129432q = 2;
                if (c.c(cVar, interfaceC43172j, "", this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC14606a instanceof InterfaceC14606a.b) {
                JobCrmAddNoteInternalAction.NoteInputChange noteInputChange = new JobCrmAddNoteInternalAction.NoteInputChange(((InterfaceC14606a.b) interfaceC14606a).f11774a);
                this.f129432q = 3;
                if (interfaceC43172j.emit(noteInputChange, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
