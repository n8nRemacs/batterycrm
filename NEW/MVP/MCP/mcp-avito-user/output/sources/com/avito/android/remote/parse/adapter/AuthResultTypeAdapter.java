package com.avito.android.remote.parse.adapter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.C2;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthResultTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AuthResultTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/AuthResult;", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthResultTypeAdapter implements com.google.gson.h<AuthResult> {
    @Override // com.google.gson.h
    public final AuthResult deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        Profile profile = (Profile) gVar.b(kVarI.D(ChannelContext.UserToUser.TYPE), Profile.class);
        Session session = (Session) gVar.b(iVar, Session.class);
        String strC = C2.c(kVarI, "message");
        com.google.gson.i iVarD = kVarI.D("postAuthAction");
        return new AuthResult(session, profile, strC, (DeepLink) (iVarD == null ? null : gVar.b(iVarD, DeepLink.class)));
    }
}
