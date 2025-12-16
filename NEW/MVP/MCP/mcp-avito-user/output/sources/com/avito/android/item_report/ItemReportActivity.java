package com.avito.android.item_report;

import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.item_report.di.b;
import com.avito.android.util.L5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemReportActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/item_report/ItemReportActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/item_report/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_item-report_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ItemReportActivity extends com.avito.android.ui.activity.a implements a, InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        b.a aVarA = com.avito.android.item_report.di.a.a();
        aVarA.a((com.avito.android.item_report.di.c) C29972i.a(C29972i.b(this), com.avito.android.item_report.di.c.class));
        aVarA.build();
        setContentView(R.layout.fragment_container);
        if (getSupportFragmentManager().G(R.id.fragment_container) == null) {
            String stringExtra = getIntent().getStringExtra("item_id");
            ItemReportFragment itemReportFragment = new ItemReportFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("item_id", stringExtra);
            itemReportFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, itemReportFragment, null, 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.item_report.a
    public final void onError(@Y61.k String str) {
        L5.b(this, str, 0);
        finish();
    }
}
