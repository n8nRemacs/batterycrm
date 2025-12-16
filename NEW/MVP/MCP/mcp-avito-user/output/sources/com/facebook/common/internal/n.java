package com.facebook.common.internal;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;

/* compiled from: Objects.java */
@Nullsafe
/* loaded from: classes5.dex */
public final class n {

    /* compiled from: Objects.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f339821a;

        /* renamed from: b, reason: collision with root package name */
        public final a f339822b;

        /* renamed from: c, reason: collision with root package name */
        public a f339823c;

        /* compiled from: Objects.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @I41.h
            public String f339824a;

            /* renamed from: b, reason: collision with root package name */
            @I41.h
            public Object f339825b;

            /* renamed from: c, reason: collision with root package name */
            @I41.h
            public a f339826c;

            public a() {
            }
        }

        public b(String str, a aVar) {
            a aVar2 = new a();
            this.f339822b = aVar2;
            this.f339823c = aVar2;
            str.getClass();
            this.f339821a = str;
        }

        public final void a(String str, boolean z12) {
            b(String.valueOf(z12), str);
        }

        public final void b(@I41.h Object obj, String str) {
            a aVar = new a();
            this.f339823c.f339826c = aVar;
            this.f339823c = aVar;
            aVar.f339825b = obj;
            aVar.f339824a = str;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f339821a);
            sb2.append('{');
            a aVar = this.f339822b.f339826c;
            String str = "";
            while (aVar != null) {
                Object obj = aVar.f339825b;
                sb2.append(str);
                String str2 = aVar.f339824a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                aVar = aVar.f339826c;
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    @I41.c
    public static boolean a(@I41.h Object obj, @I41.h Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName(), null);
    }
}
