package org.joda.time;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;

/* compiled from: DateTimeZone.java */
/* renamed from: org.joda.time.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44868j implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC44868j f420911c = Q.f420445g;

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference<org.joda.time.tz.f> f420912d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference<org.joda.time.tz.e> f420913e = new AtomicReference<>();

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReference<AbstractC44868j> f420914f = new AtomicReference<>();
    private static final long serialVersionUID = 5546345482340108586L;

    /* renamed from: b, reason: collision with root package name */
    public final String f420915b;

    /* compiled from: DateTimeZone.java */
    /* renamed from: org.joda.time.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Map<String, String> f420916a;

        /* renamed from: b, reason: collision with root package name */
        public static final org.joda.time.format.b f420917b;

        static {
            HashMap map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            f420916a = Collections.unmodifiableMap(map);
            C44867i c44867i = new C44867i();
            org.joda.time.format.c cVar = new org.joda.time.format.c();
            cVar.o(4, null, true);
            f420917b = cVar.u().f(c44867i);
        }
    }

    /* compiled from: DateTimeZone.java */
    /* renamed from: org.joda.time.j$b */
    public static final class b implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;

        /* renamed from: b, reason: collision with root package name */
        public transient String f420918b;

        private void readObject(ObjectInputStream objectInputStream) {
            this.f420918b = objectInputStream.readUTF();
        }

        private Object readResolve() {
            return AbstractC44868j.c(this.f420918b);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.f420918b);
        }
    }

    public AbstractC44868j(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.f420915b = str;
    }

    @FromString
    public static AbstractC44868j c(String str) {
        if (str == null) {
            return e();
        }
        boolean zEquals = str.equals("UTC");
        AbstractC44868j abstractC44868j = f420911c;
        if (zEquals) {
            return abstractC44868j;
        }
        AbstractC44868j abstractC44868jA = l().a(str);
        if (abstractC44868jA != null) {
            return abstractC44868jA;
        }
        if (!str.startsWith("+") && !str.startsWith("-")) {
            throw new IllegalArgumentException(AK.c.k("The datetime zone id '", str, "' is not recognised"));
        }
        int i12 = -((int) a.f420917b.b(str));
        if (i12 == 0) {
            return abstractC44868j;
        }
        return i12 == 0 ? abstractC44868j : new org.joda.time.tz.d(i12, i12, q(i12), null);
    }

    public static AbstractC44868j d(TimeZone timeZone) throws ClassNotFoundException {
        char cCharAt;
        if (timeZone == null) {
            return e();
        }
        String id2 = timeZone.getID();
        if (id2 == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        boolean zEquals = id2.equals("UTC");
        AbstractC44868j abstractC44868j = f420911c;
        if (zEquals) {
            return abstractC44868j;
        }
        String str = a.f420916a.get(id2);
        org.joda.time.tz.f fVarL = l();
        AbstractC44868j abstractC44868jA = str != null ? fVarL.a(str) : null;
        if (abstractC44868jA == null) {
            abstractC44868jA = fVarL.a(id2);
        }
        if (abstractC44868jA != null) {
            return abstractC44868jA;
        }
        if (str != null || (!id2.startsWith("GMT+") && !id2.startsWith("GMT-"))) {
            throw new IllegalArgumentException(AK.c.k("The datetime zone id '", id2, "' is not recognised"));
        }
        String strSubstring = id2.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            StringBuilder sb2 = new StringBuilder(strSubstring);
            for (int i12 = 0; i12 < sb2.length(); i12++) {
                int iDigit = Character.digit(sb2.charAt(i12), 10);
                if (iDigit >= 0) {
                    sb2.setCharAt(i12, (char) (iDigit + 48));
                }
            }
            strSubstring = sb2.toString();
        }
        int i13 = -((int) a.f420917b.b(strSubstring));
        if (i13 == 0) {
            return abstractC44868j;
        }
        return i13 == 0 ? abstractC44868j : new org.joda.time.tz.d(i13, i13, q(i13), null);
    }

    public static AbstractC44868j e() throws ClassNotFoundException {
        AtomicReference<AbstractC44868j> atomicReference = f420914f;
        AbstractC44868j abstractC44868jD = atomicReference.get();
        if (abstractC44868jD != null) {
            return abstractC44868jD;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                abstractC44868jD = c(property);
            }
        } catch (RuntimeException unused) {
        }
        if (abstractC44868jD == null) {
            try {
                abstractC44868jD = d(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (abstractC44868jD == null) {
            abstractC44868jD = f420911c;
        }
        AbstractC44868j abstractC44868j = abstractC44868jD;
        while (!atomicReference.compareAndSet(null, abstractC44868j)) {
            if (atomicReference.get() != null) {
                return atomicReference.get();
            }
        }
        return abstractC44868j;
    }

    public static org.joda.time.tz.e h() throws ClassNotFoundException {
        org.joda.time.tz.e cVar;
        String property;
        AtomicReference<org.joda.time.tz.e> atomicReference = f420913e;
        org.joda.time.tz.e eVar = atomicReference.get();
        if (eVar != null) {
            return eVar;
        }
        try {
            property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
        } catch (SecurityException unused) {
        }
        if (property != null) {
            try {
                Class<?> cls = Class.forName(property, false, AbstractC44868j.class.getClassLoader());
                if (!org.joda.time.tz.e.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("System property referred to class that does not implement " + org.joda.time.tz.e.class);
                }
                cVar = (org.joda.time.tz.e) cls.asSubclass(org.joda.time.tz.e.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e12) {
                throw new RuntimeException(e12);
            }
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new org.joda.time.tz.c();
        }
        org.joda.time.tz.e eVar2 = cVar;
        while (!atomicReference.compareAndSet(null, eVar2)) {
            if (atomicReference.get() != null) {
                return atomicReference.get();
            }
        }
        return eVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:42|17)|(7:39|19|47|(3:31|(3:45|33|34)(1:48)|28)|46|30|50)|37|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r1.printStackTrace();
        r1 = new org.joda.time.tz.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.joda.time.tz.f l() throws java.lang.ClassNotFoundException {
        /*
            java.util.concurrent.atomic.AtomicReference<org.joda.time.tz.f> r0 = org.joda.time.AbstractC44868j.f420912d
            java.lang.Object r1 = r0.get()
            org.joda.time.tz.f r1 = (org.joda.time.tz.f) r1
            if (r1 != 0) goto L9e
            java.lang.Class<org.joda.time.tz.f> r1 = org.joda.time.tz.f.class
            java.lang.String r2 = "System property referred to class that does not implement "
            r3 = 0
            java.lang.String r4 = "org.joda.time.DateTimeZone.Provider"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L58
            if (r4 == 0) goto L58
            java.lang.Class<org.joda.time.j> r5 = org.joda.time.AbstractC44868j.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L3e
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r5)     // Catch: java.lang.Exception -> L3e
            boolean r5 = r1.isAssignableFrom(r4)     // Catch: java.lang.Exception -> L3e
            if (r5 == 0) goto L40
            java.lang.Class r1 = r4.asSubclass(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L3e
            org.joda.time.tz.f r1 = (org.joda.time.tz.f) r1     // Catch: java.lang.Exception -> L3e
            r(r1)     // Catch: java.lang.Exception -> L3e
        L3c:
            r2 = r1
            goto L88
        L3e:
            r1 = move-exception
            goto L52
        L40:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3e
            r5.<init>(r2)     // Catch: java.lang.Exception -> L3e
            r5.append(r1)     // Catch: java.lang.Exception -> L3e
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L3e
            r4.<init>(r1)     // Catch: java.lang.Exception -> L3e
            throw r4     // Catch: java.lang.Exception -> L3e
        L52:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.SecurityException -> L58
            r2.<init>(r1)     // Catch: java.lang.SecurityException -> L58
            throw r2     // Catch: java.lang.SecurityException -> L58
        L58:
            java.lang.String r1 = "org.joda.time.DateTimeZone.Folder"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L75
            if (r1 == 0) goto L75
            org.joda.time.tz.j r2 = new org.joda.time.tz.j     // Catch: java.lang.Exception -> L6e
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L6e
            r4.<init>(r1)     // Catch: java.lang.Exception -> L6e
            r2.<init>(r4)     // Catch: java.lang.Exception -> L6e
            r(r2)     // Catch: java.lang.Exception -> L6e
            goto L88
        L6e:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.SecurityException -> L75
            r2.<init>(r1)     // Catch: java.lang.SecurityException -> L75
            throw r2     // Catch: java.lang.SecurityException -> L75
        L75:
            org.joda.time.tz.j r1 = new org.joda.time.tz.j     // Catch: java.lang.Exception -> L7e
            r1.<init>(r3)     // Catch: java.lang.Exception -> L7e
            r(r1)     // Catch: java.lang.Exception -> L7e
            goto L3c
        L7e:
            r1 = move-exception
            r1.printStackTrace()
            org.joda.time.tz.g r1 = new org.joda.time.tz.g
            r1.<init>()
            goto L3c
        L88:
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L91
            r1 = r2
            goto L9e
        L91:
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L88
            java.lang.Object r0 = r0.get()
            r1 = r0
            org.joda.time.tz.f r1 = (org.joda.time.tz.f) r1
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.AbstractC44868j.l():org.joda.time.tz.f");
    }

    public static String q(int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i12 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i12 = -i12;
        }
        int i13 = i12 / Constants.ONE_HOUR;
        org.joda.time.format.i.b(stringBuffer, i13, 2);
        int i14 = i12 - (i13 * Constants.ONE_HOUR);
        int i15 = i14 / 60000;
        stringBuffer.append(':');
        org.joda.time.format.i.b(stringBuffer, i15, 2);
        int i16 = i14 - (i15 * 60000);
        if (i16 == 0) {
            return stringBuffer.toString();
        }
        int i17 = i16 / 1000;
        stringBuffer.append(':');
        org.joda.time.format.i.b(stringBuffer, i17, 2);
        int i18 = i16 - (i17 * 1000);
        if (i18 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        org.joda.time.format.i.b(stringBuffer, i18, 3);
        return stringBuffer.toString();
    }

    public static void r(org.joda.time.tz.f fVar) {
        Set<String> setB = fVar.b();
        if (setB == null || setB.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!setB.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        AbstractC44868j abstractC44868j = f420911c;
        AbstractC44868j abstractC44868jA = fVar.a("UTC");
        ((Q) abstractC44868j).getClass();
        if (!(abstractC44868jA instanceof Q)) {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r9, long r11) {
        /*
            r8 = this;
            int r11 = r8.i(r11)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.i(r0)
            if (r12 != r11) goto Le
            return r0
        Le:
            int r11 = r8.i(r9)
            long r0 = (long) r11
            long r0 = r9 - r0
            int r12 = r8.i(r0)
            if (r11 == r12) goto L3d
            if (r11 >= 0) goto L3d
            long r2 = r8.o(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L2b
            r2 = r4
        L2b:
            long r0 = (long) r12
            long r0 = r9 - r0
            long r6 = r8.o(r0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L37
            goto L38
        L37:
            r4 = r6
        L38:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            r11 = r12
        L3e:
            long r11 = (long) r11
            long r0 = r9 - r11
            long r2 = r9 ^ r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L57
            long r9 = r9 ^ r11
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L4f
            goto L57
        L4f:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "Subtracting time zone offset caused overflow"
            r9.<init>(r10)
            throw r9
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.AbstractC44868j.a(long, long):long");
    }

    public final long b(long j12) {
        long jI2 = i(j12);
        long j13 = j12 + jI2;
        if ((j12 ^ j13) >= 0 || (j12 ^ jI2) < 0) {
            return j13;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    public final long f(long j12, AbstractC44868j abstractC44868j) throws ClassNotFoundException {
        if (abstractC44868j == null) {
            abstractC44868j = e();
        }
        return abstractC44868j == this ? j12 : abstractC44868j.a(b(j12), j12);
    }

    public abstract String g(long j12);

    public int hashCode() {
        return this.f420915b.hashCode() + 57;
    }

    public abstract int i(long j12);

    public int k(long j12) {
        int i12 = i(j12);
        long j13 = j12 - i12;
        int i13 = i(j13);
        if (i12 != i13) {
            if (i12 - i13 < 0) {
                long jO2 = o(j13);
                if (jO2 == j13) {
                    jO2 = Long.MAX_VALUE;
                }
                long j14 = j12 - i13;
                long jO3 = o(j14);
                if (jO2 != (jO3 != j14 ? jO3 : Long.MAX_VALUE)) {
                    return i12;
                }
            }
        } else if (i12 >= 0) {
            long jP2 = p(j13);
            if (jP2 < j13) {
                int i14 = i(jP2);
                if (j13 - jP2 <= i14 - i12) {
                    return i14;
                }
            }
        }
        return i13;
    }

    public abstract int m(long j12);

    public abstract boolean n();

    public abstract long o(long j12);

    public abstract long p(long j12);

    public final String toString() {
        return this.f420915b;
    }

    public Object writeReplace() {
        b bVar = new b();
        bVar.f420918b = this.f420915b;
        return bVar;
    }
}
