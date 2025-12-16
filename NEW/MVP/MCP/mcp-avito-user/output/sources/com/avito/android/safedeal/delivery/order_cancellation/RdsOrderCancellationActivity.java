package com.avito.android.safedeal.delivery.order_cancellation;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.RdsOrderCancellationReasonsFragment;
import com.avito.android.safedeal.delivery.order_cancellation.details.ReasonDetailsFragment;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.FbsEntryPointFragment;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RdsOrderCancellationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/RdsOrderCancellationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/o;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RdsOrderCancellationActivity extends com.avito.android.ui.activity.a implements o, InterfaceC28477j.a {
    @Override // com.avito.android.safedeal.delivery.order_cancellation.o
    public final void H0(@Y61.k ReasonRds reasonRds, int i12) {
        new ReasonDetailsFragment.a();
        String stringExtra = getIntent().getStringExtra("EXTRA_ORDER_ID");
        if (stringExtra == null) {
            throw new IllegalArgumentException("An order id was expected");
        }
        Bundle bundle = new Bundle(3);
        bundle.putParcelable("EXTRA_REASON", reasonRds);
        bundle.putString("EXTRA_ORDER_ID", stringExtra);
        bundle.putInt("EXTRA_COMMENT_MAX_LENGTH", i12);
        ReasonDetailsFragment reasonDetailsFragment = new ReasonDetailsFragment();
        reasonDetailsFragment.setArguments(bundle);
        a2(reasonDetailsFragment);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.o
    public final void I0(@Y61.k ReasonRds reasonRds) {
        K2.c(this);
        H hE2 = getSupportFragmentManager().e();
        new FbsEntryPointFragment.a();
        String stringExtra = getIntent().getStringExtra("EXTRA_ORDER_ID");
        if (stringExtra == null) {
            throw new IllegalArgumentException("An order id was expected");
        }
        Bundle bundle = new Bundle(3);
        bundle.putParcelable("EXTRA_REASON", reasonRds);
        bundle.putString("EXTRA_ORDER_ID", stringExtra);
        FbsEntryPointFragment fbsEntryPointFragment = new FbsEntryPointFragment();
        fbsEntryPointFragment.setArguments(bundle);
        hE2.n(R.id.fragment_container, fbsEntryPointFragment, null);
        hE2.f46447f = 4097;
        hE2.e();
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.safedeal.delivery.order_cancellation.di.a.a().a((com.avito.android.safedeal.delivery.di.component.b) C29972i.a(C29972i.b(this), com.avito.android.safedeal.delivery.di.component.b.class)).a(this);
    }

    public final void a2(BaseFragment baseFragment) {
        String str = baseFragment instanceof ReasonDetailsFragment ? "details" : "reasons";
        H hE2 = getSupportFragmentManager().e();
        hE2.j(R.id.fragment_container, baseFragment, null, 1);
        hE2.c(str);
        hE2.f46447f = 4097;
        hE2.e();
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.o
    public final void l0() {
        setResult(-1);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            K2.c(this);
            getSupportFragmentManager().Y();
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.delivery_rds_order_cancellation_activity);
        if (bundle == null) {
            new RdsOrderCancellationReasonsFragment.a();
            String stringExtra = getIntent().getStringExtra("EXTRA_ORDER_ID");
            if (stringExtra == null) {
                throw new IllegalStateException("An order id was expected");
            }
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("EXTRA_ORDER_ID", stringExtra);
            RdsOrderCancellationReasonsFragment rdsOrderCancellationReasonsFragment = new RdsOrderCancellationReasonsFragment();
            rdsOrderCancellationReasonsFragment.setArguments(bundle2);
            a2(rdsOrderCancellationReasonsFragment);
        }
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.o
    public final void w0(int i12) {
        K2.c(this);
        if (i12 == 0) {
            setResult(0, getIntent());
        } else {
            setResult(i12);
        }
        finish();
    }
}
