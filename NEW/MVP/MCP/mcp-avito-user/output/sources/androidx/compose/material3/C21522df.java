package androidx.compose.material3;

import androidx.compose.foundation.C20539l1;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/df;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21522df {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C21522df f36227a = new C21522df();

    public static final void d(C21522df c21522df, androidx.compose.ui.graphics.drawscope.g gVar, float[] fArr, float f12, float f13, long j12, long j13, long j14, long j15) {
        long j16;
        long j17;
        c21522df.getClass();
        int i12 = 0;
        boolean z12 = gVar.getLayoutDirection() == LayoutDirection.f42839c;
        long jA2 = l0.h.a(0.0f, l0.g.h(gVar.v1()));
        long jA3 = l0.h.a(l0.n.e(gVar.i()), l0.g.h(gVar.v1()));
        long j18 = z12 ? jA3 : jA2;
        long j19 = z12 ? jA2 : jA3;
        float fM02 = gVar.M0(Tf.f35502d);
        float fM03 = gVar.M0(Tf.f35503e);
        androidx.compose.ui.graphics.m1.f39698b.getClass();
        int i13 = androidx.compose.ui.graphics.m1.f39699c;
        long j22 = j19;
        long j23 = j18;
        androidx.compose.ui.graphics.drawscope.g.G0(gVar, j12, j18, j19, fM03, i13, null, 0, 480);
        androidx.compose.ui.graphics.drawscope.g.G0(gVar, j13, l0.h.a(((l0.g.g(j22) - l0.g.g(j23)) * f12) + l0.g.g(j23), l0.g.h(gVar.v1())), l0.h.a(((l0.g.g(j22) - l0.g.g(j23)) * f13) + l0.g.g(j23), l0.g.h(gVar.v1())), fM03, i13, null, 0, 480);
        int length = fArr.length;
        while (i12 < length) {
            float f14 = fArr[i12];
            if (f14 > f13 || f14 < f12) {
                j16 = j22;
                j17 = j14;
            } else {
                j16 = j22;
                j17 = j15;
            }
            long j24 = j23;
            j23 = j24;
            androidx.compose.ui.graphics.drawscope.g.U(gVar, j17, fM02 / 2.0f, l0.h.a(l0.g.g(l0.h.b(j24, j16, f14)), l0.g.h(gVar.v1())), 0.0f, null, 0, 120);
            i12++;
            j22 = j16;
        }
    }

    @InterfaceC22132o
    @Y61.k
    public static Te e(@Y61.l androidx.compose.runtime.A a12) {
        a12.I(1376295968);
        C21859s9.f37272a.getClass();
        C21942w3 c21942w3A = C21859s9.a(a12);
        Te te2 = c21942w3A.f37650P;
        if (te2 == null) {
            d0.c0.f393351a.getClass();
            long jC2 = C21964x3.c(c21942w3A, d0.c0.f393356f);
            long jC3 = C21964x3.c(c21942w3A, d0.c0.f393352b);
            long jC4 = androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, d0.c0.f393363m), 0.38f);
            long jC5 = C21964x3.c(c21942w3A, d0.c0.f393360j);
            long jC6 = androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, d0.c0.f393366p), 0.38f);
            long jG2 = androidx.compose.ui.graphics.V.g(androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, d0.c0.f393354d), 0.38f), c21942w3A.f37667p);
            long jC7 = androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, d0.c0.f393353c), 0.38f);
            ColorSchemeKeyTokens colorSchemeKeyTokens = d0.c0.f393365o;
            te2 = new Te(jC2, jC3, jC4, jC5, jC6, jG2, jC7, androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, colorSchemeKeyTokens), 0.38f), androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, d0.c0.f393355e), 0.12f), androidx.compose.ui.graphics.T.c(C21964x3.c(c21942w3A, colorSchemeKeyTokens), 0.38f), null);
            c21942w3A.f37650P = te2;
        }
        a12.O();
        return te2;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k androidx.compose.foundation.interaction.m mVar, @Y61.l v.a aVar, @Y61.l Te te2, boolean z12, long j12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        v.a aVar2;
        long j13;
        v.a aVar3;
        long j14;
        androidx.compose.runtime.B bE2 = a12.E(-290277409);
        if ((i12 & 6) == 0) {
            i13 = i12 | (bE2.B(mVar) ? 4 : 2);
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48 | (bE2.B(te2) ? 256 : 128) | (bE2.j(z12) ? 2048 : 1024) | 24576;
        if ((74899 & i14) == 74898 && bE2.c()) {
            bE2.f();
            aVar3 = aVar;
            j14 = j12;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar2 = androidx.compose.ui.v.f42878y1;
                j13 = Tf.f35499a;
            } else {
                bE2.f();
                aVar2 = aVar;
                j13 = j12;
            }
            bE2.Y();
            bE2.I(-1142853013);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new androidx.compose.runtime.snapshots.D();
                bE2.H(objT);
            }
            androidx.compose.runtime.snapshots.D d12 = (androidx.compose.runtime.snapshots.D) objT;
            bE2.X(false);
            bE2.I(-1142852924);
            boolean z13 = (i14 & 14) == 4;
            Object objT2 = bE2.t();
            if (z13 || objT2 == c1651a) {
                objT2 = new Ve(mVar, d12, null);
                bE2.H(objT2);
            }
            bE2.X(false);
            C22187u0.d((Y41.p) objT2, bE2, mVar);
            float f12 = !d12.isEmpty() ? Tf.f35501c : Tf.f35500b;
            d0.c0.f393351a.getClass();
            androidx.compose.ui.graphics.h1 h1VarA = He.a(d0.c0.f393358h, bE2);
            androidx.compose.ui.v vVarP = C20588k2.p(j13, aVar2);
            float f13 = d0.c0.f393362l / 2;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            C20608p2.a(bE2, androidx.compose.foundation.A.b(androidx.compose.ui.draw.y.a(C20539l1.a(C20839s1.a(vVarP, mVar, androidx.compose.material.ripple.w.a(false, f13, 0L, bE2, 54, 4)), mVar), z12 ? f12 : 0, h1VarA, false, 24), z12 ? te2.f35486a : te2.f35491f, h1VarA));
            aVar3 = aVar2;
            j14 = j13;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new We(this, mVar, aVar3, te2, z12, j14, i12);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 ??, still in use, count: 1, list:
          (r1v14 ?? I:java.lang.Object) from 0x00ea: INVOKE (r0v1 ?? I:androidx.compose.runtime.B), (r1v14 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:235)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    public final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 ??, still in use, count: 1, list:
          (r1v14 ?? I:java.lang.Object) from 0x00ea: INVOKE (r0v1 ?? I:androidx.compose.runtime.B), (r1v14 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:235)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 ??, still in use, count: 1, list:
          (r1v14 ?? I:java.lang.Object) from 0x00ea: INVOKE (r0v1 ?? I:androidx.compose.runtime.B), (r1v14 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:235)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.material3.InterfaceC21537e7
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    public final void c(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v14 ??, still in use, count: 1, list:
          (r1v14 ?? I:java.lang.Object) from 0x00ea: INVOKE (r0v1 ?? I:androidx.compose.runtime.B), (r1v14 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:235)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
}
