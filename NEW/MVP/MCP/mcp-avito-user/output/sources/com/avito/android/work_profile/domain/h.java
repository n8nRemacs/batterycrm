package com.avito.android.work_profile.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import com.avito.android.work_profile.WorkProfileOpenParams;
import com.avito.android.work_profile.profile.work_profile_host.mvi.entity.WorkProfileHostInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WorkProfileInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/domain/h;", "Lcom/avito/android/work_profile/domain/g;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ZP0.a f330646a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WorkProfileOpenParams f330647b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.work_profile.profile.work_profile_host.mvi.k f330648c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f330649d;

    /* compiled from: WorkProfileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.domain.WorkProfileInteractorImpl$getProfileTabs$1", f = "WorkProfileInteractor.kt", i = {0, 1}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 36}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330650q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330651r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = h.this.new a(continuation);
            aVar.f330651r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.domain.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public h(@k ZP0.a aVar, @k WorkProfileOpenParams workProfileOpenParams, @k com.avito.android.work_profile.profile.work_profile_host.mvi.k kVar, @k R0 r02) {
        this.f330646a = aVar;
        this.f330647b = workProfileOpenParams;
        this.f330648c = kVar;
        this.f330649d = r02;
    }

    @Override // com.avito.android.work_profile.domain.g
    @k
    public final InterfaceC43160i<WorkProfileHostInternalAction> a() {
        return C43175k.I(this.f330649d.a(), C43175k.G(new a(null)));
    }
}
