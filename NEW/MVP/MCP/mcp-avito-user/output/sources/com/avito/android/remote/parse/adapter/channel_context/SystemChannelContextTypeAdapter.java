package com.avito.android.remote.parse.adapter.channel_context;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import com.avito.android.util.C2;
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

/* compiled from: SystemChannelContextTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/channel_context/SystemChannelContextTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/context/ChannelContext$System;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SystemChannelContextTypeAdapter implements h<ChannelContext.System> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    @Override // com.google.gson.h
    public final ChannelContext.System deserialize(i iVar, Type type, g gVar) {
        ?? arrayList;
        k kVarI = iVar.i();
        String strS = kVarI.D("name").s();
        String strC = C2.c(kVarI, "status");
        String strC2 = C2.c(kVarI, "description");
        i iVarD = kVarI.D("image");
        k kVar = iVarD instanceof k ? (k) iVarD : null;
        Image image = (Image) (kVar == null ? null : gVar.b(kVar, Image.class));
        i iVarD2 = kVarI.D(ChannelContext.MENU);
        if (iVarD2 != null) {
            ArrayList arrayList2 = iVarD2.h().f362000b;
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.b((i) it.next(), ChannelMenuAction.class));
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        i iVarD3 = kVarI.D(ChannelContext.ATTACH_MENU);
        AttachMenu attachMenu = (AttachMenu) (iVarD3 == null ? null : gVar.b(iVarD3, AttachMenu.class));
        i iVarD4 = kVarI.D(ChannelContext.HEADER_TITLE_BUTTON);
        return new ChannelContext.System(strS, strC, strC2, image, arrayList, attachMenu, (HeaderTitleButton) (iVarD4 != null ? gVar.b(iVarD4, HeaderTitleButton.class) : null));
    }
}
