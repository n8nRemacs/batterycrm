package com.avito.android.util;

import android.net.Uri;
import com.avito.android.remote.model.Size;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: Images.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/a2;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.a2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35742a2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Map<Size, Uri> f318788a;

    /* renamed from: b, reason: collision with root package name */
    public final int f318789b;

    /* renamed from: c, reason: collision with root package name */
    public final int f318790c;

    /* renamed from: d, reason: collision with root package name */
    public final float f318791d;

    /* renamed from: e, reason: collision with root package name */
    public final float f318792e;

    /* renamed from: f, reason: collision with root package name */
    public final int f318793f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f318794g;

    /* compiled from: Images.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.a2$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f318795b = new a();

        public a() {
            super(3, C35829k2.class, "areaEstimation", "areaEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            Size size2 = size;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            return Float.valueOf((size2.getWidth() * size2.getHeight()) / (iIntValue2 * iIntValue));
        }
    }

    /* compiled from: Images.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.a2$b */
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f318796b = new b();

        public b() {
            super(3, C35829k2.class, "heightEstimation", "heightEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            num.intValue();
            return Float.valueOf(size.getHeight() / num2.intValue());
        }
    }

    /* compiled from: Images.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.a2$c */
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.q<Size, Integer, Integer, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f318797b = new c();

        public c() {
            super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
        }

        @Override // Y41.q
        public final Float invoke(Size size, Integer num, Integer num2) {
            return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35742a2(@Y61.l Map<Size, ? extends Uri> map, int i12, int i13, float f12, float f13, @InterfaceC35846m3 int i14, boolean z12) {
        this.f318788a = map;
        this.f318789b = i12;
        this.f318790c = i13;
        this.f318791d = f12;
        this.f318792e = f13;
        this.f318793f = i14;
        this.f318794g = z12;
        if (f12 <= 0.0f && f12 >= 1.0f) {
            throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.i(f12, "expected minScale to be > 0 and < 1, minScale was ").toString());
        }
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException(androidx.media3.exoplayer.analytics.m.i(f13, "expected maxScale to be > 0, maxScale was ").toString());
        }
        if (C42756l.H(Integer.valueOf(i14), new Integer[]{0, 2, 1}) < 0) {
            throw new IllegalArgumentException("expected notFoundReturnStrategy to be any of STRATEGY_RETURN_NULL (0), STRATEGY_RETURN_MIN (2), STRATEGY_RETURN_MAX (1)");
        }
    }

    @Y61.l
    public final Uri a() {
        return c(a.f318795b);
    }

    @Y61.l
    public final Uri b() {
        return c(b.f318796b);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri c(@Y61.k Y41.q<? super com.avito.android.remote.model.Size, ? super java.lang.Integer, ? super java.lang.Integer, java.lang.Float> r12) {
        /*
            r11 = this;
            r0 = 0
            java.util.Map<com.avito.android.remote.model.Size, android.net.Uri> r1 = r11.f318788a
            if (r1 != 0) goto L6
            return r0
        L6:
            java.util.Set r2 = r1.keySet()
            r3 = 1
            int r4 = r11.f318793f
            if (r4 == r3) goto L30
            r5 = 2
            if (r4 == r5) goto L14
        L12:
            r4 = r0
            goto L4b
        L14:
            if (r1 == 0) goto L12
            java.util.Set r4 = r1.keySet()
            if (r4 == 0) goto L12
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            com.avito.android.util.b2 r5 = new com.avito.android.util.b2
            r5.<init>()
            java.util.List r4 = kotlin.collections.C42745f0.B0(r4, r5)
            if (r4 == 0) goto L12
            java.lang.Object r4 = kotlin.collections.C42745f0.G(r4)
            com.avito.android.remote.model.Size r4 = (com.avito.android.remote.model.Size) r4
            goto L4b
        L30:
            if (r1 == 0) goto L12
            java.util.Set r4 = r1.keySet()
            if (r4 == 0) goto L12
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            com.avito.android.util.c2 r5 = new com.avito.android.util.c2
            r5.<init>()
            java.util.List r4 = kotlin.collections.C42745f0.B0(r4, r5)
            if (r4 == 0) goto L12
            java.lang.Object r4 = kotlin.collections.C42745f0.G(r4)
            com.avito.android.remote.model.Size r4 = (com.avito.android.remote.model.Size) r4
        L4b:
            java.util.Iterator r2 = r2.iterator()
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L52:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Laa
            java.lang.Object r6 = r2.next()
            com.avito.android.remote.model.Size r6 = (com.avito.android.remote.model.Size) r6
            int r7 = r11.f318789b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            int r9 = r11.f318790c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r12.invoke(r6, r8, r10)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            boolean r10 = r11.f318794g
            if (r10 == 0) goto L86
            int r10 = r6.getWidth()
            if (r7 > r10) goto L84
            int r7 = r6.getHeight()
            if (r9 <= r7) goto L86
        L84:
            r7 = r3
            goto L87
        L86:
            r7 = 0
        L87:
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 - r8
            float r10 = java.lang.Math.abs(r10)
            float r9 = r5 - r9
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 >= 0) goto L52
            float r9 = r11.f318792e
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 > 0) goto L52
            float r9 = r11.f318791d
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 > 0) goto L52
            if (r7 != 0) goto L52
            r4 = r6
            r5 = r8
            goto L52
        Laa:
            if (r4 != 0) goto Lad
            return r0
        Lad:
            java.lang.Object r12 = r1.get(r4)
            android.net.Uri r12 = (android.net.Uri) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.C35742a2.c(Y41.q):android.net.Uri");
    }

    @Y61.l
    public final Uri d() {
        return c(c.f318797b);
    }

    public /* synthetic */ C35742a2(Map map, int i12, int i13, float f12, float f13, int i14, boolean z12, int i15, C42822w c42822w) {
        this(map, i12, i13, f12, f13, i14, (i15 & 64) != 0 ? false : z12);
    }
}
