package androidx.compose.material;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22142q;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Bb {

    /* renamed from: a, reason: collision with root package name */
    public static final float f32409a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f32410b;

    /* compiled from: TextFieldImpl.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "labelProgress", "Landroidx/compose/ui/graphics/T;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "Lkotlin/G0;", "invoke-RIQooxk", "(FJJFLandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.t<Float, androidx.compose.ui.graphics.T, androidx.compose.ui.graphics.T, Float, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32411A;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32412l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32413m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f32414n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21291ob f32415o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f32416p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f32417q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.k f32418r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32419s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32420t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.h1 f32421u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ TextFieldType f32422v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32423w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f32424x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.layout.T1 f32425y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f32426z;

        /* compiled from: TextFieldImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.material.Bb$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1630a {
            static {
                int[] iArr = new int[TextFieldType.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    TextFieldType textFieldType = TextFieldType.f33237b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, String str, InterfaceC21291ob interfaceC21291ob, boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar3, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar4, androidx.compose.ui.graphics.h1 h1Var, TextFieldType textFieldType, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar5, boolean z14, androidx.compose.foundation.layout.T1 t12, boolean z15, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar6) {
            super(6);
            this.f32412l = pVar;
            this.f32413m = pVar2;
            this.f32414n = str;
            this.f32415o = interfaceC21291ob;
            this.f32416p = z12;
            this.f32417q = z13;
            this.f32418r = kVar;
            this.f32419s = pVar3;
            this.f32420t = pVar4;
            this.f32421u = h1Var;
            this.f32422v = textFieldType;
            this.f32423w = pVar5;
            this.f32424x = z14;
            this.f32425y = t12;
            this.f32426z = z15;
            this.f32411A = pVar6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.t
        public final kotlin.G0 invoke(Float f12, androidx.compose.ui.graphics.T t12, androidx.compose.ui.graphics.T t13, Float f13, androidx.compose.runtime.A a12, Integer num) {
            int i12;
            C22096n c22096n;
            C22096n c22096n2;
            C22096n c22096nC;
            float fFloatValue = f12.floatValue();
            long j12 = t12.f39331a;
            long j13 = t13.f39331a;
            float fFloatValue2 = f13.floatValue();
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i12 = (a13.k(fFloatValue) ? 4 : 2) | iIntValue;
            } else {
                i12 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i12 |= a13.n(j12) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i12 |= a13.n(j13) ? 256 : 128;
            }
            if ((iIntValue & 3072) == 0) {
                i12 |= a13.k(fFloatValue2) ? 2048 : 1024;
            }
            int i13 = i12;
            if (a13.p(i13 & 1, (i13 & 9363) != 9362)) {
                C22096n c22096n3 = null;
                Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f32412l;
                if (pVar == null) {
                    a13.C(-1572254148);
                    a13.h();
                    c22096n = null;
                } else {
                    a13.C(-1572254147);
                    C22096n c22096nC2 = androidx.compose.runtime.internal.r.c(-1865025495, new Cb(fFloatValue, j13, pVar, this.f32426z, j12), a13);
                    a13.h();
                    c22096n = c22096nC2;
                }
                InterfaceC21291ob interfaceC21291ob = this.f32415o;
                boolean z12 = this.f32416p;
                Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar2 = this.f32413m;
                if (pVar2 == null || this.f32414n.length() != 0 || fFloatValue2 <= 0.0f) {
                    a13.C(-1570844268);
                    a13.h();
                    c22096n2 = null;
                } else {
                    a13.C(-1571270300);
                    C22096n c22096nC3 = androidx.compose.runtime.internal.r.c(-413527723, new Eb(fFloatValue2, interfaceC21291ob, z12, pVar2), a13);
                    a13.h();
                    c22096n2 = c22096nC3;
                }
                boolean z13 = this.f32417q;
                long j14 = ((androidx.compose.ui.graphics.T) interfaceC21291ob.a(z12, z13, a13).getF42167b()).f39331a;
                Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar3 = this.f32419s;
                if (pVar3 == null) {
                    a13.C(-1570655509);
                    a13.h();
                    c22096nC = null;
                } else {
                    a13.C(-1570655508);
                    c22096nC = androidx.compose.runtime.internal.r.c(-1165144581, new Db(j14, pVar3), a13);
                    a13.h();
                }
                long j15 = ((androidx.compose.ui.graphics.T) interfaceC21291ob.e(z12, z13, this.f32418r, a13).getF42167b()).f39331a;
                Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar4 = this.f32420t;
                if (pVar4 == null) {
                    a13.C(-1570361846);
                    a13.h();
                } else {
                    a13.C(-1570361845);
                    C22096n c22096nC4 = androidx.compose.runtime.internal.r.c(1694126319, new Fb(j15, pVar4), a13);
                    a13.h();
                    c22096n3 = c22096nC4;
                }
                androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(androidx.compose.ui.v.f42878y1, ((androidx.compose.ui.graphics.T) interfaceC21291ob.f(a13).getF42167b()).f39331a, this.f32421u);
                int iOrdinal = this.f32422v.ordinal();
                if (iOrdinal == 0) {
                    a13.C(-1570081481);
                    Vb.a(vVarB, this.f32423w, c22096n, c22096n2, c22096nC, c22096n3, this.f32424x, fFloatValue, this.f32425y, a13, (i13 << 21) & 29360128);
                    a13.h();
                } else if (iOrdinal != 1) {
                    a13.C(-1568043975);
                    a13.h();
                } else {
                    a13.C(-1569502122);
                    Object objT = a13.t();
                    androidx.compose.runtime.A.f37866a.getClass();
                    A.a.C1651a c1651a = A.a.f37868b;
                    if (objT == c1651a) {
                        l0.n.f413402b.getClass();
                        objT = C22126m3.g(l0.n.a(0L));
                        a13.H(objT);
                    }
                    InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
                    C22096n c22096nC5 = androidx.compose.runtime.internal.r.c(-1212965554, new Gb(interfaceC22204y1, this.f32425y, this.f32411A), a13);
                    boolean z14 = (i13 & 14) == 4;
                    Object objT2 = a13.t();
                    if (z14 || objT2 == c1651a) {
                        objT2 = new Ab(fFloatValue, interfaceC22204y1);
                        a13.H(objT2);
                    }
                    C22096n c22096n4 = c22096n2;
                    C22096n c22096n5 = c22096nC;
                    C22096n c22096n6 = c22096n3;
                    V6.a(vVarB, this.f32423w, c22096n4, c22096n, c22096n5, c22096n6, this.f32424x, fFloatValue, (Y41.l) objT2, c22096nC5, this.f32425y, a13, ((i13 << 21) & 29360128) | 805306368);
                    a13.h();
                }
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32427A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ int f32428B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ int f32429C;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldType f32430l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f32431m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32432n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.k0 f32433o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32434p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32435q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32436r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32437s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f32438t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f32439u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f32440v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.k f32441w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.layout.T1 f32442x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.h1 f32443y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21291ob f32444z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(TextFieldType textFieldType, String str, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, androidx.compose.ui.text.input.k0 k0Var, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar2, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar3, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar4, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar5, boolean z12, boolean z13, boolean z14, androidx.compose.foundation.interaction.k kVar, androidx.compose.foundation.layout.T1 t12, androidx.compose.ui.graphics.h1 h1Var, InterfaceC21291ob interfaceC21291ob, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar6, int i12, int i13) {
            super(2);
            this.f32430l = textFieldType;
            this.f32431m = str;
            this.f32432n = pVar;
            this.f32433o = k0Var;
            this.f32434p = pVar2;
            this.f32435q = pVar3;
            this.f32436r = pVar4;
            this.f32437s = pVar5;
            this.f32438t = z12;
            this.f32439u = z13;
            this.f32440v = z14;
            this.f32441w = kVar;
            this.f32442x = t12;
            this.f32443y = h1Var;
            this.f32444z = interfaceC21291ob;
            this.f32427A = pVar6;
            this.f32428B = i12;
            this.f32429C = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f32428B | 1);
            int iA3 = C22066f2.a(this.f32429C);
            InterfaceC21291ob interfaceC21291ob = this.f32444z;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f32427A;
            Bb.a(this.f32430l, this.f32431m, this.f32432n, this.f32433o, this.f32434p, this.f32435q, this.f32436r, this.f32437s, this.f32438t, this.f32439u, this.f32440v, this.f32441w, this.f32442x, this.f32443y, interfaceC21291ob, pVar, a12, iA2, iA3);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/c5;", "it", "Landroidx/compose/ui/graphics/T;", "invoke-XeAY9LY", "(Landroidx/compose/material/c5;Landroidx/compose/runtime/A;I)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<EnumC21129c5, androidx.compose.runtime.A, Integer, androidx.compose.ui.graphics.T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21291ob f32445l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f32446m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f32447n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.k f32448o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC21291ob interfaceC21291ob, boolean z12, boolean z13, androidx.compose.foundation.interaction.k kVar) {
            super(3);
            this.f32445l = interfaceC21291ob;
            this.f32446m = z12;
            this.f32447n = z13;
            this.f32448o = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final androidx.compose.ui.graphics.T invoke(EnumC21129c5 enumC21129c5, androidx.compose.runtime.A a12, Integer num) {
            EnumC21129c5 enumC21129c52 = enumC21129c5;
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(-1272940975);
            long j12 = ((androidx.compose.ui.graphics.T) this.f32445l.b(this.f32446m, enumC21129c52 == EnumC21129c5.f33502c ? false : this.f32447n, this.f32448o, a13).getF42167b()).f39331a;
            a13.h();
            return androidx.compose.ui.graphics.T.a(j12);
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f32409a = 16;
        f32410b = 12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0229 A[PHI: r1
  0x0229: PHI (r1v9 java.lang.String) = (r1v6 java.lang.String), (r1v10 java.lang.String) binds: [B:157:0x0227, B:151:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02b4  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.material.TextFieldType r31, @Y61.k java.lang.String r32, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r33, @Y61.k androidx.compose.ui.text.input.k0 r34, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r35, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r36, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r37, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r38, boolean r39, boolean r40, boolean r41, @Y61.k androidx.compose.foundation.interaction.k r42, @Y61.k androidx.compose.foundation.layout.T1 r43, @Y61.k androidx.compose.ui.graphics.h1 r44, @Y61.k androidx.compose.material.InterfaceC21291ob r45, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r46, @Y61.l androidx.compose.runtime.A r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Bb.a(androidx.compose.material.TextFieldType, java.lang.String, Y41.p, androidx.compose.ui.text.input.k0, Y41.p, Y41.p, Y41.p, Y41.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.k, androidx.compose.foundation.layout.T1, androidx.compose.ui.graphics.h1, androidx.compose.material.ob, Y41.p, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22142q
    public static final void b(long j12, @Y61.l androidx.compose.ui.text.x0 x0Var, @Y61.k Y41.p pVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.text.x0 x0Var2;
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(-399493340);
        int i15 = (bE2.n(j12) ? 4 : 2) | i12;
        int i16 = i13 & 2;
        if (i16 != 0) {
            i14 = i15 | 48;
            x0Var2 = x0Var;
        } else {
            x0Var2 = x0Var;
            i14 = i15 | (bE2.B(x0Var) ? 32 : 16);
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= bE2.B(null) ? 256 : 128;
        }
        int i17 = i14 | (bE2.u(pVar) ? 2048 : 1024);
        if (bE2.p(i17 & 1, (i17 & 1171) != 1170)) {
            if (i16 != 0) {
                x0Var2 = null;
            }
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(494684590, new Jb(j12, pVar, null), bE2);
            if (x0Var2 != null) {
                bE2.C(2115981348);
                dc.a(x0Var2, c22096nC, bE2, ((i17 >> 3) & 14) | 48);
            } else {
                bE2.C(2115982984);
                c22096nC.invoke(bE2, 6);
            }
            bE2.X(false);
        } else {
            bE2.f();
        }
        androidx.compose.ui.text.x0 x0Var3 = x0Var2;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Hb(j12, x0Var3, pVar, i12, i13);
        }
    }

    @Y61.l
    public static final Object c(@Y61.k InterfaceC22391w interfaceC22391w) {
        Object f40763y = interfaceC22391w.getF40763y();
        androidx.compose.ui.layout.E e12 = f40763y instanceof androidx.compose.ui.layout.E ? (androidx.compose.ui.layout.E) f40763y : null;
        if (e12 != null) {
            return e12.getF40328p();
        }
        return null;
    }

    public static final int d(@Y61.l androidx.compose.ui.layout.K0 k02) {
        if (k02 != null) {
            return k02.f40346c;
        }
        return 0;
    }

    public static final int e(@Y61.l androidx.compose.ui.layout.K0 k02) {
        if (k02 != null) {
            return k02.f40345b;
        }
        return 0;
    }
}
