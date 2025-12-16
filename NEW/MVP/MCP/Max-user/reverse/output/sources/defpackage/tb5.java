package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class tb5 implements qb5 {
    public final k18 a;
    public final k18 b;

    public tb5(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    @Override // defpackage.qb5
    public final boolean a(int i, CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i > vmf.y(charSequence)) {
            return false;
        }
        Set set = na5.a;
        int iCodePointAt = charSequence.toString().codePointAt(i);
        return na5.a(iCodePointAt) || iCodePointAt == 8205 || iCodePointAt == 8419;
    }

    @Override // defpackage.qb5
    public final CharSequence b(int i, CharSequence charSequence) {
        Spannable spannableE = h().e(i, charSequence);
        return spannableE == null ? "" : spannableE;
    }

    @Override // defpackage.qb5
    public final List c(CharSequence charSequence) {
        List listD = h().d(charSequence);
        ArrayList arrayList = new ArrayList(we3.q(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((CharSequence) ((imb) it.next()).a);
        }
        return arrayList;
    }

    @Override // defpackage.qb5
    public final CharSequence d(long j, String str, String str2, CharSequence charSequence, int i) {
        Spanned spanned;
        CharSequence charSequenceB = b(i, charSequence);
        int length = charSequenceB.length();
        try {
            spanned = charSequenceB instanceof Spanned ? (Spanned) charSequenceB : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, yb5.class) : null;
        yb5[] yb5VarArr = (yb5[]) spans;
        yb5 yb5Var = yb5VarArr != null ? (yb5) ys.w(yb5VarArr) : null;
        if (yb5Var == null || str == null) {
            return charSequenceB;
        }
        vi viVar = (vi) this.b.getValue();
        viVar.getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        Context context = viVar.b;
        Long lValueOf = Long.valueOf(j);
        if (str2 == null) {
            str2 = "";
        }
        ok okVar = new ok(context, i, ucf.a(new cjg(lValueOf, str, str2)), new wi(yb5Var.X), viVar.a);
        okVar.setBounds(0, 0, i, i);
        pk pkVar = new pk(j, okVar);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(pkVar, 0, charSequence.length(), 33);
        return spannableString;
    }

    @Override // defpackage.qb5
    public final CharSequence e(CharSequence charSequence) {
        wc5 wc5VarH = h();
        wc5VarH.e.getClass();
        Spannable spannableE = wc5VarH.e(kti.d(TypedValue.applyDimension(2, 20, vw4.d().getDisplayMetrics())), charSequence);
        return spannableE == null ? "" : spannableE;
    }

    @Override // defpackage.qb5
    public final List f(CharSequence charSequence) {
        return h().d(charSequence);
    }

    @Override // defpackage.qb5
    public final boolean g(CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        Set set = na5.a;
        return charSequence.codePoints().allMatch(new ma5(2));
    }

    public final wc5 h() {
        return (wc5) this.a.getValue();
    }
}
