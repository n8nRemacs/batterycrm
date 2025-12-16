package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.l5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38944l5 extends X4 {
    public C38944l5(L3 l32) {
        super(l32);
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        String strP = c38715c0.p();
        com.yandex.metrica.i iVarA = C38689b.a(strP);
        String strH = a().h();
        com.yandex.metrica.i iVarA2 = C38689b.a(strH);
        if (iVarA.equals(iVarA2)) {
            return true;
        }
        if (TextUtils.isEmpty(iVarA.f377709a) && !TextUtils.isEmpty(iVarA2.f377709a)) {
            c38715c0.e(strH);
            a(c38715c0, EnumC38886im.LOGOUT);
        } else if (!TextUtils.isEmpty(iVarA.f377709a) && TextUtils.isEmpty(iVarA2.f377709a)) {
            a(c38715c0, EnumC38886im.LOGIN);
        } else if (TextUtils.isEmpty(iVarA.f377709a) || iVarA.f377709a.equals(iVarA2.f377709a)) {
            a(c38715c0, EnumC38886im.UPDATE);
        } else {
            a(c38715c0, EnumC38886im.SWITCH);
        }
        a().a(strP);
        return true;
    }

    private void a(C38715c0 c38715c0, EnumC38886im enumC38886im) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("action", enumC38886im.toString());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        c38715c0.f(string);
        a().r().b(c38715c0);
    }
}
