package org.commonmark.internal.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Escaping.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f420366a = Pattern.compile("[\\\\&]");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f420367b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f420368c;

    /* renamed from: d, reason: collision with root package name */
    public static final C12199a f420369d;

    /* compiled from: Escaping.java */
    /* renamed from: org.commonmark.internal.util.a$a, reason: collision with other inner class name */
    public static class C12199a implements c {
    }

    /* compiled from: Escaping.java */
    public static class b implements c {
    }

    /* compiled from: Escaping.java */
    public interface c {
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f420368c = Pattern.compile("[ \t\r\n]+");
        f420369d = new C12199a();
        new b();
    }

    public static void a(String str) {
        String str2;
        StringBuilder sb2 = null;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt == '<') {
                str2 = "&lt;";
            } else if (cCharAt != '>') {
                if (sb2 != null) {
                    sb2.append(cCharAt);
                }
            } else {
                str2 = "&gt;";
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
                sb2.append((CharSequence) str, 0, i12);
            }
            sb2.append(str2);
        }
    }

    public static String b(String str) {
        if (!f420366a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f420367b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f420369d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb2.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb2.append(org.commonmark.internal.util.b.a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }
}
