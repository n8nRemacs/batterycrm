package io.ktor.util;

import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.InterfaceC41649d1;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.core.C41641n;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ByteChannels.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1, 1, 1, 2, 2}, l = {59, 61, 62}, m = "invokeSuspend", n = {"$this$use$iv", "it", "closed$iv", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$4", "I$0", "L$0", "I$0"})
/* renamed from: io.ktor.util.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41600i extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Closeable f400464q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC41649d1 f400465r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC41649d1 f400466s;

    /* renamed from: t, reason: collision with root package name */
    public W0 f400467t;

    /* renamed from: u, reason: collision with root package name */
    public C41641n f400468u;

    /* renamed from: v, reason: collision with root package name */
    public int f400469v;

    /* renamed from: w, reason: collision with root package name */
    public int f400470w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ W0 f400471x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C41619a f400472y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C41619a f400473z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41600i(W0 w02, C41619a c41619a, C41619a c41619a2, Continuation continuation) {
        super(2, continuation);
        this.f400471x = w02;
        this.f400472y = c41619a;
        this.f400473z = c41619a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C41600i(this.f400471x, this.f400472y, this.f400473z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C41600i) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:30|(1:32)|76|34|73|35|(1:37)(4:38|86|39|(1:41)(10:42|43|52|24|(2:26|28)|62|(0)|64|68|69))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        r9 = r2;
        r10 = r3;
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:52:0x00e0, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:30:0x006c, B:33:0x0081, B:61:0x00f0, B:62:0x00f1, B:65:0x00fe, B:19:0x0050, B:34:0x0084, B:51:0x00d3, B:55:0x00e6, B:59:0x00ee, B:58:0x00eb), top: B:75:0x0050, inners: #2, #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:52:0x00e0, B:24:0x005a, B:26:0x0060, B:28:0x0066, B:30:0x006c, B:33:0x0081, B:61:0x00f0, B:62:0x00f1, B:65:0x00fe, B:19:0x0050, B:34:0x0084, B:51:0x00d3, B:55:0x00e6, B:59:0x00ee, B:58:0x00eb), top: B:75:0x0050, inners: #2, #6, #8 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:43:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d3 -> B:52:0x00e0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.C41600i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
