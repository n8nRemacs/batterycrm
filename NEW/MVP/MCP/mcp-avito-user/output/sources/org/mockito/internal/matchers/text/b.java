package org.mockito.internal.matchers.text;

import Y71.i;
import Y71.l;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MatcherToString.java */
/* loaded from: classes7.dex */
final class b {
    public static String a(org.mockito.d<?> dVar) throws SecurityException {
        for (Class<?> superclass = dVar.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (i.a(method)) {
                    return dVar.toString();
                }
            }
        }
        Class<?> cls = dVar.getClass();
        String simpleName = cls.isSynthetic() ? "" : cls.getSimpleName();
        Pattern pattern = l.f19338a;
        if (simpleName.length() == 0) {
            return "<custom argument matcher>";
        }
        Matcher matcher = l.f19338a.matcher(simpleName);
        StringBuilder sb2 = new StringBuilder();
        while (matcher.find()) {
            if (sb2.length() == 0) {
                sb2.append(matcher.group());
            } else {
                sb2.append(" ");
                sb2.append(matcher.group().toLowerCase());
            }
        }
        String string = sb2.toString();
        return string.length() == 0 ? AK.c.k("<", simpleName, ">") : AK.c.k("<", string, ">");
    }
}
