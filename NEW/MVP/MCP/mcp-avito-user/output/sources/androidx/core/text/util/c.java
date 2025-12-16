package androidx.core.text.util;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import androidx.annotation.RestrictTo;
import androidx.compose.foundation.H;
import androidx.core.util.x;
import j.N;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LinkifyCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.core.text.util.b f44887a = new androidx.core.text.util.b();

    /* compiled from: LinkifyCompat.java */
    @X
    public static class a {
    }

    /* compiled from: LinkifyCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public URLSpan f44888a;

        /* renamed from: b, reason: collision with root package name */
        public String f44889b;

        /* renamed from: c, reason: collision with root package name */
        public int f44890c;

        /* renamed from: d, reason: collision with root package name */
        public int f44891d;
    }

    /* compiled from: LinkifyCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.text.util.c$c, reason: collision with other inner class name */
    public @interface InterfaceC1747c {
    }

    public static boolean a(@N SpannableStringBuilder spannableStringBuilder, int i12) {
        int i13;
        int i14;
        int i15;
        if (Build.VERSION.SDK_INT >= 28) {
            return Linkify.addLinks(spannableStringBuilder, i12);
        }
        if (i12 == 0) {
            return false;
        }
        Object[] objArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        for (int length = objArr.length - 1; length >= 0; length--) {
            spannableStringBuilder.removeSpan(objArr[length]);
        }
        if ((i12 & 4) != 0) {
            Linkify.addLinks(spannableStringBuilder, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i12 & 1) != 0) {
            b(arrayList, spannableStringBuilder, x.f44897a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
        }
        if ((i12 & 2) != 0) {
            b(arrayList, spannableStringBuilder, x.f44898b, new String[]{"mailto:"}, null);
        }
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            b bVar = new b();
            bVar.f44888a = uRLSpan;
            bVar.f44890c = spannableStringBuilder.getSpanStart(uRLSpan);
            bVar.f44891d = spannableStringBuilder.getSpanEnd(uRLSpan);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f44887a);
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size - 1) {
            b bVar2 = (b) arrayList.get(i16);
            int i17 = i16 + 1;
            b bVar3 = (b) arrayList.get(i17);
            int i18 = bVar2.f44890c;
            int i19 = bVar3.f44890c;
            if (i18 <= i19 && (i13 = bVar2.f44891d) > i19) {
                int i22 = bVar3.f44891d;
                int i23 = (i22 > i13 && (i14 = i13 - i18) <= (i15 = i22 - i19)) ? i14 < i15 ? i16 : -1 : i17;
                if (i23 != -1) {
                    Object obj = ((b) arrayList.get(i23)).f44888a;
                    if (obj != null) {
                        spannableStringBuilder.removeSpan(obj);
                    }
                    arrayList.remove(i23);
                    size--;
                }
            }
            i16 = i17;
        }
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar4 = (b) it.next();
            if (bVar4.f44888a == null) {
                spannableStringBuilder.setSpan(new URLSpan(bVar4.f44889b), bVar4.f44890c, bVar4.f44891d, 33);
            }
        }
        return true;
    }

    public static void b(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z12;
        Matcher matcher = pattern.matcher(spannableStringBuilder);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannableStringBuilder, iStart, iEnd)) && strGroup != null) {
                b bVar = new b();
                int length = strArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        z12 = false;
                        break;
                    }
                    String str = strArr[i12];
                    int i13 = i12;
                    if (strGroup.regionMatches(true, 0, str, 0, str.length())) {
                        z12 = true;
                        if (!strGroup.regionMatches(false, 0, str, 0, str.length())) {
                            StringBuilder sbR = H.r(str);
                            sbR.append(strGroup.substring(str.length()));
                            strGroup = sbR.toString();
                        }
                    } else {
                        i12 = i13 + 1;
                    }
                }
                if (!z12 && strArr.length > 0) {
                    strGroup = AK.c.s(new StringBuilder(), strArr[0], strGroup);
                }
                bVar.f44889b = strGroup;
                bVar.f44890c = iStart;
                bVar.f44891d = iEnd;
                arrayList.add(bVar);
            }
        }
    }
}
