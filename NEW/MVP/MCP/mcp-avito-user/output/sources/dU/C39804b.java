package du;

import Y61.k;
import Y61.l;
import bu.AbstractC25714c;
import bu.C25713b;
import bu.C25715d;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ScrollPositionUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_das-date-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: du.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39804b {
    @l
    public static final Integer a(@k Date date, @k C25713b c25713b) {
        ArrayList arrayList = c25713b.f57531a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C42745f0.h(((C25715d) it.next()).f57536b, arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            }
            AbstractC25714c abstractC25714c = (AbstractC25714c) it2.next();
            if ((abstractC25714c instanceof AbstractC25714c.a) && C39803a.c(((AbstractC25714c.a) abstractC25714c).f57532a, date)) {
                break;
            }
            i13++;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (C39803a.b(((C25715d) it3.next()).f57535a, date) && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        int i14 = (i12 - 1) + i13;
        Integer numValueOf = Integer.valueOf(i14);
        if (i14 >= 0) {
            return numValueOf;
        }
        return null;
    }
}
