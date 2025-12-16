package com.avito.android.crm_candidates.view.base;

import Ju.InterfaceC14249c;
import Ps.InterfaceC14833a;
import com.avito.android.crm_candidates.deeplink.change_status.JobCrmChangeStatusDeeplink;
import com.avito.android.crm_candidates.deeplink.notes.JobCrmNotesDeeplink;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$2$2", f = "JobCrmCandidatesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class B extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f129754q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129755r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f129755r = jobCrmCandidatesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        B b12 = new B(this.f129755r, continuation);
        b12.f129754q = obj;
        return b12;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((B) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f129754q).f413261b;
        boolean z12 = interfaceC14249c instanceof JobCrmNotesDeeplink.b;
        JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129755r;
        if (z12) {
            JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
            jobCrmCandidatesFragment.s5().accept(new InterfaceC14833a.m(((JobCrmNotesDeeplink.b) interfaceC14249c).f129174b));
        } else if (interfaceC14249c instanceof JobCrmChangeStatusDeeplink.b) {
            JobCrmCandidatesFragment.a aVar2 = JobCrmCandidatesFragment.f129791O0;
            JobCrmChangeStatusDeeplink.b bVar = (JobCrmChangeStatusDeeplink.b) interfaceC14249c;
            jobCrmCandidatesFragment.s5().accept(new InterfaceC14833a.b(bVar.f129148b, bVar.f129149c, bVar.f129150d));
        }
        return G0.f406611a;
    }
}
