package com.avito.android.messenger.conversation.adapter;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: MessageViewGroupDividerDelegate.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/t;", "Lcom/avito/android/messenger/conversation/adapter/s;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f189287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f189288c;

    public t(@Y61.k View view) {
        this.f189287b = view;
        this.f189288c = view.getResources().getDimensionPixelSize(R.dimen.messenger_message_group_divider);
    }

    @Override // com.avito.android.messenger.conversation.adapter.s
    public final void n60(boolean z12) {
        View view = this.f189287b;
        if (z12) {
            view.setPadding(0, this.f189288c, 0, 0);
        } else {
            view.setPadding(0, 0, 0, 0);
        }
    }
}
