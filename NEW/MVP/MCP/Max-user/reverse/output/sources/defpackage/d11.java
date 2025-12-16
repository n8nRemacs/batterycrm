package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* loaded from: classes.dex */
public final /* synthetic */ class d11 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ d11(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xs xsVar = (xs) obj;
                if (xsVar.isEmpty()) {
                    return xsVar;
                }
                List list = this.b;
                ArrayList arrayList = new ArrayList(we3.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(knb.a(((ConversationParticipant) it.next()).getExternalId()).a));
                }
                xs xsVar2 = new xs(0);
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    Object next = qsVar.next();
                    if (!arrayList.contains(Long.valueOf(((Number) next).longValue()))) {
                        xsVar2.add(next);
                    }
                }
                return xsVar2;
            case 1:
                return ue3.d0(this.b);
            default:
                return this.b;
        }
    }
}
