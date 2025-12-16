package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.util.W0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlatformTextMessageFromAvitoContentRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/N;", "Lcom/avito/android/util/W0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class N implements W0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193265a;

    /* JADX WARN: Multi-variable type inference failed */
    public N(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar) {
        this.f193265a = lVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(@Y61.l ActionMode actionMode, @Y61.l MenuItem menuItem) {
        this.f193265a.invoke(new h0.a(menuItem));
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
