package com.avito.android.remote.parse.adapter.channel_context;

import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UserToUserChannelContextTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/channel_context/UserToUserChannelContextTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$UserToUser;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserToUserChannelContextTypeAdapter implements h<ChannelContext.UserToUser> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    @Override // com.google.gson.h
    public final ChannelContext.UserToUser deserialize(i iVar, Type type, g gVar) {
        ?? arrayList;
        k kVarI = iVar.i();
        i iVarD = kVarI.D(ChannelContext.MENU);
        if (iVarD != null) {
            ArrayList arrayList2 = iVarD.h().f362000b;
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((i) it.next(), ChannelMenuAction.class));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        i iVarD2 = kVarI.D(ChannelContext.ATTACH_MENU);
        AttachMenu attachMenu = (AttachMenu) (iVarD2 == null ? null : gVar.b(iVarD2, AttachMenu.class));
        i iVarD3 = kVarI.D(ChannelContext.SHARED_LOCATION);
        return new ChannelContext.UserToUser((MessageBody.Location) (iVarD3 != null ? gVar.b(iVarD3, MessageBody.Location.class) : null), arrayList, attachMenu);
    }
}
