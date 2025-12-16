package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.function.Function;

/* compiled from: MaterialDynamicColors.java */
@RestrictTo
/* loaded from: classes6.dex */
public final class t {

    /* renamed from: I, reason: collision with root package name */
    public static final C37048l f356367I;

    /* renamed from: J, reason: collision with root package name */
    public static final C37048l f356368J;

    /* renamed from: K, reason: collision with root package name */
    public static final C37048l f356369K;

    /* renamed from: L, reason: collision with root package name */
    public static final C37048l f356370L;

    /* renamed from: M, reason: collision with root package name */
    public static final C37048l f356371M;

    /* renamed from: N, reason: collision with root package name */
    public static final C37048l f356372N;

    /* renamed from: O, reason: collision with root package name */
    public static final C37048l f356373O;

    /* renamed from: P, reason: collision with root package name */
    public static final C37048l f356374P;

    /* renamed from: Q, reason: collision with root package name */
    public static final C37048l f356375Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C37048l f356376R;

    /* renamed from: S, reason: collision with root package name */
    public static final C37048l f356377S;

    /* renamed from: a, reason: collision with root package name */
    public static final C37048l f356378a;

    /* renamed from: b, reason: collision with root package name */
    public static final C37048l f356379b;

    /* renamed from: c, reason: collision with root package name */
    public static final C37048l f356380c;

    /* renamed from: g, reason: collision with root package name */
    public static final C37048l f356384g;

    /* renamed from: h, reason: collision with root package name */
    public static final C37048l f356385h;

    /* renamed from: i, reason: collision with root package name */
    public static final C37048l f356386i;

    /* renamed from: j, reason: collision with root package name */
    public static final C37048l f356387j;

    /* renamed from: k, reason: collision with root package name */
    public static final C37048l f356388k;

    /* renamed from: l, reason: collision with root package name */
    public static final C37048l f356389l;

    /* renamed from: m, reason: collision with root package name */
    public static final C37048l f356390m;

    /* renamed from: n, reason: collision with root package name */
    public static final C37048l f356391n;

    /* renamed from: o, reason: collision with root package name */
    public static final C37048l f356392o;

    /* renamed from: p, reason: collision with root package name */
    public static final C37048l f356393p;

    /* renamed from: q, reason: collision with root package name */
    public static final C37048l f356394q;

    /* renamed from: r, reason: collision with root package name */
    public static final C37048l f356395r;

    /* renamed from: s, reason: collision with root package name */
    public static final C37048l f356396s;

    /* renamed from: t, reason: collision with root package name */
    public static final C37048l f356397t;

    /* renamed from: u, reason: collision with root package name */
    public static final C37048l f356398u;

    /* renamed from: v, reason: collision with root package name */
    public static final C37048l f356399v;

    /* renamed from: w, reason: collision with root package name */
    public static final C37048l f356400w;

    /* renamed from: x, reason: collision with root package name */
    public static final C37048l f356401x;

    /* renamed from: y, reason: collision with root package name */
    public static final C37048l f356402y;

