package com.avito.android.crm_candidates.features.applications_list.logics;

import Os.InterfaceC14731a;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmApplicationsListLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.features.applications_list.logics.JobCrmApplicationsListLoader$loadList$2", f = "JobCrmApplicationsListLoader.kt", i = {0, 1, 2}, l = {23, AvailableCode.HMS_IS_SPOOF, 32, 35, 38}, m = "invokeSuspend", n = {"$this$coroutineScope", AdFormat.BANNER, "response"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129543q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129544r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<JobCrmApplicationsListInternalAction> f129545s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ JobCrmApplicationsListInternalAction.LoadType f129546t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f129547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14731a f129548v;

    /* compiled from: JobCrmApplicationsListLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/JobCrmBannerItem;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/JobCrmBannerItem;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.features.applications_list.logics.JobCrmApplicationsListLoader$loadList$2$banner$1", f = "JobCrmApplicationsListLoader.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super JobCrmBannerItem>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f129549q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14731a f129550r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14731a interfaceC14731a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f129550r = interfaceC14731a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f129550r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super JobCrmBannerItem> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f129549q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f129549q = 1;
                obj = this.f129550r.m(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* compiled from: JobCrmApplicationsListLoader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/application_item/JobCrmApplicationItem;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.features.applications_list.logics.JobCrmApplicationsListLoader$loadList$2$candidates$1", f = "JobCrmApplicationsListLoader.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<List<? extends JobCrmApplicationItem>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f129551q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14731a f129552r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f129553s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14731a interfaceC14731a, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f129552r = interfaceC14731a;
            this.f129553s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f129552r, this.f129553s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<List<? extends JobCrmApplicationItem>>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f129551q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f129551q = 1;
                obj = this.f129552r.n(this.f129553s, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(InterfaceC43172j<? super JobCrmApplicationsListInternalAction> interfaceC43172j, JobCrmApplicationsListInternalAction.LoadType loadType, String str, InterfaceC14731a interfaceC14731a, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f129545s = interfaceC43172j;
        this.f129546t = loadType;
        this.f129547u = str;
        this.f129548v = interfaceC14731a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f129545s, this.f129546t, this.f129547u, this.f129548v, continuation);
        jVar.f129544r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.applications_list.logics.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
