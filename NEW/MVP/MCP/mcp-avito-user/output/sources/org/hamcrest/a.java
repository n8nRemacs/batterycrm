package org.hamcrest;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: BaseDescription.java */
/* loaded from: classes7.dex */
public abstract class a implements g {
    public static String h(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    @Override // org.hamcrest.g
    public final g a(String str) {
        d(str);
        return this;
    }

    @Override // org.hamcrest.g
    public final g b(Object obj) {
        if (obj == null) {
            d("null");
        } else if (obj instanceof String) {
            String str = (String) obj;
            c('\"');
            for (int i12 = 0; i12 < str.length(); i12++) {
                i(str.charAt(i12));
            }
            c('\"');
        } else if (obj instanceof Character) {
            c('\"');
            i(((Character) obj).charValue());
            c('\"');
        } else if (obj instanceof Byte) {
            c('<');
            d(h(obj));
            d("b>");
        } else if (obj instanceof Short) {
            c('<');
            d(h(obj));
            d("s>");
        } else if (obj instanceof Long) {
            c('<');
            d(h(obj));
            d("L>");
        } else if (obj instanceof Float) {
            c('<');
            d(h(obj));
            d("F>");
        } else if (obj.getClass().isArray()) {
            V61.a aVar = new V61.a(obj);
            V61.e eVar = new V61.e();
            eVar.f16927b = aVar;
            f("[", ", ", "]", eVar);
        } else {
            c('<');
            d(h(obj));
            c('>');
        }
        return this;
    }

    public abstract void c(char c12);

    public void d(String str) {
        for (int i12 = 0; i12 < str.length(); i12++) {
            c(str.charAt(i12));
        }
    }

    public final g e(String str, String str2, String str3, Collection collection) {
        f(str, str2, str3, collection.iterator());
        return this;
    }

    public final void f(String str, String str2, String str3, Iterator it) {
        d(str);
        boolean z12 = false;
        while (it.hasNext()) {
            if (z12) {
                d(str2);
            }
            ((m) it.next()).a(this);
            z12 = true;
        }
        d(str3);
    }

    public final <T> g g(String str, String str2, String str3, Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        V61.e eVar = new V61.e();
        eVar.f16927b = it;
        f(str, str2, str3, eVar);
        return this;
    }

    public final void i(char c12) {
        if (c12 == '\t') {
            d("\\t");
            return;
        }
        if (c12 == '\n') {
            d("\\n");
            return;
        }
        if (c12 == '\r') {
            d("\\r");
            return;
        }
        if (c12 == '\"') {
            d("\\\"");
        } else if (c12 != '\\') {
            c(c12);
        } else {
            d("\\\\");
        }
    }
}
