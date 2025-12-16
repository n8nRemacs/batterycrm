package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v67 {
    public final String a;
    public boolean d;
    public final String b = v67.class.getName();
    public final ArrayList c = new ArrayList();
    public final ArrayList e = new ArrayList();

    public v67(String str) {
        this.a = str;
    }

    public final InetAddress[] a() {
        ArrayList arrayList = this.c;
        InetAddress[] inetAddressArr = null;
        if ((!arrayList.isEmpty() ? arrayList : null) != null) {
            int size = arrayList.size();
            inetAddressArr = new InetAddress[size];
            for (int i = 0; i < size; i++) {
                inetAddressArr[i] = ((ss7) arrayList.get(i)).a;
            }
        }
        return inetAddressArr;
    }

    public final String toString() {
        return ue3.N(this.c, "\n", ho7.i("Host(", this.a, "|\n"), ")", new d73(24), 24);
    }
}
