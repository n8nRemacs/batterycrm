package com.avito.android.vas_performance.screens.applied_services.ui;

import Y61.l;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.favorite_sellers.C30597v;
import com.avito.android.lib.design.toast_bar.k;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.D6;
import com.avito.android.vas_performance.ui.applied_services.AppliedServicesDialogFragment;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/applied_services/ui/AppliedServicesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/vas_performance/screens/applied_services/ui/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppliedServicesActivity extends com.avito.android.ui.activity.a implements a, InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f320323o = 0;

    /* renamed from: m, reason: collision with root package name */
    public View f320324m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public k f320325n;

    @Override // com.avito.android.vas_performance.screens.applied_services.ui.a
    public final void B() {
        View view = this.f320324m;
        if (view == null) {
            view = null;
        }
        D6.w(view);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.applied_service_activity);
        this.f320324m = findViewById(R.id.progress_view);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("advert_id");
            if (getIntent().getBooleanExtra("use_mvi_version", false)) {
                AppliedServicesFragment.f320326n0.getClass();
                AppliedServicesFragment appliedServicesFragment = new AppliedServicesFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("advert_id", stringExtra);
                appliedServicesFragment.setArguments(bundle2);
                appliedServicesFragment.show(getSupportFragmentManager(), "dialog");
                return;
            }
            AppliedServicesDialogFragment.f321405s0.getClass();
            AppliedServicesDialogFragment appliedServicesDialogFragment = new AppliedServicesDialogFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putString("advert_id", stringExtra);
            appliedServicesDialogFragment.setArguments(bundle3);
            appliedServicesDialogFragment.show(getSupportFragmentManager(), "dialog");
        }
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k kVar = this.f320325n;
        if (kVar != null) {
            kVar.f();
        }
    }

    @Override // com.avito.android.vas_performance.screens.applied_services.ui.a
    public final void t2() {
        View view = this.f320324m;
        if (view == null) {
            view = null;
        }
        D6.H(view);
    }

    @Override // com.avito.android.vas_performance.screens.applied_services.ui.a
    public final void v1(@Y61.k ApiError apiError) {
        B();
        if (this.f320325n == null) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            View view = this.f320324m;
            if (view == null) {
                view = null;
            }
            this.f320325n = com.avito.android.component.toast.c.b(cVar, view, com.avito.android.printable_text.b.c(R.string.unknown_server_error, new Serializable[0]), null, null, null, new f.c(apiError), 0, null, null, false, false, new C30597v(this, 6), null, 3054);
        }
        Fragment fragmentH = getSupportFragmentManager().H("dialog");
        if (fragmentH != null) {
            H hE2 = getSupportFragmentManager().e();
            hE2.m(fragmentH);
            hE2.f();
        }
    }
}
