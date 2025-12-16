package com.avito.android.messenger.conversation.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageViewDelete.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/r;", "Lcom/avito/android/messenger/conversation/adapter/q;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f189286b;

    public r(@Y61.k View view) {
        this.f189286b = (ImageView) view.findViewById(R.id.message_delete_icon);
    }

    @Override // com.avito.android.messenger.conversation.adapter.q
    public final void QS() {
        ImageView imageView = this.f189286b;
        D6.w(imageView);
        imageView.setOnClickListener(null);
    }

    @Override // com.avito.android.messenger.conversation.adapter.q
    public final void wb(@Y61.k Y41.a<G0> aVar) {
        ImageView imageView = this.f189286b;
        D6.H(imageView);
        imageView.setOnClickListener(new com.avito.android.lib.design.list_item.a(27, aVar));
    }
}
