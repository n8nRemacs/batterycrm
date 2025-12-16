package com.avito.android.messenger.conversation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import kotlin.Metadata;

/* compiled from: ChannelActivity.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/ChannelActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    public boolean f188882m;

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        boolean z12 = getSupportFragmentManager().H("ChannelActivityFragment") instanceof ChannelActivityFragment;
        if (!this.f188882m || this.f304538c == null) {
            super.onBackPressed();
        } else {
            V1();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            ChannelActivityArguments channelActivityArguments = extras != null ? (ChannelActivityArguments) extras.getParcelable("arguments") : null;
            if (channelActivityArguments == null) {
                throw new IllegalArgumentException(("arguments was not passed to " + this).toString());
            }
            ChannelActivityArguments.Open open = channelActivityArguments instanceof ChannelActivityArguments.Open ? (ChannelActivityArguments.Open) channelActivityArguments : null;
            boolean z12 = false;
            if (open != null && open.f188901f) {
                z12 = true;
            }
            this.f188882m = z12;
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            ChannelActivityFragment.f188908G0.getClass();
            ChannelActivityFragment channelActivityFragment = new ChannelActivityFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("arguments", channelActivityArguments);
            channelActivityFragment.setArguments(bundle2);
            hE2.n(R.id.fragment_container, channelActivityFragment, "ChannelActivityFragment");
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        Fragment fragmentH = getSupportFragmentManager().H("ChannelActivityFragment");
        ChannelActivityFragment channelActivityFragment = fragmentH instanceof ChannelActivityFragment ? (ChannelActivityFragment) fragmentH : null;
        if (channelActivityFragment != null) {
            channelActivityFragment.setArguments(intent.getExtras());
            channelActivityFragment.D5();
            channelActivityFragment.E5();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
