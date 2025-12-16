package com.avito.android.crm_candidates.features.notes_list.logics;

import Ws.InterfaceC15794a;
import Y41.p;
import com.avito.android.crm_candidates.features.notes_list.entity.JobCrmNotesListInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmNotesListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_candidates/features/notes_list/entity/JobCrmNotesListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.notes_list.logics.JobCrmNotesListActor$process$1", f = "JobCrmNotesListActor.kt", i = {}, l = {20, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super JobCrmNotesListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129706q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129707r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15794a f129708s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC15794a interfaceC15794a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f129708s = interfaceC15794a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f129708s, continuation);
        aVar.f129707r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super JobCrmNotesListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f129706q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f129707r;
            InterfaceC15794a interfaceC15794a = this.f129708s;
            if (interfaceC15794a instanceof InterfaceC15794a.b) {
                ((InterfaceC15794a.b) interfaceC15794a).getClass();
                JobCrmNotesListInternalAction.ShowContent showContent = new JobCrmNotesListInternalAction.ShowContent(c.a(null));
                this.f129706q = 1;
                if (interfaceC43172j.emit(showContent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC15794a instanceof InterfaceC15794a.C1287a) {
                JobCrmNotesListInternalAction.AddNewNote addNewNote = new JobCrmNotesListInternalAction.AddNewNote(((InterfaceC15794a.C1287a) interfaceC15794a).f18072a);
                this.f129706q = 2;
                if (interfaceC43172j.emit(addNewNote, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
