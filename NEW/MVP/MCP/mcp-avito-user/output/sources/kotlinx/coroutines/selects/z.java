package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;

/* compiled from: WhileSelect.kt */
@s0
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {37}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class z extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Y41.l f412243q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f412244r;

    /* renamed from: s, reason: collision with root package name */
    public int f412245s;

    public z() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0047 -> B:13:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            r6.f412244r = r7
            int r0 = r6.f412245s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.f412245s = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f412245s
            r2 = 1
            if (r1 == 0) goto L27
            if (r1 != r2) goto L1f
            Y41.l r1 = r6.f412243q
            Y41.l r1 = (Y41.l) r1
            kotlin.C42729a0.b(r7)
            r3 = r1
            r1 = r6
            goto L4b
        L1f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L27:
            kotlin.C42729a0.b(r7)
            r7 = 0
            r1 = r7
            r7 = r6
        L2d:
            kotlinx.coroutines.selects.o r3 = new kotlinx.coroutines.selects.o
            kotlin.coroutines.CoroutineContext r4 = r7.getF411447c()
            r3.<init>(r4)
            r1.invoke(r3)
            r4 = r1
            Y41.l r4 = (Y41.l) r4
            r7.f412243q = r4
            r7.f412245s = r2
            java.lang.Object r3 = r3.g(r7)
            if (r3 != r0) goto L47
            goto L55
        L47:
            r5 = r1
            r1 = r7
            r7 = r3
            r3 = r5
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L56
            kotlin.G0 r0 = kotlin.G0.f406611a
        L55:
            return r0
        L56:
            r7 = r1
            r1 = r3
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
