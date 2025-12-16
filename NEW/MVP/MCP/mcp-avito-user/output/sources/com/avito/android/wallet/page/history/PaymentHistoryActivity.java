package com.avito.android.wallet.page.history;

import QO0.b;
import QO0.d;
import QO0.f;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.h;
import com.avito.android.ui.activity.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PaymentHistoryActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/page/history/PaymentHistoryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentHistoryActivity extends a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @l
    public Chips f327830m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public ViewPager f327831n;

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.payment_operations_history_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Chips chips = (Chips) findViewById(R.id.wallet_page_tabs);
        this.f327830m = chips;
        ViewPager viewPager = (ViewPager) findViewById(R.id.wallet_page_view_pager);
        this.f327831n = viewPager;
        List<? extends h> listU = C42745f0.U(new f("topup", getResources().getString(R.string.wallet_history_tab_topup), true), new f("service", getResources().getString(R.string.wallet_history_tab_payment), false));
        viewPager.setAdapter(new d(getSupportFragmentManager(), listU));
        chips.setData(listU);
        chips.p(0, true);
        viewPager.c(new QO0.a(chips));
        chips.setChipsSelectedListener(new b(viewPager, listU));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        ArrayList arrayList;
        super.onDestroy();
        ViewPager viewPager = this.f327831n;
        if (viewPager != null && (arrayList = viewPager.f55000S) != null) {
            arrayList.clear();
        }
        Chips chips = this.f327830m;
        if (chips == null) {
            return;
        }
        chips.setChipsSelectedListener(null);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return false;
    }
}
