package com.avito.android.remote.parse.adapter.channel_context;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.remote.model.messenger.context.ChatReplyTime;
import com.avito.android.remote.model.messenger.context.HeaderButton;
import com.avito.android.remote.model.messenger.context.Placeholder;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ItemChannelContextTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/channel_context/ItemChannelContextTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$Item;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemChannelContextTypeAdapter implements h<ChannelContext.Item> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    @Override // com.google.gson.h
    public final ChannelContext.Item deserialize(i iVar, Type type, g gVar) {
        Object objB;
        List arrayList;
        k kVarI = iVar.i();
        String strS = kVarI.D("id").s();
        String strS2 = kVarI.D("title").s();
        i iVarD = kVarI.D("categoryId");
        String strS3 = iVarD != null ? iVarD.s() : null;
        if (strS3 == null) {
            strS3 = "";
        }
        i iVarD2 = kVarI.D("category");
        String strS4 = iVarD2 != null ? iVarD2.s() : null;
        if (strS4 == null) {
            strS4 = "";
        }
        i iVarD3 = kVarI.D("priceString");
        String strS5 = iVarD3 != null ? iVarD3.s() : null;
        if (strS5 == null) {
            strS5 = "";
        }
        i iVarD4 = kVarI.D("images");
        i[] iVarArr = {iVarD4 != null ? iVarD4.i().D("main") : null, kVarI.D("image")};
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                objB = null;
                break;
            }
            i iVar2 = iVarArr[i12];
            if (iVar2 != null) {
                objB = gVar.b(iVar2, Image.class);
                break;
            }
            i12++;
        }
        Image image = (Image) objB;
        i iVarD5 = kVarI.D("deleted");
        boolean zD2 = iVarD5 != null ? iVarD5.d() : false;
        i iVarD6 = kVarI.D(ChannelContext.Item.USER_ID);
        String strS6 = iVarD6 != null ? iVarD6.s() : null;
        i iVarD7 = kVarI.D(ChannelContext.MENU);
        if (iVarD7 != null) {
            ArrayList arrayList2 = iVarD7.h().f362000b;
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((i) it.next(), ChannelMenuAction.class));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        i iVarD8 = kVarI.D(ChannelContext.ATTACH_MENU);
        AttachMenu attachMenu = (AttachMenu) (iVarD8 == null ? null : gVar.b(iVarD8, AttachMenu.class));
        i iVarD9 = kVarI.D(ChannelContext.SHARED_LOCATION);
        MessageBody.Location location = (MessageBody.Location) (iVarD9 == null ? null : gVar.b(iVarD9, MessageBody.Location.class));
        i iVarD10 = kVarI.D(ChannelContext.Item.REPLY_TIME);
        ChatReplyTime chatReplyTime = (ChatReplyTime) (iVarD10 == null ? null : gVar.b(iVarD10, ChatReplyTime.class));
        i iVarD11 = kVarI.D(ChannelContext.Item.ASSISTANT_REPLY_TIME_PLACEHOLDER);
        String strE = iVarD11 != null ? C34328m0.e(iVarD11) : null;
        i iVarD12 = kVarI.D(ChannelContext.Item.HIDE_PHONE);
        boolean zD3 = iVarD12 != null ? iVarD12.d() : false;
        i iVarD13 = kVarI.D(ChannelContext.Item.PLACEHOLDER);
        Placeholder placeholder = (Placeholder) (iVarD13 == null ? null : gVar.b(iVarD13, Placeholder.class));
        i iVarD14 = kVarI.D(ChannelContext.Item.HEADER_BUTTON);
        return new ChannelContext.Item(strS, strS3, strS4, strS2, strS5, image, zD2, strS6, arrayList, attachMenu, location, chatReplyTime, strE, zD3, placeholder, (HeaderButton) (iVarD14 == null ? null : gVar.b(iVarD14, HeaderButton.class)));
    }
}
