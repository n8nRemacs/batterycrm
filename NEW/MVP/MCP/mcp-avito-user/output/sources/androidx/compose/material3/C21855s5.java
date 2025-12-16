package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21855s5 extends kotlin.jvm.internal.N implements Y41.r<androidx.compose.foundation.lazy.grid.X, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f37260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.grid.I0 f37261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f37262n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f37263o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f37264p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f37265q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f37266r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, kotlin.G0> f37267s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ce f37268t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y3 f37269u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21855s5(kotlin.ranges.l lVar, androidx.compose.foundation.lazy.grid.I0 i02, kotlinx.coroutines.T t12, String str, String str2, int i12, int i13, Y41.l<? super Integer, kotlin.G0> lVar2, Ce ce2, Y3 y32) {
        super(4);
        this.f37260l = lVar;
        this.f37261m = i02;
        this.f37262n = t12;
        this.f37263o = str;
        this.f37264p = str2;
        this.f37265q = i12;
        this.f37266r = i13;
        this.f37267s = lVar2;
        this.f37268t = ce2;
        this.f37269u = y32;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 ??, still in use, count: 1, list:
          (r1v15 ?? I:java.lang.Object) from 0x009c: INVOKE (r13v1 ?? I:androidx.compose.runtime.A), (r1v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:157)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // Y41.r
    public final kotlin.G0 invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v15 ??, still in use, count: 1, list:
          (r1v15 ?? I:java.lang.Object) from 0x009c: INVOKE (r13v1 ?? I:androidx.compose.runtime.A), (r1v15 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:157)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
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
