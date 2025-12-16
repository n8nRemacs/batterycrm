package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

/* loaded from: classes8.dex */
final class sr implements bg<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o11 f390014a = new o11();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final eg f390015b = new eg();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f390016a;

        /* renamed from: b, reason: collision with root package name */
        private final int f390017b;

        /* renamed from: c, reason: collision with root package name */
        private final int f390018c;

        /* renamed from: d, reason: collision with root package name */
        private final int f390019d;

        public a(int i12) {
            this.f390016a = Color.alpha(i12);
            this.f390017b = Color.red(i12);
            this.f390018c = Color.green(i12);
            this.f390019d = Color.blue(i12);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f390016a == aVar.f390016a && this.f390017b == aVar.f390017b && this.f390018c == aVar.f390018c && this.f390019d == aVar.f390019d;
        }

        public final int hashCode() {
            return (((((this.f390016a * 31) + this.f390017b) * 31) + this.f390018c) * 31) + this.f390019d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    @Override // com.yandex.mobile.ads.impl.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@j.N android.graphics.drawable.Drawable r6, @j.N android.graphics.Bitmap r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L12
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r1 = r0.getBitmap()
            if (r1 == 0) goto L12
            android.graphics.Bitmap r6 = r0.getBitmap()
            goto L18
        L12:
            com.yandex.mobile.ads.impl.o11 r0 = r5.f390014a
            android.graphics.Bitmap r6 = r0.a(r6)
        L18:
            com.yandex.mobile.ads.impl.eg r0 = r5.f390015b
            r0.getClass()
            r0 = 1
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r6, r0, r0, r0)
            com.yandex.mobile.ads.impl.eg r1 = r5.f390015b
            r1.getClass()
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r7, r0, r0, r0)
            com.yandex.mobile.ads.impl.sr$a r1 = new com.yandex.mobile.ads.impl.sr$a
            r2 = 0
            int r6 = r6.getPixel(r2, r2)
            r1.<init>(r6)
            com.yandex.mobile.ads.impl.sr$a r6 = new com.yandex.mobile.ads.impl.sr$a
            int r7 = r7.getPixel(r2, r2)
            r6.<init>(r7)
            int r7 = com.yandex.mobile.ads.impl.sr.a.a(r1)
            int r3 = com.yandex.mobile.ads.impl.sr.a.a(r6)
            int r7 = r7 - r3
            int r7 = java.lang.Math.abs(r7)
            r3 = 20
            if (r7 <= r3) goto L50
            goto L80
        L50:
            int r7 = com.yandex.mobile.ads.impl.sr.a.b(r1)
            int r4 = com.yandex.mobile.ads.impl.sr.a.b(r6)
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r3) goto L60
            goto L80
        L60:
            int r7 = com.yandex.mobile.ads.impl.sr.a.c(r1)
            int r4 = com.yandex.mobile.ads.impl.sr.a.c(r6)
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r3) goto L70
            goto L80
        L70:
            int r7 = com.yandex.mobile.ads.impl.sr.a.d(r1)
            int r6 = com.yandex.mobile.ads.impl.sr.a.d(r6)
            int r7 = r7 - r6
            int r6 = java.lang.Math.abs(r7)
            if (r6 > r3) goto L80
            goto L81
        L80:
            r0 = r2
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.sr.a(android.graphics.drawable.Drawable, android.graphics.Bitmap):boolean");
    }
}
