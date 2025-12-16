package com.avito.android.messenger.conversation.mvi.messages.builders;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.ChannelItemContentType;
import com.avito.android.messenger.conversation.T1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: QuoteRenderingParamsBuilder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/k;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {
    @Inject
    public k() {
    }

    @Y61.k
    public static com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c a(@Y61.k T1.d dVar) {
        return new com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.c((ChannelItemContentType.f189031c.a(dVar) || ChannelItemContentType.f189032d.a(dVar) || ChannelItemContentType.f189033e.a(dVar) || ChannelItemContentType.f189034f.a(dVar) || ChannelItemContentType.f189035g.a(dVar) || ChannelItemContentType.f189036h.a(dVar) || ChannelItemContentType.f189037i.a(dVar) || ChannelItemContentType.f189038j.a(dVar) || ChannelItemContentType.f189039k.a(dVar)) ? Integer.valueOf(R.dimen.messenger_compose_image_width) : null);
    }
}
