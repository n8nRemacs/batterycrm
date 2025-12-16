package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e8d implements gxe {
    public final HashSet a = new HashSet();

    @Override // defpackage.gxe
    public final void onRateCall(JSONObject jSONObject) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gxe) it.next()).onRateCall(jSONObject);
        }
    }
}
