package com.avito.user_stats;

import Y61.k;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import eW0.C40058a;
import eW0.C40059b;
import eW0.C40061d;
import eW0.C40062e;
import eW0.C40063f;
import eW0.C40064g;
import eW0.InterfaceC40066i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: UserStatsTemplateUnitTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/user_stats/UserStatsTemplateUnitTypeAdapter;", "Lcom/google/gson/h;", "LeW0/i;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserStatsTemplateUnitTypeAdapter implements h<InterfaceC40066i> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f338637a = P0.g(new Q("header", C40062e.class), new Q("block_2_columns", C40058a.class), new Q("description", C40059b.class), new Q("infographic", C40063f.class), new Q("space", C40064g.class), new Q("block_expanded_info", C40061d.class));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.google.gson.h
    public final InterfaceC40066i deserialize(i iVar, Type type, g gVar) {
        com.google.gson.k kVarI = iVar.i();
        i iVarD = kVarI.D("type");
        String strS = iVarD != null ? iVarD.s() : null;
        if (strS == null) {
            strS = "";
        }
        Class cls = (Class) this.f338637a.get(strS);
        if (cls == null || cls.isAssignableFrom(C40061d.class)) {
            return null;
        }
        return (InterfaceC40066i) gVar.b(kVarI, cls);
    }
}
