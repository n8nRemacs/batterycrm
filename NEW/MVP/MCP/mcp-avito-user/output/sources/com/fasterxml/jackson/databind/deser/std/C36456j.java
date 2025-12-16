package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import rX0.InterfaceC47610a;

/* compiled from: DateDeserializers.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36456j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f341788a;

    /* compiled from: DateDeserializers.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f341789a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f341789a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f341789a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f341789a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: DateDeserializers.java */
    @InterfaceC47610a
    /* renamed from: com.fasterxml.jackson.databind.deser.std.j$d */
    public static class d extends c<Date> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f341793g = new d();

        public d() {
            super(Date.class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return new Date(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c
        public final c<Date> q0(DateFormat dateFormat, String str) {
            return new d(this, dateFormat, str);
        }
    }

    /* compiled from: DateDeserializers.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.j$e */
    public static class e extends c<java.sql.Date> {
        public e() {
            super(java.sql.Date.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c, com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            Date dateR = R(jsonParser, fVar);
            if (dateR == null) {
                return null;
            }
            return new java.sql.Date(dateR.getTime());
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return new java.sql.Date(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c
        public final c<java.sql.Date> q0(DateFormat dateFormat, String str) {
            return new e(this, dateFormat, str);
        }
    }

    /* compiled from: DateDeserializers.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.j$f */
    public static class f extends c<Timestamp> {
        public f() {
            super(Timestamp.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c, com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            Date dateR = R(jsonParser, fVar);
            if (dateR == null) {
                return null;
            }
            return new Timestamp(dateR.getTime());
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return new Timestamp(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c
        public final c<Timestamp> q0(DateFormat dateFormat, String str) {
            return new f(this, dateFormat, str);
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f341788a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    /* compiled from: DateDeserializers.java */
    @InterfaceC47610a
    /* renamed from: com.fasterxml.jackson.databind.deser.std.j$b */
    public static class b extends c<Calendar> {

        /* renamed from: g, reason: collision with root package name */
        public final Constructor<Calendar> f341790g;

        public b() {
            super(Calendar.class);
            this.f341790g = null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c, com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws ValueInstantiationException, IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Date dateR = R(jsonParser, fVar);
            if (dateR == null) {
                return null;
            }
            Constructor<Calendar> constructor = this.f341790g;
            if (constructor == null) {
                Calendar calendar = Calendar.getInstance(fVar.f341921d.h());
                calendar.setTime(dateR);
                return calendar;
            }
            try {
                Calendar calendarNewInstance = constructor.newInstance(new Object[0]);
                calendarNewInstance.setTimeInMillis(dateR.getTime());
                TimeZone timeZoneH = fVar.f341921d.h();
                if (timeZoneH != null) {
                    calendarNewInstance.setTimeZone(timeZoneH);
                }
                return calendarNewInstance;
            } catch (Exception e12) {
                fVar.x(this.f341716b, e12);
                throw null;
            }
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C36456j.c
        public final c<Calendar> q0(DateFormat dateFormat, String str) {
            return new b(this, dateFormat, str);
        }

        public b(int i12) {
            super(GregorianCalendar.class);
            this.f341790g = com.fasterxml.jackson.databind.util.g.k(false, GregorianCalendar.class);
        }

        public b(b bVar, DateFormat dateFormat, String str) {
            super(bVar, dateFormat, str);
            this.f341790g = bVar.f341790g;
        }
    }

    /* compiled from: DateDeserializers.java */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.j$c */
    public static abstract class c<T> extends G<T> implements com.fasterxml.jackson.databind.deser.i {

        /* renamed from: e, reason: collision with root package name */
        public final DateFormat f341791e;

        /* renamed from: f, reason: collision with root package name */
        public final String f341792f;

        public c(Class<?> cls) {
            super(cls);
            this.f341791e = null;
            this.f341792f = null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.C
        public final Date R(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            Date date;
            if (this.f341791e == null || !jsonParser.Y(JsonToken.VALUE_STRING)) {
                return super.R(jsonParser, fVar);
            }
            String strTrim = jsonParser.L().trim();
            if (strTrim.isEmpty()) {
                if (x(fVar, strTrim).ordinal() != 3) {
                    return null;
                }
                return new Date(0L);
            }
            synchronized (this.f341791e) {
                try {
                    try {
                        date = this.f341791e.parse(strTrim);
                    } catch (ParseException unused) {
                        fVar.I(this.f341716b, strTrim, "expected format \"%s\"", this.f341792f);
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return date;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.text.DateFormat] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.text.DateFormat] */
        /* JADX WARN: Type inference failed for: r4v7, types: [com.fasterxml.jackson.databind.util.B] */
        /* JADX WARN: Type inference failed for: r4v8 */
        @Override // com.fasterxml.jackson.databind.deser.i
        public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
            DateFormat dateFormat;
            ?? b12;
            Boolean bool;
            JsonFormat.b bVarK0 = C.k0(fVar, cVar, this.f341716b);
            if (bVarK0 != null) {
                TimeZone timeZoneC = bVarK0.c();
                String str = bVarK0.f340947b;
                boolean z12 = str != null && str.length() > 0;
                com.fasterxml.jackson.databind.e eVar = fVar.f341921d;
                Locale locale = bVarK0.f340949d;
                Boolean bool2 = bVarK0.f340951f;
                if (z12) {
                    if (locale == null) {
                        locale = eVar.f341506c.f341480h;
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
                    if (timeZoneC == null) {
                        timeZoneC = eVar.h();
                    }
                    simpleDateFormat.setTimeZone(timeZoneC);
                    if (bool2 != null) {
                        simpleDateFormat.setLenient(bool2.booleanValue());
                    }
                    return q0(simpleDateFormat, str);
                }
                String strS = this.f341792f;
                if (timeZoneC != null) {
                    DateFormat dateFormat2 = eVar.f341506c.f341479g;
                    if (dateFormat2.getClass() == com.fasterxml.jackson.databind.util.B.class) {
                        if (locale == null) {
                            locale = eVar.f341506c.f341480h;
                        }
                        com.fasterxml.jackson.databind.util.B b13 = (com.fasterxml.jackson.databind.util.B) dateFormat2;
                        TimeZone timeZone = b13.f342536b;
                        com.fasterxml.jackson.databind.util.B b14 = b13;
                        if (timeZoneC != timeZone) {
                            b14 = b13;
                            if (!timeZoneC.equals(timeZone)) {
                                b14 = new com.fasterxml.jackson.databind.util.B(timeZoneC, b13.f342537c, b13.f342538d, b13.f342541g);
                            }
                        }
                        boolean zEquals = locale.equals(b14.f342537c);
                        b12 = b14;
                        if (!zEquals) {
                            b12 = new com.fasterxml.jackson.databind.util.B(b14.f342536b, locale, b14.f342538d, b14.f342541g);
                        }
                        if (bool2 != null && bool2 != (bool = b12.f342538d) && !bool2.equals(bool)) {
                            b12 = new com.fasterxml.jackson.databind.util.B(b12.f342536b, b12.f342537c, bool2, b12.f342541g);
                        }
                    } else {
                        b12 = (DateFormat) dateFormat2.clone();
                        b12.setTimeZone(timeZoneC);
                        if (bool2 != null) {
                            b12.setLenient(bool2.booleanValue());
                        }
                    }
                    return q0(b12, strS);
                }
                if (bool2 != null) {
                    DateFormat dateFormat3 = eVar.f341506c.f341479g;
                    if (dateFormat3.getClass() == com.fasterxml.jackson.databind.util.B.class) {
                        com.fasterxml.jackson.databind.util.B b15 = (com.fasterxml.jackson.databind.util.B) dateFormat3;
                        Boolean bool3 = b15.f342538d;
                        com.fasterxml.jackson.databind.util.B b16 = b15;
                        if (bool2 != bool3) {
                            b16 = b15;
                            if (!bool2.equals(bool3)) {
                                b16 = new com.fasterxml.jackson.databind.util.B(b15.f342536b, b15.f342537c, bool2, b15.f342541g);
                            }
                        }
                        strS = AK.c.s(androidx.compose.ui.graphics.colorspace.e.q(100, "[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' ("), Boolean.FALSE.equals(b16.f342538d) ? "strict" : "lenient", ")]");
                        dateFormat = b16;
                    } else {
                        DateFormat dateFormat4 = (DateFormat) dateFormat3.clone();
                        dateFormat4.setLenient(bool2.booleanValue());
                        boolean z13 = dateFormat4 instanceof SimpleDateFormat;
                        dateFormat = dateFormat4;
                        if (z13) {
                            ((SimpleDateFormat) dateFormat4).toPattern();
                            dateFormat = dateFormat4;
                        }
                    }
                    if (strS == null) {
                        strS = "[unknown]";
                    }
                    return q0(dateFormat, strS);
                }
            }
            return this;
        }

        @Override // com.fasterxml.jackson.databind.i
        public Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return R(jsonParser, fVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342443m;
        }

        public abstract c<T> q0(DateFormat dateFormat, String str);

        public c(c<T> cVar, DateFormat dateFormat, String str) {
            super(cVar.f341716b);
            this.f341791e = dateFormat;
            this.f341792f = str;
        }
    }
}
