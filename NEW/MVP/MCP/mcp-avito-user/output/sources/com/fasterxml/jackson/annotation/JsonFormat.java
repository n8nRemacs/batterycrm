package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface JsonFormat {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Feature {

        /* renamed from: b, reason: collision with root package name */
        public static final Feature f340927b;

        /* renamed from: c, reason: collision with root package name */
        public static final Feature f340928c;

        /* renamed from: d, reason: collision with root package name */
        public static final Feature f340929d;

        /* renamed from: e, reason: collision with root package name */
        public static final Feature f340930e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Feature[] f340931f;

        static {
            Feature feature = new Feature("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
            f340927b = feature;
            Feature feature2 = new Feature("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
            f340928c = feature2;
            Feature feature3 = new Feature("ACCEPT_CASE_INSENSITIVE_VALUES", 2);
            Feature feature4 = new Feature("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 3);
            Feature feature5 = new Feature("WRITE_DATES_WITH_ZONE_ID", 4);
            Feature feature6 = new Feature("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 5);
            f340929d = feature6;
            Feature feature7 = new Feature("WRITE_SORTED_MAP_ENTRIES", 6);
            f340930e = feature7;
            f340931f = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, new Feature("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 7)};
        }

        public Feature() {
            throw null;
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) f340931f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Shape {

        /* renamed from: b, reason: collision with root package name */
        public static final Shape f340932b;

        /* renamed from: c, reason: collision with root package name */
        public static final Shape f340933c;

        /* renamed from: d, reason: collision with root package name */
        public static final Shape f340934d;

        /* renamed from: e, reason: collision with root package name */
        public static final Shape f340935e;

        /* renamed from: f, reason: collision with root package name */
        public static final Shape f340936f;

        /* renamed from: g, reason: collision with root package name */
        public static final Shape f340937g;

        /* renamed from: h, reason: collision with root package name */
        public static final Shape f340938h;

        /* renamed from: i, reason: collision with root package name */
        public static final Shape f340939i;

        /* renamed from: j, reason: collision with root package name */
        public static final Shape f340940j;

        /* renamed from: k, reason: collision with root package name */
        public static final Shape f340941k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ Shape[] f340942l;

        static {
            Shape shape = new Shape("ANY", 0);
            f340932b = shape;
            Shape shape2 = new Shape("NATURAL", 1);
            f340933c = shape2;
            Shape shape3 = new Shape("SCALAR", 2);
            f340934d = shape3;
            Shape shape4 = new Shape("ARRAY", 3);
            f340935e = shape4;
            Shape shape5 = new Shape("OBJECT", 4);
            f340936f = shape5;
            Shape shape6 = new Shape("NUMBER", 5);
            f340937g = shape6;
            Shape shape7 = new Shape("NUMBER_FLOAT", 6);
            f340938h = shape7;
            Shape shape8 = new Shape("NUMBER_INT", 7);
            f340939i = shape8;
            Shape shape9 = new Shape("STRING", 8);
            f340940j = shape9;
            Shape shape10 = new Shape("BOOLEAN", 9);
            Shape shape11 = new Shape("BINARY", 10);
            f340941k = shape11;
            f340942l = new Shape[]{shape, shape2, shape3, shape4, shape5, shape6, shape7, shape8, shape9, shape10, shape11};
        }

        public Shape() {
            throw null;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) f340942l.clone();
        }

        public final boolean a() {
            return this == f340937g || this == f340939i || this == f340938h;
        }
    }

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f340943c = new a(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f340944a;

        /* renamed from: b, reason: collision with root package name */
        public final int f340945b;

        public a(int i12, int i13) {
            this.f340944a = i12;
            this.f340945b = i13;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f340944a == this.f340944a && aVar.f340945b == this.f340945b;
        }

        public final int hashCode() {
            return this.f340945b + this.f340944a;
        }

        public final String toString() {
            return this == f340943c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f340944a), Integer.valueOf(this.f340945b));
        }
    }

    public static class b implements InterfaceC36432b<JsonFormat>, Serializable {

        /* renamed from: i, reason: collision with root package name */
        public static final b f340946i = new b();
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final String f340947b;

        /* renamed from: c, reason: collision with root package name */
        public final Shape f340948c;

        /* renamed from: d, reason: collision with root package name */
        public final Locale f340949d;

        /* renamed from: e, reason: collision with root package name */
        public final String f340950e;

        /* renamed from: f, reason: collision with root package name */
        public final Boolean f340951f;

        /* renamed from: g, reason: collision with root package name */
        public final a f340952g;

        /* renamed from: h, reason: collision with root package name */
        public transient TimeZone f340953h;

        public b() {
            this("", Shape.f340932b, "", "", a.f340943c, null);
        }

        public static boolean a(Serializable serializable, Object obj) {
            if (obj == null) {
                return serializable == null;
            }
            if (serializable == null) {
                return false;
            }
            return obj.equals(serializable);
        }

        public final Boolean b(Feature feature) {
            a aVar = this.f340952g;
            aVar.getClass();
            int iOrdinal = 1 << feature.ordinal();
            if ((aVar.f340945b & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & aVar.f340944a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public final TimeZone c() {
            TimeZone timeZone = this.f340953h;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.f340950e;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.f340953h = timeZone2;
            return timeZone2;
        }

        public final boolean d() {
            String str;
            return (this.f340953h == null && ((str = this.f340950e) == null || str.isEmpty())) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[PHI: r1
  0x0039: PHI (r1v3 com.fasterxml.jackson.annotation.JsonFormat$a) = 
  (r1v1 com.fasterxml.jackson.annotation.JsonFormat$a)
  (r1v2 com.fasterxml.jackson.annotation.JsonFormat$a)
  (r1v1 com.fasterxml.jackson.annotation.JsonFormat$a)
  (r1v1 com.fasterxml.jackson.annotation.JsonFormat$a)
 binds: [B:26:0x0037, B:40:0x0058, B:38:0x0055, B:30:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.fasterxml.jackson.annotation.JsonFormat.b e(com.fasterxml.jackson.annotation.JsonFormat.b r10) {
            /*
                r9 = this;
                if (r10 == 0) goto L81
                com.fasterxml.jackson.annotation.JsonFormat$b r0 = com.fasterxml.jackson.annotation.JsonFormat.b.f340946i
                if (r10 == r0) goto L81
                if (r10 != r9) goto La
                goto L81
            La:
                if (r9 != r0) goto Ld
                return r10
            Ld:
                java.lang.String r0 = r10.f340947b
                if (r0 == 0) goto L1a
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L18
                goto L1a
            L18:
                r2 = r0
                goto L1d
            L1a:
                java.lang.String r0 = r9.f340947b
                goto L18
            L1d:
                com.fasterxml.jackson.annotation.JsonFormat$Shape r0 = com.fasterxml.jackson.annotation.JsonFormat.Shape.f340932b
                com.fasterxml.jackson.annotation.JsonFormat$Shape r1 = r10.f340948c
                if (r1 != r0) goto L27
                com.fasterxml.jackson.annotation.JsonFormat$Shape r0 = r9.f340948c
                r3 = r0
                goto L28
            L27:
                r3 = r1
            L28:
                java.util.Locale r0 = r10.f340949d
                if (r0 != 0) goto L2e
                java.util.Locale r0 = r9.f340949d
            L2e:
                r4 = r0
                com.fasterxml.jackson.annotation.JsonFormat$a r0 = r10.f340952g
                com.fasterxml.jackson.annotation.JsonFormat$a r1 = r9.f340952g
                if (r1 != 0) goto L37
            L35:
                r7 = r0
                goto L5e
            L37:
                if (r0 != 0) goto L3b
            L39:
                r0 = r1
                goto L35
            L3b:
                int r5 = r0.f340945b
                int r6 = r0.f340944a
                if (r5 != 0) goto L44
                if (r6 != 0) goto L44
                goto L39
            L44:
                int r7 = r1.f340945b
                int r8 = r1.f340944a
                if (r8 != 0) goto L4d
                if (r7 != 0) goto L4d
                goto L35
            L4d:
                int r0 = ~r5
                r0 = r0 & r8
                r0 = r0 | r6
                int r6 = ~r6
                r6 = r6 & r7
                r5 = r5 | r6
                if (r0 != r8) goto L58
                if (r5 != r7) goto L58
                goto L39
            L58:
                com.fasterxml.jackson.annotation.JsonFormat$a r1 = new com.fasterxml.jackson.annotation.JsonFormat$a
                r1.<init>(r0, r5)
                goto L39
            L5e:
                java.lang.Boolean r0 = r10.f340951f
                if (r0 != 0) goto L64
                java.lang.Boolean r0 = r9.f340951f
            L64:
                r8 = r0
                java.lang.String r0 = r10.f340950e
                if (r0 == 0) goto L75
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L70
                goto L75
            L70:
                java.util.TimeZone r10 = r10.f340953h
            L72:
                r6 = r10
                r5 = r0
                goto L7a
            L75:
                java.util.TimeZone r10 = r9.f340953h
                java.lang.String r0 = r9.f340950e
                goto L72
            L7a:
                com.fasterxml.jackson.annotation.JsonFormat$b r10 = new com.fasterxml.jackson.annotation.JsonFormat$b
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r10
            L81:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.b.e(com.fasterxml.jackson.annotation.JsonFormat$b):com.fasterxml.jackson.annotation.JsonFormat$b");
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f340948c != bVar.f340948c || !this.f340952g.equals(bVar.f340952g)) {
                return false;
            }
            if (a(bVar.f340951f, this.f340951f)) {
                if (a(bVar.f340950e, this.f340950e)) {
                    if (a(bVar.f340947b, this.f340947b)) {
                        if (a(bVar.f340953h, this.f340953h)) {
                            if (a(bVar.f340949d, this.f340949d)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f340950e;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this.f340947b;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = this.f340948c.hashCode() + iHashCode;
            Boolean bool = this.f340951f;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this.f340949d;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return this.f340952g.hashCode() ^ iHashCode2;
        }

        public final String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.f340947b, this.f340948c, this.f340951f, this.f340949d, this.f340950e, this.f340952g);
        }

        public b(String str, Shape shape, String str2, String str3, a aVar, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, aVar, bool);
        }

        public b(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, a aVar, Boolean bool) {
            this.f340947b = str == null ? "" : str;
            this.f340948c = shape == null ? Shape.f340932b : shape;
            this.f340949d = locale;
            this.f340953h = timeZone;
            this.f340950e = str2;
            this.f340952g = aVar == null ? a.f340943c : aVar;
            this.f340951f = bool;
        }
    }

    OptBoolean lenient() default OptBoolean.f340985c;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.f340932b;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
