package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class t2i {
    public static final ov5 a = new ov5(8);

    public static boolean a(Spannable spannable, int i) throws NumberFormatException, UnsupportedEncodingException {
        int i2;
        int i3;
        int i4;
        int iIndexOf;
        if (Build.VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(spannable, i);
        }
        if (i != 0) {
            Object[] objArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            for (int length = objArr.length - 1; length >= 0; length--) {
                spannable.removeSpan(objArr[length]);
            }
            if ((i & 4) != 0) {
                Linkify.addLinks(spannable, 4);
            }
            ArrayList arrayList = new ArrayList();
            if ((i & 1) != 0) {
                e(arrayList, spannable, bpb.b, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
            }
            if ((i & 2) != 0) {
                e(arrayList, spannable, bpb.c, new String[]{"mailto:"}, null);
            }
            if ((i & 8) != 0) {
                String string = spannable.toString();
                int i5 = 0;
                while (true) {
                    try {
                        String strD = d(string);
                        if (strD == null || (iIndexOf = string.indexOf(strD)) < 0) {
                            break;
                        }
                        w88 w88Var = new w88();
                        int length2 = strD.length() + iIndexOf;
                        w88Var.c = iIndexOf + i5;
                        i5 += length2;
                        w88Var.d = i5;
                        string = string.substring(length2);
                        try {
                            w88Var.b = "geo:0,0?q=" + URLEncoder.encode(strD, "UTF-8");
                            arrayList.add(w88Var);
                        } catch (UnsupportedEncodingException unused) {
                        }
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
            }
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                w88 w88Var2 = new w88();
                w88Var2.a = uRLSpan;
                w88Var2.c = spannable.getSpanStart(uRLSpan);
                w88Var2.d = spannable.getSpanEnd(uRLSpan);
                arrayList.add(w88Var2);
            }
            Collections.sort(arrayList, a);
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size - 1) {
                w88 w88Var3 = (w88) arrayList.get(i6);
                int i7 = i6 + 1;
                w88 w88Var4 = (w88) arrayList.get(i7);
                int i8 = w88Var3.c;
                int i9 = w88Var4.c;
                if (i8 <= i9 && (i2 = w88Var3.d) > i9) {
                    int i10 = w88Var4.d;
                    int i11 = (i10 > i2 && (i3 = i2 - i8) <= (i4 = i10 - i9)) ? i3 < i4 ? i6 : -1 : i7;
                    if (i11 != -1) {
                        Object obj = ((w88) arrayList.get(i11)).a;
                        if (obj != null) {
                            spannable.removeSpan(obj);
                        }
                        arrayList.remove(i11);
                        size--;
                    }
                }
                i6 = i7;
            }
            if (arrayList.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w88 w88Var5 = (w88) it.next();
                    if (w88Var5.a == null) {
                        spannable.setSpan(new URLSpan(w88Var5.b), w88Var5.c, w88Var5.d, 33);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean b(Spannable spannable, Pattern pattern, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Linkify.addLinks(spannable, pattern, str);
        }
        if (i >= 28) {
            return v88.b(spannable, pattern, str, null, null, null);
        }
        String[] strArr = {(str == null ? "" : str).toLowerCase(Locale.ROOT)};
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (strGroup != null) {
                spannable.setSpan(new URLSpan(f(strGroup, strArr, matcher)), iStart, iEnd, 33);
                z = true;
            }
        }
        return z;
    }

    public static final void c(TextView textView, yeb yebVar) {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        Drawable drawableMutate3;
        Drawable drawableMutate4;
        Drawable drawableMutate5;
        Drawable drawableMutate6;
        textView.setHighlightColor(zob.b(yebVar.i().h, 0.24f));
        Drawable drawableF = mfh.f(textView);
        if (drawableF != null) {
            cei.k(drawableF, yebVar.i().h);
        }
        int i = yebVar.i().h;
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable textSelectHandle = textView.getTextSelectHandle();
            if (textSelectHandle != null && (drawableMutate6 = textSelectHandle.mutate()) != null) {
                t35.g(drawableMutate6, i);
                textView.setTextSelectHandle(drawableMutate6);
            }
            Drawable textSelectHandleLeft = textView.getTextSelectHandleLeft();
            if (textSelectHandleLeft != null && (drawableMutate5 = textSelectHandleLeft.mutate()) != null) {
                t35.g(drawableMutate5, i);
                textView.setTextSelectHandleLeft(drawableMutate5);
            }
            Drawable textSelectHandleRight = textView.getTextSelectHandleRight();
            if (textSelectHandleRight == null || (drawableMutate4 = textSelectHandleRight.mutate()) == null) {
                return;
            }
            t35.g(drawableMutate4, i);
            textView.setTextSelectHandleRight(drawableMutate4);
            return;
        }
        Object objB = z7j.b(textView, "mEditor");
        if (objB == null) {
            return;
        }
        Object objB2 = z7j.b(textView, "mTextSelectHandleRes");
        if (!(objB2 instanceof Integer)) {
            objB2 = null;
        }
        Integer num = (Integer) objB2;
        if (num != null) {
            Drawable drawable = textView.getContext().getDrawable(num.intValue());
            if (drawable != null && (drawableMutate3 = drawable.mutate()) != null) {
                t35.g(drawableMutate3, i);
                z7j.d(objB, "mSelectHandleCenter", drawableMutate3);
            }
        }
        Object objB3 = z7j.b(textView, "mTextSelectHandleLeftRes");
        if (!(objB3 instanceof Integer)) {
            objB3 = null;
        }
        Integer num2 = (Integer) objB3;
        if (num2 != null) {
            Drawable drawable2 = textView.getContext().getDrawable(num2.intValue());
            if (drawable2 != null && (drawableMutate2 = drawable2.mutate()) != null) {
                t35.g(drawableMutate2, i);
                z7j.d(objB, "mSelectHandleLeft", drawableMutate2);
            }
        }
        Object objB4 = z7j.b(textView, "mTextSelectHandleRightRes");
        Integer num3 = (Integer) (objB4 instanceof Integer ? objB4 : null);
        if (num3 != null) {
            Drawable drawable3 = textView.getContext().getDrawable(num3.intValue());
            if (drawable3 == null || (drawableMutate = drawable3.mutate()) == null) {
                return;
            }
            t35.g(drawableMutate, i);
            z7j.d(objB, "mSelectHandleRight", drawableMutate);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2i.d(java.lang.String):java.lang.String");
    }

    public static void e(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    w88 w88Var = new w88();
                    w88Var.b = f(strGroup, strArr, matcher);
                    w88Var.c = iStart;
                    w88Var.d = iEnd;
                    arrayList.add(w88Var);
                }
            }
        }
    }

    public static String f(String str, String[] strArr, Matcher matcher) {
        boolean z;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            String str3 = str;
            if (str3.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (str3.regionMatches(false, 0, str2, 0, str2.length())) {
                    str = str3;
                } else {
                    StringBuilder sbM = az1.m(str2);
                    sbM.append(str3.substring(str2.length()));
                    str = sbM.toString();
                }
            } else {
                i++;
                str = str3;
            }
        }
        return (z || strArr.length <= 0) ? str : ho7.l(new StringBuilder(), strArr[0], str);
    }

    public static int g(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int h(Object obj) {
        return g(obj == null ? 0 : obj.hashCode());
    }
}
