package com.google.common.base;

import aZ0.InterfaceC19845a;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: Joiner.java */
@InterfaceC37268l
@XY0.b
/* loaded from: classes6.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final String f358954a;

    /* compiled from: Joiner.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C f358955a;

        /* renamed from: b, reason: collision with root package name */
        public final String f358956b;

        public a(C c12, String str, C37281z c37281z) {
            this.f358955a = c12;
            str.getClass();
            this.f358956b = str;
        }

        @InterfaceC19845a
        public final void a(StringBuilder sb2, Iterator it) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                C c12 = this.f358955a;
                sb2.append(c12.d(key));
                String str = this.f358956b;
                sb2.append((CharSequence) str);
                sb2.append(c12.d(entry.getValue()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) c12.f358954a);
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb2.append(c12.d(entry2.getKey()));
                    sb2.append((CharSequence) str);
                    sb2.append(c12.d(entry2.getValue()));
                }
            }
        }
    }

    public C(String str) {
        str.getClass();
        this.f358954a = str;
    }

    public static C c(char c12) {
        return new C(String.valueOf(c12));
    }

    @InterfaceC19845a
    public void a(StringBuilder sb2, Iterator it) {
        if (it.hasNext()) {
            sb2.append(d(it.next()));
            while (it.hasNext()) {
                sb2.append((CharSequence) this.f358954a);
                sb2.append(d(it.next()));
            }
        }
    }

    @InterfaceC19845a
    public final void b(StringBuilder sb2, Iterator it) {
        try {
            a(sb2, it);
        } catch (IOException e12) {
            throw new AssertionError(e12);
        }
    }

    public CharSequence d(@I41.a Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public C e() {
        return new C37281z(this, this);
    }

    public C(C c12, C37281z c37281z) {
        this.f358954a = c12.f358954a;
    }
}
