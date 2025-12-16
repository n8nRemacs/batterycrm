package org.mockito.internal.creation.bytebuddy.inject;

import androidx.compose.runtime.snapshots.X;
import java.util.concurrent.ConcurrentMap;

/* loaded from: avito.apk:org/mockito/internal/creation/bytebuddy/inject/MockMethodDispatcher.raw */
public abstract class MockMethodDispatcher {
    private static final ConcurrentMap<String, MockMethodDispatcher> DISPATCHERS = null;

    public abstract boolean hasNext();

    public abstract Object next() throws Throwable;

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/util/concurrent/Callable<*>; */
    public abstract void remove() throws Throwable;

    public abstract Object invoke(Object obj, Object obj2, Object obj3);

    /* renamed from: <init>, reason: not valid java name */
    public abstract void m273init(long j12, int i12);

    public abstract void a(X x12);

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;)Z */
    public abstract X b();

    public abstract X c(long j12);

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public MockMethodDispatcher(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r2 = this;
            r0 = r2
            super/*A.b*/.a(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 3, list:
          (r0v1 ?? I:java.lang.Object A[D('classLoader' java.lang.ClassLoader)]) from 0x0026: INVOKE (r3v5 ?? I:A0.c), (r0v1 ?? I:java.lang.Object A[D('classLoader' java.lang.ClassLoader)]) VIRTUAL call: A0.c.equals(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m)]
          (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('classLoader' java.lang.ClassLoader)]) from 0x0007: IF  (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('classLoader' java.lang.ClassLoader)]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:6:0x0038 (LINE:16)
          (r0v1 ?? I:kotlin.coroutines.CoroutineContext A[D('classLoader' java.lang.ClassLoader)]) from CONSTRUCTOR (r0v1 ?? I:kotlin.coroutines.CoroutineContext A[D('classLoader' java.lang.ClassLoader)]) (LINE:21) call: A1.a.<init>(kotlin.coroutines.CoroutineContext):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    static void L3(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 3, list:
          (r0v1 ?? I:java.lang.Object A[D('classLoader' java.lang.ClassLoader)]) from 0x0026: INVOKE (r3v5 ?? I:A0.c), (r0v1 ?? I:java.lang.Object A[D('classLoader' java.lang.ClassLoader)]) VIRTUAL call: A0.c.equals(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m)]
          (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('classLoader' java.lang.ClassLoader)]) from 0x0007: IF  (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('classLoader' java.lang.ClassLoader)]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:6:0x0038 (LINE:16)
          (r0v1 ?? I:kotlin.coroutines.CoroutineContext A[D('classLoader' java.lang.ClassLoader)]) from CONSTRUCTOR (r0v1 ?? I:kotlin.coroutines.CoroutineContext A[D('classLoader' java.lang.ClassLoader)]) (LINE:21) call: A1.a.<init>(kotlin.coroutines.CoroutineContext):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
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

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    /* renamed from: <init>, reason: not valid java name */
    public static void m271init(
    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0006: IF  (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:6:0x000f
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0002: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('type' java.lang.Class<?>)]), block:B:2:0x0000 */
    public static java.lang.Object invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0006: IF  (r0v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:6:0x000f
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
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

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to apply debug info
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0004: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = 
  (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('dispatcher' org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher)])
, block:B:2:0x0000 */
    public static java.lang.Object invoke(java.lang.Object r4) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.String, org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher> r0 = org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.DISPATCHERS
            r1 = r4
            r2 = r5
            java.lang.String r0 = r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.invoke(java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0009: CHECK_CAST (r0v2 ?? I:org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher) = (org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher) (r0v1 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;Ljava/lang/Class<*>;)Z */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('identifier' java.lang.String)]), block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x000c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('type' java.lang.Class<?>)]), block:B:2:0x0000 */
    static {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.String, org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher> r0 = org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.DISPATCHERS
            r1 = r3
            void r0 = r0.<init>()
            org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher r0 = (org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher) r0
            r1 = r4
            void r0 = r0.<clinit>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.m272clinit():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0009: CHECK_CAST (r0v2 ?? I:org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher) = (org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher) (r0v1 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x000f: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r10 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('parameterTypeNames' java.lang.String[])]), block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0003: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('identifier' java.lang.String)]), block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x000c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('type' java.lang.Class<?>)]), block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000d: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('object' java.lang.Object)]), block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000e: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r9 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('arguments' java.lang.Object[])]), block:B:2:0x0000 */
    public static java.util.Iterator iterator() {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.String, org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher> r0 = org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.DISPATCHERS
            r1 = r6
            void r0 = r0.<init>()
            org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher r0 = (org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher) r0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            void r0 = r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.inject.MockMethodDispatcher.iterator():java.util.Iterator");
    }
}
