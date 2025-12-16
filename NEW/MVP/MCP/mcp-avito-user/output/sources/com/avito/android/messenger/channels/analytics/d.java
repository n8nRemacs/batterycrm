package com.avito.android.messenger.channels.analytics;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.memory.consumption.f;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import kotlin.Metadata;

/* compiled from: ChannelsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {
    void a(long j12);

    void b(@Y61.k RecyclerView recyclerView);

    void c();

    void d();

    void e();

    void f(int i12);

    void g();

    void h(int i12, @Y61.k UseCaseScenario useCaseScenario);

    void i();

    void j(@Y61.k n nVar);

    void k();

    void l();

    void m();

    void n(@Y61.k Throwable th2);

    void o(@Y61.k f.a aVar, @Y61.k ChannelsListFragment channelsListFragment);

    void p(@Y61.k Throwable th2);

    void q(boolean z12);
}
