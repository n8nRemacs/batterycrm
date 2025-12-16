package com.yandex.mobile.ads.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class y10 {

    /* renamed from: a, reason: collision with root package name */
    private final String f391881a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private String f391882a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private b f391883b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private String f391884c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private Integer f391885d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private Integer f391886e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private int f391887f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private int f391888g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private String f391889h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        private Long f391890i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        private Long f391891j;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        private Integer f391892k;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        private Integer f391893l;

        @j.N
        public final a b(@j.P String str) {
            Long lValueOf;
            if (str != null) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                    lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
                } catch (ParseException unused) {
                }
            } else {
                lValueOf = null;
            }
            this.f391891j = lValueOf;
            return this;
        }

        @j.N
        public final a c(@j.P String str) throws NumberFormatException {
            Integer numValueOf;
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            this.f391886e = numValueOf;
            return this;
        }

        @j.N
        public final a d(@j.P String str) throws NumberFormatException {
            Integer numValueOf;
            int i12 = "left".equals(str) ? 1 : "right".equals(str) ? 2 : 3;
            this.f391887f = i12;
            if (i12 == 3) {
                try {
                    numValueOf = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    numValueOf = null;
                }
                this.f391892k = numValueOf;
            }
            return this;
        }

        @j.N
        public final a e(@j.P String str) {
            Long lValueOf;
            if (str != null) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                    lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
                } catch (ParseException unused) {
                }
            } else {
                lValueOf = null;
            }
            this.f391890i = lValueOf;
            return this;
        }

        @j.N
        public final a g(@j.P String str) {
            b bVar;
            Iterator it = Arrays.asList(b.values()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (b) it.next();
                if (bVar.f391895a.equals(str)) {
                    break;
                }
            }
            this.f391883b = bVar;
            return this;
        }

        @j.N
        public final a i(@j.P String str) throws NumberFormatException {
            Integer numValueOf;
            int i12 = "top".equals(str) ? 1 : "bottom".equals(str) ? 2 : 3;
            this.f391888g = i12;
            if (i12 == 3) {
                try {
                    numValueOf = Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    numValueOf = null;
                }
                this.f391893l = numValueOf;
            }
            return this;
        }

        @j.N
        public final a j(@j.P String str) throws NumberFormatException {
            Integer numValueOf;
            try {
                numValueOf = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            this.f391885d = numValueOf;
            return this;
        }

        @j.N
        public final a a(@j.P String str) {
            this.f391889h = str;
            return this;
        }

        @j.N
        public final a f(@j.P String str) {
            this.f391884c = str;
            return this;
        }

        @j.N
        public final void h(@j.P String str) {
            this.f391882a = str;
        }

        @j.N
        public final y10 a() {
            return new y10(this);
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        EF7("StaticResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF17("IFrameResource"),
        /* JADX INFO: Fake field, exist only in values array */
        EF27("HTMLResource");


        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final String f391895a;

        b(String str) {
            this.f391895a = str;
        }
    }

    public y10(@j.N a aVar) {
        aVar.f391882a;
        aVar.f391883b;
        this.f391881a = aVar.f391884c;
        aVar.f391885d;
        aVar.f391886e;
        aVar.f391887f;
        aVar.f391888g;
        aVar.f391889h;
        aVar.f391890i;
        aVar.f391891j;
        aVar.f391892k;
        aVar.f391893l;
    }

    public final String a() {
        return this.f391881a;
    }
}
