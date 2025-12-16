package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vyf extends dtf implements sm6 {
    public ssb X;
    public FileChannel Y;
    public uid Z;
    public Closeable o;
    public ByteBuffer s0;
    public long t0;
    public int u0;
    public int v0;
    public /* synthetic */ Object w0;
    public final /* synthetic */ ssb x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyf(ssb ssbVar, Continuation continuation) {
        super(2, continuation);
        this.x0 = ssbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vyf) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vyf vyfVar = new vyf(this.x0, continuation);
        vyfVar.w0 = obj;
        return vyfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r6 = new byte[(r6 - r15) - 1];
        r14.position(r5);
        r14.get(r6);
        r5 = java.nio.ByteBuffer.wrap(r6);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
    
        r5 = ((java.nio.charset.CharsetDecoder) r0.c).decode(r5).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        r5 = "<Invalid UTF-8 sequence>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0187, code lost:
    
        if (r3.a(r4, r22) == r12) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[Catch: all -> 0x0025, TryCatch #3 {all -> 0x0025, blocks: (B:7:0x001e, B:36:0x00de, B:42:0x00f6, B:43:0x0108, B:46:0x0116, B:51:0x0134, B:30:0x0097, B:34:0x00a9, B:52:0x0154, B:54:0x0160, B:55:0x0167, B:56:0x0173, B:22:0x0078, B:27:0x0088), top: B:74:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x0025, TryCatch #3 {all -> 0x0025, blocks: (B:7:0x001e, B:36:0x00de, B:42:0x00f6, B:43:0x0108, B:46:0x0116, B:51:0x0134, B:30:0x0097, B:34:0x00a9, B:52:0x0154, B:54:0x0160, B:55:0x0167, B:56:0x0173, B:22:0x0078, B:27:0x0088), top: B:74:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154 A[Catch: all -> 0x0025, TryCatch #3 {all -> 0x0025, blocks: (B:7:0x001e, B:36:0x00de, B:42:0x00f6, B:43:0x0108, B:46:0x0116, B:51:0x0134, B:30:0x0097, B:34:0x00a9, B:52:0x0154, B:54:0x0160, B:55:0x0167, B:56:0x0173, B:22:0x0078, B:27:0x0088), top: B:74:0x0013 }] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a9 -> B:35:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0131 -> B:50:0x0132). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vyf.n(java.lang.Object):java.lang.Object");
    }
}
