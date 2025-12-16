package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.C20835r0;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.S0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.q;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.RenderMode;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: LottieAnimation.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/z;", "setDynamicProperties", "", "progress", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.airbnb.lottie.compose.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27274j {

    /* compiled from: LottieAnimation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.j$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ AsyncUpdates f59471A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ boolean f59472B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ int f59473C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ int f59474D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ int f59475E;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C27291k f59476l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f59477m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f59478n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f59479o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f59480p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f59481q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f59482r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RenderMode f59483s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f59484t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ z f59485u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f59486v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22374n f59487w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f59488x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f59489y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Map<String, Typeface> f59490z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C27291k c27291k, Y41.a<Float> aVar, androidx.compose.ui.v vVar, boolean z12, boolean z13, boolean z14, boolean z15, RenderMode renderMode, boolean z16, z zVar, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, boolean z17, boolean z18, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z19, int i12, int i13, int i14) {
            super(2);
            this.f59476l = c27291k;
            this.f59477m = aVar;
            this.f59478n = vVar;
            this.f59479o = z12;
            this.f59480p = z13;
            this.f59481q = z14;
            this.f59482r = z15;
            this.f59483s = renderMode;
            this.f59484t = z16;
            this.f59485u = zVar;
            this.f59486v = interfaceC22215f;
            this.f59487w = interfaceC22374n;
            this.f59488x = z17;
            this.f59489y = z18;
            this.f59490z = map;
            this.f59471A = asyncUpdates;
            this.f59472B = z19;
            this.f59473C = i12;
            this.f59474D = i13;
            this.f59475E = i14;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f59473C | 1);
            int iA3 = C22066f2.a(this.f59474D);
            Map<String, Typeface> map = this.f59490z;
            int i12 = this.f59475E;
            C27274j.a(this.f59476l, this.f59477m, this.f59478n, this.f59479o, this.f59480p, this.f59481q, this.f59482r, this.f59483s, this.f59484t, this.f59485u, this.f59486v, this.f59487w, this.f59488x, this.f59489y, map, this.f59471A, this.f59472B, a12, iA2, iA3, i12);
            return G0.f406611a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.airbnb.lottie.compose.j$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ boolean f59491A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ boolean f59492B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ boolean f59493C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ Context f59494D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f59495E;

        /* renamed from: F, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<z> f59496F;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Rect f59497l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22374n f59498m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f59499n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Matrix f59500o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.B f59501p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f59502q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f59503r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RenderMode f59504s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AsyncUpdates f59505t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C27291k f59506u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Map<String, Typeface> f59507v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ z f59508w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f59509x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f59510y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f59511z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Rect rect, InterfaceC22374n interfaceC22374n, InterfaceC22215f interfaceC22215f, Matrix matrix, com.airbnb.lottie.B b12, boolean z12, boolean z13, RenderMode renderMode, AsyncUpdates asyncUpdates, C27291k c27291k, Map<String, ? extends Typeface> map, z zVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, Context context, Y41.a<Float> aVar, InterfaceC22204y1<z> interfaceC22204y1) {
            super(1);
            this.f59497l = rect;
            this.f59498m = interfaceC22374n;
            this.f59499n = interfaceC22215f;
            this.f59500o = matrix;
            this.f59501p = b12;
            this.f59502q = z12;
            this.f59503r = z13;
            this.f59504s = renderMode;
            this.f59505t = asyncUpdates;
            this.f59506u = c27291k;
            this.f59507v = map;
            this.f59508w = zVar;
            this.f59509x = z14;
            this.f59510y = z15;
            this.f59511z = z16;
            this.f59491A = z17;
            this.f59492B = z18;
            this.f59493C = z19;
            this.f59494D = context;
            this.f59495E = aVar;
            this.f59496F = interfaceC22204y1;
        }

        @Override // Y41.l
        public final G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            androidx.compose.ui.graphics.M mA2 = gVar2.getF39478c().a();
            Rect rect = this.f59497l;
            long jA2 = l0.o.a(rect.width(), rect.height());
            long jA3 = androidx.compose.ui.unit.v.a(kotlin.math.b.b(l0.n.e(gVar2.i())), kotlin.math.b.b(l0.n.c(gVar2.i())));
            long jA4 = this.f59498m.a(jA2, gVar2.i());
            float fE2 = l0.n.e(jA2);
            int i12 = S0.f40400b;
            int i13 = (int) (jA4 >> 32);
            int i14 = (int) (jA4 & 4294967295L);
            long jA5 = this.f59499n.a(androidx.compose.ui.unit.v.a((int) (Float.intBitsToFloat(i13) * fE2), (int) (Float.intBitsToFloat(i14) * l0.n.c(jA2))), jA3, gVar2.getLayoutDirection());
            Matrix matrix = this.f59500o;
            matrix.reset();
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            matrix.preTranslate((int) (jA5 >> 32), (int) (jA5 & 4294967295L));
            matrix.preScale(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            com.airbnb.lottie.B b12 = this.f59501p;
            b12.i(this.f59502q);
            b12.f59039f = this.f59503r;
            b12.f59015A = this.f59504s;
            b12.e();
            b12.f59031Q = this.f59505t;
            b12.r(this.f59506u);
            Map<String, Typeface> map = b12.f59046m;
            Map<String, Typeface> map2 = this.f59507v;
            if (map2 != map) {
                b12.f59046m = map2;
                b12.invalidateSelf();
            }
            InterfaceC22204y1<z> interfaceC22204y1 = this.f59496F;
            z f42167b = interfaceC22204y1.getF42167b();
            O2.g gVarD = null;
            z zVar = this.f59508w;
            if (zVar != f42167b) {
                if (interfaceC22204y1.getF42167b() != null || zVar != null) {
                    throw null;
                }
                interfaceC22204y1.setValue(zVar);
            }
            boolean z12 = b12.f59056w;
            boolean z13 = this.f59509x;
            if (z12 != z13) {
                b12.f59056w = z13;
                com.airbnb.lottie.model.layer.c cVar = b12.f59053t;
                if (cVar != null) {
                    cVar.r(z13);
                }
            }
            b12.f59057x = this.f59510y;
            b12.f59058y = this.f59511z;
            b12.f59051r = this.f59491A;
            b12.q(this.f59492B);
            boolean z14 = b12.f59059z;
            boolean z15 = this.f59493C;
            if (z15 != z14) {
                b12.f59059z = z15;
                b12.invalidateSelf();
            }
            Iterator<String> it = com.airbnb.lottie.B.f59013U.iterator();
            while (it.hasNext()) {
                gVarD = b12.f59035b.d(it.next());
                if (gVarD != null) {
                    break;
                }
            }
            if (b12.b(this.f59494D) || gVarD == null) {
                b12.y(this.f59495E.invoke().floatValue());
            } else {
                b12.y(gVarD.f11947b);
            }
            b12.setBounds(0, 0, rect.width(), rect.height());
            Canvas canvas = C22247d.f39473a;
            b12.g(((C22245c) mA2).f39351a, matrix);
            return G0.f406611a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.j$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ AsyncUpdates f59512A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ boolean f59513B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ int f59514C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ int f59515D;

        /* renamed from: E, reason: collision with root package name */
        public final /* synthetic */ int f59516E;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C27291k f59517l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Float> f59518m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f59519n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f59520o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f59521p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f59522q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f59523r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ RenderMode f59524s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f59525t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ z f59526u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f59527v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22374n f59528w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f59529x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ boolean f59530y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Map<String, Typeface> f59531z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(C27291k c27291k, Y41.a<Float> aVar, androidx.compose.ui.v vVar, boolean z12, boolean z13, boolean z14, boolean z15, RenderMode renderMode, boolean z16, z zVar, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, boolean z17, boolean z18, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z19, int i12, int i13, int i14) {
            super(2);
            this.f59517l = c27291k;
            this.f59518m = aVar;
            this.f59519n = vVar;
            this.f59520o = z12;
            this.f59521p = z13;
            this.f59522q = z14;
            this.f59523r = z15;
            this.f59524s = renderMode;
            this.f59525t = z16;
            this.f59526u = zVar;
            this.f59527v = interfaceC22215f;
            this.f59528w = interfaceC22374n;
            this.f59529x = z17;
            this.f59530y = z18;
            this.f59531z = map;
            this.f59512A = asyncUpdates;
            this.f59513B = z19;
            this.f59514C = i12;
            this.f59515D = i13;
            this.f59516E = i14;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f59514C | 1);
            int iA3 = C22066f2.a(this.f59515D);
            androidx.compose.ui.v vVar = this.f59519n;
            Map<String, Typeface> map = this.f59531z;
            int i12 = this.f59516E;
            C27274j.a(this.f59517l, this.f59518m, vVar, this.f59520o, this.f59521p, this.f59522q, this.f59523r, this.f59524s, this.f59525t, this.f59526u, this.f59527v, this.f59528w, this.f59529x, this.f59530y, map, this.f59512A, this.f59513B, a12, iA2, iA3, i12);
            return G0.f406611a;
        }
    }

    @X41.j
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l C27291k c27291k, @Y61.k Y41.a<Float> aVar, @Y61.l androidx.compose.ui.v vVar, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l RenderMode renderMode, boolean z16, @Y61.l z zVar, @Y61.l InterfaceC22215f interfaceC22215f, @Y61.l InterfaceC22374n interfaceC22374n, boolean z17, boolean z18, @Y61.l Map<String, ? extends Typeface> map, @Y61.l AsyncUpdates asyncUpdates, boolean z19, @Y61.l androidx.compose.runtime.A a12, int i12, int i13, int i14) {
        InterfaceC22215f interfaceC22215f2;
        androidx.compose.runtime.B bE2 = a12.E(382909894);
        boolean z22 = (i14 & 8) != 0 ? false : z12;
        boolean z23 = (i14 & 16) != 0 ? false : z13;
        boolean z24 = (i14 & 32) != 0 ? true : z14;
        boolean z25 = (i14 & 64) != 0 ? false : z15;
        RenderMode renderMode2 = (i14 & 128) != 0 ? RenderMode.f59154b : renderMode;
        boolean z26 = (i14 & 256) != 0 ? false : z16;
        z zVar2 = (i14 & 512) != 0 ? null : zVar;
        if ((i14 & 1024) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f2 = InterfaceC22215f.a.f39080f;
        } else {
            interfaceC22215f2 = interfaceC22215f;
        }
        boolean z27 = (i14 & 4096) != 0 ? true : z17;
        boolean z28 = (i14 & 8192) != 0 ? false : z18;
        Map<String, ? extends Typeface> map2 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (32768 & i14) != 0 ? AsyncUpdates.f59010b : asyncUpdates;
        boolean z29 = (65536 & i14) != 0 ? false : z19;
        bE2.I(185152185);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = new com.airbnb.lottie.B();
            bE2.H(objT);
        }
        com.airbnb.lottie.B b12 = (com.airbnb.lottie.B) objT;
        bE2.X(false);
        bE2.I(185152232);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = new Matrix();
            bE2.H(objT2);
        }
        Matrix matrix = (Matrix) objT2;
        bE2.X(false);
        bE2.I(185152312);
        boolean zB2 = bE2.B(c27291k);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = C22126m3.g(null);
            bE2.H(objT3);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT3;
        bE2.X(false);
        bE2.I(185152364);
        if (c27291k == null || c27291k.b() == 0.0f) {
            C20632w.a(vVar, bE2, (i12 >> 6) & 14);
            bE2.X(false);
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new a(c27291k, aVar, vVar, z22, z23, z24, z25, renderMode2, z26, zVar2, interfaceC22215f2, interfaceC22374n, z27, z28, map2, asyncUpdates2, z29, i12, i13, i14);
                return;
            }
            return;
        }
        bE2.X(false);
        Rect rect = c27291k.f59592k;
        C20835r0.a(0, new b(rect, interfaceC22374n, interfaceC22215f2, matrix, b12, z25, z29, renderMode2, asyncUpdates2, c27291k, map2, zVar2, z22, z23, z24, z26, z27, z28, (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b), aVar, interfaceC22204y1), bE2, vVar.d0(new LottieAnimationSizeElement(rect.width(), rect.height())));
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new c(c27291k, aVar, vVar, z22, z23, z24, z25, renderMode2, z26, zVar2, interfaceC22215f2, interfaceC22374n, z27, z28, map2, asyncUpdates2, z29, i12, i13, i14);
        }
    }
}
