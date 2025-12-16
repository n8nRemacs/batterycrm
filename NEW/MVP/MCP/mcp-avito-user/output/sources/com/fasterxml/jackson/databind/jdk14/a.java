package com.fasterxml.jackson.databind.jdk14;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.e;
import com.fasterxml.jackson.databind.f;
import com.fasterxml.jackson.databind.introspect.C36467f;
import com.fasterxml.jackson.databind.util.g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: JDK14Util.java */
/* loaded from: classes4.dex */
public class a {

    /* compiled from: JDK14Util.java */
    /* renamed from: com.fasterxml.jackson.databind.jdk14.a$a, reason: collision with other inner class name */
    public static class C10547a {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.b f342118a;

        /* renamed from: b, reason: collision with root package name */
        public final e f342119b;

        /* renamed from: c, reason: collision with root package name */
        public final AnnotationIntrospector f342120c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C36467f> f342121d;

        /* renamed from: e, reason: collision with root package name */
        public final C36467f f342122e;

        /* renamed from: f, reason: collision with root package name */
        public final b[] f342123f;

        public C10547a(com.fasterxml.jackson.databind.b bVar, f fVar) {
            C36467f c36467fD;
            this.f342118a = bVar;
            this.f342120c = fVar.f341921d.d();
            this.f342119b = fVar.f341921d;
            RuntimeException runtimeException = c.f342127e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            c cVar = c.f342126d;
            Class<?> cls = bVar.f341454a.f341930b;
            Object[] objArrA = cVar.a(cls);
            int length = objArrA.length;
            b[] bVarArr = new b[length];
            for (int i12 = 0; i12 < objArrA.length; i12++) {
                try {
                    try {
                        bVarArr[i12] = new b((Class) cVar.f342130c.invoke(objArrA[i12], new Object[0]), (String) cVar.f342129b.invoke(objArrA[i12], new Object[0]));
                    } catch (Exception e12) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i12), Integer.valueOf(objArrA.length), g.A(cls)), e12);
                    }
                } catch (Exception e13) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i12), Integer.valueOf(objArrA.length), g.A(cls)), e13);
                }
            }
            this.f342123f = bVarArr;
            if (length != 0) {
                List<C36467f> listN = bVar.n();
                this.f342121d = listN;
                Iterator<C36467f> it = listN.iterator();
                loop1: while (true) {
                    if (!it.hasNext()) {
                        c36467fD = null;
                        break;
                    }
                    C36467f next = it.next();
                    if (next.t() == length) {
                        for (int i13 = 0; i13 < length; i13++) {
                            if (!next.v(i13).equals(this.f342123f[i13].f342124a)) {
                                break;
                            }
                        }
                        c36467fD = next;
                        break loop1;
                    }
                }
            } else {
                c36467fD = bVar.d();
                this.f342121d = Collections.singletonList(c36467fD);
            }
            if (c36467fD == null) {
                throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + g.t(this.f342118a.f341454a));
            }
            this.f342122e = c36467fD;
        }
    }

    /* compiled from: JDK14Util.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f342124a;

        /* renamed from: b, reason: collision with root package name */
        public final String f342125b;

        public b(Class<?> cls, String str) {
            this.f342124a = cls;
            this.f342125b = str;
        }
    }

    /* compiled from: JDK14Util.java */
    public static class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f342126d;

        /* renamed from: e, reason: collision with root package name */
        public static final RuntimeException f342127e;

        /* renamed from: a, reason: collision with root package name */
        public final Method f342128a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f342129b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f342130c;

        static {
            c cVar = null;
            try {
                e = null;
                cVar = new c();
            } catch (RuntimeException e12) {
                e = e12;
            }
            f342126d = cVar;
            f342127e = e;
        }

        public c() throws ClassNotFoundException {
            try {
                this.f342128a = Class.class.getMethod("getRecordComponents", new Class[0]);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.f342129b = cls.getMethod("getName", new Class[0]);
                this.f342130c = cls.getMethod("getType", new Class[0]);
            } catch (Exception e12) {
                throw new RuntimeException(androidx.compose.ui.graphics.colorspace.e.n("Failed to access Methods needed to support `java.lang.Record`: (", e12.getClass().getName(), ") ", e12.getMessage()), e12);
            }
        }

        public final Object[] a(Class<?> cls) {
            try {
                return (Object[]) this.f342128a.invoke(cls, new Object[0]);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + g.A(cls));
            }
        }
    }

    public static C36467f a(f fVar, com.fasterxml.jackson.databind.b bVar, ArrayList arrayList) {
        C10547a c10547a = new C10547a(bVar, fVar);
        Iterator<C36467f> it = c10547a.f342121d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C36467f c36467f = c10547a.f342122e;
            if (!zHasNext) {
                b[] bVarArr = c10547a.f342123f;
                for (b bVar2 : bVarArr) {
                    arrayList.add(bVar2.f342125b);
                }
                return c36467f;
            }
            C36467f next = it.next();
            JsonCreator.Mode modeE = c10547a.f342120c.e(c10547a.f342119b, next);
            if (modeE != null && JsonCreator.Mode.f340925e != modeE && (JsonCreator.Mode.f340923c == modeE || next != c36467f)) {
                break;
            }
        }
        return null;
    }

    public static String[] b(Class<?> cls) {
        RuntimeException runtimeException = c.f342127e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        c cVar = c.f342126d;
        Object[] objArrA = cVar.a(cls);
        String[] strArr = new String[objArrA.length];
        for (int i12 = 0; i12 < objArrA.length; i12++) {
            try {
                strArr[i12] = (String) cVar.f342129b.invoke(objArrA[i12], new Object[0]);
            } catch (Exception e12) {
                throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i12), Integer.valueOf(objArrA.length), g.A(cls)), e12);
            }
        }
        return strArr;
    }
}
