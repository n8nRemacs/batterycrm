package com.avito.android.messenger.search;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsSearchRouter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/z;", "Lcom/avito/android/messenger/search/y;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ChannelsSearchFragment f197216a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.F f197217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f197218c;

    public z(@Y61.k ChannelsSearchFragment channelsSearchFragment, @Y61.k com.avito.android.messenger.F f12, @Y61.l Bundle bundle) {
        this.f197216a = channelsSearchFragment;
        this.f197217b = f12;
        int i12 = channelsSearchFragment.getResources().getConfiguration().orientation;
        this.f197218c = bundle != null ? bundle.getInt("original_orientation", i12) : i12;
    }

    public final boolean a() {
        ChannelsSearchFragment channelsSearchFragment = this.f197216a;
        K2.e(channelsSearchFragment);
        ActivityC22955m activityC22955mL1 = channelsSearchFragment.l1();
        if (activityC22955mL1 == null) {
            return false;
        }
        int i12 = this.f197218c;
        if (i12 == 0 || channelsSearchFragment.getResources().getConfiguration().orientation != i12) {
            activityC22955mL1.finish();
        } else {
            activityC22955mL1.supportFinishAfterTransition();
        }
        return true;
    }
}
