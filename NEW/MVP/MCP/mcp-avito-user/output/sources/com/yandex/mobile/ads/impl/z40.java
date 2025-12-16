package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class z40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.instream.e f392183a;

    public static class a implements Comparator<ut0> {
        private a() {
        }

        @Override // java.util.Comparator
        public final int compare(ut0 ut0Var, ut0 ut0Var2) {
            ut0 ut0Var3 = ut0Var;
            ut0 ut0Var4 = ut0Var2;
            if (ut0Var3.equals(ut0Var4)) {
                return 0;
            }
            String type = ut0Var3.a().getType();
            String type2 = ut0Var4.a().getType();
            return (!type.equals(InstreamAdBreakType.PREROLL) && (type2.equals(InstreamAdBreakType.PREROLL) || type.equals(InstreamAdBreakType.POSTROLL) || (!type2.equals(InstreamAdBreakType.POSTROLL) && ut0Var3.b() >= ut0Var4.b()))) ? 1 : -1;
        }

        public /* synthetic */ a(int i12) {
            this();
        }
    }

    public z40(@j.N com.yandex.mobile.ads.instream.e eVar) {
        this.f392183a = eVar;
    }

    @j.N
    public final y40 a(@j.N List<p60> list) {
        p60 p60Var;
        p60 next;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (p60 p60Var2 : list) {
            if (InstreamAdBreakType.MIDROLL.equals(p60Var2.getType())) {
                arrayList2.add(p60Var2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            p60 p60Var3 = (p60) it.next();
            InstreamAdBreakPosition adBreakPosition = p60Var3.getAdBreakPosition();
            long value = adBreakPosition.getValue();
            if (InstreamAdBreakPosition.Type.PERCENTS.equals(adBreakPosition.getPositionType())) {
                value = (long) ((value / 100.0f) * this.f392183a.b());
            }
            arrayList.add(new ut0(p60Var3, value));
        }
        Collections.sort(arrayList, new a(0));
        Iterator<p60> it2 = list.iterator();
        while (true) {
            p60Var = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (InstreamAdBreakType.PREROLL.equals(next.getType())) {
                break;
            }
        }
        Iterator<p60> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            p60 next2 = it3.next();
            if (InstreamAdBreakType.POSTROLL.equals(next2.getType())) {
                p60Var = next2;
                break;
            }
        }
        return new y40(arrayList, next, p60Var);
    }
}
