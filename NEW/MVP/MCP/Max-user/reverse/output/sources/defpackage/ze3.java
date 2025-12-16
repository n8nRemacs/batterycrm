package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ze3 extends ye3 {
    public static void s(Comparator comparator, List list) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
