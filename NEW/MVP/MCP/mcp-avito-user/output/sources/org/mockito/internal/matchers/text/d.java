package org.mockito.internal.matchers.text;

import androidx.camera.view.k;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ValuePrinter.java */
/* loaded from: classes7.dex */
public class d {

    /* compiled from: ValuePrinter.java */
    public class a implements Iterator<Object> {

        /* renamed from: b, reason: collision with root package name */
        public int f421692b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f421693c;

        public a(Object obj) {
            this.f421693c = obj;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f421692b < Array.getLength(this.f421693c);
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i12 = this.f421692b;
            this.f421692b = i12 + 1;
            return Array.get(this.f421693c, i12);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("cannot remove items from an array");
        }
    }

    public static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return "\"" + obj.toString() + '\"';
        }
        if (obj instanceof Character) {
            char cCharValue = ((Character) obj).charValue();
            StringBuilder sb2 = new StringBuilder("'");
            if (cCharValue == '\t') {
                sb2.append("\\t");
            } else if (cCharValue == '\n') {
                sb2.append("\\n");
            } else if (cCharValue == '\r') {
                sb2.append("\\r");
            } else if (cCharValue != '\"') {
                sb2.append(cCharValue);
            } else {
                sb2.append("\\\"");
            }
            sb2.append('\'');
            return sb2.toString();
        }
        if (obj instanceof Long) {
            return obj + "L";
        }
        if (obj instanceof Double) {
            return obj + "d";
        }
        if (obj instanceof Float) {
            return obj + "f";
        }
        if (obj instanceof Short) {
            return k.a(obj, "(short) ");
        }
        if (obj instanceof Byte) {
            return String.format("(byte) 0x%02X", (Byte) obj);
        }
        if (!(obj instanceof Map)) {
            if (obj.getClass().isArray()) {
                return b("[", ", ", "]", new a(obj));
            }
            if (obj instanceof org.mockito.internal.matchers.text.a) {
                return ((org.mockito.internal.matchers.text.a) obj).f421691a;
            }
            try {
                return String.valueOf(obj);
            } catch (RuntimeException unused) {
                return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = ((Map) obj).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb3.append(a(entry.getKey()));
            sb3.append(" = ");
            sb3.append(a(entry.getValue()));
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        return "{" + ((Object) sb3) + "}";
    }

    public static String b(String str, String str2, String str3, Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder(str);
        while (it.hasNext()) {
            sb2.append(a(it.next()));
            if (it.hasNext()) {
                sb2.append(str2);
            }
        }
        sb2.append(str3);
        return sb2.toString();
    }
}
