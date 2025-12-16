package org.mockito.internal.invocation;

import V71.t;
import com.yandex.div2.D8;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;

/* compiled from: MatchersBinder.java */
/* loaded from: classes7.dex */
public class l implements Serializable {
    public static i a(org.mockito.internal.progress.a aVar, e eVar) {
        List<t> listA = aVar.a();
        if (!listA.isEmpty()) {
            int size = listA.size();
            int length = eVar.f421653d.length;
            if (length != size) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(length);
                sb2.append(" matchers expected, ");
                D8.r(listA, sb2, " recorded:");
                sb2.append((Object) Q71.a.e(listA));
                throw new InvalidUseOfMatchersException(Y71.l.b("Invalid use of argument matchers!", sb2.toString(), "", "This exception may occur if matchers are combined with raw values:", "    //incorrect:", "    someMethod(any(), \"raw String\");", "When using matchers, all arguments have to be provided by matchers.", "For example:", "    //correct:", "    someMethod(any(), eq(\"String by matcher\"));", "", "For more info see javadoc for Matchers class.", ""));
            }
        }
        LinkedList linkedList = new LinkedList();
        Iterator<t> it = listA.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            linkedList.add(null);
        }
        return new i(eVar, linkedList);
    }
}
