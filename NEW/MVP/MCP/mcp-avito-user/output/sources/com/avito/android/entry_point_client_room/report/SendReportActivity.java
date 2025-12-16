package com.avito.android.entry_point_client_room.report;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.entry_point_client_room.report.SendReportFragment;
import com.avito.android.util.C35961v3;
import kotlin.Metadata;

/* compiled from: SendReportActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/SendReportActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SendReportActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f147646m = C35961v3.a(this);

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            SendReportFragment.a aVar = SendReportFragment.f147647s0;
            SendReportOpenParams sendReportOpenParams = (SendReportOpenParams) this.f147646m.getValue();
            aVar.getClass();
            SendReportFragment sendReportFragment = new SendReportFragment();
            sendReportFragment.f147653r0.setValue(sendReportFragment, SendReportFragment.f147648t0[0], sendReportOpenParams);
            hE2.n(R.id.fragment_container, sendReportFragment, null);
            hE2.e();
        }
    }
}
