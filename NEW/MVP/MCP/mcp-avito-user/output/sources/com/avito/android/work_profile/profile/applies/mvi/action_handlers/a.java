package com.avito.android.work_profile.profile.applies.mvi.action_handlers;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.work_profile.profile.applies.mvi.entity.AppliesToVacancyInternalAction;
import com.avito.android.work_profile.profile.applies.mvi.entity.Loader;
import com.avito.android.work_profile.profile.applies.mvi.j;
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

/* compiled from: AppliesListLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/mvi/action_handlers/a;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.work_profile.domain.b f330874a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f330875b;

    /* compiled from: AppliesListLoader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/work_profile/profile/applies/mvi/entity/AppliesToVacancyInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.applies.mvi.action_handlers.AppliesListLoader$loadList$1", f = "AppliesListLoader.kt", i = {0, 1}, l = {19, 20, 22, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.work_profile.profile.applies.mvi.action_handlers.a$a, reason: collision with other inner class name */
    public static final class C10280a extends SuspendLambda implements p<InterfaceC43172j<? super AppliesToVacancyInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330876q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330877r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Loader f330878s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f330879t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10280a(Loader loader, a aVar, Continuation<? super C10280a> continuation) {
            super(2, continuation);
            this.f330878s = loader;
            this.f330879t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C10280a c10280a = new C10280a(this.f330878s, this.f330879t, continuation);
            c10280a.f330877r = obj;
            return c10280a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AppliesToVacancyInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C10280a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0218  */
        /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.applies.mvi.action_handlers.a.C10280a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k com.avito.android.work_profile.domain.b bVar, @k j jVar) {
        this.f330874a = bVar;
        this.f330875b = jVar;
    }

    @k
    public final InterfaceC43160i<AppliesToVacancyInternalAction> a(@k Loader loader) {
        return C43175k.G(new C10280a(loader, this, null));
    }
}
