package com.avito.android.messenger.conversation;

import MY.k;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.avito.android.messenger.conversation.ChannelFragment;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/A1;", "Lcom/avito/android/util/W0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A1 implements com.avito.android.util.W0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f188874a;

    public A1(ChannelFragment channelFragment) {
        this.f188874a = channelFragment;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(@Y61.l ActionMode actionMode, @Y61.l MenuItem menuItem) {
        ChannelFragment.a aVar = ChannelFragment.f188932o3;
        this.f188874a.D5().accept(new k.a.b(menuItem));
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(@Y61.l ActionMode actionMode, @Y61.l Menu menu) {
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(@Y61.l ActionMode actionMode, @Y61.l Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(@Y61.l ActionMode actionMode) {
    }
}
