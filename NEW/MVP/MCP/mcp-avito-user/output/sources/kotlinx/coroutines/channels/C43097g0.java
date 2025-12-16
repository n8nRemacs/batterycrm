package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {127, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: kotlinx.coroutines.channels.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43097g0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public K0 f410898q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f410899r;

    /* renamed from: s, reason: collision with root package name */
    public Object f410900s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410901t;

    /* renamed from: u, reason: collision with root package name */
    public int f410902u;

    public C43097g0() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x005f, B:25:0x0067), top: B:42:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:42:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            r8.f410901t = r9
            int r0 = r8.f410902u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.f410902u = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f410902u
            r2 = 0
            if (r1 == 0) goto L84
            r3 = 1
            r4 = 2
            if (r1 == r3) goto L33
            if (r1 != r4) goto L2b
            java.lang.Object r1 = r8.f410900s
            kotlinx.coroutines.channels.y r3 = r8.f410899r
            kotlinx.coroutines.channels.K0 r5 = r8.f410898q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L27
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r8
            goto L5f
        L27:
            r9 = move-exception
            r2 = r5
            goto L89
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlinx.coroutines.channels.y r1 = r8.f410899r
            kotlinx.coroutines.channels.K0 r3 = r8.f410898q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L79
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> L79
            r5 = r3
            r3 = r1
            r1 = r9
            r9 = r8
        L4a:
            r9.f410898q = r5     // Catch: java.lang.Throwable -> L27
            r9.f410899r = r3     // Catch: java.lang.Throwable -> L27
            r9.f410900s = r1     // Catch: java.lang.Throwable -> L27
            r9.f410902u = r4     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r3.a(r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != r0) goto L59
            goto L78
        L59:
            r7 = r1
            r1 = r9
            r9 = r6
            r6 = r5
            r5 = r3
            r3 = r7
        L5f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r9 == 0) goto L74
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Throwable -> L71
            r3 = r5
            r5 = r6
            r7 = r1
            r1 = r9
            r9 = r7
            goto L4a
        L71:
            r9 = move-exception
            r2 = r6
            goto L89
        L74:
            r6.c(r2)
            r0 = r3
        L78:
            return r0
        L79:
            r9 = move-exception
            r2 = r3
            goto L89
        L7c:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "ReceiveChannel is empty."
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L84:
            kotlin.C42729a0.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L88
        L88:
            r9 = move-exception
        L89:
            throw r9     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43097g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
