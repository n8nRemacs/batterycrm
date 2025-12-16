package R71;

import Q71.b;
import java.util.Iterator;
import java.util.List;

/* compiled from: ScenarioPrinter.java */
/* loaded from: classes7.dex */
public class a {
    public static String a(List list) {
        if (list.size() == 1) {
            return "Actually, above is the only interaction with this mock.";
        }
        StringBuilder sb2 = new StringBuilder("***\nFor your reference, here is the list of all invocations ([?] - means unverified).\n");
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            i12++;
            sb2.append(i12);
            sb2.append(". ");
            if (!bVar.M()) {
                sb2.append("[?]");
            }
            sb2.append(bVar.j());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
