package com.avito.android.remote.parse.adapter.messenger.platform;

import Sk0.C15196a;
import Sk0.C15197b;
import W81.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message.MessageBody.SystemMessageBody.Platform;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C2;
import com.avito.android.util.V2;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PlatformMessageBodyTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/platform/PlatformMessageBodyTypeAdapter;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody$Platform;", "T", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$SystemMessageBody;", "Lcom/google/gson/o;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PlatformMessageBodyTypeAdapter<T extends MessageBody.SystemMessageBody.Platform> implements h<MessageBody.SystemMessageBody>, o<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f254276a;

    public PlatformMessageBodyTypeAdapter(@k String str) {
        this.f254276a = str;
    }

    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.SystemMessageBody.Platform platform = (MessageBody.SystemMessageBody.Platform) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.t(MessageBody.SystemMessageBody.Platform.CHUNKS, nVar.a(platform.getChunks(), new C15197b().getType()));
        PlatformActions contextActions = platform.getContextActions();
        if (contextActions != null) {
            kVar.t(MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS, nVar.a(contextActions, a.class));
        }
        String flow = platform.getFlow();
        if (flow != null) {
            kVar.t(MessageBody.SystemMessageBody.Platform.FLOW, nVar.c(flow));
        }
        String fallbackText = platform.getFallbackText();
        if (fallbackText != null) {
            kVar.t("text", nVar.c(fallbackText));
        }
        InputState inputState = platform.getInputState();
        if (inputState != null) {
            kVar.t(MessageBody.SystemMessageBody.Platform.INPUT_STATE, nVar.c(inputState));
        }
        return kVar;
    }

    @k
    public abstract T b(@k List<? extends MessageBody.SystemMessageBody.Platform.Bubble> list, @l PlatformActions platformActions, @l String str, @l String str2, @l InputState inputState);

    public final MessageBody.SystemMessageBody c(String str) {
        return (str == null || C43066x.K(str)) ? new MessageBody.SystemMessageBody.Unknown() : b(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(str, C42784z0.f406748b, 0, 4, null))), null, null, str, null);
    }

    @Override // com.google.gson.h
    public final MessageBody.SystemMessageBody deserialize(i iVar, Type type, g gVar) {
        List<String> platforms;
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("text");
        String strS = iVarD != null ? iVarD.s() : null;
        i iVarD2 = kVarI.D(MessageBody.SystemMessageBody.Platform.CHUNKS);
        i iVarD3 = kVarI.D(MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS);
        i iVarD4 = kVarI.D(MessageBody.SystemMessageBody.Platform.INPUT_STATE);
        try {
            List<? extends MessageBody.SystemMessageBody.Platform.Bubble> list = (List) gVar.b(iVarD2, new C15196a().getType());
            PlatformActions platformActions = (PlatformActions) gVar.b(iVarD3, a.class);
            List<? extends MessageBody.SystemMessageBody.Platform.Bubble> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                boolean z12 = false;
                if (platformActions != null) {
                    PlatformSupport platformSupport = platformActions.getPlatformSupport();
                    if (!((platformSupport == null || (platforms = platformSupport.getPlatforms()) == null) ? true : platforms.contains("android"))) {
                        z12 = true;
                    }
                }
                if (!z12) {
                    return b(list, platformActions, C2.c(kVarI, MessageBody.SystemMessageBody.Platform.FLOW), strS, iVarD4 != null ? (InputState) gVar.b(iVarD4, InputState.class) : null);
                }
            }
            return c(strS);
        } catch (Exception e12) {
            V2.f318762a.a(this.f254276a, "Failed to deserialize system platform message body: " + iVar, e12);
            return c(strS);
        }
    }
}
