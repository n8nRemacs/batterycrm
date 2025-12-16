package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.v11;

/* loaded from: classes8.dex */
final class dl implements cl {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private static final a f384630c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final Object f384631d = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final w90 f384632b;

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static final Boolean a(a aVar, w90 w90Var, String str) {
            if (!w90Var.contains(str)) {
                w90Var = null;
            }
            if (w90Var != null) {
                return Boolean.valueOf(w90Var.getBoolean(str, false));
            }
            return null;
        }

        public static final Integer b(a aVar, w90 w90Var, String str) {
            if (!w90Var.contains(str)) {
                w90Var = null;
            }
            if (w90Var != null) {
                return Integer.valueOf(w90Var.b(0, str));
            }
            return null;
        }

        public static final Long c(a aVar, w90 w90Var, String str) {
            if (!w90Var.contains(str)) {
                w90Var = null;
            }
            if (w90Var != null) {
                return Long.valueOf(w90Var.a(str));
            }
            return null;
        }

        private a() {
        }

        public static final void a(a aVar, w90 w90Var, String str, Boolean bool) {
            if (bool != null) {
                w90Var.putBoolean(str, bool.booleanValue());
            } else {
                w90Var.remove(str);
            }
        }

        public static final void a(a aVar, w90 w90Var, String str, Integer num) {
            if (num != null) {
                w90Var.a(num.intValue(), str);
            } else {
                w90Var.remove(str);
            }
        }

