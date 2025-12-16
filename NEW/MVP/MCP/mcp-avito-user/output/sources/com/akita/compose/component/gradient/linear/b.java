package com.akita.compose.component.gradient.linear;

import Y41.l;
import androidx.compose.ui.draw.i;
import androidx.compose.ui.draw.p;
import androidx.compose.ui.graphics.C22322z0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import com.akita.compose.component.gradient.linear.GradientLinearStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GradientLinear.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"gradient_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* compiled from: GradientLinear.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/draw/p;", "invoke", "(Landroidx/compose/ui/draw/i;)Landroidx/compose/ui/draw/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<i, p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f61646l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f61647m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ GradientLinearStyle f61648n;

        /* compiled from: GradientLinear.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.akita.compose.component.gradient.linear.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2087a {
            static {
                int[] iArr = new int[GradientLinearStyle.Orientation.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    GradientLinearStyle.Orientation orientation = GradientLinearStyle.Orientation.f61641b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, long j13, GradientLinearStyle gradientLinearStyle) {
            super(1);
            this.f61646l = j12;
            this.f61647m = j13;
            this.f61648n = gradientLinearStyle;
        }

        @Override // Y41.l
        public final p invoke(i iVar) {
            C22322z0 c22322z0A;
            i iVar2 = iVar;
            List listU = C42745f0.U(T.a(this.f61646l), T.a(this.f61647m));
            int iOrdinal = this.f61648n.f61640c.ordinal();
            if (iOrdinal == 0) {
                c22322z0A = J.a.a(J.f39287a, listU, Float.intBitsToFloat((int) (iVar2.f39046b.i() >> 32)) * 0.1f, (1 - 0.1f) * Float.intBitsToFloat((int) (iVar2.f39046b.i() >> 32)), 8);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                c22322z0A = J.a.d(J.f39287a, listU, Float.intBitsToFloat((int) (iVar2.f39046b.i() & 4294967295L)) * 0.1f, (1 - 0.1f) * Float.intBitsToFloat((int) (iVar2.f39046b.i() & 4294967295L)), 8);
            }
            return iVar2.f(new com.akita.compose.component.gradient.linear.a(c22322z0A));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 ??, still in use, count: 1, list:
          (r9v8 ?? I:java.lang.Object) from 0x003c: INVOKE (r8v0 ?? I:androidx.compose.runtime.A), (r9v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:61)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 ??, still in use, count: 1, list:
          (r9v8 ?? I:java.lang.Object) from 0x003c: INVOKE (r8v0 ?? I:androidx.compose.runtime.A), (r9v8 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:61)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
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
