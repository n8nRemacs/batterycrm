package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: Channels.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final /* synthetic */ class C43219z {

    /* compiled from: Channels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    /* renamed from: kotlinx.coroutines.flow.z$a */
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC43172j f411832q;

        /* renamed from: r, reason: collision with root package name */
        public kotlinx.coroutines.channels.K0 f411833r;

        /* renamed from: s, reason: collision with root package name */
        public InterfaceC43125y f411834s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f411835t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f411836u;

        /* renamed from: v, reason: collision with root package name */
        public int f411837v;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411836u = obj;
            this.f411837v |= BeduinInputModel.MIN_TEXT_VERSION;
            return C43219z.a(null, null, false, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x0030, B:25:0x0057, B:29:0x006c, B:31:0x0074, B:20:0x0048, B:24:0x0053), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0086 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(kotlinx.coroutines.flow.InterfaceC43172j<? super T> r6, kotlinx.coroutines.channels.K0<? extends T> r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.G0> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C43219z.a
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.z$a r0 = (kotlinx.coroutines.flow.C43219z.a) r0
            int r1 = r0.f411837v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f411837v = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.z$a r0 = new kotlinx.coroutines.flow.z$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f411836u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f411837v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            boolean r8 = r0.f411835t
            kotlinx.coroutines.channels.y r6 = r0.f411834s
            kotlinx.coroutines.channels.K0 r7 = r0.f411833r
            kotlinx.coroutines.flow.j r2 = r0.f411832q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L36
        L33:
            r9 = r6
            r6 = r2
            goto L57
        L36:
            r6 = move-exception
            goto L92
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            boolean r8 = r0.f411835t
            kotlinx.coroutines.channels.y r6 = r0.f411834s
            kotlinx.coroutines.channels.K0 r7 = r0.f411833r
            kotlinx.coroutines.flow.j r2 = r0.f411832q
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L36
            goto L6c
        L4c:
            kotlin.C42729a0.b(r9)
            boolean r9 = r6 instanceof kotlinx.coroutines.flow.u2
            if (r9 != 0) goto L9a
            kotlinx.coroutines.channels.y r9 = r7.iterator()     // Catch: java.lang.Throwable -> L36
        L57:
            r0.f411832q = r6     // Catch: java.lang.Throwable -> L36
            r0.f411833r = r7     // Catch: java.lang.Throwable -> L36
            r0.f411834s = r9     // Catch: java.lang.Throwable -> L36
            r0.f411835t = r8     // Catch: java.lang.Throwable -> L36
            r0.f411837v = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L68
            return r1
        L68:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L6c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L36
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L89
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L36
            r0.f411832q = r2     // Catch: java.lang.Throwable -> L36
            r0.f411833r = r7     // Catch: java.lang.Throwable -> L36
            r0.f411834s = r6     // Catch: java.lang.Throwable -> L36
            r0.f411835t = r8     // Catch: java.lang.Throwable -> L36
            r0.f411837v = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r9 != r1) goto L33
            return r1
        L89:
            if (r8 == 0) goto L8f
            r6 = 0
            r7.c(r6)
        L8f:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L92:
            throw r6     // Catch: java.lang.Throwable -> L93
        L93:
            r9 = move-exception
            if (r8 == 0) goto L99
            kotlinx.coroutines.channels.D.a(r7, r6)
        L99:
            throw r9
        L9a:
            kotlinx.coroutines.flow.u2 r6 = (kotlinx.coroutines.flow.u2) r6
            java.lang.Throwable r6 = r6.f411788b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C43219z.a(kotlinx.coroutines.flow.j, kotlinx.coroutines.channels.K0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
