package defpackage;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.SM;

/* loaded from: classes2.dex */
public final class y64 {
    public static final lcj a = new lcj(16);

    public static void a(zs zsVar) {
        Object next;
        List list;
        ArrayList arrayList = new ArrayList();
        Iterator it = zsVar.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            Object next2 = f2Var.next();
            if (SM.SET_COOKIE.equals(((u97) next2).a)) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                list = HttpCookie.parse(((u97) it2.next()).b);
            } catch (Exception unused) {
                list = hd5.a;
            }
            arrayList2.add(list);
        }
        ArrayList arrayListR = we3.r(arrayList2);
        ArrayList arrayList3 = new ArrayList(we3.q(arrayListR, 10));
        Iterator it3 = arrayListR.iterator();
        while (it3.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it3.next();
            httpCookie.toString();
            arrayList3.add(httpCookie);
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            } else {
                next = it4.next();
                if ("vdt".equals(((HttpCookie) next).getName())) {
                    break;
                }
            }
        }
        HttpCookie httpCookie2 = (HttpCookie) next;
        if (httpCookie2 != null) {
            httpCookie2.getName();
            httpCookie2.getValue();
        }
    }
}
