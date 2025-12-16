package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {153, 156}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: kotlinx.coroutines.channels.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43101i0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public K0 f410909q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f410910r;

    /* renamed from: s, reason: collision with root package name */
    public Object f410911s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410912t;

    /* renamed from: u, reason: collision with root package name */
    public int f410913u;

    public C43101i0() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #1 {all -> 0x0076, blocks: (B:24:0x0064, B:26:0x006c), top: B:43:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:43:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            r8.f410912t = r9
            int r0 = r8.f410913u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r8.f410913u = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f410913u
            r2 = 0
            if (r1 == 0) goto L81
            r3 = 1
            r4 = 2
            if (r1 == r3) goto L33
            if (r1 != r4) goto L2b
            java.lang.Object r1 = r8.f410911s
            kotlinx.coroutines.channels.y r3 = r8.f410910r
            kotlinx.coroutines.channels.K0 r5 = r8.f410909q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L27
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r8
            goto L64
        L27:
            r9 = move-exception
            r2 = r5
            goto L86
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlinx.coroutines.channels.y r1 = r8.f410910r
            kotlinx.coroutines.channels.K0 r3 = r8.f410909q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L7e
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L7e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r9 != 0) goto L47
            r3.c(r2)
            r0 = r2
            goto L7d
        L47:
            java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> L7e
            r5 = r3
            r3 = r1
            r1 = r9
            r9 = r8
        L4f:
            r9.f410909q = r5     // Catch: java.lang.Throwable -> L27
            r9.f410910r = r3     // Catch: java.lang.Throwable -> L27
            r9.f410911s = r1     // Catch: java.lang.Throwable -> L27
            r9.f410913u = r4     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r3.a(r9)     // Catch: java.lang.Throwable -> L27
            if (r6 != r0) goto L5e
            goto L7d
        L5e:
            r7 = r1
            r1 = r9
            r9 = r6
            r6 = r5
            r5 = r3
            r3 = r7
        L64:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L76
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L79
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Throwable -> L76
            r3 = r5
            r5 = r6
            r7 = r1
            r1 = r9
            r9 = r7
            goto L4f
        L76:
            r9 = move-exception
            r2 = r6
            goto L86
        L79:
            r6.c(r2)
            r0 = r3
        L7d:
            return r0
        L7e:
            r9 = move-exception
            r2 = r3
            goto L86
        L81:
            kotlin.C42729a0.b(r9)
            throw r2     // Catch: java.lang.Throwable -> L85
        L85:
            r9 = move-exception
        L86:
            throw r9     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r2, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43101i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
