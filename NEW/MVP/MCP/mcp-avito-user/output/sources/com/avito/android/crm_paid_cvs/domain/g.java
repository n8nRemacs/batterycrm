package com.avito.android.crm_paid_cvs.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.TypedResult;
import dt.InterfaceC39801a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import sP.InterfaceC48087a;

/* compiled from: SearchesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/domain/g;", "Ldt/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements InterfaceC39801a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC48087a f130315a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f130316b;

    /* compiled from: SearchesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.domain.SearchesInteractor", f = "SearchesInteractor.kt", i = {0}, l = {33}, m = "getSearchesList", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public g f130317q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f130318r;

        /* renamed from: t, reason: collision with root package name */
        public int f130320t;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f130318r = obj;
            this.f130320t |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.this.a(this);
        }
    }

    @Inject
    public g(@k InterfaceC48087a interfaceC48087a, @k x xVar) {
        this.f130315a = interfaceC48087a;
        this.f130316b = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // dt.InterfaceC39801a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super com.avito.android.remote.model.TypedResult<java.util.List<com.avito.android.crm_paid_cvs.dto.SearchItem>>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.avito.android.crm_paid_cvs.domain.g.a
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.crm_paid_cvs.domain.g$a r0 = (com.avito.android.crm_paid_cvs.domain.g.a) r0
            int r1 = r0.f130320t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130320t = r1
            goto L1a
        L13:
            com.avito.android.crm_paid_cvs.domain.g$a r0 = new com.avito.android.crm_paid_cvs.domain.g$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r13 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r13
            r0.<init>(r13)
        L1a:
            java.lang.Object r13 = r0.f130318r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f130320t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.crm_paid_cvs.domain.g r0 = r0.f130317q
            kotlin.C42729a0.b(r13)
            goto L50
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            kotlin.C42729a0.b(r13)
            java.lang.String r13 = "112"
            long r4 = java.lang.Long.parseLong(r13)
            java.lang.Long r13 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r0.f130317q = r12
            r0.f130320t = r3
            sP.a r2 = r12.f130315a
            java.lang.Object r13 = r2.d(r13, r0)
            if (r13 != r1) goto L4f
            return r1
        L4f:
            r0 = r12
        L50:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r1 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto Lb9
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r13 = r13.getResult()
            yP.b r13 = (yP.C50156b) r13
            java.util.List r13 = r13.a()
            if (r13 == 0) goto Lb1
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r13, r2)
            r1.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L75:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r13.next()
            yP.a r2 = (yP.C50155a) r2
            com.avito.android.deep_linking.x r3 = r0.f130316b
            com.avito.android.crm_paid_cvs.dto.SearchItem r11 = new com.avito.android.crm_paid_cvs.dto.SearchItem
            long r4 = r2.getId()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r6 = r2.getTitle()
            java.lang.String r7 = r2.getDescription()
            boolean r8 = r2.getHasNewItems()
            java.lang.String r4 = r2.getOpenAction()
            com.avito.android.deep_linking.links.DeepLink r9 = r3.b(r4)
            java.lang.String r2 = r2.getEditAction()
            com.avito.android.deep_linking.links.DeepLink r10 = r3.b(r2)
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.add(r11)
            goto L75
        Lb1:
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
        Lb3:
            com.avito.android.remote.model.TypedResult$Success r13 = new com.avito.android.remote.model.TypedResult$Success
            r13.<init>(r1)
            goto Lbd
        Lb9:
            boolean r0 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lbe
        Lbd:
            return r13
        Lbe:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.domain.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object b() {
        return C42784z0.f406748b;
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object c(@k List<FilterItem> list, @l Long l12, @k Continuation<? super TypedResult<Q<Long, List<CvItem>>>> continuation) {
        return new TypedResult.Success(new Q(Boxing.boxLong(0L), C42784z0.f406748b));
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object d(@k String str, @k CvStatus cvStatus, @k String str2, @k Continuation<? super TypedResult<CvItem>> continuation) {
        return new TypedResult.Success(null);
    }

    @Override // dt.InterfaceC39801a
    @l
    public final Object e(@k Continuation<? super TypedResult<List<FilterItem>>> continuation) {
        return new TypedResult.Success(C42784z0.f406748b);
    }
}
