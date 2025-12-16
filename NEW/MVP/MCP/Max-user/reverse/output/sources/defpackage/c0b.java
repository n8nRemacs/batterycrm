package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class c0b {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public c0b(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public final Object a(String str, long[] jArr, Long l, boolean z, String str2, ldb ldbVar) {
        m1g m1gVar = (m1g) this.a.getValue();
        y1h y1hVar = new y1h(xhb.C1, 0);
        y1hVar.x(ApiProtocol.PARAM_CONVERSATION_ID, str);
        if (jArr.length != 0) {
            y1hVar.q("calleeIds", jArr);
        }
        if (l != null) {
            ((us) y1hVar.b).put(ApiProtocol.PARAM_CHAT_ID, l);
        }
        y1hVar.i(ApiProtocol.PARAM_IS_VIDEO, z);
        y1hVar.x("internalParams", str2);
        return m1gVar.e(y1hVar, ldbVar);
    }
}
