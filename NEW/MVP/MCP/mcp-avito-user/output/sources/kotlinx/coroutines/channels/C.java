package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* compiled from: BufferedChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/C;", "E", "Lkotlinx/coroutines/internal/X;", "Lkotlinx/atomicfu/AtomicArray;", "", "data", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class C<E> extends kotlinx.coroutines.internal.X<C<E>> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final C43108m<E> f410782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f410783g;

    public C(long j12, @Y61.l C<E> c12, @Y61.l C43108m<E> c43108m, int i12) {
        super(j12, c12, i12);
        this.f410782f = c43108m;
        this.f410783g = new AtomicReferenceArray(C43122v.f411003b * 2);
    }

    @Override // kotlinx.coroutines.internal.X
    public final int g() {
        return C43122v.f411003b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        r7 = r4.f410944c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        kotlinx.coroutines.internal.Q.b(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r7, @Y61.k kotlin.coroutines.CoroutineContext r8) {
        /*
            r6 = this;
            int r0 = kotlinx.coroutines.channels.C43122v.f411003b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f410783g
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof kotlinx.coroutines.H1
            kotlinx.coroutines.channels.m<E> r4 = r6.f410782f
            r5 = 0
            if (r3 != 0) goto L68
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.R0
            if (r3 == 0) goto L22
            goto L68
        L22:
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.channels.C43122v.f411011j
            if (r2 == r3) goto L5b
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.channels.C43122v.f411012k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.channels.C43122v.f411008g
            if (r2 == r3) goto L12
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.channels.C43122v.f411007f
            if (r2 != r3) goto L34
            goto L12
        L34:
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.channels.C43122v.f411010i
            if (r2 == r7) goto L5a
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.channels.C43122v.f411005d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.channels.C43122v.f411013l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.n(r7, r5)
            if (r1 == 0) goto L67
            Y41.l<E, kotlin.G0> r7 = r4.f410944c
            if (r7 == 0) goto L67
            kotlinx.coroutines.internal.Q.b(r7, r0, r8)
        L67:
            return
        L68:
            if (r1 == 0) goto L6d
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.channels.C43122v.f411011j
            goto L6f
        L6d:
            kotlinx.coroutines.internal.a0 r3 = kotlinx.coroutines.channels.C43122v.f411012k
        L6f:
            boolean r2 = r6.k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L86
            Y41.l<E, kotlin.G0> r7 = r4.f410944c
            if (r7 == 0) goto L86
            kotlinx.coroutines.internal.Q.b(r7, r0, r8)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C.h(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean k(int i12, @Y61.l Object obj, @Y61.l Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f410783g;
        int i13 = (i12 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i13, obj, obj2)) {
            if (atomicReferenceArray.get(i13) != obj) {
                return false;
            }
        }
        return true;
    }

    @Y61.l
    public final Object l(int i12) {
        return this.f410783g.get((i12 * 2) + 1);
    }

    public final void m(int i12, boolean z12) {
        if (z12) {
            this.f410782f.a0((this.f411887d * C43122v.f411003b) + i12);
        }
        i();
    }

    public final void n(int i12, Object obj) {
        this.f410783g.set(i12 * 2, obj);
    }

    public final void o(int i12, @Y61.l kotlinx.coroutines.internal.a0 a0Var) {
        this.f410783g.set((i12 * 2) + 1, a0Var);
    }
}
