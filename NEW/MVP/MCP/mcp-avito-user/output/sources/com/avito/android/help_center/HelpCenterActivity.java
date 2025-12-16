package com.avito.android.help_center;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HelpCenterActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/help_center/HelpCenterActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HelpCenterActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.fragment.app.Fragment] */
    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        ?? r12;
        Iterator it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                r12 = 0;
                break;
            }
            r12 = (Fragment) it.next();
            if (r12 != 0 && r12.isAdded() && (r12 instanceof com.avito.android.ui.fragments.c)) {
                break;
            }
        }
        com.avito.android.ui.fragments.c cVar = (com.avito.android.ui.fragments.c) r12;
        if (cVar == null || cVar.i0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("key_url");
            HelpCenterFragment helpCenterFragment = new HelpCenterFragment();
            C35966w1.a(helpCenterFragment, -1, new C30748e(stringExtra));
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, helpCenterFragment, null, 1);
            hE2.e();
        }
    }
}
