package com.avito.android.beduin.network.parse;

import Y61.k;
import com.avito.android.beduin.network.model.LabelToken;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BeduinLocalTokenTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinLocalTokenTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/network/model/LabelToken;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinLocalTokenTypeAdapter implements h<LabelToken> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f104043a = P0.g(new Q("text", LabelToken.TextToken.class), new Q("storageText", LabelToken.StorageTextToken.class), new Q("link", LabelToken.LinkToken.class), new Q("datetime", LabelToken.DateTimeToken.class), new Q("icon", LabelToken.IconToken.class), new Q("textIcon", LabelToken.TextIconToken.class), new Q("spacing", LabelToken.SpacingToken.class), new Q("salesStrikethrough", LabelToken.SalesStrikeThroughToken.class), new Q("dockingBadge", LabelToken.DockingBadgeToken.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final LabelToken deserialize(i iVar, Type type, g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f104043a.get(strS);
        if (cls == null) {
            return null;
        }
        return (LabelToken) gVar.b(kVarI, cls);
    }
}
