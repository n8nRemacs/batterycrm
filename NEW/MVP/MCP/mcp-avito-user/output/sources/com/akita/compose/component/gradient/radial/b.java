package com.akita.compose.component.gradient.radial;

import Y41.l;
import androidx.compose.ui.draw.i;
import androidx.compose.ui.draw.p;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: GradientRadial.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"gradient_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* compiled from: GradientRadial.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<i, p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f61653l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f61654m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ c f61655n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f61656o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f61657p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ long f61658q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, long j13, c cVar, long j14, long j15, long j16) {
            super(1);
            this.f61653l = j12;
            this.f61654m = j13;
            this.f61655n = cVar;
            this.f61656o = j14;
            this.f61657p = j15;
            this.f61658q = j16;
        }

        @Override // Y41.l
        public final p invoke(i iVar) {
            i iVar2 = iVar;
            float fD2 = n.d(iVar2.f39046b.i());
            J.a aVar = J.f39287a;
            List listU = C42745f0.U(T.a(this.f61653l), T.a(this.f61654m));
            c cVar = this.f61655n;
            float f12 = cVar.f61664f * fD2;
            float f13 = cVar.f61665g * fD2;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
            g.a aVar2 = g.f413384b;
            W0 w0C = J.a.c(aVar, listU, jFloatToRawIntBits, 0.8f * fD2);
            List listU2 = C42745f0.U(T.a(this.f61656o), T.a(this.f61657p));
            float f14 = cVar.f61666h * fD2;
            float f15 = cVar.f61667i * fD2;
            return iVar2.f(new com.akita.compose.component.gradient.radial.a(fD2, this.f61658q, J.a.c(aVar, listU2, (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), 0.6f * fD2), w0C));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v14 ??, still in use, count: 1, list:
          (r15v14 ?? I:java.lang.Object) from 0x005d: INVOKE (r14v0 ?? I:androidx.compose.runtime.A), (r15v14 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:94)
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
    @Y61.k
    public static final androidx.compose.ui.v a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v14 ??, still in use, count: 1, list:
          (r15v14 ?? I:java.lang.Object) from 0x005d: INVOKE (r14v0 ?? I:androidx.compose.runtime.A), (r15v14 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:94)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
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
