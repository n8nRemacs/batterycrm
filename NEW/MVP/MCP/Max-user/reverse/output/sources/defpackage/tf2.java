package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class tf2 implements di4 {
    public final k18 a;
    public final k18 b;
    public final vf2 c = vf2.b;

    public tf2(k18 k18Var, k18 k18Var2) {
        this.a = k18Var2;
        this.b = k18Var;
    }

    @Override // defpackage.di4
    public final ki4 a() {
        return this.c;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        np1 np1Var;
        uf2 uf2Var;
        if (!this.c.a.contains(gi4Var)) {
            return null;
        }
        if (gi4Var.equals(vf2.c)) {
            imb imbVar = new imb("id", Long.valueOf(l8j.i("id", bundle)));
            String strK = l8j.k("type", bundle);
            Iterator it = uf2.d.iterator();
            do {
                f2 f2Var = (f2) it;
                if (!f2Var.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                uf2Var = (uf2) f2Var.next();
            } while (!uf2Var.a.equals(strK));
            np1Var = new np1(gwi.b(imbVar, new imb("type", uf2Var), new imb("load_mark", l8j.d("load_mark", bundle)), new imb("message_id", l8j.d("message_id", bundle)), new imb("highlights", bundle.containsKey("highlights") ? vmf.S(l8j.k("highlights", bundle), new String[]{","}, 4) : null), new imb("highlight_message", l8j.b("highlight_message", bundle)), new imb("from_forward", l8j.b("from_forward", bundle)), new imb("forward_cht_id", l8j.d("forward_cht_id", bundle)), new imb("forward_msg_ids", l8j.e("forward_msg_ids", bundle)), new imb("forward_attach_id", l8j.d("forward_attach_id", bundle)), new imb("is_forward_attach", l8j.b("is_forward_attach", bundle)), new imb(ApiProtocol.PARAM_PAYLOAD, bundle.getString(ApiProtocol.PARAM_PAYLOAD))), 1);
        } else {
            if (!gi4Var.equals(vf2.d)) {
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            }
            pb2 pb2Var = (pb2) ((byd) this.a.getValue()).a.getValue();
            if (pb2Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", pb2Var.a);
            bundle2.putParcelable("type", uf2.b);
            np1Var = new np1(bundle2, 2);
        }
        return new ni4(str, gi4Var, bundle, 0, ((gu5) ((rt5) this.b.getValue())).y() ? new li4(new zb2(3), new zb2(4)) : new li4((q8g) null, 3), np1Var, 8);
    }
}
