package com.avito.android.help_center.help_center_request;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.help_center.help_center_request.HelpCenterRequestFragment;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: HelpCenterRequestActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/help_center/help_center_request/HelpCenterRequestActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpCenterRequestActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("key_theme");
            String stringExtra2 = getIntent().getStringExtra("key_advertisement_id");
            String stringExtra3 = getIntent().getStringExtra("key_context_id");
            new HelpCenterRequestFragment.a();
            HelpCenterRequestFragment helpCenterRequestFragment = new HelpCenterRequestFragment();
            C35966w1.a(helpCenterRequestFragment, 3, new d(stringExtra, stringExtra2, stringExtra3));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, helpCenterRequestFragment, null, 1);
            hE2.h();
        }
    }
}
