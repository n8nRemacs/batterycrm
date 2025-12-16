package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.profile_removal.ButtonTypes;
import com.avito.android.remote.model.profile_removal.RemovalButton;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ProfileRemovalButtonTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ProfileRemovalButtonTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/profile_removal/RemovalButton;", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileRemovalButtonTypeAdapter implements com.google.gson.h<RemovalButton> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254205a = P0.g(new kotlin.Q(ButtonTypes.NEXT.getValue(), RemovalButton.Continue.class), new kotlin.Q(ButtonTypes.ACTION.getValue(), RemovalButton.External.class), new kotlin.Q(ButtonTypes.SUPPORT_REQUEST.getValue(), RemovalButton.External.class), new kotlin.Q(ButtonTypes.REMOVE_PROFILE.getValue(), RemovalButton.Internal.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final RemovalButton deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f254205a.get(strS);
        if (cls == null) {
            return null;
        }
        return (RemovalButton) gVar.b(kVarI, cls);
    }
}
