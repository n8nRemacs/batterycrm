package io.ktor.websocket;

import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;
import kotlinx.coroutines.channels.K0;
import kotlinx.coroutines.channels.M0;

/* compiled from: DefaultWebSocketSession.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {352, 172, 226, 178, 179, 181, 196, 211, 226, 226, 226, 226}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frame", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
/* renamed from: io.ktor.websocket.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41719e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C41716b f401524A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C43108m f401525B;

    /* renamed from: q, reason: collision with root package name */
    public Serializable f401526q;

    /* renamed from: r, reason: collision with root package name */
    public Object f401527r;

    /* renamed from: s, reason: collision with root package name */
    public l0.a f401528s;

    /* renamed from: t, reason: collision with root package name */
    public C41716b f401529t;

    /* renamed from: u, reason: collision with root package name */
    public M0 f401530u;

    /* renamed from: v, reason: collision with root package name */
    public K0 f401531v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC43125y f401532w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC41723i f401533x;

    /* renamed from: y, reason: collision with root package name */
    public int f401534y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f401535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41719e(C41716b c41716b, C43108m c43108m, Continuation continuation) {
        super(2, continuation);
        this.f401524A = c41716b;
        this.f401525B = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C41719e c41719e = new C41719e(this.f401524A, this.f401525B, continuation);
        c41719e.f401535z = obj;
        return c41719e;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C41719e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0204, code lost:
    
        r0 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x034c A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0040, blocks: (B:9:0x003b, B:37:0x0136, B:39:0x013e, B:41:0x0166, B:43:0x016e, B:45:0x017a, B:46:0x017c, B:49:0x0199, B:60:0x01de, B:62:0x01e2, B:64:0x01e8, B:67:0x0202, B:69:0x0211, B:71:0x0215, B:74:0x022f, B:106:0x034c, B:21:0x00ac, B:25:0x00c9, B:28:0x00e4), top: B:156:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:9:0x003b, B:37:0x0136, B:39:0x013e, B:41:0x0166, B:43:0x016e, B:45:0x017a, B:46:0x017c, B:49:0x0199, B:60:0x01de, B:62:0x01e2, B:64:0x01e8, B:67:0x0202, B:69:0x0211, B:71:0x0215, B:74:0x022f, B:106:0x034c, B:21:0x00ac, B:25:0x00c9, B:28:0x00e4), top: B:156:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025f A[Catch: all -> 0x0078, TryCatch #3 {all -> 0x0078, blocks: (B:78:0x025b, B:80:0x025f, B:82:0x0263, B:83:0x0265, B:85:0x0269, B:87:0x0273, B:88:0x028b, B:90:0x0290, B:91:0x0298, B:93:0x029e, B:94:0x02ac, B:98:0x02d2, B:99:0x0319, B:101:0x031f, B:102:0x032a, B:15:0x0073), top: B:159:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028b A[Catch: all -> 0x0078, TryCatch #3 {all -> 0x0078, blocks: (B:78:0x025b, B:80:0x025f, B:82:0x0263, B:83:0x0265, B:85:0x0269, B:87:0x0273, B:88:0x028b, B:90:0x0290, B:91:0x0298, B:93:0x029e, B:94:0x02ac, B:98:0x02d2, B:99:0x0319, B:101:0x031f, B:102:0x032a, B:15:0x0073), top: B:159:0x0073 }] */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, io.ktor.websocket.i] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r4v39, types: [T, io.ktor.utils.io.core.m] */
    /* JADX WARN: Type inference failed for: r4v42, types: [kotlinx.coroutines.channels.M0, kotlinx.coroutines.channels.m] */
    /* JADX WARN: Type inference failed for: r4v46, types: [kotlinx.coroutines.channels.M0, kotlinx.coroutines.channels.m] */
    /* JADX WARN: Type inference failed for: r5v15, types: [io.ktor.websocket.b, java.io.Serializable, java.lang.Object, java.lang.Throwable, java.util.concurrent.CancellationException, kotlin.jvm.internal.l0$a, kotlinx.coroutines.channels.K0, kotlinx.coroutines.channels.M0, kotlinx.coroutines.channels.y] */
    /* JADX WARN: Type inference failed for: r5v16, types: [io.ktor.websocket.b, kotlin.jvm.internal.l0$a, kotlinx.coroutines.channels.K0, kotlinx.coroutines.channels.M0, kotlinx.coroutines.channels.y] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v7, types: [io.ktor.utils.io.pool.h, io.ktor.websocket.i, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15, types: [kotlinx.coroutines.channels.M0] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.M0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.channels.M0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01e6 -> B:68:0x0204). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x022c -> B:68:0x0204). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.C41719e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
