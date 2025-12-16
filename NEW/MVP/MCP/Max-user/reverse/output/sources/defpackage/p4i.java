package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p4i extends jsi {
    public static final String i = cei.m("WorkContinuationImpl");
    public final c5i a;
    public final String b;
    public final uk5 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public wib h;

    public p4i(c5i c5iVar, String str, uk5 uk5Var, List list, int i2) {
        this.a = c5iVar;
        this.b = str;
        this.c = uk5Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            String stringId = ((WorkRequest) list.get(i3)).getStringId();
            this.e.add(stringId);
            this.f.add(stringId);
        }
    }

    public static HashSet e(p4i p4iVar) {
        HashSet hashSet = new HashSet();
        p4iVar.getClass();
        return hashSet;
    }

    public final vib c() {
        if (this.g) {
            cei.g().o(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            wib wibVar = new wib(0);
            this.a.d.c(new lg5(this, wibVar));
            this.h = wibVar;
        }
        return this.h;
    }

    public final cb8 d() {
        c5i c5iVar = this.a;
        s5i s5iVarX = c5iVar.c.x();
        s5iVarX.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        ArrayList<String> arrayList = this.f;
        int size = arrayList.size();
        lc4.a(sb, size);
        sb.append(")");
        dsd dsdVarC = dsd.c(size, sb.toString());
        int i2 = 1;
        for (String str : arrayList) {
            if (str == null) {
                dsdVarC.S(i2);
            } else {
                dsdVarC.f(i2, str);
            }
            i2++;
        }
        oq7 oq7Var = ((WorkDatabase_Impl) s5iVarX.a).e;
        jad jadVar = new jad(s5iVarX, 19, dsdVarC);
        s7c s7cVar = oq7Var.j;
        String[] strArrD = oq7Var.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        for (String str2 : strArrD) {
            if (!oq7Var.d.containsKey(str2.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
            }
        }
        isd isdVar = new isd((lrd) s7cVar.a, s7cVar, jadVar, strArrD);
        lz1 lz1Var = r5i.v;
        u5i u5iVar = c5iVar.d;
        Object obj = new Object();
        cc9 cc9Var = new cc9();
        cc9Var.l(isdVar, new gb8(u5iVar, obj, lz1Var, cc9Var));
        return cc9Var;
    }
}
