package com.avito.android.work_profile.profile.work_profile_host.mvi;

import Y41.p;
import YP0.d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import com.avito.android.work_profile.profile.work_profile_host.mvi.entity.WorkProfileHostInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rQ0.AbstractC47586a;

/* compiled from: WorkProfileHostActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.work_profile.profile.work_profile_host.mvi.WorkProfileHostActor$process$1", f = "WorkProfileHostActor.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super WorkProfileHostInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331267q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331268r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f331269s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC47586a f331270t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC47586a abstractC47586a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f331269s = bVar;
        this.f331270t = abstractC47586a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f331269s, this.f331270t, continuation);
        aVar.f331268r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super WorkProfileHostInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331267q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f331268r;
            AbstractC47586a.b bVar = (AbstractC47586a.b) this.f331270t;
            WorkProfileTab workProfileTab = bVar.f429809a;
            YP0.d dVar = this.f331269s.f331271a;
            WorkProfileTab workProfileTab2 = dVar.f19466c;
            if (workProfileTab != workProfileTab2) {
                if (workProfileTab2 == null) {
                    str = dVar.f19464a.f330599c;
                } else {
                    int i13 = d.a.f19467a[workProfileTab2.ordinal()];
                    str = i13 != 1 ? i13 != 2 ? i13 != 3 ? null : "job_about_me" : "job_my_applies" : "job_my_cvs";
                }
                int iOrdinal = workProfileTab.ordinal();
                InterfaceC28373a interfaceC28373a = dVar.f19465b;
                if (iOrdinal == 0) {
                    interfaceC28373a.c(new YP0.a(7255, 3, str));
                } else if (iOrdinal == 1) {
                    interfaceC28373a.c(new YP0.a(7495, 2, str));
                } else if (iOrdinal == 2) {
                    interfaceC28373a.c(new YP0.a(11593, 1, str));
                }
                dVar.f19466c = workProfileTab;
            }
            WorkProfileHostInternalAction.NewTabSelected newTabSelected = new WorkProfileHostInternalAction.NewTabSelected(bVar.f429809a);
            this.f331267q = 1;
            if (interfaceC43172j.emit(newTabSelected, this) == coroutine_suspended) {
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
