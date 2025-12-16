package com.avito.android.messenger.conversation.mvi.messages.preview.preview_wrappers;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.avito.android.messenger.MessageDeliveryStatus;
import kotlin.Metadata;

/* compiled from: OutgoingMessagePreviewWrapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l v vVar, boolean z12, @Y61.l MessageDeliveryStatus messageDeliveryStatus, @Y61.k C22096n c22096n, @Y61.l A a12, int i12) {
        MessageDeliveryStatus messageDeliveryStatus2;
        boolean z13;
        B bE2 = a12.E(1791675294);
        if (((i12 | 3504) & 46811) == 9362 && bE2.c()) {
            bE2.f();
            z13 = z12;
            messageDeliveryStatus2 = messageDeliveryStatus;
        } else {
            MessageDeliveryStatus messageDeliveryStatus3 = MessageDeliveryStatus.f186165d;
            com.akita.compose.theme.re23.c.a(false, r.c(964073955, new j(vVar, c22096n), bE2), bE2, 48, 1);
            messageDeliveryStatus2 = messageDeliveryStatus3;
            z13 = true;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(vVar, z13, messageDeliveryStatus2, c22096n, i12);
        }
    }
}
