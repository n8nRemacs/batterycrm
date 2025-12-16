package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class pm4 implements lp5 {
    public static final int[] Z = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final i5i s0 = new i5i(new dm4(2));
    public static final i5i t0 = new i5i(new dm4(3));
    public int Y;
    public boolean a;
    public int b;
    public int c;
    public zjd d;
    public jbe X = new jbe(18);
    public boolean o = true;

    public final void a(ArrayList arrayList, int i) {
        int i2 = 1;
        switch (i) {
            case 0:
                arrayList.add(new q4());
                break;
            case 1:
                arrayList.add(new u4());
                break;
            case 2:
                arrayList.add(new dc(this.a ? 1 : 0));
                break;
            case 3:
                arrayList.add(new cd(this.a ? 1 : 0));
                break;
            case 4:
                gp5 gp5VarH = s0.h(0);
                if (gp5VarH == null) {
                    arrayList.add(new t16());
                    break;
                } else {
                    arrayList.add(gp5VarH);
                    break;
                }
            case 5:
                arrayList.add(new y76());
                break;
            case 6:
                arrayList.add(new jr8(this.X, (this.o ? 0 : 2) | this.b));
                break;
            case 7:
                arrayList.add(new n3a(this.a ? 1 : 0));
                break;
            case 8:
                arrayList.add(new kj6(this.X, this.o ? 0 : 32));
                arrayList.add(new u3a(this.X, this.c | (this.o ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new eua());
                break;
            case 10:
                arrayList.add(new gqc());
                break;
            case 11:
                if (this.d == null) {
                    t76 t76Var = wg7.b;
                    this.d = zjd.o;
                }
                arrayList.add(new jjg(1, !this.o ? 1 : 0, this.X, new z9g(0L), new br4(this.d, i, i2)));
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                arrayList.add(new ikh());
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                arrayList.add(new go4(this.Y));
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                gp5 gp5VarH2 = t0.h(new Object[0]);
                if (gp5VarH2 != null) {
                    arrayList.add(gp5VarH2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new he0(1 ^ (this.o ? 1 : 0), this.X));
                break;
            case LangUtils.HASH_SEED /* 17 */:
                arrayList.add(new yq0(1));
                break;
            case 18:
                arrayList.add(new ke0(2));
                break;
            case 19:
                arrayList.add(new yq0(0));
                break;
            case 20:
                int i3 = this.c;
                if ((i3 & 2) == 0 && (i3 & 4) == 0) {
                    arrayList.add(new ke0(1));
                    break;
                }
                break;
            case 21:
                arrayList.add(new ke0(0));
                break;
        }
    }

    @Override // defpackage.lp5
    public final synchronized gp5[] c() {
        return i(Uri.EMPTY, new HashMap());
    }

    @Override // defpackage.lp5
    public final synchronized gp5[] i(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = Z;
            arrayList = new ArrayList(21);
            List list = (List) map.get(HTTP.CONTENT_TYPE);
            int iB = kbj.b((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iB != -1) {
                a(arrayList, iB);
            }
            int iC = kbj.c(uri);
            if (iC != -1 && iC != iB) {
                a(arrayList, iC);
            }
            for (int i = 0; i < 21; i++) {
                int i2 = iArr[i];
                if (i2 != iB && i2 != iC) {
                    a(arrayList, i2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (gp5[]) arrayList.toArray(new gp5[0]);
    }
}
