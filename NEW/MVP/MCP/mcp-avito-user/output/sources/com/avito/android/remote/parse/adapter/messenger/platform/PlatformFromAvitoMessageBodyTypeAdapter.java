package com.avito.android.remote.parse.adapter.messenger.platform;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PlatformFromAvitoMessageBodyTypeAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/platform/PlatformFromAvitoMessageBodyTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/messenger/platform/PlatformMessageBodyTypeAdapter;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform$FromAvito;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlatformFromAvitoMessageBodyTypeAdapter extends PlatformMessageBodyTypeAdapter<MessageBody.SystemMessageBody.Platform.FromAvito> {
    public PlatformFromAvitoMessageBodyTypeAdapter() {
        super("PlatformFromAvitoMessageBodyTypeAdapter");
    }

    @Override // com.avito.android.remote.parse.adapter.messenger.platform.PlatformMessageBodyTypeAdapter
    public final MessageBody.SystemMessageBody.Platform b(List list, PlatformActions platformActions, String str, String str2, InputState inputState) {
        return new MessageBody.SystemMessageBody.Platform.FromAvito(list, platformActions, str, str2, inputState);
    }
}
