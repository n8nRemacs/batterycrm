package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class msc {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(fb0.g, Range.create(2160, 4319));
        map.put(fb0.f, Range.create(1080, 1439));
        map.put(fb0.e, Range.create(720, 1079));
        map.put(fb0.d, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, mt.a);
        map2.put(1, mt.c);
    }

    public msc(List list, HashMap map) {
        HashMap map2;
        Integer num;
        fb0 fb0Var;
        HashMap map3 = b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = c;
            if (!zHasNext) {
                break;
            }
            fb0 fb0Var2 = (fb0) it.next();
            this.a.put(new eb0(fb0Var2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.a.put(new eb0(fb0Var2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.a.get(new eb0((fb0) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    fb0Var = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    fb0Var = (fb0) entry2.getKey();
                    break;
                }
            }
            if (fb0Var != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (mt.a(size, (Rational) entry3.getValue(), d4f.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.a.get(new eb0(fb0Var, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.a.entrySet()) {
            Size size2 = (Size) map.get(((eb0) entry4.getKey()).a);
            if (size2 != null) {
                Size size3 = d4f.a;
                Collections.sort((List) entry4.getValue(), new y20(size2.getHeight() * size2.getWidth(), 1));
            }
        }
    }
}
