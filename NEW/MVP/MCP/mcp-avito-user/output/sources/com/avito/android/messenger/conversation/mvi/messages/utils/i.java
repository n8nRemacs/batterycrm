package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.Q0;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MessageListUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {
    @Y61.k
    public static final String a(@Y61.k T1 t12) {
        if (!(t12 instanceof T1.d)) {
            if (t12.equals(T1.e.f189197b)) {
                return "PaginationError";
            }
            if (t12.equals(T1.f.f189201b)) {
                return "PaginationInProgress";
            }
            if (t12 instanceof T1.g) {
                return "SpamActions";
            }
            if (t12 instanceof T1.h) {
                return "TypingIndicator";
            }
            if (t12.equals(T1.i.f189217b)) {
                return "UnreadMessagesDivider";
            }
            throw new NoWhenBranchMatchedException();
        }
        T1.d dVar = (T1.d) t12;
        T1.d.b bVar = dVar.f189168c;
        if (!(bVar instanceof T1.d.b.a)) {
            if (!(bVar instanceof T1.d.b.C5574b)) {
                throw new NoWhenBranchMatchedException();
            }
            MessageBody.SystemMessageBody.Platform.Bubble bubble = ((T1.d.b.C5574b) bVar).f189195a;
            boolean z12 = bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation;
            LocalMessage localMessage = dVar.f189180o;
            if (z12) {
                return b(localMessage.getBody()).concat(" Platform.Bubble.GeoLocation");
            }
            if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image) {
                return b(localMessage.getBody()).concat(" Platform.Bubble.Image");
            }
            if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item) {
                return b(localMessage.getBody()).concat(" Platform.Bubble.Item");
            }
            if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Text) {
                return b(localMessage.getBody()).concat(" Platform.Bubble.Text");
            }
            if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.Video) {
                return b(localMessage.getBody()).concat(" Platform.Bubble.Video");
            }
            if (bubble instanceof MessageBody.SystemMessageBody.Platform.Bubble.File) {
                return b(localMessage.getBody()).concat(" Platform.Bubble.File");
            }
            throw new NoWhenBranchMatchedException();
        }
        MessageBody messageBody = ((T1.d.b.a) bVar).f189194a;
        if (messageBody instanceof MessageBody.AppCall) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Call) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Deleted) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.File) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.ImageBody) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.ImageReference) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Item) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.ItemReference) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Link) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.LocalImage) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Location) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Text) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Unknown) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Text.Reaction) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Text.Regular) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Unknown) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Video) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.Voice) {
            return b(((T1.d.b.a) bVar).f189194a);
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromAvito) {
            return "Platform.FromAvito – should be divided into separate bubbles!";
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromUser) {
            return "Platform.FromUser – should be divided into separate bubbles!";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final String b(@Y61.k MessageBody messageBody) {
        if (messageBody instanceof MessageBody.AppCall) {
            return "MessageBody.AppCall";
        }
        if (messageBody instanceof MessageBody.Call) {
            return "MessageBody.Call";
        }
        if (messageBody instanceof MessageBody.Deleted) {
            return "MessageBody.Deleted";
        }
        if (messageBody instanceof MessageBody.File) {
            return "MessageBody.File";
        }
        if (messageBody instanceof MessageBody.ImageBody) {
            return "MessageBody.ImageBody";
        }
        if (messageBody instanceof MessageBody.ImageReference) {
            return "MessageBody.ImageReference";
        }
        if (messageBody instanceof MessageBody.Item) {
            return "MessageBody.Item";
        }
        if (messageBody instanceof MessageBody.ItemReference) {
            return "MessageBody.ItemReference";
        }
        if (messageBody instanceof MessageBody.Link) {
            return "MessageBody.Link";
        }
        if (messageBody instanceof MessageBody.LocalImage) {
            return "MessageBody.LocalImage";
        }
        if (messageBody instanceof MessageBody.Location) {
            return "MessageBody.Location";
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Text) {
            return "MessageBody.SystemMessageBody.Text";
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Unknown) {
            return "MessageBody.SystemMessageBody.Unknown";
        }
        if (messageBody instanceof MessageBody.Text.Reaction) {
            return "MessageBody.Text.Reaction";
        }
        if (messageBody instanceof MessageBody.Text.Regular) {
            return "MessageBody.Text.Regular";
        }
        if (messageBody instanceof MessageBody.Unknown) {
            return "MessageBody.Unknown";
        }
        if (messageBody instanceof MessageBody.Video) {
            return "MessageBody.Video";
        }
        if (messageBody instanceof MessageBody.Voice) {
            return "MessageBody.Voice";
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromAvito) {
            return "MessageBody.SystemMessageBody.Platform.FromAvito";
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromUser) {
            return "MessageBody.SystemMessageBody.Platform.FromUser";
        }
        throw new NoWhenBranchMatchedException();
    }

    @InterfaceC22132o
    public static final float c(float f12, @Y61.l A a12) {
        a12.C(-1359330669);
        float fM02 = ((androidx.compose.ui.unit.d) a12.o(Q0.f41199h)).M0(f12);
        a12.h();
        return fM02;
    }
}
