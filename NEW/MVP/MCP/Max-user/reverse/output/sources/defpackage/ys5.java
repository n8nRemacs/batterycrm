package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final /* synthetic */ class ys5 implements o44, jy8, y79, gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ys5(xa6 xa6Var, n95 n95Var, l95 l95Var, boolean z) {
        this.a = 4;
        this.c = n95Var;
        this.d = l95Var;
        this.b = z;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        long jP;
        int i;
        switch (this.a) {
            case 3:
                e7b e7bVar = (e7b) this.c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                j6g j6gVar = (j6g) obj;
                String strSubstring = j6gVar.c;
                List arrayList = null;
                for (ku3 ku3Var : ((l24) e7bVar.e.getValue()).a.b.values()) {
                    if (TextUtils.equals(j6gVar.c, ku3Var.l())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(ku3Var);
                    }
                }
                if (arrayList == null) {
                    arrayList = Collections.EMPTY_LIST;
                }
                if (arrayList.size() == 1) {
                    jP = ((ku3) arrayList.get(0)).p();
                    strSubstring = null;
                } else {
                    if (this.b || strSubstring.length() <= 1) {
                        strSubstring = null;
                    } else {
                        if (linkedHashSet.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it = linkedHashSet.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                String str = ((cj9) it.next()).b;
                                if (str != null && str.length() != 0 && (i = i + 1) < 0) {
                                    ve3.o();
                                    throw null;
                                }
                            }
                        }
                        l5c l5cVar = (l5c) ((age) e7bVar.f.getValue());
                        l5cVar.getClass();
                        if (i >= ((int) l5cVar.m(PmsKey.mentions_entity_names_limit, 3))) {
                            return;
                        }
                        if (strSubstring.charAt(0) == '@') {
                            strSubstring = strSubstring.substring(1);
                        }
                    }
                    jP = 0;
                }
                if (jP == 0 && (strSubstring == null || strSubstring.length() == 0)) {
                    return;
                }
                String str2 = (strSubstring == null || strSubstring.length() == 0) ? null : strSubstring;
                int i2 = j6gVar.a;
                linkedHashSet.add(new cj9(jP, str2, bj9.a, i2, j6gVar.b - i2, null));
                return;
            default:
                n95 n95Var = (n95) this.c;
                l95 l95Var = (l95) this.d;
                hf0 hf0Var = (hf0) obj;
                r95 r95Var = n95Var.a;
                ArrayList arrayList2 = r95Var.a;
                ListIterator listIterator = arrayList2.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        arrayList2.add(0, hf0Var);
                        r95Var.invalidate();
                    } else if (((k95) listIterator.next()) instanceof hf0) {
                        listIterator.set(hf0Var);
                        r95Var.invalidate();
                    }
                }
                n95Var.b();
                if (this.b) {
                    r95Var.post(new cj(n95Var, l95Var, hf0Var, 27));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.y79
    public void b(u69 u69Var) {
        z79 z79Var = (z79) this.c;
        hke hkeVarR = z79Var.g.r(u69Var, wg7.m((k09) this.d), -1, -9223372036854775807L);
        hkeVarR.d(new yn6(hkeVarR, 0, new vd(z79Var, u69Var, this.b, 8)), dx4.a);
    }

    @Override // defpackage.jy8
    public void d(eb7 eb7Var, int i) {
        eb7Var.d(((ly8) this.c).c, i, ((k20) this.d).c(), this.b);
    }

    @Override // defpackage.o44
    public Object s(Task task) {
        return ((Integer) task.f()).intValue() != 402 ? task : h79.u((Context) this.c, (Intent) this.d, this.b).k(new es(2), new os5(2));
    }

    public /* synthetic */ ys5(e7b e7bVar, boolean z, LinkedHashSet linkedHashSet) {
        this.a = 3;
        this.c = e7bVar;
        this.b = z;
        this.d = linkedHashSet;
    }

    public /* synthetic */ ys5(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }
}
