package W71;

import Y71.h;
import androidx.compose.foundation.H;
import e81.InterfaceC39968b;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: PrintSettings.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final List<Integer> f17762a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final Set<String> f17763b = Collections.emptySet();

    public final String a(InterfaceC39968b interfaceC39968b, List list) {
        new org.mockito.internal.matchers.text.c();
        String str = h.b(interfaceC39968b.v3()) + "." + interfaceC39968b.getMethod().getName();
        StringBuilder sbR = H.r(str);
        sbR.append(org.mockito.internal.matchers.text.d.b("(", ", ", ");", org.mockito.internal.matchers.text.c.a(list, this)));
        String string = sbR.toString();
        if (list.isEmpty() || string.length() <= 45) {
            return string;
        }
        StringBuilder sbR2 = H.r(str);
        sbR2.append(org.mockito.internal.matchers.text.d.b("(\n    ", ",\n    ", "\n);", org.mockito.internal.matchers.text.c.a(list, this)));
        return sbR2.toString();
    }
}
