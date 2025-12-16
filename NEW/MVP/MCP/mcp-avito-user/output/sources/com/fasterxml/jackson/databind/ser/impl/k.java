package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.A;
import java.util.Arrays;

/* compiled from: PropertySerializerMap.java */
/* loaded from: classes4.dex */
public abstract class k {

    /* compiled from: PropertySerializerMap.java */
    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f342289a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f342290b;

        /* renamed from: c, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f342291c;

        /* renamed from: d, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f342292d;

        public a(k kVar, Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar, Class<?> cls2, com.fasterxml.jackson.databind.l<Object> lVar2) {
            this.f342289a = cls;
            this.f342291c = lVar;
            this.f342290b = cls2;
            this.f342292d = lVar2;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final k c(Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar) {
            return new c(this, new f[]{new f(this.f342289a, this.f342291c), new f(this.f342290b, this.f342292d), new f(cls, lVar)});
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final com.fasterxml.jackson.databind.l<Object> d(Class<?> cls) {
            if (cls == this.f342289a) {
                return this.f342291c;
            }
            if (cls == this.f342290b) {
                return this.f342292d;
            }
            return null;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f342293a = new b();

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final k c(Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar) {
            return new e(this, cls, lVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final com.fasterxml.jackson.databind.l<Object> d(Class<?> cls) {
            return null;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    public static final class c extends k {

        /* renamed from: a, reason: collision with root package name */
        public final f[] f342294a;

        public c(k kVar, f[] fVarArr) {
            this.f342294a = fVarArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final k c(Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar) {
            f[] fVarArr = this.f342294a;
            int length = fVarArr.length;
            if (length == 8) {
                return this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, lVar);
            return new c(this, fVarArr2);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final com.fasterxml.jackson.databind.l<Object> d(Class<?> cls) {
            f[] fVarArr = this.f342294a;
            f fVar = fVarArr[0];
            if (fVar.f342299a == cls) {
                return fVar.f342300b;
            }
            f fVar2 = fVarArr[1];
            if (fVar2.f342299a == cls) {
                return fVar2.f342300b;
            }
            f fVar3 = fVarArr[2];
            if (fVar3.f342299a == cls) {
                return fVar3.f342300b;
            }
            switch (fVarArr.length) {
                case 8:
                    f fVar4 = fVarArr[7];
                    if (fVar4.f342299a == cls) {
                        return fVar4.f342300b;
                    }
                case 7:
                    f fVar5 = fVarArr[6];
                    if (fVar5.f342299a == cls) {
                        return fVar5.f342300b;
                    }
                case 6:
                    f fVar6 = fVarArr[5];
                    if (fVar6.f342299a == cls) {
                        return fVar6.f342300b;
                    }
                case 5:
                    f fVar7 = fVarArr[4];
                    if (fVar7.f342299a == cls) {
                        return fVar7.f342300b;
                    }
                case 4:
                    f fVar8 = fVarArr[3];
                    if (fVar8.f342299a == cls) {
                        return fVar8.f342300b;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    /* compiled from: PropertySerializerMap.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f342295a;

        /* renamed from: b, reason: collision with root package name */
        public final k f342296b;

        public d(com.fasterxml.jackson.databind.l<Object> lVar, k kVar) {
            this.f342295a = lVar;
            this.f342296b = kVar;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    public static final class e extends k {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f342297a;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f342298b;

        public e(k kVar, Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342297a = cls;
            this.f342298b = lVar;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final k c(Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar) {
            return new a(this, this.f342297a, this.f342298b, cls, lVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.k
        public final com.fasterxml.jackson.databind.l<Object> d(Class<?> cls) {
            if (cls == this.f342297a) {
                return this.f342298b;
            }
            return null;
        }
    }

    /* compiled from: PropertySerializerMap.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f342299a;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.l<Object> f342300b;

        public f(Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar) {
            this.f342299a = cls;
            this.f342300b = lVar;
        }
    }

    public static k a() {
        return b.f342293a;
    }

    public final d b(com.fasterxml.jackson.databind.h hVar, A a12, com.fasterxml.jackson.databind.c cVar) {
        com.fasterxml.jackson.databind.l<Object> lVarP = a12.p(hVar, cVar);
        return new d(lVarP, c(hVar.f341930b, lVarP));
    }

    public abstract k c(Class<?> cls, com.fasterxml.jackson.databind.l<Object> lVar);

    public abstract com.fasterxml.jackson.databind.l<Object> d(Class<?> cls);
}
