package com.avito.android.messenger.conversation.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: MessageViewDateDelegate.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/p;", "Lcom/avito/android/messenger/conversation/adapter/o;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final TextView f189260b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TextView f189261c;

    public p(@Y61.k View view) {
        this.f189260b = (TextView) view.findViewById(R.id.message_date);
        this.f189261c = (TextView) view.findViewById(R.id.message_date_divider);
    }

    @Override // com.avito.android.messenger.conversation.adapter.o
    public final void S6(@Y61.l String str) {
        TextView textView = this.f189260b;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.messenger.conversation.adapter.o
    public final void b0(@Y61.k String str) {
        TextView textView = this.f189261c;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }
}
