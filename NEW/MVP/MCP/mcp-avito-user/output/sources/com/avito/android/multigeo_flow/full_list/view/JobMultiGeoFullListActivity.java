package com.avito.android.multigeo_flow.full_list.view;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoFullListFragment;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: JobMultiGeoFullListActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/view/JobMultiGeoFullListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JobMultiGeoFullListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f206921m = new a(null);

    /* compiled from: JobMultiGeoFullListActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/view/JobMultiGeoFullListActivity$a;", "", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"CommitTransaction"})
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        H hE2 = getSupportFragmentManager().e();
        JobMultiGeoFullListFragment.a aVar = JobMultiGeoFullListFragment.f206922x0;
        JobMultiGeoParams jobMultiGeoParams = (JobMultiGeoParams) C35961v3.a(this).getValue();
        aVar.getClass();
        JobMultiGeoFullListFragment jobMultiGeoFullListFragment = new JobMultiGeoFullListFragment();
        jobMultiGeoFullListFragment.f206924n0.setValue(jobMultiGeoFullListFragment, JobMultiGeoFullListFragment.f206923y0[0], jobMultiGeoParams);
        hE2.j(R.id.fragment_container, jobMultiGeoFullListFragment, null, 1);
        hE2.e();
    }
}
