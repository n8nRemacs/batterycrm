package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.profile_removal.RemovalProcessItem;
import com.my.tracker.ads.AdFormat;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: ProfileRemovalItemTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/ProfileRemovalItemTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/profile_removal/RemovalProcessItem;", "<init>", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileRemovalItemTypeAdapter implements com.google.gson.h<RemovalProcessItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f254206a = P0.g(new kotlin.Q("title", RemovalProcessItem.Title.class), new kotlin.Q("subtitle", RemovalProcessItem.Subtitle.class), new kotlin.Q("header", RemovalProcessItem.Header.class), new kotlin.Q("link", RemovalProcessItem.Link.class), new kotlin.Q("text", RemovalProcessItem.Text.class), new kotlin.Q(AdFormat.BANNER, RemovalProcessItem.Banner.class), new kotlin.Q("radioButton", RemovalProcessItem.ListItem.class), new kotlin.Q("listItem", RemovalProcessItem.TextArea.class), new kotlin.Q("spacing", RemovalProcessItem.SpacerItem.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final RemovalProcessItem deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f254206a.get(strS);
        if (cls == null) {
            return null;
        }
        return (RemovalProcessItem) gVar.b(kVarI, cls);
    }
}
