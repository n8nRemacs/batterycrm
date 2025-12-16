package com.avito.android.job.cv_packages;

import Ae.InterfaceC13022a;
import Y41.p;
import com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction;
import com.avito.android.job.cv_packages.mvi.u;
import com.avito.android.job.cv_packages.mvi.w;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvPackagesInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/c;", "Lcom/avito/android/job/cv_packages/b;", "a", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.job.cv_packages.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ZP.a f174331a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13022a f174332b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final w f174333c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final u f174334d;

    /* compiled from: CvPackagesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/job/cv_packages/c$a;", "", "<init>", "()V", "", "AUTO_TYPE", "Ljava/lang/String;", "JOB_TYPE", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvPackagesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/job/cv_packages/mvi/entity/CvPackageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.job.cv_packages.CvPackagesInteractorImpl$requestPackagesInfo$1", f = "CvPackagesInteractor.kt", i = {}, l = {30, 32, 34, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super CvPackageInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public u f174335q;

        /* renamed from: r, reason: collision with root package name */
        public int f174336r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f174337s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f174338t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f174339u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f174340v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, c cVar, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f174338t = str;
            this.f174339u = cVar;
            this.f174340v = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f174338t, this.f174339u, this.f174340v, continuation);
            bVar.f174337s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CvPackageInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_packages.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@Y61.k ZP.a aVar, @Y61.k InterfaceC13022a interfaceC13022a, @Y61.k w wVar, @Y61.k u uVar) {
        this.f174331a = aVar;
        this.f174332b = interfaceC13022a;
        this.f174333c = wVar;
        this.f174334d = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.avito.android.job.cv_packages.c r12, java.lang.String r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.NumberFormatException {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof com.avito.android.job.cv_packages.d
            if (r0 == 0) goto L16
            r0 = r14
            com.avito.android.job.cv_packages.d r0 = (com.avito.android.job.cv_packages.d) r0
            int r1 = r0.f174344t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f174344t = r1
            goto L1b
        L16:
            com.avito.android.job.cv_packages.d r0 = new com.avito.android.job.cv_packages.d
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.f174342r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f174344t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.job.cv_packages.mvi.w r12 = r0.f174341q
            kotlin.C42729a0.b(r14)
            goto L4e
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.C42729a0.b(r14)
            long r13 = java.lang.Long.parseLong(r13)
            com.avito.android.job.cv_packages.mvi.w r2 = r12.f174333c
            r0.f174341q = r2
            r0.f174344t = r3
            ZP.a r12 = r12.f174331a
            java.lang.Object r14 = r12.a(r13, r0)
            if (r14 != r1) goto L4d
            goto Le6
        L4d:
            r12 = r2
        L4e:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            r12.getClass()
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r12 == 0) goto Ld1
            com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
            java.lang.Object r12 = r14.getResult()
            aQ.b r12 = (aQ.C19806b) r12
            java.lang.String r12 = r12.getTitle()
            java.lang.Object r13 = r14.getResult()
            aQ.b r13 = (aQ.C19806b) r13
            java.lang.String r13 = r13.getSubtitle()
            java.lang.Object r14 = r14.getResult()
            aQ.b r14 = (aQ.C19806b) r14
            java.util.List r14 = r14.a()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r14, r1)
            r0.<init>(r1)
            java.util.Iterator r14 = r14.iterator()
        L88:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto Lcb
            java.lang.Object r1 = r14.next()
            aQ.a r1 = (aQ.C19805a) r1
            com.avito.android.job.cv_packages.item.d r2 = new com.avito.android.job.cv_packages.item.d
            com.avito.android.deep_linking.links.DeepLink r3 = r1.getDeeplink()
            if (r3 == 0) goto La1
            java.lang.String r3 = r3.getPath()
            goto La2
        La1:
            r3 = 0
        La2:
            if (r3 != 0) goto La6
            java.lang.String r3 = ""
        La6:
            com.avito.android.job.cv_packages.item.a r11 = new com.avito.android.job.cv_packages.item.a
            java.lang.String r5 = r1.getTitle()
            com.avito.android.deep_linking.links.DeepLink r6 = r1.getDeeplink()
            java.lang.String r7 = r1.getPrice()
            java.lang.String r8 = r1.getDiscount()
            java.lang.String r9 = r1.getOriginalPrice()
            java.lang.String r10 = r1.getSinglePrice()
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.<init>(r3, r11)
            r0.add(r2)
            goto L88
        Lcb:
            com.avito.android.job.cv_packages.mvi.entity.a$a r14 = new com.avito.android.job.cv_packages.mvi.entity.a$a
            r14.<init>(r12, r13, r0)
            goto Le1
        Ld1:
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r12 == 0) goto Le7
            com.avito.android.job.cv_packages.mvi.entity.a$b r12 = new com.avito.android.job.cv_packages.mvi.entity.a$b
            com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
            com.avito.android.remote.error.ApiError r13 = r14.getError()
            r12.<init>(r13)
            r14 = r12
        Le1:
            com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction$PackagesResult r1 = new com.avito.android.job.cv_packages.mvi.entity.CvPackageInternalAction$PackagesResult
            r1.<init>(r14)
        Le6:
            return r1
        Le7:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.job.cv_packages.c.b(com.avito.android.job.cv_packages.c, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.job.cv_packages.b
    @Y61.k
    public final InterfaceC43160i<CvPackageInternalAction> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new b(str2, this, str, null));
    }
}
