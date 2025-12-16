package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bob extends dtf implements em6 {
    public Map X;
    public Object Y;
    public Map Z;
    public onb o;
    public dob s0;
    public Iterator t0;
    public long u0;
    public int v0;
    public final /* synthetic */ dob w0;
    public final /* synthetic */ List x0;
    public final /* synthetic */ bj1 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bob(dob dobVar, List list, bj1 bj1Var, Continuation continuation) {
        super(1, continuation);
        this.w0 = dobVar;
        this.x0 = list;
        this.y0 = bj1Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        List list = this.x0;
        bj1 bj1Var = this.y0;
        return new bob(this.w0, list, bj1Var, (Continuation) obj).n(qqg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        if (r4 == r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a8, code lost:
    
        if (r9 == r11) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0129 -> B:37:0x0132). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bob.n(java.lang.Object):java.lang.Object");
    }
}
