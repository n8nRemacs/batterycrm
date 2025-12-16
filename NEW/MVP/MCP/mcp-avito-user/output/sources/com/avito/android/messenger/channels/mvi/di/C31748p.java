package com.avito.android.messenger.channels.mvi.di;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.messenger.channels.mvi.view.a0;
import com.avito.android.messenger.channels.mvi.view.k0;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;

/* compiled from: ChannelsListModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/di/p;", "Lcom/avito/android/messenger/channels/mvi/view/k0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.di.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31748p implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32208e f187436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f187437b;

    public C31748p(InterfaceC32208e interfaceC32208e, InterfaceC35745a5 interfaceC35745a5) {
        this.f187436a = interfaceC32208e;
        this.f187437b = interfaceC35745a5;
    }

    @Override // com.avito.android.messenger.channels.mvi.view.k0
    @Y61.k
    public final a0 a(@Y61.k RecyclerView recyclerView, @Y61.k LinearLayoutManager linearLayoutManager, @Y61.k View view) {
        return new a0(recyclerView, linearLayoutManager, view, this.f187436a, this.f187437b);
    }
}
