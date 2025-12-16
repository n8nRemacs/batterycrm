package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bx1 {
    public static final Object a = ipi.b(3, new jl1(20));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public static final boolean a(ytd ytdVar) {
        Object next;
        Object next2;
        ?? r0 = a;
        Iterator it = ((List) r0.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ytdVar.g((String) next) != null) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            Iterator it2 = ytdVar.e().iterator();
            loop1: while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                bud budVar = (bud) next2;
                List<String> list = (List) r0.getValue();
                if (list == null || !list.isEmpty()) {
                    for (String str2 : list) {
                        String str3 = budVar.b;
                        if (str3 != null && vmf.s(str3, str2, false)) {
                            break loop1;
                        }
                    }
                }
            }
            bud budVar2 = (bud) next2;
            str = budVar2 != null ? budVar2.b : null;
        }
        if (str != null) {
            ytdVar.E(str);
        }
        return str != null;
    }

    public static final boolean b(ytd ytdVar) {
        Object next;
        String str = ytdVar.g(":call-incoming") != null ? ":call-incoming" : null;
        if (str == null) {
            Iterator it = ytdVar.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str2 = ((bud) next).b;
                if (str2 != null && vmf.s(str2, ":call-incoming", false)) {
                    break;
                }
            }
            bud budVar = (bud) next;
            str = budVar != null ? budVar.b : null;
        }
        if (str != null) {
            ytdVar.E(str);
        }
        return str != null;
    }
}
