package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.mobile.ads.impl.l41;
import com.yandex.mobile.ads.impl.rj1;

/* loaded from: classes8.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final float f392777a;

    /* renamed from: com.yandex.mobile.ads.nativeads.template.a$a, reason: collision with other inner class name */
    public static class C10990a extends a {
        public C10990a(float f12) {
            super(f12);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final float a(float f12) {
            if (f12 < 10.0f) {
                return 10.0f;
            }
            return f12;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final d a(Context context, int i12, int i13, int i14) {
            float f12 = this.f392777a;
            int i15 = rj1.f389556b;
            int iMin = Math.min(Math.round(TypedValue.applyDimension(1, f12, context.getResources().getDisplayMetrics())), i12);
            return new d(iMin, Math.round(i14 * (iMin / i13)));
        }
    }

    public static class b extends a {
        public b(float f12) {
            super(f12);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final float a(float f12) {
            float f13 = 0.01f;
            if (f12 >= 0.01f) {
                f13 = 1.0f;
                if (f12 <= 1.0f) {
                    return f12;
                }
            }
            return f13;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final d a(Context context, int i12, int i13, int i14) {
            int iRound = Math.round(i12 * this.f392777a);
            return new d(iRound, Math.round(i14 * (iRound / i13)));
        }
    }

    public static class c extends a {
        public c(float f12) {
            super(f12);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final float a(float f12) {
            float f13 = 0.01f;
            if (f12 >= 0.01f) {
                f13 = 1.0f;
                if (f12 <= 1.0f) {
                    return f12;
                }
            }
            return f13;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final d a(Context context, int i12, int i13, int i14) {
            int i15 = rj1.f389556b;
            int iA2 = l41.a(context, 1, 140.0f);
            int iRound = Math.round(i12 * this.f392777a);
            if (i13 > iRound) {
                i14 = Math.round(i14 / (i13 / iRound));
                i13 = iRound;
            }
            if (i14 > iA2) {
                i13 = Math.round(i13 / (i14 / iA2));
            } else {
                iA2 = i14;
            }
            return new d(i13, iA2);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f392778a;

        /* renamed from: b, reason: collision with root package name */
        private final int f392779b;

        public d(int i12, int i13) {
            this.f392778a = i12;
            this.f392779b = i13;
        }

        public final int a() {
            return this.f392779b;
        }

        public final int b() {
            return this.f392778a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f392778a == dVar.f392778a && this.f392779b == dVar.f392779b;
        }

        public final int hashCode() {
            return (this.f392778a * 31) + this.f392779b;
        }
    }

    public a(float f12) {
        this.f392777a = a(f12);
    }

    public abstract float a(float f12);

    public abstract d a(Context context, int i12, int i13, int i14);
}
