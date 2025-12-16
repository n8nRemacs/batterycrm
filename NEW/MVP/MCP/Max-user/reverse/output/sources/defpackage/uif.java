package defpackage;

import android.os.Bundle;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class uif implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uif(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new fgd(20, (nte) this.b);
            case 1:
                return new fgd(21, (ejf) this.b);
            case 2:
                return new fgd(22, (nte) this.b);
            case 3:
                return new fgd(23, (sue) this.b);
            case 4:
                return new fgd(24, (sue) this.b);
            case 5:
                return new fgd(25, (vmg) this.b);
            case 6:
                return new fgd(26, (wj1) this.b);
            case 7:
                return new fgd(27, (sue) this.b);
            case 8:
                return new fgd(28, (kvf) this.b);
            case 9:
                return new fgd(29, (q8g) this.b);
            case 10:
                return new jeh(0, (kvf) this.b);
            case 11:
                return new jeh(1, (q8g) this.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new jeh(2, (rth) this.b);
            case 13:
                return new jeh(3, (wj1) this.b);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new jeh(4, (dwh) this.b);
            default:
                Bundle bundle = (Bundle) this.b;
                String str = "default";
                if (bundle != null && bundle.containsKey(Widget.ARG_SCOPE_ID)) {
                    Object obj = bundle.get(Widget.ARG_SCOPE_ID);
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else if (obj instanceof b1e) {
                        str = ((b1e) obj).a;
                    }
                }
                return new b1e(str);
        }
    }
}
