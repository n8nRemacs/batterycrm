package defpackage;

import java.util.HashMap;
import java.util.function.BiConsumer;
import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.wt.internal.WebTransportSocket;

/* loaded from: classes2.dex */
public final /* synthetic */ class ov3 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                qv3 qv3Var = (qv3) obj3;
                Long l = (Long) obj;
                ku3 ku3Var = (ku3) obj2;
                if (ku3Var != null) {
                    te8 te8Var = ((ie4) qv3Var.e.get()).d;
                    l.getClass();
                    te8Var.r().c(ku3Var.a.b, ((ul6) ((bwf) te8Var.c).getValue()).a);
                    break;
                }
                break;
            case 1:
                b36 b36Var = (b36) obj3;
                Integer num = (Integer) obj;
                c36 c36Var = (c36) obj2;
                if (!((Long) b36Var.h.get(num)).equals(b36Var.g.get(num))) {
                    num.getClass();
                    ((qlf) c36Var).i0();
                    break;
                }
                break;
            case 2:
                ((rw) obj3).invoke(obj, obj2);
                break;
            case 3:
                rwa rwaVar = OneMeApplication.s0;
                ((qk) obj3).invoke(obj, obj2);
                break;
            case 4:
                ((ysc) obj3).f(((Integer) obj).intValue(), (String) obj2, 1);
                break;
            case 5:
                HashMap map = (HashMap) obj3;
                String str = (String) obj;
                a04 a04Var = (a04) obj2;
                a04Var.getClass();
                nn8 nn8Var = new nn8();
                nn8Var.put("firstName", a04Var.a);
                String str2 = a04Var.b;
                if (str2 != null && str2.length() != 0) {
                    nn8Var.put("lastName", str2);
                }
                map.put(str, nn8Var.b());
                break;
            default:
                WebTransportSocket.configureSession$lambda$3((WebTransportSocket) obj3, (Long) obj, (String) obj2);
                break;
        }
    }
}
