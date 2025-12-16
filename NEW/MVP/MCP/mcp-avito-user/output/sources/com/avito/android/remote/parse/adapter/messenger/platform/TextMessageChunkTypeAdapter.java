package com.avito.android.remote.parse.adapter.messenger.platform;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TextMessageChunkTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/platform/TextMessageChunkTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Text$Chunk;", "Lcom/google/gson/h;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextMessageChunkTypeAdapter implements o<MessageBody.Text.Chunk>, h<MessageBody.Text.Chunk> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.Text.Chunk chunk = (MessageBody.Text.Chunk) obj;
        k kVar = new k();
        if (chunk instanceof MessageBody.Text.Chunk.Plain) {
            kVar.y("type", "plain");
            kVar.t("value", nVar.c(chunk));
        } else if (chunk instanceof MessageBody.Text.Chunk.Link) {
            kVar.y("type", "link");
            kVar.t("value", nVar.c(chunk));
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.Text.Chunk deserialize(i iVar, Type type, g gVar) {
        if (!(iVar instanceof k)) {
            if (iVar instanceof j) {
                return null;
            }
            throw new IllegalArgumentException("Unexpected json: " + iVar);
        }
        i iVarD = iVar.i().D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (L.f(strS, "plain")) {
            return (MessageBody.Text.Chunk) gVar.b(iVar.i().D("value"), MessageBody.Text.Chunk.Plain.class);
        }
        if (L.f(strS, "link")) {
            return (MessageBody.Text.Chunk) gVar.b(iVar.i().D("value"), MessageBody.Text.Chunk.Link.class);
        }
        throw new IllegalArgumentException(G.f("Unsupported type: ", strS));
    }
}
