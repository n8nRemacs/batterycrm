package com.akita.compose.component.segmented_control;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: SegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"segmented-control_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class p {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
          (r2v10 ?? I:java.lang.Object) from 0x0148: INVOKE (r0v1 ?? I:androidx.compose.runtime.B), (r2v10 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:329)
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
    @androidx.compose.runtime.InterfaceC22137p
    public static final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
          (r2v10 ?? I:java.lang.Object) from 0x0148: INVOKE (r0v1 ?? I:androidx.compose.runtime.B), (r2v10 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:329)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
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

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, @Y61.k SegmentedControlState segmentedControlState, @Y61.k z zVar, @Y61.l androidx.compose.ui.v vVar, @Y61.k Y41.l lVar, @Y61.l A a12, int i13) {
        B bE2 = a12.E(366011349);
        int i14 = (bE2.m(i12) ? 4 : 2) | i13 | (bE2.B(segmentedControlState) ? 32 : 16) | (bE2.B(zVar) ? 256 : 128) | (bE2.B(vVar) ? 2048 : 1024) | (bE2.u(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            int i15 = (i14 & 14) | 3072 | (i14 & 112) | (i14 & 896);
            int i16 = i14 << 3;
            a(i12, segmentedControlState, zVar, androidx.compose.runtime.internal.r.c(1818258008, new h(zVar), bE2), vVar, lVar, bE2, i15 | (57344 & i16) | (i16 & 458752));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(i12, segmentedControlState, zVar, vVar, lVar, i13);
        }
    }
}
