package com.avito.android.sbc.autodispatches;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SbcAutoDispatchesActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatches/SbcAutoDispatchesActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "Lcom/avito/android/sbc/autodispatches/x;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes3.dex */
public final class SbcAutoDispatchesActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a, x {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.sbc.autodispatches.x
    public final void T0(long j12) {
        H hE2 = getSupportFragmentManager().e();
        SbcDispatchEditFragment.f260032s0.getClass();
        SbcDispatchEditFragment sbcDispatchEditFragment = new SbcDispatchEditFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("dispatch_id", j12);
        sbcDispatchEditFragment.setArguments(bundle);
        hE2.n(R.id.fragment_container, sbcDispatchEditFragment, null);
        hE2.c(SbcDispatchEditFragment.class.getName());
        hE2.e();
    }

    @Override // com.avito.android.sbc.autodispatches.x
    public final void f0(@Y61.k SbcDispatchEditResult sbcDispatchEditResult) {
        getSupportFragmentManager().o0(C22777e.b(new Q("dispatch_edit_result", Integer.valueOf(sbcDispatchEditResult.ordinal()))), "dispatch_edit_request_key");
        g1();
    }

    @Override // com.avito.android.sbc.autodispatches.x
    public final void g1() {
        if (getSupportFragmentManager().L() > 0) {
            getSupportFragmentManager().Y();
        } else {
            p();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            SbcAutoDispatchesFragment.f258822t0.getClass();
            hE2.j(R.id.fragment_container, new SbcAutoDispatchesFragment(), "fragment_sbc_auto_dispatch_list", 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.sbc.autodispatches.x
    public final void p() {
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