        public static final void a(a aVar, w90 w90Var, String str, Long l12) {
            if (l12 != null) {
                w90Var.putLong(str, l12.longValue());
            } else {
                w90Var.remove(str);
            }
        }
    }

    public dl(@Y61.k w90 w90Var) {
        this.f384632b = w90Var;
    }

    @Override // com.yandex.mobile.ads.impl.cl
    @Y61.l
    public final v11 a() {
        v11 v11VarA;
        synchronized (f384631d) {
            try {
                long jA2 = this.f384632b.a(el.a(1));
                a aVar = f384630c;
                Boolean boolA = a.a(aVar, this.f384632b, el.a(8));
                if (jA2 != 0) {
                    Integer numB = a.b(aVar, this.f384632b, el.a(21));
                    Integer numB2 = a.b(aVar, this.f384632b, el.a(22));
                    Long lC2 = a.c(aVar, this.f384632b, el.a(6));
                    boolean z12 = this.f384632b.getBoolean(el.a(7), false);
                    int iB2 = this.f384632b.b(0, el.a(5));
                    int iB3 = this.f384632b.b(0, el.a(31));
                    long jA3 = this.f384632b.a(el.a(32));
                    long jA4 = this.f384632b.a(el.a(33));
                    Boolean boolA2 = a.a(aVar, this.f384632b, el.a(10));
                    boolean z13 = this.f384632b.getBoolean(el.a(12), false);
                    boolean z14 = this.f384632b.getBoolean(el.a(13), false);
                    boolean z15 = this.f384632b.getBoolean(el.a(14), false);
                    boolean z16 = this.f384632b.getBoolean(el.a(15), false);
                    Boolean boolA3 = a.a(aVar, this.f384632b, el.a(16));
                    String strB = this.f384632b.b(el.a(9));
                    String strB2 = this.f384632b.b(el.a(48));
                    String strB3 = this.f384632b.b(el.a(49));
                    String strB4 = this.f384632b.b(el.a(45));
                    String strB5 = this.f384632b.b(el.a(2));
                    String strB6 = this.f384632b.b(el.a(3));
                    boolean z17 = this.f384632b.getBoolean(el.a(4), false);
                    boolean z18 = this.f384632b.getBoolean(el.a(11), false);
                    boolean z19 = this.f384632b.getBoolean(el.a(46), false);
                    boolean z22 = this.f384632b.getBoolean(el.a(18), false);
                    boolean z23 = this.f384632b.getBoolean(el.a(17), false);
                    boolean z24 = this.f384632b.getBoolean(el.a(19), false);
                    boolean z25 = this.f384632b.getBoolean(el.a(20), false);
                    boolean z26 = this.f384632b.getBoolean(el.a(25), false);
                    boolean z27 = this.f384632b.getBoolean(el.a(26), false);
                    boolean z28 = this.f384632b.getBoolean(el.a(23), false);
                    boolean z29 = this.f384632b.getBoolean(el.a(24), false);
                    boolean z32 = this.f384632b.getBoolean(el.a(28), false);
                    boolean z33 = this.f384632b.getBoolean(el.a(29), false);
                    boolean z34 = this.f384632b.getBoolean(el.a(41), false);
                    boolean z35 = this.f384632b.getBoolean(el.a(30), false);
                    BiddingSettings biddingSettingsA = tf.a(this.f384632b);
                    String strB7 = this.f384632b.b(el.a(34));
                    String strB8 = this.f384632b.b(el.a(27));
                    Integer numB3 = a.b(aVar, this.f384632b, el.a(35));
                    boolean z36 = this.f384632b.getBoolean(el.a(36), false);
                    boolean z37 = this.f384632b.getBoolean(el.a(37), false);
                    boolean z38 = this.f384632b.getBoolean(el.a(39), false);
                    boolean z39 = this.f384632b.getBoolean(el.a(40), false);
                    boolean z42 = this.f384632b.getBoolean(el.a(42), false);
                    boolean z43 = this.f384632b.getBoolean(el.a(38), false);
                    boolean z44 = this.f384632b.getBoolean(el.a(43), false);
                    boolean z45 = this.f384632b.getBoolean(el.a(44), false);
                    boolean z46 = this.f384632b.getBoolean(el.a(50), false);
                    Boolean boolA4 = a.a(aVar, this.f384632b, el.a(47));
                    boolean z47 = this.f384632b.getBoolean(el.a(51), false);
                    boolean z48 = this.f384632b.getBoolean(el.a(52), false);
                    boolean z49 = this.f384632b.getBoolean(el.a(53), false);
                    boolean z52 = this.f384632b.getBoolean(el.a(54), false);
                    Long lC3 = a.c(aVar, this.f384632b, el.a(55));
                    long jLongValue = lC3 != null ? lC3.longValue() : 0L;
                    Long lC4 = a.c(aVar, this.f384632b, el.a(56));
                    long jLongValue2 = lC4 != null ? lC4.longValue() : 0L;
                    String strB9 = this.f384632b.b(el.a(57));
                    String strB10 = this.f384632b.b(el.a(58));
                    boolean z53 = this.f384632b.getBoolean(el.a(59), false);
                    v11.a aVarD = new v11.a().h(strB).c(boolA3).a(jA2).a(numB).b(numB2).a(lC2).a(z12).a(iB2).b(iB3).e(jA3).d(jA4).b(boolA2).h(z13).m(z14).w(z15).c(z16).E(z18).n(z19).f(strB5).g(strB6).g(z17).d(boolA).s(z22).t(z23).A(z24).B(z25).G(z26).F(z27).o(z28).e(z43).r(z29).e(strB8).k(z32).a(biddingSettingsA).f(z36).q(z37).i(z38).x(z35).J(z39).z(z33).v(z34).a(boolA4).u(z42).j(z44).a(strB2).d(strB3).C(z45).c(strB4).d(z46).l(z47).y(z48).I(z49).H(z52).b(jLongValue).c(jLongValue2).b(strB9).i(strB10).b(z53).p(this.f384632b.getBoolean(el.a(60), false)).D(this.f384632b.getBoolean(el.a(61), false));
                    if (strB7 != null && numB3 != null) {
                        aVarD.a(new qs(numB3.intValue(), strB7));
                    }
                    v11VarA = aVarD.a();
                } else {
                    v11VarA = null;
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v11VarA;
    }

    @Override // com.yandex.mobile.ads.impl.cl
    public final void a(@Y61.k v11 v11Var) {
        synchronized (f384631d) {
            try {
                this.f384632b.putString(el.a(9), v11Var.t());
                this.f384632b.putString(el.a(45), v11Var.g());
                this.f384632b.putBoolean(el.a(11), v11Var.b0());
                this.f384632b.putBoolean(el.a(46), v11Var.J());
                this.f384632b.putLong(el.a(1), v11Var.j());
                this.f384632b.putString(el.a(2), v11Var.p());
                this.f384632b.putString(el.a(3), v11Var.r());
                this.f384632b.putString(el.a(27), v11Var.m());
                this.f384632b.putBoolean(el.a(4), v11Var.C());
                this.f384632b.putBoolean(el.a(25), v11Var.i0());
                this.f384632b.putBoolean(el.a(26), v11Var.h0());
                this.f384632b.a(v11Var.c(), el.a(5));
                this.f384632b.putBoolean(el.a(23), v11Var.K());
                this.f384632b.putBoolean(el.a(24), v11Var.N());
                this.f384632b.putBoolean(el.a(36), v11Var.B());
                this.f384632b.putBoolean(el.a(37), v11Var.M());
                this.f384632b.putBoolean(el.a(39), v11Var.E());
                this.f384632b.putBoolean(el.a(38), v11Var.A());
                this.f384632b.putBoolean(el.a(40), v11Var.e0());
                this.f384632b.putBoolean(el.a(41), v11Var.R());
                this.f384632b.putBoolean(el.a(42), v11Var.Q());
                this.f384632b.putBoolean(el.a(43), v11Var.F());
                this.f384632b.putBoolean(el.a(44), v11Var.Z());
                this.f384632b.a(v11Var.q(), el.a(31));
                this.f384632b.putLong(el.a(32), v11Var.o());
                this.f384632b.putLong(el.a(33), v11Var.n());
                this.f384632b.putString(el.a(48), v11Var.b());
                this.f384632b.putString(el.a(49), v11Var.h());
                this.f384632b.putString(el.a(57), v11Var.e());
                Long lA2 = v11Var.a();
                boolean zW2 = v11Var.w();
                Boolean boolG0 = v11Var.g0();
                Boolean boolT = v11Var.T();
                boolean zD2 = v11Var.D();
                boolean zI2 = v11Var.I();
                boolean zS2 = v11Var.S();
                boolean zY2 = v11Var.y();
                Boolean boolF0 = v11Var.f0();
                boolean zO2 = v11Var.O();
                boolean zP2 = v11Var.P();
                boolean zX2 = v11Var.X();
                boolean zY3 = v11Var.Y();
                boolean zG2 = v11Var.G();
                boolean zW3 = v11Var.W();
                boolean zU2 = v11Var.U();
                Integer numD = v11Var.d();
                Integer numS = v11Var.s();
                BiddingSettings biddingSettingsF = v11Var.f();
                boolean zA2 = v11Var.A();
                boolean Z12 = v11Var.Z();
                Boolean boolV = v11Var.v();
                boolean z12 = v11Var.z();
                boolean zH2 = v11Var.H();
                boolean zV2 = v11Var.V();
                boolean zD02 = v11Var.d0();
                boolean zC02 = v11Var.c0();
                long jK2 = v11Var.k();
                long jL2 = v11Var.l();
                a aVar = f384630c;
                a.a(aVar, this.f384632b, el.a(6), lA2);
                a.a(aVar, this.f384632b, el.a(7), Boolean.valueOf(zW2));
                a.a(aVar, this.f384632b, el.a(8), boolG0);
                a.a(aVar, this.f384632b, el.a(10), boolT);
                a.a(aVar, this.f384632b, el.a(12), Boolean.valueOf(zD2));
                a.a(aVar, this.f384632b, el.a(13), Boolean.valueOf(zI2));
                a.a(aVar, this.f384632b, el.a(14), Boolean.valueOf(zS2));
                a.a(aVar, this.f384632b, el.a(15), Boolean.valueOf(zY2));
                a.a(aVar, this.f384632b, el.a(16), boolF0);
                a.a(aVar, this.f384632b, el.a(18), Boolean.valueOf(zO2));
                a.a(aVar, this.f384632b, el.a(17), Boolean.valueOf(zP2));
                a.a(aVar, this.f384632b, el.a(19), Boolean.valueOf(zX2));
                a.a(aVar, this.f384632b, el.a(20), Boolean.valueOf(zY3));
                a.a(aVar, this.f384632b, el.a(38), Boolean.valueOf(zA2));
                a.a(aVar, this.f384632b, el.a(28), Boolean.valueOf(zG2));
                a.a(aVar, this.f384632b, el.a(29), Boolean.valueOf(zW3));
                a.a(aVar, this.f384632b, el.a(30), Boolean.valueOf(zU2));
                a.a(aVar, this.f384632b, el.a(47), boolV);
                a.a(aVar, this.f384632b, el.a(50), Boolean.valueOf(z12));
                a.a(aVar, this.f384632b, el.a(21), numD);
                a.a(aVar, this.f384632b, el.a(22), numS);
                if (biddingSettingsF != null) {
                    tf.a(this.f384632b, biddingSettingsF);
                } else {
                    tf.b(this.f384632b);
                }
                qs qsVarI = v11Var.i();
                if (qsVarI != null) {
                    this.f384632b.putString(el.a(34), qsVarI.a());
                    this.f384632b.a(qsVarI.b(), el.a(35));
                }
                a.a(aVar, this.f384632b, el.a(44), Boolean.valueOf(Z12));
                this.f384632b.putLong(el.a(55), jK2);
                this.f384632b.putBoolean(el.a(51), zH2);
                this.f384632b.putBoolean(el.a(52), zV2);
                this.f384632b.putBoolean(el.a(53), zD02);
                this.f384632b.putBoolean(el.a(54), zC02);
                this.f384632b.putLong(el.a(56), jL2);
                this.f384632b.putString(el.a(58), v11Var.u());
                this.f384632b.putBoolean(el.a(59), v11Var.x());
                this.f384632b.putBoolean(el.a(60), v11Var.L());
                this.f384632b.putBoolean(el.a(61), v11Var.a0());
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
