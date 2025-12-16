package com.avito.android.messenger.conversation.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageViewStatus.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/v;", "Lcom/avito/android/messenger/conversation/adapter/u;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f189309b;

    /* compiled from: MessageViewStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MessageDeliveryStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186163b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MessageDeliveryStatus messageDeliveryStatus2 = MessageDeliveryStatus.f186163b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MessageDeliveryStatus messageDeliveryStatus3 = MessageDeliveryStatus.f186163b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public v(@Y61.k View view) {
        this.f189309b = (ImageView) view.findViewById(R.id.message_status_icon);
        view.post(new RunnableC28882d(18, view, this));
    }

    @Override // com.avito.android.messenger.conversation.adapter.u
    public final void m80(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.lib.design.list_item.a aVar2 = new com.avito.android.lib.design.list_item.a(28, aVar);
        ImageView imageView = this.f189309b;
        imageView.setOnClickListener(aVar2);
        imageView.setClickable(true);
    }

    @Override // com.avito.android.messenger.conversation.adapter.u
    public final void qB(@Y61.k MessageDeliveryStatus messageDeliveryStatus) {
        int iOrdinal = messageDeliveryStatus.ordinal();
        ImageView imageView = this.f189309b;
        if (iOrdinal == 0) {
            imageView.setImageResource(R.drawable.ic_msg_pending_16);
            D6.H(imageView);
        } else if (iOrdinal == 1) {
            imageView.setImageResource(R.drawable.ic_msg_delivered_16);
            D6.H(imageView);
        } else if (iOrdinal == 2) {
            imageView.setImageResource(R.drawable.ic_msg_read_16);
            D6.H(imageView);
        } else if (iOrdinal == 3) {
            imageView.setImageResource(R.drawable.ic_msg_error_16);
            D6.H(imageView);
        }
        imageView.setTag(messageDeliveryStatus);
    }
}
