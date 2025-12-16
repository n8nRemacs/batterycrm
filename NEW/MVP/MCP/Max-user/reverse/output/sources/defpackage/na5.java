package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class na5 {
    public static final Set a;
    public static final LinkedHashSet b;

    static {
        Set setH = gke.h("👰\u200d♂️", "🫃", "👯\u200d♂️", "💏", "👨\u200d❤️\u200d💋\u200d👨", "👩\u200d❤️\u200d💋\u200d👩", "💑", "👨\u200d❤️\u200d👨", "👩\u200d❤️\u200d👩", "🌈", "🏳️\u200d🌈", "🏳️\u200d⚧️", "🧑\u200d🤝\u200d🧑", "👬", "👭");
        a = setH;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((String) it.next()).codePoints().filter(new ma5(1)).toArray());
        }
        b = linkedHashSet;
    }

    public static final boolean a(int i) {
        if (8400 <= i && i < 8448) {
            return true;
        }
        if (8596 <= i && i < 8601) {
            return true;
        }
        if (9100 <= i && i < 9301) {
            return true;
        }
        if (9723 <= i && i < 9727) {
            return true;
        }
        if (9728 <= i && i < 9984) {
            return true;
        }
        if (9984 <= i && i < 10176) {
            return true;
        }
        if (65024 <= i && i < 65040) {
            return true;
        }
        if (127462 <= i && i < 127488) {
            return true;
        }
        if (127744 <= i && i < 128512) {
            return true;
        }
        if (128512 <= i && i < 128592) {
            return true;
        }
        if (128640 <= i && i < 128768) {
            return true;
        }
        if (128992 <= i && i < 129004) {
            return true;
        }
        if (129648 <= i && i < 129661) {
            return true;
        }
        if (129664 <= i && i < 129734) {
            return true;
        }
        if (129742 <= i && i < 129756) {
            return true;
        }
        if (129760 <= i && i < 129769) {
            return true;
        }
        if (129776 <= i && i < 129785) {
            return true;
        }
        if (129280 <= i && i < 129536) {
            return true;
        }
        if (127000 > i || i >= 127601) {
            return (917536 <= i && i < 917632) || i == 126980 || i == 129008 || i == 8252 || i == 8265 || i == 8482 || i == 8505 || i == 8601 || i == 8617 || i == 8618 || i == 8986 || i == 8987 || i == 9000 || i == 9410 || i == 9642 || i == 9643 || i == 9654 || i == 9664 || i == 10548 || i == 10549 || i == 11013 || i == 11014 || i == 11015 || i == 11035 || i == 11036 || i == 11088 || i == 11093 || i == 12336 || i == 12349 || i == 12951 || i == 12953 || i == 169 || i == 174;
        }
        return true;
    }

    public static final boolean b(CharSequence charSequence) {
        if (ue3.A(a, charSequence)) {
            return true;
        }
        int[] array = charSequence.codePoints().filter(new ma5(0)).toArray();
        LinkedHashSet linkedHashSet = b;
        if (linkedHashSet != null && linkedHashSet.isEmpty()) {
            return false;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (Arrays.equals((int[]) it.next(), array)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(int i) {
        if (i == 8205) {
            return true;
        }
        return (127995 <= i && i < 128000) || i == 65039 || i == 8419;
    }
}
