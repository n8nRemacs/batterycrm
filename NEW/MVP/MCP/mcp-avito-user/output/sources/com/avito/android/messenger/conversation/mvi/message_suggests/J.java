package com.avito.android.messenger.conversation.mvi.message_suggests;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessageSuggestsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/J;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class J implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f191925a;

    public J(H h12) {
        this.f191925a = h12;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        if (hVar instanceof MessageSuggestsView.SuggestItem) {
            this.f191925a.f191908c.accept(hVar);
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
