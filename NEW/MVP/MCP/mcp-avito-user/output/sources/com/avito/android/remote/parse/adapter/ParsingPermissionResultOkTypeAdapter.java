package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.ParsingPermissionResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParsingPermissionResultOkTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ParsingPermissionResultOkTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/ParsingPermissionResult$Ok;", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ParsingPermissionResultOkTypeAdapter implements com.google.gson.h<ParsingPermissionResult.Ok> {
    @Override // com.google.gson.h
    public final ParsingPermissionResult.Ok deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return new ParsingPermissionResult.Ok((Profile) gVar.b(iVar.i().D(ChannelContext.UserToUser.TYPE), Profile.class), (Session) gVar.b(iVar, Session.class));
    }
}
