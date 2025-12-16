package org.jsoup.helper;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import org.jsoup.Connection;
import org.jsoup.parser.g;

/* compiled from: HttpConnection.java */
/* loaded from: classes7.dex */
public class c implements Connection {

    /* compiled from: HttpConnection.java */
    public static abstract class b<T extends Connection.a> implements Connection.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f421036a;

        public b() {
            this.f421036a = new LinkedHashMap();
            new LinkedHashMap();
        }
    }

    /* compiled from: HttpConnection.java */
    /* renamed from: org.jsoup.helper.c$c, reason: collision with other inner class name */
    public static class C12211c implements Connection.b {
        public final String toString() {
            return "null=null";
        }
    }

    /* compiled from: HttpConnection.java */
    public static class d extends b<Connection.c> implements Connection.c {
        public d() throws UnsupportedEncodingException {
            super();
            new ArrayList();
            a("Accept-Encoding", "gzip");
            a("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
            new g(new org.jsoup.parser.b());
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00b0, code lost:
        
            r10 = new java.lang.String(r9, com.adjust.sdk.Constants.ENCODING);
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: UnsupportedEncodingException -> 0x00b1, TryCatch #0 {UnsupportedEncodingException -> 0x00b1, blocks: (B:12:0x0043, B:14:0x004f, B:16:0x0057, B:20:0x0062, B:24:0x006e, B:28:0x0073, B:30:0x0076, B:49:0x00a7, B:33:0x007d, B:35:0x0083, B:42:0x0097, B:46:0x009d, B:36:0x0086, B:38:0x008c, B:39:0x008f, B:41:0x0095, B:50:0x00a9), top: B:55:0x0043 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00a9 A[EDGE_INSN: B:63:0x00a9->B:50:0x00a9 BREAK  A[LOOP:1: B:29:0x0074->B:49:0x00a7], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final org.jsoup.helper.c.d a(java.lang.String r9, java.lang.String r10) throws java.io.UnsupportedEncodingException {
            /*
                r8 = this;
                org.jsoup.helper.d.b(r9)
                org.jsoup.helper.d.b(r9)
                java.util.LinkedHashMap r0 = r8.f421036a
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r9.equalsIgnoreCase(r2)
                if (r2 == 0) goto L10
                java.lang.Object r0 = r1.getValue()
                java.util.List r0 = (java.util.List) r0
                goto L33
            L2f:
                java.util.List r0 = java.util.Collections.emptyList()
            L33:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L43
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashMap r1 = r8.f421036a
                r1.put(r9, r0)
            L43:
                java.lang.String r9 = "ISO-8859-1"
                byte[] r9 = r10.getBytes(r9)     // Catch: java.io.UnsupportedEncodingException -> Lb1
                int r1 = r9.length     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r2 = 3
                r3 = 1
                r4 = 0
                if (r1 < r2) goto L72
                r1 = r9[r4]     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r1 = r1 & 255(0xff, float:3.57E-43)
                r5 = 239(0xef, float:3.35E-43)
                if (r1 != r5) goto L72
                r1 = r9[r3]     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r1 = r1 & 255(0xff, float:3.57E-43)
                r5 = 187(0xbb, float:2.62E-43)
                if (r1 != r5) goto L61
                r1 = r3
                goto L62
            L61:
                r1 = r4
            L62:
                r5 = 2
                r5 = r9[r5]     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r5 = r5 & 255(0xff, float:3.57E-43)
                r6 = 191(0xbf, float:2.68E-43)
                if (r5 != r6) goto L6d
                r5 = r3
                goto L6e
            L6d:
                r5 = r4
            L6e:
                r1 = r1 & r5
                if (r1 == 0) goto L72
                goto L73
            L72:
                r2 = r4
            L73:
                int r1 = r9.length     // Catch: java.io.UnsupportedEncodingException -> Lb1
            L74:
                if (r2 >= r1) goto La9
                r4 = r9[r2]     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r5 = r4 & 128(0x80, float:1.8E-43)
                if (r5 != 0) goto L7d
                goto La7
            L7d:
                r5 = r4 & 224(0xe0, float:3.14E-43)
                r6 = 192(0xc0, float:2.69E-43)
                if (r5 != r6) goto L86
                int r4 = r2 + 1
                goto L97
            L86:
                r5 = r4 & 240(0xf0, float:3.36E-43)
                r7 = 224(0xe0, float:3.14E-43)
                if (r5 != r7) goto L8f
                int r4 = r2 + 2
                goto L97
            L8f:
                r4 = r4 & 248(0xf8, float:3.48E-43)
                r5 = 240(0xf0, float:3.36E-43)
                if (r4 != r5) goto Lb1
                int r4 = r2 + 3
            L97:
                int r5 = r9.length     // Catch: java.io.UnsupportedEncodingException -> Lb1
                if (r4 < r5) goto L9b
                goto Lb1
            L9b:
                if (r2 >= r4) goto La7
                int r2 = r2 + 1
                r5 = r9[r2]     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r5 = r5 & r6
                r7 = 128(0x80, float:1.8E-43)
                if (r5 == r7) goto L9b
                goto Lb1
            La7:
                int r2 = r2 + r3
                goto L74
            La9:
                java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> Lb1
                java.lang.String r2 = "UTF-8"
                r1.<init>(r9, r2)     // Catch: java.io.UnsupportedEncodingException -> Lb1
                r10 = r1
            Lb1:
                r0.add(r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.c.d.a(java.lang.String, java.lang.String):org.jsoup.helper.c$d");
        }
    }

    /* compiled from: HttpConnection.java */
    public static class e extends b<Connection.d> implements Connection.d {
        static {
            Pattern.compile("(application|text)/\\w*\\+?xml.*");
        }

        public e() {
            super();
        }
    }

    public c() {
        new d();
        new e();
    }
}
