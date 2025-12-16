package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final class zl7 extends xy {
    public final lz7 d;
    public final String o;

    public zl7(lz7 lz7Var, String str, boolean z, boolean z2) {
        super(s00.INLINE_KEYBOARD, z, z2);
        this.d = lz7Var;
        this.o = str;
    }

    @Override // defpackage.xy
    public final HashMap a() {
        HashMap mapA = super.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.d.a).iterator();
        while (it.hasNext()) {
            List<zw0> list = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (zw0 zw0Var : list) {
                zw0Var.getClass();
                HashMap map = new HashMap();
                String str = zw0Var.d;
                if (str != null) {
                    map.put(KwsFeaturesConfigProviderImpl.URL_KEY, str);
                }
                map.put("type", zw0Var.a.a);
                map.put("text", zw0Var.b);
                map.put("intent", zw0Var.c.a);
                map.put(ApiProtocol.PARAM_PAYLOAD, zw0Var.o);
                map.put("isQuick", Boolean.valueOf(zw0Var.X));
                map.put("contactId", Long.valueOf(zw0Var.Y));
                arrayList2.add(map);
            }
        }
        mapA.put("buttons", arrayList);
        return mapA;
    }
}
