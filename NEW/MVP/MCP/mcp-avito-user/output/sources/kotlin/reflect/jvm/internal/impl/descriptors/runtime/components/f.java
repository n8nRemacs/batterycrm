package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C42924b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C42924b.C11666b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes8.dex */
public final class f implements z {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f407808c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Class<?> f407809a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final KotlinClassHeader f407810b;

    /* compiled from: ReflectKotlinClass.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f a(@Y61.k java.lang.Class r13) {
            /*
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.f407806a
                r1.getClass()
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.c.b(r13, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r1 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f
                m51.e r2 = m51.e.f414319g
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = r0.f408515g
                r4 = 0
                if (r3 == 0) goto L4a
                int[] r3 = r0.f408509a
                if (r3 != 0) goto L1b
                goto L4a
            L1b:
                m51.e r7 = new m51.e
                int[] r3 = r0.f408509a
                int r5 = r0.f408511c
                r5 = r5 & 8
                if (r5 == 0) goto L27
                r5 = 1
                goto L28
            L27:
                r5 = 0
            L28:
                r7.<init>(r3, r5)
                boolean r2 = r7.b(r2)
                if (r2 != 0) goto L38
                java.lang.String[] r2 = r0.f408512d
                r0.f408514f = r2
                r0.f408512d = r4
                goto L4c
            L38:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.f408515g
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.f408499f
                if (r2 == r3) goto L46
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.f408500g
                if (r2 == r3) goto L46
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.f408503j
                if (r2 != r3) goto L4c
            L46:
                java.lang.String[] r2 = r0.f408512d
                if (r2 != 0) goto L4c
            L4a:
                r2 = r4
                goto L65
            L4c:
                java.lang.String[] r2 = r0.f408516h
                if (r2 == 0) goto L53
                m51.C43887a.a(r2)
            L53:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r6 = r0.f408515g
                java.lang.String[] r8 = r0.f408512d
                java.lang.String[] r9 = r0.f408514f
                java.lang.String[] r10 = r0.f408513e
                java.lang.String r11 = r0.f408510b
                int r12 = r0.f408511c
                r5 = r2
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            L65:
                if (r2 != 0) goto L68
                return r4
            L68:
                r1.<init>(r13, r2, r4)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.a.a(java.lang.Class):kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f");
        }

        public a() {
        }
    }

    public f() {
        throw null;
    }

    public f(Class cls, KotlinClassHeader kotlinClassHeader, C42822w c42822w) {
        this.f407809a = cls;
        this.f407810b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z
    @Y61.k
    public final KotlinClassHeader a() {
        return this.f407810b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z
    public final void b(@Y61.k C42924b c42924b) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c cVar;
        String str;
        c.f407806a.getClass();
        Class<?> cls = this.f407809a;
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            cVar = c.f407806a;
            str = "(";
            if (i12 >= length) {
                break;
            }
            Method method = declaredMethods[i12];
            kotlin.reflect.jvm.internal.impl.name.f fVarE = kotlin.reflect.jvm.internal.impl.name.f.e(method.getName());
            m.f407820a.getClass();
            StringBuilder sb2 = new StringBuilder("(");
            for (Class<?> cls2 : method.getParameterTypes()) {
                sb2.append(C42892d.b(cls2));
            }
            sb2.append(")");
            sb2.append(C42892d.b(method.getReturnType()));
            C42924b.a aVarA = c42924b.a(fVarE, sb2.toString());
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                c.c(aVarA, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length2 = parameterAnnotations.length;
            for (int i13 = 0; i13 < length2; i13++) {
                Annotation[] annotationArr = parameterAnnotations[i13];
                int length3 = annotationArr.length;
                int i14 = 0;
                while (i14 < length3) {
                    Annotation annotation2 = annotationArr[i14];
                    Class<?> clsF = ((InterfaceC42819t) X41.b.a(annotation2)).f();
                    Method[] methodArr = declaredMethods;
                    z.a aVarC = aVarA.c(i13, C42892d.a(clsF), new b(annotation2));
                    if (aVarC != null) {
                        cVar.getClass();
                        c.d(aVarC, annotation2, clsF);
                    }
                    i14++;
                    declaredMethods = methodArr;
                }
            }
            aVarA.a();
            i12++;
            declaredMethods = declaredMethods;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length4 = declaredConstructors.length;
        int i15 = 0;
        while (i15 < length4) {
            Constructor<?> constructor = declaredConstructors[i15];
            kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.name.h.f409261f;
            m.f407820a.getClass();
            StringBuilder sb3 = new StringBuilder(str);
            for (Class<?> cls3 : constructor.getParameterTypes()) {
                sb3.append(C42892d.b(cls3));
            }
            sb3.append(")V");
            C42924b.a aVarA2 = c42924b.a(fVar, sb3.toString());
            for (Annotation annotation3 : constructor.getDeclaredAnnotations()) {
                c.c(aVarA2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            if (parameterAnnotations2.length != 0) {
                int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length6 = parameterAnnotations2.length;
                for (int i16 = 0; i16 < length6; i16++) {
                    Annotation[] annotationArr2 = parameterAnnotations2[i16];
                    int length7 = annotationArr2.length;
                    int i17 = 0;
                    while (i17 < length7) {
                        Annotation annotation4 = annotationArr2[i17];
                        Constructor<?>[] constructorArr = declaredConstructors;
                        Class<?> clsF2 = ((InterfaceC42819t) X41.b.a(annotation4)).f();
                        int i18 = length4;
                        int i19 = length5;
                        String str2 = str;
                        z.a aVarC2 = aVarA2.c(i16 + length5, C42892d.a(clsF2), new b(annotation4));
                        if (aVarC2 != null) {
                            cVar.getClass();
                            c.d(aVarC2, annotation4, clsF2);
                        }
                        i17++;
                        length4 = i18;
                        declaredConstructors = constructorArr;
                        length5 = i19;
                        str = str2;
                    }
                }
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            int i22 = length4;
            String str3 = str;
            aVarA2.a();
            i15++;
            length4 = i22;
            declaredConstructors = constructorArr2;
            str = str3;
        }
        for (Field field : cls.getDeclaredFields()) {
            kotlin.reflect.jvm.internal.impl.name.f fVarE2 = kotlin.reflect.jvm.internal.impl.name.f.e(field.getName());
            m.f407820a.getClass();
            String strB = C42892d.b(field.getType());
            C.a aVar = C.f408430b;
            String strB2 = fVarE2.b();
            aVar.getClass();
            C42924b.C11666b c11666b = c42924b.new C11666b(C.a.a(strB2, strB));
            for (Annotation annotation5 : field.getDeclaredAnnotations()) {
                c.c(c11666b, annotation5);
            }
            c11666b.a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b c() {
        return C42892d.a(this.f407809a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z
    public final void d(@Y61.k z.c cVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c.f407806a.getClass();
        c.b(this.f407809a, cVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof f) {
            if (L.f(this.f407809a, ((f) obj).f407809a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f407809a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.z
    @Y61.k
    public final String j() {
        return this.f407809a.getName().replace('.', '/').concat(".class");
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.compose.ui.graphics.colorspace.e.u(f.class, sb2, ": ");
        sb2.append(this.f407809a);
        return sb2.toString();
    }
}
