package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemMessageBodyTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ItemMessageBodyTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Item;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemMessageBodyTypeAdapter implements com.google.gson.h<MessageBody.Item> {
    @Override // com.google.gson.h
    public final MessageBody.Item deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        String strS = kVarI.D("id").s();
        String strC = C2.c(kVarI, ChannelContext.Item.USER_ID);
        String strS2 = kVarI.D("title").s();
        com.google.gson.i iVarD = kVarI.D("price");
        Object objB = null;
        String strS3 = iVarD != null ? iVarD.s() : null;
        com.google.gson.i iVarD2 = kVarI.D("location");
        String strS4 = iVarD2 != null ? iVarD2.s() : null;
        com.google.gson.i iVarD3 = kVarI.D("images");
        com.google.gson.i[] iVarArr = {iVarD3 != null ? iVarD3.i().D("main") : null, kVarI.D("image")};
        int i12 = 0;
        while (true) {
            if (i12 < 2) {
                com.google.gson.i iVar2 = iVarArr[i12];
                if (iVar2 != null) {
                    objB = gVar.b(iVar2, Image.class);
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        return new MessageBody.Item(strS, strC, strS2, (Image) objB, strS3, strS4);
    }
}
