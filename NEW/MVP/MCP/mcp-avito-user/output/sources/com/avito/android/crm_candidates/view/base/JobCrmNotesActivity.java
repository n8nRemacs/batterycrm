package com.avito.android.crm_candidates.view.base;

import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.crm_candidates.view.base.JobCrmNotesListFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.K2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmNotesActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmNotesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JobCrmNotesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f129876m = new a(null);

    /* compiled from: JobCrmNotesActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/view/base/JobCrmNotesActivity$a;", "", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // android.app.Activity
    public final void finish() {
        K2.c(this);
        super.finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        JobCrmNotesListFragment.a aVar = JobCrmNotesListFragment.f129877u0;
        List parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("job_crm_notes_arg");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = C42784z0.f406748b;
        }
        List list = parcelableArrayListExtra;
        String stringExtra = getIntent().getStringExtra("job_crm_candidate_name_arg");
        String str = stringExtra == null ? "" : stringExtra;
        String stringExtra2 = getIntent().getStringExtra("job_crm_applicant_id_arg");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("job_crm_application_id_arg");
        String str3 = stringExtra3 == null ? "" : stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("job_crm_vacancy_id_arg");
        String str4 = stringExtra4 == null ? "" : stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("job_crm_cv_id_arg");
        String str5 = stringExtra5 == null ? "" : stringExtra5;
        aVar.getClass();
        JobCrmNotesListFragment jobCrmNotesListFragment = new JobCrmNotesListFragment();
        C35966w1.a(jobCrmNotesListFragment, -1, new M(list, str, str2, str3, str4, str5));
        hE2.j(R.id.fragment_container, jobCrmNotesListFragment, null, 1);
        hE2.e();
    }
}
