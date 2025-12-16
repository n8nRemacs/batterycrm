package com.avito.android.str_cancellation_settings;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrCancellationSettingsActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_cancellation_settings/StrCancellationSettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrCancellationSettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f288110m = new a(null);

    /* compiled from: StrCancellationSettingsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_cancellation_settings/StrCancellationSettingsActivity$a;", "", "<init>", "()V", "", "END_DATE_EXTRA_KEY", "Ljava/lang/String;", "FROM_PAGE_EXTRA_LABEL", "ITEM_ID_EXTRA_KEY", "", "NO_ITEM_ID", "J", "START_DATE_EXTRA_KEY", "STR_CANCELLATION_SETTINGS_FRAGMENT_TAG", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            long longExtra = getIntent().getLongExtra("item_id_extra", -1L);
            if (longExtra == -1) {
                return;
            }
            String stringExtra = getIntent().getStringExtra("start_date_extra");
            String stringExtra2 = getIntent().getStringExtra("end_date_extra");
            String stringExtra3 = getIntent().getStringExtra("from_page_label_extra");
            StrCancellationSettingsFragment.f288111l0.getClass();
            StrCancellationSettingsFragment strCancellationSettingsFragment = new StrCancellationSettingsFragment();
            strCancellationSettingsFragment.setArguments(C22777e.b(new Q("itemId", Long.valueOf(longExtra)), new Q("startDate", stringExtra), new Q("endDate", stringExtra2), new Q("fromPageLabel", stringExtra3)));
            strCancellationSettingsFragment.show(getSupportFragmentManager(), "StrCancellationSettingsFragment");
        }
    }
}
