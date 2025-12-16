package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes17.dex */
public @interface JsonAutoDetect {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Visibility {

        /* renamed from: b, reason: collision with root package name */
        public static final Visibility f340908b;

        /* renamed from: c, reason: collision with root package name */
        public static final Visibility f340909c;

        /* renamed from: d, reason: collision with root package name */
        public static final Visibility f340910d;

        /* renamed from: e, reason: collision with root package name */
        public static final Visibility f340911e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Visibility[] f340912f;

        static {
            Visibility visibility = new Visibility("ANY", 0);
            f340908b = visibility;
            Visibility visibility2 = new Visibility("NON_PRIVATE", 1);
            Visibility visibility3 = new Visibility("PROTECTED_AND_PUBLIC", 2);
            Visibility visibility4 = new Visibility("PUBLIC_ONLY", 3);
            f340909c = visibility4;
            Visibility visibility5 = new Visibility("NONE", 4);
            f340910d = visibility5;
            Visibility visibility6 = new Visibility("DEFAULT", 5);
            f340911e = visibility6;
            f340912f = new Visibility[]{visibility, visibility2, visibility3, visibility4, visibility5, visibility6};
        }

        public Visibility() {
            throw null;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) f340912f.clone();
        }

        public final boolean a(Member member) {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal == 1) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f340913a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f340914b;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            f340914b = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340914b[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340914b[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340914b[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340914b[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340914b[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340914b[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Visibility.values().length];
            f340913a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f340913a[4] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f340913a[1] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f340913a[2] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f340913a[3] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static class b implements InterfaceC36432b<JsonAutoDetect>, Serializable {

        /* renamed from: g, reason: collision with root package name */
        public static final b f340915g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f340916h;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Visibility f340917b;

        /* renamed from: c, reason: collision with root package name */
        public final Visibility f340918c;

        /* renamed from: d, reason: collision with root package name */
        public final Visibility f340919d;

        /* renamed from: e, reason: collision with root package name */
        public final Visibility f340920e;

        /* renamed from: f, reason: collision with root package name */
        public final Visibility f340921f;

        static {
            Visibility visibility = Visibility.f340909c;
            f340915g = new b(visibility, visibility, visibility, Visibility.f340908b, visibility);
            Visibility visibility2 = Visibility.f340911e;
            f340916h = new b(visibility2, visibility2, visibility2, visibility2, visibility2);
        }

        public b(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this.f340917b = visibility;
            this.f340918c = visibility2;
            this.f340919d = visibility3;
            this.f340920e = visibility4;
            this.f340921f = visibility5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (obj.getClass() == getClass()) {
                b bVar = (b) obj;
                if (this.f340917b == bVar.f340917b && this.f340918c == bVar.f340918c && this.f340919d == bVar.f340919d && this.f340920e == bVar.f340920e && this.f340921f == bVar.f340921f) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f340917b.ordinal() + 1) ^ ((this.f340920e.ordinal() * 11) + ((this.f340918c.ordinal() * 3) - (this.f340919d.ordinal() * 7)))) ^ (this.f340921f.ordinal() * 13);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object readResolve() {
            /*
                r6 = this;
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.f340909c
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = r6.f340917b
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r2 = r6.f340918c
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r3 = r6.f340919d
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r4 = r6.f340920e
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r5 = r6.f340921f
                if (r1 != r0) goto L1b
                if (r2 != r0) goto L2a
                if (r3 != r0) goto L2a
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r1 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.f340908b
                if (r4 != r1) goto L2a
                if (r5 != r0) goto L2a
                com.fasterxml.jackson.annotation.JsonAutoDetect$b r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.b.f340915g
                goto L2b
            L1b:
                com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.f340911e
                if (r1 != r0) goto L2a
                if (r2 != r0) goto L2a
                if (r3 != r0) goto L2a
                if (r4 != r0) goto L2a
                if (r5 != r0) goto L2a
                com.fasterxml.jackson.annotation.JsonAutoDetect$b r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.b.f340916h
                goto L2b
            L2a:
                r0 = 0
            L2b:
                if (r0 != 0) goto L2e
                r0 = r6
            L2e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonAutoDetect.b.readResolve():java.lang.Object");
        }

        public final String toString() {
            return "JsonAutoDetect.Value(fields=" + this.f340917b + ",getters=" + this.f340918c + ",isGetters=" + this.f340919d + ",setters=" + this.f340920e + ",creators=" + this.f340921f + ")";
        }
    }

    Visibility creatorVisibility() default Visibility.f340911e;

    Visibility fieldVisibility() default Visibility.f340911e;

    Visibility getterVisibility() default Visibility.f340911e;

    Visibility isGetterVisibility() default Visibility.f340911e;

    Visibility setterVisibility() default Visibility.f340911e;
}
