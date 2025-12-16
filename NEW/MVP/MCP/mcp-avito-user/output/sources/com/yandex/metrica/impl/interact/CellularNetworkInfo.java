package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.yandex.metrica.impl.ob.C39177uj;
import com.yandex.metrica.impl.ob.InterfaceC38685ak;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.Xj;
import com.yandex.metrica.impl.ob.Zj;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class CellularNetworkInfo {

    /* renamed from: a, reason: collision with root package name */
    public String f377741a = "";

    public class a implements InterfaceC38685ak {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38685ak
        public final void a(Zj zj2) {
            C39177uj c39177ujB = zj2.b();
            if (c39177ujB != null) {
                String strM = c39177ujB.m();
                String strN = c39177ujB.n();
                Integer numL = c39177ujB.l();
                Integer numK = c39177ujB.k();
                Integer numB = c39177ujB.b();
                Integer numE = c39177ujB.e();
                Integer numP = c39177ujB.p();
                HashMap map = new HashMap();
                map.put("network_type", strM);
                map.put("operator_name", strN);
                map.put("country_code", numK != null ? String.valueOf(numK) : null);
                map.put("operator_id", numL != null ? String.valueOf(numL) : null);
                map.put("cell_id", numB != null ? String.valueOf(numB) : null);
                map.put("lac", numE != null ? String.valueOf(numE) : null);
                map.put("signal_strength", numP != null ? String.valueOf(numP) : null);
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str2)) {
                        sb2.append(str);
                        sb2.append((String) entry.getKey());
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(str2);
                        str = ContainerUtils.FIELD_DELIMITER;
                    }
                }
                CellularNetworkInfo.this.f377741a = sb2.toString();
            }
        }
    }

    public CellularNetworkInfo(Context context) {
        new Xj(context, P.g().d().b()).a(new a());
    }

    public String getCelluralInfo() {
        return this.f377741a;
    }
}
