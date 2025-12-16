package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {971, 993}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* renamed from: androidx.compose.foundation.gestures.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20459h0 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C22340s f27729q;

    /* renamed from: r, reason: collision with root package name */
    public int f27730r;

    /* renamed from: s, reason: collision with root package name */
    public int f27731s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f27732t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0.a f27733u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0.h<androidx.compose.ui.input.pointer.C> f27734v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0.h<androidx.compose.ui.input.pointer.C> f27735w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20459h0(l0.a aVar, l0.h<androidx.compose.ui.input.pointer.C> hVar, l0.h<androidx.compose.ui.input.pointer.C> hVar2, Continuation<? super C20459h0> continuation) {
        super(2, continuation);
        this.f27733u = aVar;
        this.f27734v = hVar;
        this.f27735w = hVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20459h0 c20459h0 = new C20459h0(this.f27733u, this.f27734v, this.f27735w, continuation);
        c20459h0.f27732t = obj;
        return c20459h0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
        return ((C20459h0) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r2 = r3 ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[EDGE_INSN: B:69:0x00d9->B:44:0x00d9 BREAK  A[LOOP:0: B:39:0x00c6->B:43:0x00d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, androidx.compose.ui.input.pointer.C] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b7 -> B:38:0x00ba). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20459h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
