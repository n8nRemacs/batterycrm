package com.avito.android.messenger.blacklist_reasons;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;

/* compiled from: BlacklistReasonsActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/BlacklistReasonsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class BlacklistReasonsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.messenger_blacklist_reasons_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("user_id");
        if (stringExtra == null) {
            throw new IllegalArgumentException("User id is required");
        }
        String stringExtra2 = getIntent().getStringExtra("channel_id");
        if (stringExtra2 == null) {
            throw new IllegalArgumentException("Channel id is required");
        }
        String stringExtra3 = getIntent().getStringExtra("item_id");
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            BlacklistReasonsFragment blacklistReasonsFragment = new BlacklistReasonsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("user_id", stringExtra);
            bundle2.putString("channel_id", stringExtra2);
            bundle2.putString("item_id", stringExtra3);
            blacklistReasonsFragment.setArguments(bundle2);
            hE2.j(R.id.messenger_blacklist_reasons_screen_root, blacklistReasonsFragment, null, 1);
            hE2.e();
        }
    }
}
