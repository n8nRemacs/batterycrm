package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ya5 implements qb5 {
    public final ta5 a;

    public ya5(ta5 ta5Var) {
        this.a = ta5Var;
    }

    @Override // defpackage.qb5
    public final boolean a(int i, CharSequence charSequence) {
        CharSequence charSequence2;
        if (!TextUtils.isEmpty(charSequence) && i >= 0 && i < charSequence.length()) {
            try {
                charSequence2 = charSequence;
            } catch (Exception e) {
                e = e;
                charSequence2 = charSequence;
            }
            try {
                CharSequence charSequenceF = this.a.f(0, charSequence.length(), charSequence2, Integer.MAX_VALUE, 1);
                if (charSequenceF instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequenceF;
                    apg[] apgVarArr = (apg[]) spanned.getSpans(0, spanned.length(), apg.class);
                    if (apgVarArr != null && apgVarArr.length != 0) {
                        for (apg apgVar : apgVarArr) {
                            int spanStart = spanned.getSpanStart(apgVar);
                            int spanEnd = spanned.getSpanEnd(apgVar);
                            if (i >= spanStart && i < spanEnd) {
                                return true;
                            }
                            if (i >= spanEnd) {
                                break;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                wqi.e("ya5", String.format(Locale.ENGLISH, "Can't know is emoji at position %s", charSequence2), e);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.qb5
    public final List c(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return Collections.EMPTY_LIST;
        }
        try {
            charSequence2 = charSequence;
            try {
                CharSequence charSequenceF = this.a.f(0, charSequence.length(), charSequence2, Integer.MAX_VALUE, 1);
                if (!(charSequenceF instanceof Spanned)) {
                    return Collections.EMPTY_LIST;
                }
                Spanned spanned = (Spanned) charSequenceF;
                apg[] apgVarArr = (apg[]) spanned.getSpans(0, spanned.length(), apg.class);
                if (apgVarArr == null || apgVarArr.length == 0) {
                    return Collections.EMPTY_LIST;
                }
                ArrayList arrayList = new ArrayList(apgVarArr.length);
                for (apg apgVar : apgVarArr) {
                    int spanStart = spanned.getSpanStart(apgVar);
                    int spanEnd = spanned.getSpanEnd(apgVar);
                    try {
                        arrayList.add(spanned.subSequence(spanStart, spanEnd));
                    } catch (Exception unused) {
                        wqi.e("ya5", String.format(Locale.ENGLISH, "Can't create emoji span: start = %d, end = %d, text = %s", Integer.valueOf(spanStart), Integer.valueOf(spanEnd), charSequence2), null);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                th = th;
                wqi.g("ya5", th, "Can't get emoji tokens %s", charSequence2);
                return Collections.EMPTY_LIST;
            }
        } catch (Throwable th2) {
            th = th2;
            charSequence2 = charSequence;
        }
    }

    @Override // defpackage.qb5
    public final CharSequence e(CharSequence charSequence) {
        CharSequence charSequence2;
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                charSequence2 = charSequence;
            } catch (Exception e) {
                e = e;
                charSequence2 = charSequence;
            }
            try {
                CharSequence charSequenceF = this.a.f(0, charSequence.length(), charSequence2, Integer.MAX_VALUE, 1);
                if (charSequenceF != null) {
                    return charSequenceF;
                }
            } catch (Exception e2) {
                e = e2;
                wqi.e("ya5", String.format(Locale.ENGLISH, "Can't process emoji %s", charSequence2), e);
                return charSequence2;
            }
        }
        return "";
    }

    @Override // defpackage.qb5
    public final boolean g(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        List listC = c(charSequence);
        if (listC.isEmpty()) {
            return false;
        }
        String strTrim = charSequence.toString().trim();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            String string = ((CharSequence) it.next()).toString();
            if (!strTrim.startsWith(string)) {
                return false;
            }
            strTrim = strTrim.replaceFirst(Pattern.quote(string), "").trim();
        }
        return strTrim.length() == 0;
    }
}
