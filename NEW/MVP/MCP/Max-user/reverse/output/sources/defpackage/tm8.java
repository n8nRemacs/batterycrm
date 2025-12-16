package defpackage;

import defpackage.u45;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class tm8 implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ tm8(zm8 zm8Var, String str, int i) {
        this.a = i;
        this.b = zm8Var;
        this.c = str;
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        int i = this.a;
        final String str = this.c;
        zm8 zm8Var = this.b;
        switch (i) {
            case 0:
                ay2 ay2Var = (ay2) obj;
                ArrayList arrayList = zm8Var.q;
                List<gm9> list = ay2Var.c;
                ArrayList arrayList2 = new ArrayList(list.size());
                for (gm9 gm9Var : list) {
                    try {
                        arrayList2.add(u6e.c(gm9Var.b, gm9Var.a, gm9Var.c, gm9Var.d));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                zm8Var.n.addAll(arrayList2);
                arrayList.addAll(arrayList2);
                String str2 = ay2Var.o;
                if (str2 == null || !str2.equals("0")) {
                    zm8Var.s = ay2Var.o;
                } else {
                    zm8Var.s = null;
                }
                rm8 rm8Var = zm8Var.i;
                if (rm8Var != null) {
                    rm8Var.f(str, zm8Var.n, false);
                    rm8 rm8Var2 = zm8Var.i;
                    new ArrayList(arrayList);
                    rm8Var2.getClass();
                    return;
                }
                return;
            case 1:
                final Throwable th2 = (Throwable) obj;
                zm8Var.getClass();
                final String str3 = "searchChatsAndMessages: exception";
                wqi.b("zm8", "searchChatsAndMessages: exception", th2);
                ((y3b) zm8Var.g).a(new RuntimeException(str3, str, th2) { // from class: ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException
                    {
                        super(u45.k(str3, ". query is ", str), th2);
                    }
                });
                return;
            default:
                final Throwable th3 = (Throwable) obj;
                final String str4 = "searchChats: exception";
                wqi.b("zm8", "searchChats: exception", th3);
                ((y3b) zm8Var.g).a(new RuntimeException(str4, str, th3) { // from class: ru.ok.tamtam.search.MainSearchLoaderImpl$NotFoundException
                    {
                        super(u45.k(str4, ". query is ", str), th3);
                    }
                });
                return;
        }
    }
}
