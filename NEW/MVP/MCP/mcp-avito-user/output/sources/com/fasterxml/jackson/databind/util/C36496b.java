package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

/* compiled from: ArrayBuilders.java */
/* renamed from: com.fasterxml.jackson.databind.util.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36496b {

    /* renamed from: a, reason: collision with root package name */
    public C10548b f342582a = null;

    /* renamed from: b, reason: collision with root package name */
    public c f342583b = null;

    /* renamed from: c, reason: collision with root package name */
    public h f342584c = null;

    /* renamed from: d, reason: collision with root package name */
    public f f342585d = null;

    /* renamed from: e, reason: collision with root package name */
    public g f342586e = null;

    /* renamed from: f, reason: collision with root package name */
    public e f342587f = null;

    /* renamed from: g, reason: collision with root package name */
    public d f342588g = null;

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f342589a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f342590b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f342591c;

        public a(Class cls, int i12, Object obj) {
            this.f342589a = cls;
            this.f342590b = i12;
            this.f342591c = obj;
        }

        public final boolean equals(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
            if (obj == this) {
                return true;
            }
            if (!com.fasterxml.jackson.databind.util.g.u(this.f342589a, obj)) {
                return false;
            }
            int length = Array.getLength(obj);
            int i12 = this.f342590b;
            if (length != i12) {
                return false;
            }
            for (int i13 = 0; i13 < i12; i13++) {
                Object obj2 = Array.get(this.f342591c, i13);
                Object obj3 = Array.get(obj, i13);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$b, reason: collision with other inner class name */
    public static final class C10548b extends w<boolean[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final boolean[] a(int i12) {
            return new boolean[i12];
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$c */
    public static final class c extends w<byte[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final byte[] a(int i12) {
            return new byte[i12];
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$d */
    public static final class d extends w<double[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final double[] a(int i12) {
            return new double[i12];
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$e */
    public static final class e extends w<float[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final float[] a(int i12) {
            return new float[i12];
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$f */
    public static final class f extends w<int[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final int[] a(int i12) {
            return new int[i12];
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$g */
    public static final class g extends w<long[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final long[] a(int i12) {
            return new long[i12];
        }
    }

    /* compiled from: ArrayBuilders.java */
    /* renamed from: com.fasterxml.jackson.databind.util.b$h */
    public static final class h extends w<short[]> {
        @Override // com.fasterxml.jackson.databind.util.w
        public final short[] a(int i12) {
            return new short[i12];
        }
    }

    public static Object a(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }
}
