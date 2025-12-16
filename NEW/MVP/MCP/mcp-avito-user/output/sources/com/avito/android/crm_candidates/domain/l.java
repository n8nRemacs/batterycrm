package com.avito.android.crm_candidates.domain;

import Ms.InterfaceC14524a;
import Os.InterfaceC14731a;
import Qs.InterfaceC14928a;
import Ss.InterfaceC15218a;
import Us.InterfaceC15563a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_candidates.domain.DateInterval;
import com.avito.android.crm_candidates.domain.b;
import com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.di.B;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.util.V2;
import iP.InterfaceC41329a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: JobCrmCandidatesInteractor.kt */
@B
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/domain/l;", "LOs/a;", "LSs/a;", "LUs/a;", "LQs/a;", "LMs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements InterfaceC14731a, InterfaceC15218a, InterfaceC15563a, InterfaceC14928a, InterfaceC14524a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41329a> f129392a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f129393b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final o f129394c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public b.g f129395d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public b.C3844b f129396e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public b.a f129397f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public b.e f129398g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public b.c f129399h = z();

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public b.f f129400i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public b.d f129401j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public b.h f129402k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129403l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129404m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129405n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129406o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129407p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129408q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public List<JobCrmListFilterItem> f129409r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public JobCrmListFilterItem f129410s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public List<JobCrmInlineFilterItem> f129411t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public JobCrmBannerItem f129412u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f129413v;

    @Inject
    public l(@Y61.k h31.e<InterfaceC41329a> eVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k o oVar) {
        this.f129392a = eVar;
        this.f129393b = interfaceC28373a;
        this.f129394c = oVar;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f129403l = c42784z0;
        this.f129404m = c42784z0;
        this.f129405n = c42784z0;
        this.f129406o = c42784z0;
        this.f129407p = c42784z0;
        this.f129408q = c42784z0;
        this.f129409r = new ArrayList();
        this.f129411t = c42784z0;
    }

    public static b.c z() {
        DateInterval.Default r02 = DateInterval.Default.f129340b;
        r02.getClass();
        Q<Long, Long> qA2 = DateInterval.a.a(r02);
        return new b.c(qA2.f406619b.longValue(), qA2.f406620c.longValue(), DateInterval.Default.f129342d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // Qs.InterfaceC14928a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Ms.InterfaceC14524a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.crm_candidates.domain.k
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.crm_candidates.domain.k r0 = (com.avito.android.crm_candidates.domain.k) r0
            int r1 = r0.f129391t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129391t = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.domain.k r0 = new com.avito.android.crm_candidates.domain.k
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f129389r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129391t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.crm_candidates.domain.l r5 = r0.f129388q
            kotlin.C42729a0.b(r8)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            h31.e<iP.a> r8 = r4.f129392a
            java.lang.Object r8 = r8.get()
            iP.a r8 = (iP.InterfaceC41329a) r8
            nP.a r2 = new nP.a
            r2.<init>(r5, r6, r7)
            r0.f129388q = r4
            r0.f129391t = r3
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r6 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L69
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r6 = r8.getResult()
            nP.d r6 = (nP.C44308d) r6
            com.avito.android.crm_candidates.domain.o r5 = r5.f129394c
            com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r5 = r5.g(r6)
            com.avito.android.remote.model.TypedResult$Success r8 = new com.avito.android.remote.model.TypedResult$Success
            r8.<init>(r5)
            goto L6d
        L69:
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L6e
        L6d:
            return r8
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.b(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // Us.InterfaceC15563a
    @Y61.k
    public final List<JobCrmListFilterItem> c(@Y61.k String str) {
        switch (str.hashCode()) {
            case -1249512767:
                if (str.equals("gender")) {
                    return this.f129405n;
                }
                break;
            case -727131559:
                if (str.equals("vacancies")) {
                    return this.f129409r;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    return this.f129408q;
                }
                break;
            case 835260333:
                if (str.equals("manager")) {
                    return this.f129407p;
                }
                break;
            case 1318692896:
                if (str.equals("statuses")) {
                    return this.f129403l;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    return this.f129406o;
                }
                break;
            case 1990574480:
                if (str.equals("applicationStatuses")) {
                    return this.f129404m;
                }
                break;
        }
        V2.f318762a.d("JobCrmCandidatesInteractor", "List filter is empty.");
        return C42784z0.f406748b;
    }

    @Override // Ss.InterfaceC15218a
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final JobCrmListFilterItem getF129410s() {
        return this.f129410s;
    }

    @Override // Ss.InterfaceC15218a
    @Y61.l
    public final List e() {
        return this.f129411t;
    }

    @Override // Os.InterfaceC14731a
    @Y61.l
    public final G0 f() {
        this.f129413v = true;
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Os.InterfaceC14731a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.crm_candidates.domain.e
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.crm_candidates.domain.e r0 = (com.avito.android.crm_candidates.domain.e) r0
            int r1 = r0.f129366t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129366t = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.domain.e r0 = new com.avito.android.crm_candidates.domain.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f129364r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129366t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.crm_candidates.domain.l r5 = r0.f129363q
            kotlin.C42729a0.b(r7)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            h31.e<iP.a> r7 = r4.f129392a
            java.lang.Object r7 = r7.get()
            iP.a r7 = (iP.InterfaceC41329a) r7
            r0.f129363q = r4
            r0.f129366t = r3
            java.lang.Object r7 = r7.d(r6, r5, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L64
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            jP.a r6 = (jP.C42292a) r6
            com.avito.android.crm_candidates.domain.o r5 = r5.f129394c
            com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r5 = r5.c(r6)
            com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
            r7.<init>(r5)
            goto L68
        L64:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L69
        L68:
            return r7
        L69:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.g(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final Object getAll() {
        return C42784z0.f406748b;
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final G0 h(@Y61.k String str) {
        return G0.f406611a;
    }

    @Override // Ss.InterfaceC15218a
    @Y61.l
    public final G0 i() {
        this.f129395d = null;
        this.f129399h = z();
        this.f129400i = null;
        this.f129402k = null;
        this.f129396e = null;
        this.f129401j = null;
        this.f129397f = null;
        this.f129398g = null;
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // Ss.InterfaceC15218a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.j(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final G0 k(@Y61.k List list) {
        return G0.f406611a;
    }

    @Override // Us.InterfaceC15563a
    @Y61.l
    public final Object l(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Os.InterfaceC14731a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.crm_candidates.domain.f
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.crm_candidates.domain.f r0 = (com.avito.android.crm_candidates.domain.f) r0
            int r1 = r0.f129370t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129370t = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.domain.f r0 = new com.avito.android.crm_candidates.domain.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f129368r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129370t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.avito.android.crm_candidates.domain.l r0 = r0.f129367q
            kotlin.C42729a0.b(r6)
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            boolean r6 = r5.f129413v
            if (r6 == 0) goto L3c
            return r3
        L3c:
            com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem r6 = r5.f129412u
            if (r6 != 0) goto L77
            h31.e<iP.a> r6 = r5.f129392a
            java.lang.Object r6 = r6.get()
            iP.a r6 = (iP.InterfaceC41329a) r6
            r0.f129367q = r5
            r0.f129370t = r4
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r5
        L54:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L69
            com.avito.android.crm_candidates.domain.o r1 = r0.f129394c
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            lP.a r6 = (lP.C43667a) r6
            com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner.JobCrmBannerItem r3 = r1.i(r6)
            goto L6d
        L69:
            boolean r6 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r6 == 0) goto L71
        L6d:
            r0.f129412u = r3
            r6 = r3
            goto L77
        L71:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.m(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // Os.InterfaceC14731a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.l java.lang.String r23, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.n(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // Us.InterfaceC15563a
    @Y61.l
    public final G0 o(@Y61.k String str, @Y61.k List list) {
        switch (str.hashCode()) {
            case -1249512767:
                if (str.equals("gender")) {
                    this.f129405n = list;
                    break;
                }
                break;
            case -727131559:
                if (str.equals("vacancies")) {
                    this.f129409r = list;
                    break;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    this.f129408q = list;
                    break;
                }
                break;
            case 835260333:
                if (str.equals("manager")) {
                    this.f129407p = list;
                    break;
                }
                break;
            case 1318692896:
                if (str.equals("statuses")) {
                    this.f129403l = list;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    this.f129406o = list;
                    break;
                }
                break;
            case 1990574480:
                if (str.equals("applicationStatuses")) {
                    this.f129404m = list;
                    break;
                }
                break;
        }
        u(str);
        return G0.f406611a;
    }

    @Override // Ss.InterfaceC15218a
    @Y61.k
    public final List p(@Y61.k ArrayList arrayList) {
        o oVar = this.f129394c;
        this.f129408q = oVar.l("date", arrayList);
        this.f129406o = oVar.l("location", arrayList);
        this.f129409r = oVar.l("vacancies", arrayList);
        this.f129403l = oVar.l("statuses", arrayList);
        this.f129404m = oVar.l("applicationStatuses", arrayList);
        this.f129407p = oVar.l("manager", arrayList);
        this.f129410s = oVar.h(arrayList);
        this.f129405n = oVar.l("gender", arrayList);
        this.f129411t = oVar.m(arrayList);
        u(ProfileTab.ALL);
        return this.f129411t;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Os.InterfaceC14731a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(@Y61.k com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.crm_candidates.domain.j
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.crm_candidates.domain.j r0 = (com.avito.android.crm_candidates.domain.j) r0
            int r1 = r0.f129387u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129387u = r1
            goto L18
        L13:
            com.avito.android.crm_candidates.domain.j r0 = new com.avito.android.crm_candidates.domain.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f129385s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f129387u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r5 = r0.f129384r
            com.avito.android.crm_candidates.domain.l r0 = r0.f129383q
            kotlin.C42729a0.b(r6)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            h31.e<iP.a> r6 = r4.f129392a
            java.lang.Object r6 = r6.get()
            iP.a r6 = (iP.InterfaceC41329a) r6
            java.lang.String r2 = r5.f130021s
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.f129383q = r4
            r0.f129384r = r5
            r0.f129387u = r3
            java.lang.Object r6 = r6.b(r2, r3, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            r0 = r4
        L54:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L6e
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            oP.a r6 = (oP.C44674a) r6
            com.avito.android.crm_candidates.domain.o r0 = r0.f129394c
            com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem r5 = r0.a(r5, r6)
            com.avito.android.remote.model.TypedResult$Success r6 = new com.avito.android.remote.model.TypedResult$Success
            r6.<init>(r5)
            goto L72
        L6e:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L73
        L72:
            return r6
        L73:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.domain.l.q(com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void r() {
        List<JobCrmListFilterItem> list = this.f129404m;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((JobCrmListFilterItem) obj).f130139e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((JobCrmListFilterItem) it.next()).f130144j);
        }
        this.f129396e = new b.C3844b(arrayList2);
    }

    public final void s() {
        Object next;
        b.c cVarZ;
        DateInterval dateInterval;
        Iterator<T> it = this.f129408q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((JobCrmListFilterItem) next).f130139e) {
                    break;
                }
            }
        }
        JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) next;
        if (jobCrmListFilterItem == null || (dateInterval = jobCrmListFilterItem.f130142h) == null) {
            cVarZ = z();
        } else if (dateInterval instanceof DateInterval.Calendar) {
            DateInterval.Calendar calendar = (DateInterval.Calendar) dateInterval;
            cVarZ = new b.c(calendar.f129333b, calendar.f129334c, dateInterval.getF129339c());
        } else {
            Q<Long, Long> qU6 = dateInterval.u6();
            cVarZ = new b.c(qU6.f406619b.longValue(), qU6.f406620c.longValue(), dateInterval.getF129339c());
        }
        this.f129399h = cVarZ;
    }

    public final void t() {
        List<JobCrmListFilterItem> list = this.f129407p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((JobCrmListFilterItem) obj).f130139e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((JobCrmListFilterItem) it.next()).f130144j);
        }
        this.f129401j = new b.d(arrayList2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void u(String str) {
        Q<Long, Long> q12;
        Q<Long, Long> q13;
        b.a aVar = null;
        switch (str.hashCode()) {
            case -1249512767:
                if (str.equals("gender")) {
                    v();
                    break;
                }
                break;
            case -727131559:
                if (str.equals("vacancies")) {
                    y();
                    break;
                }
                break;
            case 96511:
                if (str.equals("age")) {
                    JobCrmListFilterItem jobCrmListFilterItem = this.f129410s;
                    if (jobCrmListFilterItem != null && (q12 = jobCrmListFilterItem.f130143i) != null) {
                        aVar = new b.a(q12.f406619b, q12.f406620c);
                    }
                    this.f129397f = aVar;
                    break;
                }
                break;
            case 96673:
                if (str.equals(ProfileTab.ALL)) {
                    s();
                    x();
                    w();
                    y();
                    r();
                    t();
                    JobCrmListFilterItem jobCrmListFilterItem2 = this.f129410s;
                    if (jobCrmListFilterItem2 != null && (q13 = jobCrmListFilterItem2.f130143i) != null) {
                        aVar = new b.a(q13.f406619b, q13.f406620c);
                    }
                    this.f129397f = aVar;
                    v();
                    break;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    s();
                    break;
                }
                break;
            case 835260333:
                if (str.equals("manager")) {
                    t();
                    break;
                }
                break;
            case 1318692896:
                if (str.equals("statuses")) {
                    x();
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    w();
                    break;
                }
                break;
            case 1990574480:
                if (str.equals("applicationStatuses")) {
                    r();
                    break;
                }
                break;
        }
    }

    public final void v() {
        b.e eVar;
        Object next;
        String str;
        Long lZ02;
        Iterator<T> it = this.f129405n.iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((JobCrmListFilterItem) next).f130139e) {
                    break;
                }
            }
        }
        JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) next;
        if (jobCrmListFilterItem != null && (str = jobCrmListFilterItem.f130144j) != null && (lZ02 = C43066x.z0(str)) != null) {
            eVar = new b.e(lZ02.longValue());
        }
        this.f129398g = eVar;
    }

    public final void w() {
        List<JobCrmListFilterItem> list = this.f129406o;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((JobCrmListFilterItem) obj).f130139e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((JobCrmListFilterItem) it.next()).f130144j);
        }
        this.f129400i = new b.f(arrayList2);
    }

    public final void x() {
        Object next;
        Iterator<T> it = this.f129403l.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((JobCrmListFilterItem) next).f130139e) {
                    break;
                }
            }
        }
        JobCrmListFilterItem jobCrmListFilterItem = (JobCrmListFilterItem) next;
        this.f129395d = new b.g(C42745f0.V(jobCrmListFilterItem != null ? jobCrmListFilterItem.f130144j : null));
    }

    public final void y() {
        List<JobCrmListFilterItem> list = this.f129409r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((JobCrmListFilterItem) obj).f130139e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((JobCrmListFilterItem) it.next()).f130144j);
        }
        this.f129402k = new b.h(arrayList2);
    }
}
