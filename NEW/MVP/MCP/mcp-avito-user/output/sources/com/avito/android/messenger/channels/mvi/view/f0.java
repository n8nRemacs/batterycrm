package com.avito.android.messenger.channels.mvi.view;

import androidx.fragment.app.Fragment;
import com.avito.android.messenger.channels.mvi.view.ChannelsListFragment;
import com.avito.android.persistence.messenger.C33126v0;
import com.avito.android.util.C35966w1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChannelsContentDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/view/f0;", "Landroidx/viewpager2/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f0 extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.messenger.folders.a> f188745k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(List<com.avito.android.messenger.folders.a> list, Fragment fragment) {
        super(fragment);
        this.f188745k = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f188745k.size();
    }

    @Override // androidx.viewpager2.adapter.b
    @Y61.k
    public final Fragment l(int i12) {
        ChannelsListFragment.a aVar = ChannelsListFragment.f188628A0;
        List<com.avito.android.messenger.folders.a> list = this.f188745k;
        C33126v0 c33126v0 = list.get(i12).f196345c;
        C33126v0 c33126v02 = list.get(i12).f196346d;
        C33126v0 c33126v03 = list.get(i12).f196347e;
        aVar.getClass();
        ChannelsListFragment channelsListFragment = new ChannelsListFragment();
        C35966w1.a(channelsListFragment, 8, new r(c33126v0, c33126v03, null, c33126v02, null));
        return channelsListFragment;
    }
}
