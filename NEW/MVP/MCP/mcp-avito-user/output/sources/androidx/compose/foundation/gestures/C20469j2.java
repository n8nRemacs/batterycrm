package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: TapGestureDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", i = {0, 1}, l = {386, 409}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"})
/* renamed from: androidx.compose.foundation.gestures.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20469j2 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27786q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27787r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PointerEventPass f27788s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.h<AbstractC20448e1> f27789t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20469j2(PointerEventPass pointerEventPass, l0.h<AbstractC20448e1> hVar, Continuation<? super C20469j2> continuation) {
        super(2, continuation);
        this.f27788s = pointerEventPass;
        this.f27789t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20469j2 c20469j2 = new C20469j2(this.f27788s, this.f27789t, continuation);
        c20469j2.f27787r = obj;
        return c20469j2;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
        return ((C20469j2) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (androidx.compose.foundation.gestures.C20477l2.a(r7) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r3.f406842b = androidx.compose.foundation.gestures.AbstractC20448e1.c.f27688a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        r7 = ((java.util.Collection) r11).size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r8 >= r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r9 = (androidx.compose.ui.input.pointer.C) r11.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r9.b() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (androidx.compose.ui.input.pointer.C22341t.e(r9, r2.a(), r2.J1()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r3.f406842b = androidx.compose.foundation.gestures.AbstractC20448e1.a.f27686a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r7 = androidx.compose.ui.input.pointer.PointerEventPass.f40175d;
        r16.f27787r = r2;
        r16.f27786q = 2;
        r7 = r2.N1(r7, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r7 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        r3.f406842b = androidx.compose.foundation.gestures.AbstractC20448e1.a.f27686a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        return kotlin.G0.f406611a;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.foundation.gestures.e1$b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.gestures.e1$a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, androidx.compose.foundation.gestures.e1$c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, androidx.compose.foundation.gestures.e1$a] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a3 -> B:34:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27786q
            kotlin.jvm.internal.l0$h<androidx.compose.foundation.gestures.e1> r3 = r0.f27789t
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L30
            if (r2 == r4) goto L26
            if (r2 != r5) goto L1e
            java.lang.Object r2 = r0.f27787r
            androidx.compose.ui.input.pointer.c r2 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r2
            kotlin.C42729a0.b(r17)
            r7 = r17
            goto La6
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.Object r2 = r0.f27787r
            androidx.compose.ui.input.pointer.c r2 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r2
            kotlin.C42729a0.b(r17)
            r7 = r17
            goto L44
        L30:
            kotlin.C42729a0.b(r17)
            java.lang.Object r2 = r0.f27787r
            androidx.compose.ui.input.pointer.c r2 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r2
        L37:
            r0.f27787r = r2
            r0.f27786q = r4
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.f27788s
            java.lang.Object r7 = r2.N1(r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.s r7 = (androidx.compose.ui.input.pointer.C22340s) r7
            java.lang.Object r8 = r7.f40278a
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r10 = r6
        L50:
            java.lang.Object r11 = r7.f40278a
            if (r10 >= r9) goto Lcb
            java.lang.Object r12 = r8.get(r10)
            androidx.compose.ui.input.pointer.C r12 = (androidx.compose.ui.input.pointer.C) r12
            boolean r12 = androidx.compose.ui.input.pointer.C22341t.b(r12)
            if (r12 != 0) goto Lc8
            boolean r7 = androidx.compose.foundation.gestures.C20477l2.a(r7)
            if (r7 == 0) goto L6c
            androidx.compose.foundation.gestures.e1$c r1 = androidx.compose.foundation.gestures.AbstractC20448e1.c.f27688a
            r3.f406842b = r1
            goto Ld8
        L6c:
            r7 = r11
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = r6
        L74:
            if (r8 >= r7) goto L99
            java.lang.Object r9 = r11.get(r8)
            androidx.compose.ui.input.pointer.C r9 = (androidx.compose.ui.input.pointer.C) r9
            boolean r10 = r9.b()
            if (r10 != 0) goto L94
            long r12 = r2.a()
            long r14 = r2.J1()
            boolean r9 = androidx.compose.ui.input.pointer.C22341t.e(r9, r12, r14)
            if (r9 == 0) goto L91
            goto L94
        L91:
            int r8 = r8 + 1
            goto L74
        L94:
            androidx.compose.foundation.gestures.e1$a r1 = androidx.compose.foundation.gestures.AbstractC20448e1.a.f27686a
            r3.f406842b = r1
            goto Ld8
        L99:
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.f40175d
            r0.f27787r = r2
            r0.f27786q = r5
            java.lang.Object r7 = r2.N1(r7, r0)
            if (r7 != r1) goto La6
            return r1
        La6:
            androidx.compose.ui.input.pointer.s r7 = (androidx.compose.ui.input.pointer.C22340s) r7
            java.lang.Object r7 = r7.f40278a
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = r6
        Lb2:
            if (r9 >= r8) goto L37
            java.lang.Object r10 = r7.get(r9)
            androidx.compose.ui.input.pointer.C r10 = (androidx.compose.ui.input.pointer.C) r10
            boolean r10 = r10.b()
            if (r10 == 0) goto Lc5
            androidx.compose.foundation.gestures.e1$a r1 = androidx.compose.foundation.gestures.AbstractC20448e1.a.f27686a
            r3.f406842b = r1
            goto Ld8
        Lc5:
            int r9 = r9 + 1
            goto Lb2
        Lc8:
            int r10 = r10 + 1
            goto L50
        Lcb:
            androidx.compose.foundation.gestures.e1$b r1 = new androidx.compose.foundation.gestures.e1$b
            java.lang.Object r2 = r11.get(r6)
            androidx.compose.ui.input.pointer.C r2 = (androidx.compose.ui.input.pointer.C) r2
            r1.<init>(r2)
            r3.f406842b = r1
        Ld8:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20469j2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
