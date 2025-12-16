package com.yandex.mobile.ads.impl;

import androidx.compose.ui.platform.C22491k0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class pd0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f388785b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f388786c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f388787d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f388788a;

    public static final class a {
        @X41.n
        @X41.i
        @Y61.k
        public static pd0 a(@Y61.k String str) {
            Matcher matcher = pd0.f388785b.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(C22491k0.a('\"', "No subtype found for: \"", str).toString());
            }
            String strGroup = matcher.group(1);
            Locale locale = Locale.US;
            strGroup.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = pd0.f388786c.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sbA = Cif.a("Parameter is not formatted correctly: \"");
                    sbA.append(str.substring(iEnd));
                    sbA.append("\" for: \"");
                    sbA.append(str);
                    sbA.append('\"');
                    throw new IllegalArgumentException(sbA.toString().toString());
                }
                String strGroup2 = matcher2.group(1);
                if (strGroup2 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup3 = matcher2.group(2);
                    if (strGroup3 == null) {
                        strGroup3 = matcher2.group(3);
                    } else if (C43066x.h0(strGroup3, "'", false) && C43066x.z(strGroup3, "'", false) && strGroup3.length() > 2) {
                        strGroup3 = androidx.compose.ui.graphics.colorspace.e.h(1, 1, strGroup3);
                    }
                    arrayList.add(strGroup2);
                    arrayList.add(strGroup3);
                    iEnd = matcher2.end();
                }
            }
            return new pd0(str, (String[]) arrayList.toArray(new String[0]));
        }

        @X41.n
        @Y61.l
        @X41.i
        public static pd0 b(@Y61.k String str) {
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ pd0(String str, String[] strArr) {
        this(str);
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof pd0) && kotlin.jvm.internal.L.f(((pd0) obj).f388788a, this.f388788a);
    }

    public final int hashCode() {
        return this.f388788a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return this.f388788a;
    }

    private pd0(String str) {
        this.f388788a = str;
    }
}
