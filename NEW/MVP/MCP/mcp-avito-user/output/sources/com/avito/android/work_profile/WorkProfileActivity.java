package com.avito.android.work_profile;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.C35961v3;
import com.avito.android.work_profile.profile.work_profile_host.ui.WorkProfileHostFragment;
import cv.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: WorkProfileActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/WorkProfileActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkProfileActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f330595o = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f330596m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Object f330597n = C35961v3.a(this);

    /* compiled from: WorkProfileActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/WorkProfileActivity$a;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (!isTaskRoot()) {
            super.onBackPressed();
            return;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f330596m;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new MainScreenLink(null, null, false, 7, null), null, null, 6);
        finish();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.work_profile.di.a.a().a(c.a(this), this).a(this);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            WorkProfileHostFragment.a aVar = WorkProfileHostFragment.f331291s0;
            WorkProfileOpenParams workProfileOpenParams = (WorkProfileOpenParams) this.f330597n.getValue();
            aVar.getClass();
            WorkProfileHostFragment workProfileHostFragment = new WorkProfileHostFragment();
            workProfileHostFragment.f331295p0.setValue(workProfileHostFragment, WorkProfileHostFragment.f331292t0[0], workProfileOpenParams);
            hE2.n(R.id.fragment_container, workProfileHostFragment, null);
            hE2.e();
        }
    }
}
