package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class f7b {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final gya b;
    public final pe8 c;
    public final k18 d;
    public final l6g e;
    public String g;
    public Pattern h;
    public final z7c i;
    public final qb5 j;
    public final gya k;
    public final y6i l;
    public final yi5 m;
    public final e7b n;
    public final k18 o;
    public int f = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;

    public f7b(Context context, z7c z7cVar, qb5 qb5Var, y6i y6iVar, gya gyaVar, yi5 yi5Var, k18 k18Var, l6g l6gVar, e7b e7bVar, k18 k18Var2) {
        this.a = context.getApplicationContext();
        this.c = z7cVar.a;
        this.b = gyaVar;
        this.d = k18Var;
        this.e = l6gVar;
        this.i = z7cVar;
        this.j = qb5Var;
        this.l = y6iVar;
        this.k = gyaVar;
        this.m = yi5Var;
        this.n = e7bVar;
        this.o = k18Var2;
    }

    public CharSequence a(CharSequence charSequence, boolean z) {
        return b(charSequence, z, true, false, true, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence b(java.lang.CharSequence r17, boolean r18, boolean r19, boolean r20, boolean r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f7b.b(java.lang.CharSequence, boolean, boolean, boolean, boolean, java.util.List, boolean):java.lang.CharSequence");
    }

    public final CharSequence c(CharSequence charSequence, cj9 cj9Var, boolean z, boolean z2) {
        EnumSet enumSet = cj9.g;
        bj9 bj9Var = cj9Var.c;
        int i = cj9Var.e;
        int i2 = cj9Var.d;
        if (enumSet.contains(bj9Var)) {
            return charSequence;
        }
        int i3 = i2 + i;
        if (i3 > charSequence.length() || i2 < 0) {
            wqi.o("f7b", null, "addMessageElement: can't add message element, text length: %s, from: %s, length: %s", Arrays.copyOf(new Object[]{Integer.valueOf(charSequence.length()), Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            return charSequence;
        }
        if (z && charSequence.charAt(i2) == '@') {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new fj9(cj9Var, this.b.a(z2)), i2, i3, 33);
        return spannableStringBuilder;
    }

    public final void d(SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, int i) {
        if (z) {
            spannableStringBuilder.insert(i, "\u2060 ");
            spannableStringBuilder.setSpan(new yzg(this.a, 1, false, new xn3(z2, 10)), i + 1, i + 2, 33);
        }
    }

    public final String e(long j) {
        String str;
        String str2;
        switch (az1.v(ml6.e(j, this.c.j()).b)) {
            case 0:
            case 1:
            case 2:
                return ml6.b(this.a, j, this.c.u());
            case 3:
                Context context = this.a;
                return context.getString(c5d.tt_dates_yesterday_format, ml6.b(context, j, this.c.u()));
            case 4:
            case 5:
            case 6:
            case 8:
                Locale localeU = this.c.u();
                synchronized ("dd MMM") {
                    if (ml6.p == null) {
                        ml6.p = new SimpleDateFormat("dd MMM", localeU);
                    }
                    str = ml6.p.format(Long.valueOf(j));
                }
                return str;
            case 7:
                Locale localeU2 = this.c.u();
                synchronized ("dd MMM yyyy") {
                    if (ml6.q == null) {
                        ml6.q = new SimpleDateFormat("dd MMM yyyy", localeU2);
                    }
                    str2 = ml6.q.format(Long.valueOf(j));
                }
                return str2;
            case 9:
                return this.a.getString(c5d.presence_unknown_date);
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    public final int f() {
        if (this.q == -1) {
            this.q = (int) this.a.getResources().getDimension(hvd.b);
        }
        return this.q;
    }

    public final int g() throws Resources.NotFoundException {
        if (this.p == -1) {
            this.p = (int) (vw4.e(this.i.c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(hvd.a));
        }
        return this.p;
    }

    public final int h() throws Resources.NotFoundException {
        if (this.r == -1) {
            this.r = (int) (vw4.e(this.i.c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(hvd.c));
        }
        return this.r;
    }

    public final f7c i(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? f7c.a() : new f7c(this.j.e(charSequence), m6g.c(charSequence.toString(), this));
    }

    public final f7c j(String str, ArrayList arrayList) {
        return TextUtils.isEmpty(str) ? f7c.a() : arrayList.isEmpty() ? i(str) : new f7c(k(str, arrayList, vw4.b(18)), m6g.c(str.toString(), this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    public final CharSequence k(CharSequence charSequence, List list, int i) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        boolean zA = ((gk) this.o.getValue()).a();
        qb5 qb5Var = this.j;
        if (!zA) {
            return qb5Var.b(i, charSequence);
        }
        if (list == null || !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                try {
                    if (((cj9) obj).c == bj9.u0) {
                        arrayList2.add(obj);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return arrayList.isEmpty() ? qb5Var.b(i, charSequence) : this.n.a(charSequence, arrayList, 1, false, i, true, true);
    }

    public final CharSequence l(CharSequence charSequence, List list, boolean z, int i, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        return this.n.a(charSequence, list, 1, z, i, z2 && ((gk) this.o.getValue()).a(), true);
    }

    public final CharSequence m(CharSequence charSequence, List list) {
        CharSequence charSequenceL = l(charSequence, list, true, 0, false);
        if (TextUtils.isEmpty(charSequenceL) || jqi.f(list)) {
            return charSequenceL;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequenceL);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cj9 cj9Var = (cj9) it.next();
            if (cj9Var.c == bj9.a) {
                spannableStringBuilder = c(spannableStringBuilder, cj9Var, false, true);
            }
        }
        return spannableStringBuilder;
    }
}
