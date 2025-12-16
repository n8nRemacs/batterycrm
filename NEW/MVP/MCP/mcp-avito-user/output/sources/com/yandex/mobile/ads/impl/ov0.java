package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class ov0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f388643a;

    /* renamed from: b, reason: collision with root package name */
    public final a f388644b;

    /* renamed from: c, reason: collision with root package name */
    public final int f388645c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f388646d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f388647a;

        public a(b... bVarArr) {
            this.f388647a = bVarArr;
        }

        public final b a() {
            return this.f388647a[0];
        }

        public final int b() {
            return this.f388647a.length;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f388648a;

        /* renamed from: b, reason: collision with root package name */
        public final int f388649b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f388650c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f388651d;

        public b(int i12, float[] fArr, float[] fArr2, int i13) {
            this.f388648a = i12;
            db.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f388650c = fArr;
            this.f388651d = fArr2;
            this.f388649b = i13;
        }

        public final int a() {
            return this.f388650c.length / 3;
        }
    }

    public ov0() {
        throw null;
    }

    public ov0(a aVar, a aVar2, int i12) {
        this.f388643a = aVar;
        this.f388644b = aVar2;
        this.f388645c = i12;
        this.f388646d = aVar == aVar2;
    }
}
