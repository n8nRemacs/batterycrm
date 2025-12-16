package com.avito.android.crm_candidates.view.base;

import Ps.InterfaceC14834b;
import Ts.InterfaceC15402b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C22960s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import com.avito.android.crm_candidates.view.base.JobCrmFullFiltersFragment;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Badge;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Enrichment;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.Vacancy;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.C42670a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: JobCrmCandidatesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$1", f = "JobCrmCandidatesFragment.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class A extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129738q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ JobCrmCandidatesFragment f129739r;

    /* compiled from: JobCrmCandidatesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$1$1", f = "JobCrmCandidatesFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f129740q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ JobCrmCandidatesFragment f129741r;

        /* compiled from: JobCrmCandidatesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$1$1$1", f = "JobCrmCandidatesFragment.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.crm_candidates.view.base.A$a$a, reason: collision with other inner class name */
        public static final class C3846a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f129742q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobCrmCandidatesFragment f129743r;

            /* compiled from: JobCrmCandidatesFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.crm_candidates.view.base.A$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C3847a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ JobCrmCandidatesFragment f129744b;

                public C3847a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
                    this.f129744b = jobCrmCandidatesFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v12 */
                /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference failed for: r11v34 */
                /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference failed for: r11v56 */
                /* JADX WARN: Type inference failed for: r11v57 */
                /* JADX WARN: Type inference failed for: r4v18 */
                /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference failed for: r4v30 */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Integer num;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    InterfaceC14834b interfaceC14834b = (InterfaceC14834b) obj;
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129744b;
                    if (interfaceC14834b instanceof InterfaceC14834b.a) {
                        jobCrmCandidatesFragment.u5();
                    } else if (interfaceC14834b instanceof InterfaceC14834b.C0873b) {
                        com.avito.android.crm_candidates.view.ui.counter_view.b bVar = jobCrmCandidatesFragment.f129816x0;
                        (bVar != null ? bVar : null).a();
                    } else if (interfaceC14834b instanceof InterfaceC14834b.c) {
                        InterfaceC14834b.c cVar = (InterfaceC14834b.c) interfaceC14834b;
                        JobCrmApplicationItem jobCrmApplicationItem = cVar.f13360a;
                        Context contextRequireContext = jobCrmCandidatesFragment.requireContext();
                        String str = jobCrmApplicationItem.f130004b;
                        com.avito.android.crm_candidates.view.dialogs.i iVar = jobCrmApplicationItem.f130011i != null ? new com.avito.android.crm_candidates.view.dialogs.i(null, null, null, new C29639q(jobCrmCandidatesFragment, cVar), 7, null) : null;
                        com.avito.android.crm_candidates.view.dialogs.i iVar2 = jobCrmApplicationItem.f130012j != null ? new com.avito.android.crm_candidates.view.dialogs.i(null, null, null, new r(jobCrmCandidatesFragment, cVar), 7, null) : null;
                        com.avito.android.crm_candidates.view.dialogs.i iVar3 = jobCrmApplicationItem.f130013k != null ? new com.avito.android.crm_candidates.view.dialogs.i(null, null, null, new s(jobCrmCandidatesFragment, cVar), 7, null) : null;
                        com.avito.android.crm_candidates.view.dialogs.i iVar4 = new com.avito.android.crm_candidates.view.dialogs.i(null, null, null, new t(jobCrmCandidatesFragment, cVar), 7, null);
                        boolean z12 = false;
                        Enrichment enrichment = jobCrmApplicationItem.f130019q;
                        com.avito.android.crm_candidates.view.dialogs.i iVar5 = (enrichment == null || (arrayList2 = enrichment.f130003g) == null) ? false : arrayList2.isEmpty() ^ true ? iVar4 : null;
                        com.avito.android.crm_candidates.view.dialogs.i iVar6 = new com.avito.android.crm_candidates.view.dialogs.i(null, null, null, new u(jobCrmCandidatesFragment, cVar), 7, null);
                        Enrichment enrichment2 = jobCrmApplicationItem.f130020r;
                        com.avito.android.crm_candidates.view.dialogs.i iVar7 = (enrichment2 == null || (arrayList = enrichment2.f130003g) == null) ? false : arrayList.isEmpty() ^ true ? iVar6 : null;
                        com.avito.android.crm_candidates.view.dialogs.i iVar8 = jobCrmApplicationItem.f130014l != null ? new com.avito.android.crm_candidates.view.dialogs.i(null, null, null, new C29636n(jobCrmCandidatesFragment, cVar), 7, null) : null;
                        JobCrmApplicationItem jobCrmApplicationItem2 = cVar.f13360a;
                        com.avito.android.crm_candidates.view.dialogs.i iVar9 = new com.avito.android.crm_candidates.view.dialogs.i(null, null, Integer.valueOf(jobCrmApplicationItem2.f130010h.size()), new C29637o(jobCrmCandidatesFragment, cVar), 3, null);
                        Vacancy vacancy = jobCrmApplicationItem2.f130015m;
                        com.avito.android.crm_candidates.view.dialogs.i iVar10 = new com.avito.android.crm_candidates.view.dialogs.i(vacancy != null ? vacancy.f130030b : null, vacancy != null ? vacancy.f130031c : null, null, new C29638p(jobCrmApplicationItem, jobCrmCandidatesFragment), 4, null);
                        if (!(jobCrmApplicationItem.f130015m != null)) {
                            iVar10 = null;
                        }
                        Y41.a<G0> aVar2 = null;
                        com.avito.android.crm_candidates.view.dialogs.g gVar = new com.avito.android.crm_candidates.view.dialogs.g(contextRequireContext, 0, 2, null);
                        gVar.setContentView(R.layout.job_employers_crm_candidates_options_fragment);
                        com.avito.android.lib.design.bottom_sheet.d.I(gVar, true);
                        com.avito.android.lib.design.bottom_sheet.d.M(gVar, null, false, true, 7);
                        I5.a((TextView) gVar.findViewById(R.id.options_title), str, false);
                        FlexboxLayout flexboxLayout = (FlexboxLayout) gVar.findViewById(R.id.options_badges);
                        flexboxLayout.removeAllViews();
                        Iterator it = jobCrmApplicationItem.f130009g.iterator();
                        while (it.hasNext()) {
                            Badge badge = (Badge) it.next();
                            String str2 = badge.f129995b;
                            Integer num2 = badge.f129997d;
                            if (num2 != null) {
                                int iIntValue = num2.intValue();
                                FV.a.f4720a.getClass();
                                FV.a.i(str2, contextRequireContext, iIntValue, FV.a.f4721b);
                            }
                            G0 g02 = G0.f406611a;
                            DockingBadgeSize dockingBadgeSize = DockingBadgeSize.SMALL;
                            DockingBadgeEdgeType dockingBadgeEdgeType = DockingBadgeEdgeType.Square;
                            Iterator it2 = it;
                            View dockingBadge = new DockingBadge(contextRequireContext, str2, badge.f129996c, dockingBadgeSize, dockingBadgeEdgeType, dockingBadgeEdgeType);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.setMargins(0, y6.b(3), y6.b(3), 0);
                            dockingBadge.setLayoutParams(marginLayoutParams);
                            flexboxLayout.addView(dockingBadge);
                            iVar5 = iVar5;
                            iVar7 = iVar7;
                            z12 = false;
                            aVar2 = null;
                            it = it2;
                            iVar9 = iVar9;
                            iVar10 = iVar10;
                            contextRequireContext = contextRequireContext;
                            iVar8 = iVar8;
                        }
                        com.avito.android.crm_candidates.view.dialogs.i iVar11 = iVar10;
                        com.avito.android.crm_candidates.view.dialogs.i iVar12 = iVar9;
                        com.avito.android.crm_candidates.view.dialogs.i iVar13 = iVar8;
                        com.avito.android.crm_candidates.view.dialogs.i iVar14 = iVar7;
                        com.avito.android.crm_candidates.view.dialogs.i iVar15 = iVar5;
                        boolean z13 = z12;
                        Y41.a<G0> aVar3 = aVar2;
                        View viewFindViewById = gVar.findViewById(R.id.call_layout);
                        D6.G(viewFindViewById, iVar != null ? true : z13);
                        gVar.V(iVar != null ? iVar.f129994d : aVar3, viewFindViewById);
                        View viewFindViewById2 = gVar.findViewById(R.id.chat_layout);
                        D6.G(viewFindViewById2, iVar2 != null ? true : z13);
                        gVar.V(iVar2 != null ? iVar2.f129994d : aVar3, viewFindViewById2);
                        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.option_chat_unread_count);
                        if (viewFindViewById3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        I5.a((TextView) viewFindViewById3, (iVar2 == null || (num = iVar2.f129993c) == null) ? aVar3 : num.toString(), z13);
                        View viewFindViewById4 = gVar.findViewById(R.id.cv_layout);
                        D6.G(viewFindViewById4, iVar3 != null ? true : z13);
                        gVar.V(iVar3 != null ? iVar3.f129994d : aVar3, viewFindViewById4);
                        View viewFindViewById5 = gVar.findViewById(R.id.enrichment_layout);
                        D6.G(viewFindViewById5, iVar15 != null ? true : z13);
                        gVar.V(iVar15 != null ? iVar15.f129994d : aVar3, viewFindViewById5);
                        View viewFindViewById6 = gVar.findViewById(R.id.chatbot_layout);
                        D6.G(viewFindViewById6, iVar14 != null ? true : z13);
                        gVar.V(iVar14 != null ? iVar14.f129994d : aVar3, viewFindViewById6);
                        View viewFindViewById7 = gVar.findViewById(R.id.status_layout);
                        D6.G(viewFindViewById7, iVar13 != null ? true : z13);
                        gVar.V(iVar13 != null ? iVar13.f129994d : aVar3, viewFindViewById7);
                        View viewFindViewById8 = gVar.findViewById(R.id.notes_layout);
                        D6.G(viewFindViewById8, true);
                        gVar.V(iVar12.f129994d, viewFindViewById8);
                        View viewFindViewById9 = viewFindViewById8.findViewById(R.id.option_notes_count);
                        if (viewFindViewById9 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        TextView textView = (TextView) viewFindViewById9;
                        Integer num3 = iVar12.f129993c;
                        if (num3 == null || num3.intValue() == 0) {
                            D6.w(textView);
                        } else {
                            I5.a(textView, num3.toString(), z13);
                        }
                        View viewFindViewById10 = gVar.findViewById(R.id.vacancy_layout);
                        D6.G(viewFindViewById10, iVar11 != null ? true : z13);
                        gVar.V(iVar11 != null ? iVar11.f129994d : aVar3, viewFindViewById10);
                        View viewFindViewById11 = viewFindViewById10.findViewById(R.id.option_vacancy_title);
                        if (viewFindViewById11 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        I5.a((TextView) viewFindViewById11, iVar11 != null ? iVar11.f129991a : aVar3, z13);
                        View viewFindViewById12 = viewFindViewById10.findViewById(R.id.option_vacancy_description);
                        if (viewFindViewById12 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        I5.a((TextView) viewFindViewById12, iVar11 != null ? iVar11.f129992b : aVar3, z13);
                        com.avito.android.lib.util.g.a(gVar);
                    } else if (interfaceC14834b instanceof InterfaceC14834b.d) {
                        InterfaceC14834b.d dVar = (InterfaceC14834b.d) interfaceC14834b;
                        JobCrmApplicationItem jobCrmApplicationItem3 = dVar.f13361a;
                        Enrichment enrichment3 = jobCrmApplicationItem3.f130019q;
                        boolean z14 = dVar.f13362b;
                        if ((enrichment3 != null && !z14) || ((enrichment3 = jobCrmApplicationItem3.f130020r) != null && z14)) {
                            Context contextRequireContext2 = jobCrmCandidatesFragment.requireContext();
                            com.avito.konveyor.adapter.d dVar2 = jobCrmCandidatesFragment.f129815w0;
                            com.avito.android.lib.util.g.a(new com.avito.android.crm_candidates.view.dialogs.h(contextRequireContext2, enrichment3, dVar2 != null ? dVar2 : null));
                        }
                    }
                    G0 g03 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g03;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f129744b, JobCrmCandidatesFragment.class, "handleApplicationListEvent", "handleApplicationListEvent(Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3846a(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super C3846a> continuation) {
                super(2, continuation);
                this.f129743r = jobCrmCandidatesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C3846a(this.f129743r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3846a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f129742q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129743r;
                    InterfaceC43160i<InterfaceC14834b> events = jobCrmCandidatesFragment.s5().getEvents();
                    C3847a c3847a = new C3847a(jobCrmCandidatesFragment);
                    this.f129742q = 1;
                    if (events.collect(c3847a, this) == coroutine_suspended) {
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

        /* compiled from: JobCrmCandidatesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$1$1$2", f = "JobCrmCandidatesFragment.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f129745q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobCrmCandidatesFragment f129746r;

            /* compiled from: JobCrmCandidatesFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.crm_candidates.view.base.A$a$b$a, reason: collision with other inner class name */
            public static final class C3848a extends kotlin.jvm.internal.N implements Y41.l<JobCrmApplicationsListState, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ JobCrmCandidatesFragment f129747l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3848a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
                    super(1);
                    this.f129747l = jobCrmCandidatesFragment;
                }

                @Override // Y41.l
                public final G0 invoke(JobCrmApplicationsListState jobCrmApplicationsListState) {
                    JobCrmApplicationsListState jobCrmApplicationsListState2 = jobCrmApplicationsListState;
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129747l;
                    if (jobCrmApplicationsListState2.f129500e) {
                        C42670a c42670a = jobCrmCandidatesFragment.f129801J0;
                        if (c42670a == null) {
                            c42670a = null;
                        }
                        c42670a.c(null, new C29634l(jobCrmCandidatesFragment));
                    } else if (jobCrmApplicationsListState2.f129498c) {
                        C42670a c42670a2 = jobCrmCandidatesFragment.f129801J0;
                        C42670a.d(c42670a2 != null ? c42670a2 : null);
                    } else {
                        C42670a c42670a3 = jobCrmCandidatesFragment.f129801J0;
                        if (c42670a3 == null) {
                            c42670a3 = null;
                        }
                        c42670a3.b();
                        com.avito.konveyor.adapter.d dVar = jobCrmCandidatesFragment.f129812t0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        dVar.l(jobCrmApplicationsListState2.f129501f, null);
                        SwipeRefreshLayout swipeRefreshLayout = jobCrmCandidatesFragment.f129798G0;
                        if (swipeRefreshLayout == null) {
                            swipeRefreshLayout = null;
                        }
                        swipeRefreshLayout.setRefreshing(jobCrmApplicationsListState2.f129499d);
                        int iOrdinal = jobCrmApplicationsListState2.f129497b.ordinal();
                        if (iOrdinal == 0) {
                            SwipeRefreshLayout swipeRefreshLayout2 = jobCrmCandidatesFragment.f129798G0;
                            if (swipeRefreshLayout2 == null) {
                                swipeRefreshLayout2 = null;
                            }
                            D6.G(swipeRefreshLayout2, true);
                            View view = jobCrmCandidatesFragment.f129799H0;
                            D6.w(view != null ? view : null);
                        } else if (iOrdinal == 1) {
                            SwipeRefreshLayout swipeRefreshLayout3 = jobCrmCandidatesFragment.f129798G0;
                            if (swipeRefreshLayout3 == null) {
                                swipeRefreshLayout3 = null;
                            }
                            D6.w(swipeRefreshLayout3);
                            View view2 = jobCrmCandidatesFragment.f129799H0;
                            D6.G(view2 != null ? view2 : null, true);
                        } else if (iOrdinal == 2) {
                            SwipeRefreshLayout swipeRefreshLayout4 = jobCrmCandidatesFragment.f129798G0;
                            if (swipeRefreshLayout4 == null) {
                                swipeRefreshLayout4 = null;
                            }
                            D6.w(swipeRefreshLayout4);
                            View view3 = jobCrmCandidatesFragment.f129799H0;
                            D6.w(view3 != null ? view3 : null);
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f129746r = jobCrmCandidatesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f129746r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f129745q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129746r;
                    n2<JobCrmApplicationsListState> state = jobCrmCandidatesFragment.s5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = jobCrmCandidatesFragment.f129817y0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C3848a c3848a = new C3848a(jobCrmCandidatesFragment);
                    this.f129745q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3848a, this) == coroutine_suspended) {
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

        /* compiled from: JobCrmCandidatesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$1$1$3", f = "JobCrmCandidatesFragment.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f129748q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobCrmCandidatesFragment f129749r;

            /* compiled from: JobCrmCandidatesFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.crm_candidates.view.base.A$a$c$a, reason: collision with other inner class name */
            public /* synthetic */ class C3849a implements InterfaceC43172j, kotlin.jvm.internal.D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ JobCrmCandidatesFragment f129750b;

                public C3849a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
                    this.f129750b = jobCrmCandidatesFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC15402b interfaceC15402b = (InterfaceC15402b) obj;
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129750b;
                    if (interfaceC15402b instanceof InterfaceC15402b.a) {
                        jobCrmCandidatesFragment.u5();
                    } else if (interfaceC15402b instanceof InterfaceC15402b.C1086b) {
                        JobCrmInlineFilterItem jobCrmInlineFilterItem = ((InterfaceC15402b.C1086b) interfaceC15402b).f15960a;
                        String str = jobCrmInlineFilterItem.f130107f;
                        Context contextRequireContext = jobCrmCandidatesFragment.requireContext();
                        com.avito.konveyor.a aVar2 = jobCrmCandidatesFragment.f129814v0;
                        com.avito.android.crm_candidates.view.dialogs.b bVar = new com.avito.android.crm_candidates.view.dialogs.b(str, contextRequireContext, aVar2 != null ? aVar2 : null, new v(jobCrmCandidatesFragment), new w(jobCrmCandidatesFragment), new x(jobCrmCandidatesFragment), new z(jobCrmCandidatesFragment, jobCrmInlineFilterItem.f130103b));
                        jobCrmCandidatesFragment.f129804M0 = bVar;
                        com.avito.android.lib.util.g.a(bVar);
                    } else if (interfaceC15402b instanceof InterfaceC15402b.c) {
                        ArrayList arrayList = ((InterfaceC15402b.c) interfaceC15402b).f15961a;
                        C22960s.b(jobCrmCandidatesFragment, "FILTER_RESULT", new C29635m(jobCrmCandidatesFragment));
                        androidx.fragment.app.H hE2 = jobCrmCandidatesFragment.getParentFragmentManager().e();
                        JobCrmFullFiltersFragment.f129843x0.getClass();
                        JobCrmFullFiltersFragment jobCrmFullFiltersFragment = new JobCrmFullFiltersFragment();
                        C35966w1.a(jobCrmFullFiltersFragment, -1, new E(arrayList));
                        hE2.j(R.id.fragment_container, jobCrmFullFiltersFragment, null, 1);
                        hE2.c(JobCrmFullFiltersFragment.a.class.getSimpleName());
                        hE2.e();
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                        return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f129750b, JobCrmCandidatesFragment.class, "handleInlineFiltersEvent", "handleInlineFiltersEvent(Lcom/avito/android/crm_candidates/features/inline_filters/entity/JobCrmInlineFiltersOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f129749r = jobCrmCandidatesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f129749r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f129748q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129749r;
                    InterfaceC43160i<InterfaceC15402b> events = jobCrmCandidatesFragment.r5().getEvents();
                    C3849a c3849a = new C3849a(jobCrmCandidatesFragment);
                    this.f129748q = 1;
                    if (events.collect(c3849a, this) == coroutine_suspended) {
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

        /* compiled from: JobCrmCandidatesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment$subscribeToFeatures$1$1$4", f = "JobCrmCandidatesFragment.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f129751q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ JobCrmCandidatesFragment f129752r;

            /* compiled from: JobCrmCandidatesFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTs/c;", "it", "Lkotlin/G0;", "invoke", "(LTs/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.crm_candidates.view.base.A$a$d$a, reason: collision with other inner class name */
            public static final class C3850a extends kotlin.jvm.internal.N implements Y41.l<Ts.c, G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ JobCrmCandidatesFragment f129753l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3850a(JobCrmCandidatesFragment jobCrmCandidatesFragment) {
                    super(1);
                    this.f129753l = jobCrmCandidatesFragment;
                }

                @Override // Y41.l
                public final G0 invoke(Ts.c cVar) {
                    Ts.c cVar2 = cVar;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129753l;
                    com.avito.konveyor.adapter.d dVar = jobCrmCandidatesFragment.f129813u0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(cVar2.f15962b, null);
                    RecyclerView recyclerView = jobCrmCandidatesFragment.f129796E0;
                    D6.G(recyclerView != null ? recyclerView : null, !r4.isEmpty());
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f129752r = jobCrmCandidatesFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f129752r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f129751q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                    JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129752r;
                    n2<Ts.c> state = jobCrmCandidatesFragment.r5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = jobCrmCandidatesFragment.f129817y0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C3850a c3850a = new C3850a(jobCrmCandidatesFragment);
                    this.f129751q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3850a, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f129741r = jobCrmCandidatesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f129741r, continuation);
            aVar.f129740q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f129740q;
            JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129741r;
            C43259k.d(t12, null, null, new C3846a(jobCrmCandidatesFragment, null), 3);
            C43259k.d(t12, null, null, new b(jobCrmCandidatesFragment, null), 3);
            C43259k.d(t12, null, null, new c(jobCrmCandidatesFragment, null), 3);
            C43259k.d(t12, null, null, new d(jobCrmCandidatesFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(JobCrmCandidatesFragment jobCrmCandidatesFragment, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f129739r = jobCrmCandidatesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new A(this.f129739r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f129738q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46681d;
            JobCrmCandidatesFragment jobCrmCandidatesFragment = this.f129739r;
            a aVar = new a(jobCrmCandidatesFragment, null);
            this.f129738q = 1;
            if (C23056p0.b(jobCrmCandidatesFragment, state, aVar, this) == coroutine_suspended) {
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
