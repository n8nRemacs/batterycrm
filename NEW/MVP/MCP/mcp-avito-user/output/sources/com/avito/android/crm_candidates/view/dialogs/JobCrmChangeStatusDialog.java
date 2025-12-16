package com.avito.android.crm_candidates.view.dialogs;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.crm_candidates.deeplink.change_status.JobCrmChangeStatusDeeplink;
import com.avito.android.crm_candidates.view.list_items.list_filter.JobCrmListFilterItem;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmChangeStatusDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/view/dialogs/JobCrmChangeStatusDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JobCrmChangeStatusDialog extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f129955k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f129956h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public com.avito.konveyor.adapter.d f129957i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public List<JobCrmListFilterItem> f129958j0;

    /* compiled from: JobCrmChangeStatusDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/crm_candidates/view/dialogs/JobCrmChangeStatusDialog$a;", "", "<init>", "()V", "", "CHANGE_STATUS_RESULT", "Ljava/lang/String;", "DEEPLINK_CONFIG", "HANDLE_ID", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: JobCrmChangeStatusDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.crm_candidates.view.dialogs.JobCrmChangeStatusDialog$a$a, reason: collision with other inner class name */
        public static final class C3855a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ JobCrmChangeStatusDeeplink.JobApplicationStatusConfig f129959l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f129960m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3855a(JobCrmChangeStatusDeeplink.JobApplicationStatusConfig jobApplicationStatusConfig, String str) {
                super(1);
                this.f129959l = jobApplicationStatusConfig;
                this.f129960m = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putParcelable("DEEPLINK_CONFIG", this.f129959l);
                bundle2.putString("HANDLE_ID", this.f129960m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static JobCrmChangeStatusDialog a(@k JobCrmChangeStatusDeeplink.JobApplicationStatusConfig jobApplicationStatusConfig, @k String str) {
            JobCrmChangeStatusDialog jobCrmChangeStatusDialog = new JobCrmChangeStatusDialog();
            C35966w1.a(jobCrmChangeStatusDialog, -1, new C3855a(jobApplicationStatusConfig, str));
            return jobCrmChangeStatusDialog;
        }

        public a() {
        }
    }

    /* compiled from: JobCrmChangeStatusDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f129961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(0);
            this.f129961l = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f129961l.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmChangeStatusDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f129963m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(1);
            this.f129963m = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.search);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.w(viewFindViewById);
            View viewFindViewById2 = view2.findViewById(R.id.empty_list_view);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.w(viewFindViewById2);
            View viewFindViewById3 = view2.findViewById(R.id.list);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
            view2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            JobCrmChangeStatusDialog jobCrmChangeStatusDialog = JobCrmChangeStatusDialog.this;
            recyclerView.setAdapter(jobCrmChangeStatusDialog.f129957i0);
            recyclerView.setItemAnimator(null);
            com.avito.konveyor.adapter.d dVar = jobCrmChangeStatusDialog.f129957i0;
            if (dVar != null) {
                dVar.l(jobCrmChangeStatusDialog.f129958j0, null);
            }
            View viewFindViewById4 = view2.findViewById(R.id.apply_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            viewFindViewById4.setOnClickListener(new com.avito.android.body_condition.h(29, jobCrmChangeStatusDialog, this.f129963m));
            return G0.f406611a;
        }
    }

    /* compiled from: JobCrmChangeStatusDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/crm_candidates/view/list_items/list_filter/JobCrmListFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<JobCrmListFilterItem, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(JobCrmListFilterItem jobCrmListFilterItem) {
            JobCrmListFilterItem jobCrmListFilterItem2 = jobCrmListFilterItem;
            JobCrmChangeStatusDialog jobCrmChangeStatusDialog = JobCrmChangeStatusDialog.this;
            List<JobCrmListFilterItem> list = jobCrmChangeStatusDialog.f129958j0;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (JobCrmListFilterItem jobCrmListFilterItem3 : list) {
                arrayList.add(JobCrmListFilterItem.a(jobCrmListFilterItem3, L.f(jobCrmListFilterItem2.f130144j, jobCrmListFilterItem3.f130144j), null, null, 503));
            }
            jobCrmChangeStatusDialog.f129958j0 = arrayList;
            com.avito.konveyor.adapter.d dVar = jobCrmChangeStatusDialog.f129957i0;
            if (dVar != null) {
                dVar.l(arrayList, null);
            }
            return G0.f406611a;
        }
    }

    public JobCrmChangeStatusDialog() {
        super(0, 1, null);
        this.f129958j0 = C42784z0.f406748b;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.crm_candidates.di.change_status.a.a().a(new d()).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        com.avito.konveyor.a aVar = this.f129956h0;
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar != null ? aVar : null, aVar != null ? aVar : null, null, 4, null);
        com.avito.konveyor.a aVar2 = this.f129956h0;
        this.f129957i0 = new com.avito.konveyor.adapter.d(hVar, aVar2 != null ? aVar2 : null, null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            JobCrmChangeStatusDeeplink.JobApplicationStatusConfig jobApplicationStatusConfig = (JobCrmChangeStatusDeeplink.JobApplicationStatusConfig) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("DEEPLINK_CONFIG", JobCrmChangeStatusDeeplink.JobApplicationStatusConfig.class) : arguments.getParcelable("DEEPLINK_CONFIG"));
            if (jobApplicationStatusConfig != null) {
                Set<String> setKeySet = jobApplicationStatusConfig.d().keySet();
                Map<String, String> mapC = jobApplicationStatusConfig.c();
                ArrayList arrayList = new ArrayList(mapC.size());
                for (Map.Entry<String, String> entry : mapC.entrySet()) {
                    arrayList.add(new JobCrmListFilterItem(entry.getValue(), "", "", setKeySet.contains(entry.getKey()), false, false, null, null, entry.getKey(), 128, null));
                }
                List<JobCrmListFilterItem> listM0 = C42745f0.M0(arrayList);
                if (listM0 != null) {
                    this.f129958j0 = listM0;
                }
            }
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, 0, 2, null);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.K(false);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        NavBar navBar = new NavBar(dVar.getContext(), null, 0, 6, null);
        navBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        NavBar.e(navBar, navBar.getContext().getString(R.string.change_status_title), R.attr.textH50, 4);
        navBar.c(R.attr.ic_arrowBack24, new b(dVar));
        dVar.H(navBar);
        dVar.C(R.layout.job_crm_list_filter_layout, new c(dVar));
        return dVar;
    }
}