    /* renamed from: d, reason: collision with root package name */
    public static final C37048l f356381d = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(21), new C37052p(3), null, null);

    /* renamed from: e, reason: collision with root package name */
    public static final C37048l f356382e = C37048l.c(new C37052p(13), new com.fasterxml.jackson.databind.introspect.F(14), null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final C37048l f356383f = C37048l.c(new C37052p(21), new C37052p(29), null, null);

    /* renamed from: z, reason: collision with root package name */
    public static final C37048l f356403z = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(5), new com.fasterxml.jackson.databind.introspect.F(6), new com.fasterxml.jackson.databind.introspect.F(7), null);

    /* renamed from: A, reason: collision with root package name */
    public static final C37048l f356359A = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(8), new com.fasterxml.jackson.databind.introspect.F(10), new com.fasterxml.jackson.databind.introspect.F(11), null);

    /* renamed from: B, reason: collision with root package name */
    public static final C37048l f356360B = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(12), new com.fasterxml.jackson.databind.introspect.F(13), new com.fasterxml.jackson.databind.introspect.F(15), null);

    /* renamed from: C, reason: collision with root package name */
    public static final C37048l f356361C = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(16), new com.fasterxml.jackson.databind.introspect.F(17), new com.fasterxml.jackson.databind.introspect.F(18), new com.fasterxml.jackson.databind.introspect.F(19));

    /* renamed from: D, reason: collision with root package name */
    public static final C37048l f356362D = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(20), new com.fasterxml.jackson.databind.introspect.F(22), new com.fasterxml.jackson.databind.introspect.F(23), null);

    /* renamed from: E, reason: collision with root package name */
    public static final C37048l f356363E = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(24), new com.fasterxml.jackson.databind.introspect.F(26), new com.fasterxml.jackson.databind.introspect.F(27), null);

    /* renamed from: F, reason: collision with root package name */
    public static final C37048l f356364F = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(28), new com.fasterxml.jackson.databind.introspect.F(29), new C37052p(0), null);

    /* renamed from: G, reason: collision with root package name */
    public static final C37048l f356365G = C37048l.c(new C37052p(1), new C37052p(2), new C37052p(4), new C37052p(5));

    /* renamed from: H, reason: collision with root package name */
    public static final C37048l f356366H = C37048l.c(new C37052p(7), new C37052p(8), new C37052p(9), null);

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.material.color.utilities.q] */
    static {
        final int i12 = 29;
        f356378a = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(3), new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i12) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i13 = 11;
        final int i14 = 22;
        final int i15 = 4;
        f356379b = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i13) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i14) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i15) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, null);
        final int i16 = 15;
        f356380c = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i16) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new com.fasterxml.jackson.databind.introspect.F(9), null, null);
        final int i17 = 9;
        final int i18 = 21;
        f356384g = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i17) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i18) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i19 = 23;
        final int i22 = 24;
        f356385h = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i19) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i22) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i23 = 25;
        final int i24 = 27;
        f356386i = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i23) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i24) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i25 = 28;
        final int i26 = 0;
        f356387j = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i25) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i26) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null, null);
        final int i27 = 1;
        final int i28 = 2;
        f356388k = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i27) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i28) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null, null);
        final int i29 = 3;
        final int i32 = 4;
        final int i33 = 5;
        f356389l = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i29) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i32) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i33) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i34 = 6;
        final int i35 = 8;
        final int i36 = 9;
        f356390m = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i34) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i35) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i36) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i37 = 10;
        final int i38 = 12;
        f356391n = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i37) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i38) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null, null);
        final int i39 = 13;
        final int i42 = 14;
        final int i43 = 15;
        f356392o = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i39) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i42) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i43) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i44 = 16;
        final int i45 = 17;
        final int i46 = 19;
        f356393p = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i44) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i45) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i46) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i47 = 20;
        final int i48 = 21;
        f356394q = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i47) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new C37052p(6), new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i48) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i49 = 23;
        final int i52 = 24;
        final int i53 = 25;
        f356395r = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i49) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i52) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i53) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i54 = 26;
        final int i55 = 27;
        final int i56 = 28;
        f356396s = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i54) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i55) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i56) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i57 = 0;
        final int i58 = 1;
        final int i59 = 2;
        final int i62 = 3;
        f356397t = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i57) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i58) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i59) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i62) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        });
        final int i63 = 5;
        final int i64 = 6;
        final int i65 = 9;
        f356398u = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i63) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i64) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i65) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, null);
        final int i66 = 7;
        final int i67 = 8;
        final int i68 = 9;
        f356399v = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i66) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i67) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i68) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, null);
        final int i69 = 11;
        final int i72 = 12;
        final int i73 = 13;
        f356400w = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i69) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i72) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i73) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, null);
        final int i74 = 14;
        final int i75 = 16;
        final int i76 = 17;
        f356401x = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i74) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i75) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i76) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, null);
        final int i77 = 18;
        final int i78 = 19;
        final int i79 = 20;
        f356402y = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i77) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i78) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i79) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new com.fasterxml.jackson.databind.introspect.F(4));
        final int i82 = 10;
        C37048l.c(new C37052p(10), new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i82) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new C37052p(11), null);
        f356367I = C37048l.c(new C37052p(12), new C37052p(6), new C37052p(23), null);
        final int i83 = 4;
        final int i84 = 15;
        final int i85 = 26;
        C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i83) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i84) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i85) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null);
        final int i86 = 7;
        final int i87 = 18;
        final int i88 = 26;
        C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i86) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i87) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i88) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null);
        final int i89 = 29;
        final int i92 = 10;
        final int i93 = 21;
        C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i89) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i92) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i93) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, null);
        f356368J = C37048l.c(new com.fasterxml.jackson.databind.introspect.F(25), new C37052p(6), new C37052p(16), null);
        final int i94 = 15;
        C37048l.c(new C37052p(17), new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i94) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new C37052p(18), null);
        final int i95 = 18;
        C37048l.c(new C37052p(19), new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i95) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new C37052p(18), null);
        final int i96 = 10;
        C37048l.c(new C37052p(20), new Function() { // from class: com.google.android.material.color.utilities.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i96) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        return t.a(c37049m);
                    case 3:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 4:
                        return t.f356378a;
                    case 5:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 6:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356397t;
                    case 10:
                        C37048l c37048l8 = t.f356378a;
                        return Double.valueOf(90.0d);
                    case 11:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l10 = t.f356378a;
                        throw null;
                    case 13:
                        return t.a(c37049m);
                    case 14:
                        C37048l c37048l11 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 15:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 16:
                        C37048l c37048l13 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case 17:
                        return t.f356400w;
                    case 18:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 19:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 20:
                        return t.a(c37049m);
                    default:
                        return t.a(c37049m);
                }
            }
        }, new C37052p(22), null);
        f356369K = C37048l.c(new C37052p(24), new C37052p(6), new C37052p(25), null);
        final int i97 = 15;
        C37048l.c(new C37052p(26), new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i97) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new C37052p(27), null);
        final int i98 = 18;
        C37048l.c(new C37052p(28), new Function() { // from class: com.google.android.material.color.utilities.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C37049m c37049m = (C37049m) obj;
                switch (i98) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        throw null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        throw null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        throw null;
                    case 5:
                        return t.a(c37049m);
                    case 6:
                        C37048l c37048l6 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 7:
                        C37048l c37048l7 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 8:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 9:
                        return t.f356381d;
                    case 10:
                        C37048l c37048l9 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 11:
                        C37048l c37048l10 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 12:
                        C37048l c37048l11 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l12 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 14:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 15:
                        return t.f356391n;
                    case 16:
                        C37048l c37048l14 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 17:
                        C37048l c37048l15 = t.f356378a;
                        return Double.valueOf(50.0d);
                    case 18:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(30.0d);
                    case 19:
                        return t.a(c37049m);
                    case 20:
                        C37048l c37048l17 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case 21:
                        return t.a(c37049m);
                    case 22:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l19 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l20 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return t.a(c37049m);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        C37048l c37048l21 = t.f356378a;
                        c37049m.getClass();
                        return null;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l22 = t.f356378a;
                        c37049m.getClass();
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return t.f356395r;
                    default:
                        C37048l c37048l23 = t.f356378a;
                        c37049m.getClass();
                        return null;
                }
            }
        }, new C37052p(27), null);
        final int i99 = 0;
        final int i100 = 1;
        f356370L = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i99) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i100) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i101 = 2;
        final int i102 = 3;
        f356371M = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i101) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i102) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i103 = 5;
        Function function = new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i103) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        };
        final int i104 = 5;
        Function function2 = new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i104) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        };
        final int i105 = 6;
        Function function3 = new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i105) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        };
        final int i106 = 7;
        ?? r72 = new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i106) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        };
        final int i107 = 8;
        Function function4 = new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i107) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        };
        final int i108 = 10;
        f356372N = new C37048l(function, function2, function3, r72, null, function4, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i108) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null);
        final int i109 = 11;
        final int i110 = 12;
        f356373O = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i109) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i110) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i111 = 13;
        final int i112 = 14;
        f356374P = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i111) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i112) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i113 = 16;
        final int i114 = 17;
        f356375Q = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i113) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i114) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i115 = 18;
        final int i116 = 19;
        f356376R = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i115) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i116) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
        final int i117 = 20;
        final int i118 = 22;
        f356377S = C37048l.c(new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i117) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.q
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i118) {
                    case 0:
                        C37048l c37048l = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 1:
                        C37048l c37048l2 = t.f356378a;
                        throw null;
                    case 2:
                        C37048l c37048l3 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 3:
                        C37048l c37048l4 = t.f356378a;
                        throw null;
                    case 4:
                        C37048l c37048l5 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 5:
                        C37048l c37048l6 = t.f356378a;
                        return Double.valueOf(0.0d);
                    case 6:
                        C37048l c37048l7 = t.f356378a;
                        throw null;
                    case 7:
                        C37048l c37048l8 = t.f356378a;
                        throw null;
                    case 8:
                        C37049m c37049m = (C37049m) obj;
                        C37048l c37048l9 = t.f356378a;
                        C37052p c37052p = new C37052p(14);
                        return Double.valueOf(C37048l.a(c37049m, c37052p, new C37045i(c37049m, 1), new C37047k(c37052p, c37049m, null), null, null, null, new com.fasterxml.jackson.databind.introspect.F(2)));
                    case 9:
                        C37048l c37048l10 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 10:
                        C37049m c37049m2 = (C37049m) obj;
                        C37048l c37048l11 = t.f356378a;
                        return Double.valueOf(C37048l.a(c37049m2, new C37052p(15), new C37045i(c37049m2, 0), new C37046j(null, c37049m2), null, null, null, null));
                    case 11:
                        C37048l c37048l12 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 12:
                        C37048l c37048l13 = t.f356378a;
                        throw null;
                    case 13:
                        C37048l c37048l14 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 14:
                        C37048l c37048l15 = t.f356378a;
                        throw null;
                    case 15:
                        C37048l c37048l16 = t.f356378a;
                        return Double.valueOf(10.0d);
                    case 16:
                        C37048l c37048l17 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 17:
                        C37048l c37048l18 = t.f356378a;
                        throw null;
                    case 18:
                        C37048l c37048l19 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 19:
                        C37048l c37048l20 = t.f356378a;
                        throw null;
                    case 20:
                        C37048l c37048l21 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case 21:
                        C37048l c37048l22 = t.f356378a;
                        throw null;
                    case 22:
                        C37048l c37048l23 = t.f356378a;
                        throw null;
                    case 23:
                        C37048l c37048l24 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        C37048l c37048l25 = t.f356378a;
                        throw null;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        C37048l c37048l26 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return t.f356367I;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        C37048l c37048l27 = t.f356378a;
                        throw null;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        C37048l c37048l28 = t.f356378a;
                        ((C37049m) obj).getClass();
                        return null;
                    default:
                        C37048l c37048l29 = t.f356378a;
                        throw null;
                }
            }
        }, null, null);
    }

    public static C37048l a(C37049m c37049m) {
        throw null;
    }
}
