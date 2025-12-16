package com.avito.android.select_districts;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;

/* compiled from: SelectDistrictsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select_districts/SelectDistrictsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectDistrictsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_select_districts;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            SelectDistrictsScreenParams selectDistrictsScreenParams = (SelectDistrictsScreenParams) C35961v3.a(this).getValue();
            H hE2 = getSupportFragmentManager().e();
            SelectDistrictsFragment.f266887t0.getClass();
            SelectDistrictsFragment selectDistrictsFragment = new SelectDistrictsFragment();
            selectDistrictsFragment.f266889n0.setValue(selectDistrictsFragment, SelectDistrictsFragment.f266888u0[0], selectDistrictsScreenParams);
            hE2.n(R.id.container, selectDistrictsFragment, null);
            hE2.f();
        }
    }
}
