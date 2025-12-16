package com.avito.android.messenger.search;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ChannelsSearchActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/search/ChannelsSearchActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/messenger/search/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class ChannelsSearchActivity extends com.avito.android.ui.activity.a implements InterfaceC32565a, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ArrayList f196977m = new ArrayList();

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.messenger.search.InterfaceC32565a
    public final void m1(@Y61.k ChannelsSearchFragment channelsSearchFragment) {
        this.f196977m.remove(channelsSearchFragment);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Iterator it = C42745f0.M0(this.f196977m).iterator();
        while (it.hasNext()) {
            if (((com.avito.android.ui.fragments.c) it.next()).i0()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, new ChannelsSearchFragment(), "search_fragment", 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.messenger.search.InterfaceC32565a
    public final void x(@Y61.k ChannelsSearchFragment channelsSearchFragment) {
        this.f196977m.add(channelsSearchFragment);
    }
}
