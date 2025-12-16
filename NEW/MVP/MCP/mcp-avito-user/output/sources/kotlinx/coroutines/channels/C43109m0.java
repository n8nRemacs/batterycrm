package kotlinx.coroutines.channels;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Deprecated.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {464, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: kotlinx.coroutines.channels.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43109m0<E> extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Comparator f410958q;

    /* renamed from: r, reason: collision with root package name */
    public K0 f410959r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC43125y f410960s;

    /* renamed from: t, reason: collision with root package name */
    public Object f410961t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f410962u;

    /* renamed from: v, reason: collision with root package name */
    public int f410963v;

    public C43109m0() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:24:0x006e, B:26:0x0076), top: B:49:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0067 -> B:49:0x006e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            r10.f410962u = r11
            int r0 = r10.f410963v
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r10.f410963v = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f410963v
            r2 = 0
            if (r1 == 0) goto L98
            r3 = 1
            r4 = 2
            if (r1 == r3) goto L36
            if (r1 != r4) goto L2e
            java.lang.Object r1 = r10.f410961t
            kotlinx.coroutines.channels.y r3 = r10.f410960s
            kotlinx.coroutines.channels.K0 r5 = r10.f410959r
            java.util.Comparator r6 = r10.f410958q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L2a
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r10
            goto L6e
        L2a:
            r11 = move-exception
            r2 = r5
            goto L9d
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L36:
            kotlinx.coroutines.channels.y r1 = r10.f410960s
            kotlinx.coroutines.channels.K0 r3 = r10.f410959r
            java.util.Comparator r5 = r10.f410958q
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L95
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L95
            if (r11 != 0) goto L4d
            r3.c(r2)
            r0 = r2
            goto L94
        L4d:
            java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L95
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r11
            r11 = r10
        L56:
            r11.f410958q = r6     // Catch: java.lang.Throwable -> L2a
            r11.f410959r = r5     // Catch: java.lang.Throwable -> L2a
            r11.f410960s = r3     // Catch: java.lang.Throwable -> L2a
            r11.f410961t = r1     // Catch: java.lang.Throwable -> L2a
            r11.f410963v = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r3.a(r11)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r0) goto L67
            goto L94
        L67:
            r9 = r1
            r1 = r11
            r11 = r7
            r7 = r6
            r6 = r5
            r5 = r3
            r3 = r9
        L6e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L8d
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L8d
            if (r11 == 0) goto L90
            java.lang.Object r11 = r5.next()     // Catch: java.lang.Throwable -> L8d
            int r8 = r7.compare(r3, r11)     // Catch: java.lang.Throwable -> L8d
            if (r8 <= 0) goto L87
            r3 = r5
            r5 = r6
            r6 = r7
            r9 = r1
            r1 = r11
            r11 = r9
            goto L56
        L87:
            r11 = r1
            r1 = r3
            r3 = r5
            r5 = r6
            r6 = r7
            goto L56
        L8d:
            r11 = move-exception
            r2 = r6
            goto L9d
        L90:
            r6.c(r2)
            r0 = r3
        L94:
            return r0
        L95:
            r11 = move-exception
            r2 = r3
            goto L9d
        L98:
            kotlin.C42729a0.b(r11)
            throw r2     // Catch: java.lang.Throwable -> L9c
        L9c:
            r11 = move-exception
        L9d:
            throw r11     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r2, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43109m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
