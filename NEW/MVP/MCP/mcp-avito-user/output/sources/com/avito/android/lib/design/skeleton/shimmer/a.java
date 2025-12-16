package com.avito.android.lib.design.skeleton.shimmer;

import Y61.k;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import androidx.compose.foundation.text.selection.C21030p;
import androidx.media3.exoplayer.analytics.m;
import j.InterfaceC42156l;
import j.InterfaceC42167x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: Shimmer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final float[] f180537a = new float[4];

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f180538b = new int[4];

    /* renamed from: c, reason: collision with root package name */
    public int f180539c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42156l
    public int f180540d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42156l
    public int f180541e;

    /* renamed from: f, reason: collision with root package name */
    public int f180542f;

    /* renamed from: g, reason: collision with root package name */
    public int f180543g;

    /* renamed from: h, reason: collision with root package name */
    public int f180544h;

    /* renamed from: i, reason: collision with root package name */
    public float f180545i;

    /* renamed from: j, reason: collision with root package name */
    public float f180546j;

    /* renamed from: k, reason: collision with root package name */
    public float f180547k;

    /* renamed from: l, reason: collision with root package name */
    public float f180548l;

    /* renamed from: m, reason: collision with root package name */
    public float f180549m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f180550n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f180551o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f180552p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public PorterDuff.Mode f180553q;

    /* renamed from: r, reason: collision with root package name */
    public int f180554r;

    /* renamed from: s, reason: collision with root package name */
    public int f180555s;

    /* renamed from: t, reason: collision with root package name */
    public long f180556t;

    /* renamed from: u, reason: collision with root package name */
    public long f180557u;

    /* compiled from: Shimmer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$b;", "T", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b<T extends b<T>> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a f180558a = new a();

        @k
        public final a a() {
            a aVar = this.f180558a;
            int i12 = aVar.f180542f;
            int[] iArr = aVar.f180538b;
            if (i12 == 0) {
                int i13 = aVar.f180541e;
                iArr[0] = i13;
                int i14 = aVar.f180540d;
                iArr[1] = i14;
                iArr[2] = i14;
                iArr[3] = i13;
            } else if (i12 != 1) {
                int i15 = aVar.f180541e;
                iArr[0] = i15;
                int i16 = aVar.f180540d;
                iArr[1] = i16;
                iArr[2] = i16;
                iArr[3] = i15;
            } else {
                int i17 = aVar.f180540d;
                iArr[0] = i17;
                iArr[1] = i17;
                int i18 = aVar.f180541e;
                iArr[2] = i18;
                iArr[3] = i18;
            }
            float[] fArr = aVar.f180537a;
            if (i12 == 0 || i12 != 1) {
                fArr[0] = Math.max(((1.0f - aVar.f180547k) - aVar.f180548l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - aVar.f180547k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((aVar.f180547k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((aVar.f180547k + 1.0f) + aVar.f180548l) / 2.0f, 1.0f);
            } else {
                fArr[0] = 0.0f;
                fArr[1] = Math.min(aVar.f180547k, 1.0f);
                fArr[2] = Math.min(aVar.f180547k + aVar.f180548l, 1.0f);
                fArr[3] = 1.0f;
            }
            return aVar;
        }

        @k
        public T b(@k TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            a aVar = this.f180558a;
            if (zHasValue) {
                aVar.f180550n = typedArray.getBoolean(3, aVar.f180550n);
            }
            if (typedArray.hasValue(0)) {
                aVar.f180551o = typedArray.getBoolean(0, aVar.f180551o);
            }
            if (typedArray.hasValue(1)) {
                aVar.f180541e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (aVar.f180541e & 16777215);
            }
            if (typedArray.hasValue(12)) {
                e(typedArray.getFloat(12, 1.0f));
            }
            if (typedArray.hasValue(8)) {
                d(typedArray.getInt(8, (int) aVar.f180556t));
            }
            if (typedArray.hasValue(15)) {
                aVar.f180554r = typedArray.getInt(15, aVar.f180554r);
            }
            if (typedArray.hasValue(16)) {
                long j12 = typedArray.getInt(16, (int) aVar.f180557u);
                if (j12 < 0) {
                    throw new IllegalArgumentException(C21030p.a(j12, "Given a negative repeat delay: "));
                }
                aVar.f180557u = j12;
            }
            if (typedArray.hasValue(17)) {
                aVar.f180555s = typedArray.getInt(17, aVar.f180555s);
            }
            if (typedArray.hasValue(6)) {
                int i12 = typedArray.getInt(6, aVar.f180539c);
                if (i12 == 0) {
                    aVar.f180539c = 0;
                } else if (i12 == 1) {
                    aVar.f180539c = 1;
                } else if (i12 == 2) {
                    aVar.f180539c = 2;
                } else if (i12 != 3) {
                    aVar.f180539c = 0;
                } else {
                    aVar.f180539c = 3;
                }
            }
            if (typedArray.hasValue(18)) {
                int i13 = typedArray.getInt(18, aVar.f180542f);
                if (i13 == 0 || i13 != 1) {
                    aVar.f180542f = 0;
                } else {
                    aVar.f180542f = 1;
                }
            }
            if (typedArray.hasValue(7)) {
                float f12 = typedArray.getFloat(7, aVar.f180548l);
                if (f12 < 0.0f) {
                    throw new IllegalArgumentException(m.i(f12, "Given invalid dropoff value: "));
                }
                aVar.f180548l = f12;
            }
            if (typedArray.hasValue(10)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(10, aVar.f180543g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(AK.c.g(dimensionPixelSize, "Given invalid width: "));
                }
                aVar.f180543g = dimensionPixelSize;
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(9, aVar.f180544h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(AK.c.g(dimensionPixelSize2, "Given invalid height: "));
                }
                aVar.f180544h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(14)) {
                float f13 = typedArray.getFloat(14, aVar.f180547k);
                if (f13 < 0.0f) {
                    throw new IllegalArgumentException(m.i(f13, "Given invalid intensity value: "));
                }
                aVar.f180547k = f13;
            }
            if (typedArray.hasValue(20)) {
                float f14 = typedArray.getFloat(20, aVar.f180545i);
                if (f14 < 0.0f) {
                    throw new IllegalArgumentException(m.i(f14, "Given invalid width ratio: "));
                }
                aVar.f180545i = f14;
            }
            if (typedArray.hasValue(11)) {
                float f15 = typedArray.getFloat(11, aVar.f180546j);
                if (f15 < 0.0f) {
                    throw new IllegalArgumentException(m.i(f15, "Given invalid height ratio: "));
                }
                aVar.f180546j = f15;
            }
            if (typedArray.hasValue(19)) {
                aVar.f180549m = typedArray.getFloat(19, aVar.f180549m);
            }
            return (T) c();
        }

        @k
        public abstract T c();

        @k
        public final T d(long j12) {
            if (j12 < 0) {
                throw new IllegalArgumentException(C21030p.a(j12, "Given a negative duration: "));
            }
            this.f180558a.f180556t = j12;
            return (T) c();
        }

        @k
        public final T e(@InterfaceC42167x float f12) {
            int iMin = ((int) (Math.min(1.0f, Math.max(0.0f, f12)) * 255.0f)) << 24;
            a aVar = this.f180558a;
            aVar.f180540d = iMin | (aVar.f180540d & 16777215);
            return (T) c();
        }
    }

    /* compiled from: Shimmer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$d;", "", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface d {

        /* compiled from: Shimmer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$d$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.skeleton.shimmer.a$d$a, reason: collision with other inner class name */
        public static final class C5298a {
            static {
                new C5298a();
            }
        }
    }

    /* compiled from: Shimmer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$e;", "", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface e {

        /* compiled from: Shimmer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$e$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.skeleton.shimmer.a$e$a, reason: collision with other inner class name */
        public static final class C5299a {
            static {
                new C5299a();
            }
        }
    }

    /* compiled from: Shimmer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$f;", "", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface f {

        /* compiled from: Shimmer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$f$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.skeleton.shimmer.a$f$a, reason: collision with other inner class name */
        public static final class C5300a {
            static {
                new C5300a();
            }
        }
    }

    public a() {
        new RectF();
        this.f180540d = -1;
        this.f180541e = 1291845631;
        this.f180545i = 1.0f;
        this.f180546j = 1.0f;
        this.f180548l = 0.5f;
        this.f180549m = 20.0f;
        this.f180550n = true;
        this.f180551o = true;
        this.f180552p = true;
        this.f180553q = PorterDuff.Mode.DST_IN;
        this.f180554r = -1;
        this.f180555s = 1;
        this.f180556t = 1000L;
    }

    /* compiled from: Shimmer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$a;", "Lcom/avito/android/lib/design/skeleton/shimmer/a$b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.skeleton.shimmer.a$a, reason: collision with other inner class name */
    public static final class C5297a extends b<C5297a> {
        public C5297a() {
            a aVar = this.f180558a;
            aVar.f180552p = true;
            aVar.f180553q = PorterDuff.Mode.DST_IN;
        }

        @Override // com.avito.android.lib.design.skeleton.shimmer.a.b
        public final b c() {
            return this;
        }
    }

    /* compiled from: Shimmer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/skeleton/shimmer/a$c;", "Lcom/avito/android/lib/design/skeleton/shimmer/a$b;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b<c> {
        public c() {
            a aVar = this.f180558a;
            aVar.f180552p = false;
            aVar.f180553q = PorterDuff.Mode.SRC_IN;
        }

        @Override // com.avito.android.lib.design.skeleton.shimmer.a.b
        public final b b(TypedArray typedArray) {
            super.b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            a aVar = this.f180558a;
            if (zHasValue) {
                aVar.f180541e = (typedArray.getColor(2, aVar.f180541e) & 16777215) | (aVar.f180541e & (-16777216));
            }
            if (typedArray.hasValue(13)) {
                aVar.f180540d = typedArray.getColor(13, aVar.f180540d);
            }
            if (typedArray.hasValue(5)) {
                int i12 = typedArray.getInt(5, 0);
                if (i12 == 0 || i12 != 1) {
                    aVar.f180553q = PorterDuff.Mode.SRC_IN;
                } else {
                    aVar.f180553q = PorterDuff.Mode.SRC_ATOP;
                }
            }
            return this;
        }

        @Override // com.avito.android.lib.design.skeleton.shimmer.a.b
        public final b c() {
            return this;
        }
    }
}
