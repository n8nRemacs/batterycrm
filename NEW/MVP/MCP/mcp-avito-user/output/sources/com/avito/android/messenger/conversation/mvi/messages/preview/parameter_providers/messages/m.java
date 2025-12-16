package com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.messages;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: SystemMessagesPreviewParameterProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/messages/m;", "Lcom/avito/android/messenger/conversation/mvi/messages/preview/parameter_providers/MessengerPreviewParameterProvider;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m extends MessengerPreviewParameterProvider {

    /* compiled from: SystemMessagesPreviewParameterProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MessengerPreviewParameterProvider.PreviewConfig.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MessengerPreviewParameterProvider.PreviewConfig previewConfig = MessengerPreviewParameterProvider.PreviewConfig.f193054b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MessengerPreviewParameterProvider.PreviewConfig previewConfig2 = MessengerPreviewParameterProvider.PreviewConfig.f193054b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.preview.parameter_providers.MessengerPreviewParameterProvider
    @Y61.k
    public final InterfaceC43030m<MessengerPreviewParameterProvider.a> b() {
        return C42756l.f(new MessengerPreviewParameterProvider.a[]{new MessengerPreviewParameterProvider.a(new T1.h("123", new Image(P0.c())), true), new MessengerPreviewParameterProvider.a(T1.f.f189201b, true), new MessengerPreviewParameterProvider.a(T1.e.f189197b, true), new MessengerPreviewParameterProvider.a(T1.i.f189217b, true), new MessengerPreviewParameterProvider.a(new T1.g("123", "321", T1.g.a.b.f189211a), true), new MessengerPreviewParameterProvider.a(com.avito.android.messenger.conversation.mvi.messages.utils.m.b(com.avito.android.messenger.conversation.mvi.messages.utils.m.f193603a, new T1.d.b.a(new MessageBody.SystemMessageBody.Text("Михаил Петров теперь в чате")), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741821), true)});
    }

    public /* synthetic */ m(MessengerPreviewParameterProvider.PreviewConfig previewConfig, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? MessengerPreviewParameterProvider.PreviewConfig.f193055c : previewConfig);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(@Y61.k MessengerPreviewParameterProvider.PreviewConfig previewConfig) {
        MessengerPreviewParameterProvider.PreviewConfig previewConfig2;
        int iOrdinal = previewConfig.ordinal();
        if (iOrdinal == 0) {
            previewConfig2 = MessengerPreviewParameterProvider.PreviewConfig.f193054b;
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            previewConfig2 = MessengerPreviewParameterProvider.PreviewConfig.f193055c;
        }
        super(previewConfig2);
    }
}
