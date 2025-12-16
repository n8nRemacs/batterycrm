package io.noties.markwon.html;

import android.text.TextUtils;
import j.N;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: CssInlineStyleParser.java */
/* loaded from: classes8.dex */
public abstract class b {

    /* compiled from: CssInlineStyleParser.java */
    /* renamed from: io.noties.markwon.html.b$b, reason: collision with other inner class name */
    public static class C11432b extends b {

        /* compiled from: CssInlineStyleParser.java */
        /* renamed from: io.noties.markwon.html.b$b$a */
        public static class a implements Iterable<c> {

            /* renamed from: b, reason: collision with root package name */
            public final String f401725b;

            /* compiled from: CssInlineStyleParser.java */
            /* renamed from: io.noties.markwon.html.b$b$a$a, reason: collision with other inner class name */
            public class C11433a implements Iterator<c> {

                /* renamed from: b, reason: collision with root package name */
                public final c f401726b = new c();

                /* renamed from: c, reason: collision with root package name */
                public final StringBuilder f401727c = new StringBuilder();

                /* renamed from: d, reason: collision with root package name */
                public final int f401728d;

                /* renamed from: e, reason: collision with root package name */
                public int f401729e;

                public C11433a(a aVar) {
                    this.f401728d = a.this.f401725b.length();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    c cVar = this.f401726b;
                    cVar.f401731a = "";
                    cVar.f401732b = "";
                    StringBuilder sb2 = this.f401727c;
                    sb2.setLength(0);
                    int i12 = this.f401729e;
                    String strTrim = null;
                    boolean z12 = false;
                    String strTrim2 = null;
                    while (true) {
                        int i13 = this.f401728d;
                        if (i12 < i13) {
                            char cCharAt = a.this.f401725b.charAt(i12);
                            if (strTrim == null) {
                                if (':' == cCharAt) {
                                    if (sb2.length() > 0) {
                                        strTrim = sb2.toString().trim();
                                    }
                                    sb2.setLength(0);
                                } else if (';' == cCharAt) {
                                    sb2.setLength(0);
                                } else if (Character.isWhitespace(cCharAt)) {
                                    if (sb2.length() > 0) {
                                        z12 = true;
                                    }
                                } else if (z12) {
                                    sb2.setLength(0);
                                    sb2.append(cCharAt);
                                    z12 = false;
                                } else {
                                    sb2.append(cCharAt);
                                }
                            } else if (strTrim2 != null) {
                                continue;
                            } else if (Character.isWhitespace(cCharAt)) {
                                if (sb2.length() > 0) {
                                    sb2.append(cCharAt);
                                }
                            } else if (';' == cCharAt) {
                                strTrim2 = sb2.toString().trim();
                                sb2.setLength(0);
                                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                                    this.f401729e = i12 + 1;
                                    cVar.f401731a = strTrim;
                                    cVar.f401732b = strTrim2;
                                    break;
                                }
                            } else {
                                sb2.append(cCharAt);
                            }
                            i12++;
                        } else if (strTrim != null && sb2.length() > 0) {
                            String strTrim3 = sb2.toString().trim();
                            cVar.f401731a = strTrim;
                            cVar.f401732b = strTrim3;
                            this.f401729e = i13;
                        }
                    }
                    return (TextUtils.isEmpty(cVar.f401731a) || TextUtils.isEmpty(cVar.f401732b)) ? false : true;
                }

                @Override // java.util.Iterator
                public final c next() {
                    c cVar = this.f401726b;
                    String str = cVar.f401731a;
                    String str2 = cVar.f401732b;
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        throw new NoSuchElementException();
                    }
                    return cVar;
                }
            }

            public a(@N String str) {
                this.f401725b = str;
            }

            @Override // java.lang.Iterable
            @N
            public final Iterator<c> iterator() {
                return new C11433a(null);
            }
        }

        @Override // io.noties.markwon.html.b
        @N
        public final Iterable<c> b(@N String str) {
            return new a(str);
        }
    }

    @N
    public static b a() {
        return new C11432b();
    }

    @N
    public abstract Iterable<c> b(@N String str);
}
