package io.ktor.util;

import com.huawei.hms.adapter.internal.AvailableCode;
import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.core.C41641n;
import java.io.Closeable;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ByteChannels.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 1, 1, 1}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$use$iv", "closed$iv"}, s = {"L$0", "L$0", "L$1", "I$0"})
/* renamed from: io.ktor.util.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41604k extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Closeable f400477q;

    /* renamed from: r, reason: collision with root package name */
    public int f400478r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f400479s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W0 f400480t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C41619a f400481u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C41619a f400482v;

    /* compiled from: ByteChannels.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$1$1", f = "ByteChannels.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.k$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f400483q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C41619a f400484r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C41641n f400485s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C41619a c41619a, C41641n c41641n, Continuation continuation) {
            super(2, continuation);
            this.f400484r = c41619a;
            this.f400485s = c41641n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f400484r, this.f400485s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f400483q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C41641n c41641nG = this.f400485s.G();
                this.f400483q = 1;
                if (this.f400484r.t(c41641nG, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ByteChannels.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$1$2", f = "ByteChannels.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.k$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f400486q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C41619a f400487r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C41641n f400488s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C41619a c41619a, C41641n c41641n, Continuation continuation) {
            super(2, continuation);
            this.f400487r = c41619a;
            this.f400488s = c41641n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f400487r, this.f400488s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f400486q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C41641n c41641nG = this.f400488s.G();
                this.f400486q = 1;
                if (this.f400487r.t(c41641nG, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41604k(W0 w02, C41619a c41619a, C41619a c41619a2, Continuation continuation) {
        super(2, continuation);
        this.f400480t = w02;
        this.f400481u = c41619a;
        this.f400482v = c41619a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C41604k c41604k = new C41604k(this.f400480t, this.f400481u, this.f400482v, continuation);
        c41604k.f400479s = obj;
        return c41604k;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C41604k) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:30:0x008e, B:19:0x003f, B:21:0x0045, B:25:0x0056, B:39:0x009e, B:42:0x00ab, B:38:0x009d, B:14:0x0030, B:7:0x001d, B:29:0x008c, B:26:0x0059, B:32:0x0093, B:36:0x009b, B:35:0x0098), top: B:52:0x000f, inners: #0, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:30:0x008e, B:19:0x003f, B:21:0x0045, B:25:0x0056, B:39:0x009e, B:42:0x00ab, B:38:0x009d, B:14:0x0030, B:7:0x001d, B:29:0x008c, B:26:0x0059, B:32:0x0093, B:36:0x009b, B:35:0x0098), top: B:52:0x000f, inners: #0, #2, #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0089 -> B:29:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            r1 = 2
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r12.f400478r
            io.ktor.utils.io.a r4 = r12.f400482v
            io.ktor.utils.io.a r5 = r12.f400481u
            r6 = 0
            io.ktor.utils.io.W0 r7 = r12.f400480t
            if (r3 == 0) goto L38
            if (r3 == r0) goto L2c
            if (r3 != r1) goto L24
            java.io.Closeable r3 = r12.f400477q
            java.io.Closeable r3 = (java.io.Closeable) r3
            java.lang.Object r8 = r12.f400479s
            kotlinx.coroutines.T r8 = (kotlinx.coroutines.T) r8
            kotlin.C42729a0.b(r13)     // Catch: java.lang.Throwable -> L21
            goto L8c
        L21:
            r13 = move-exception
            goto L93
        L24:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2c:
            java.lang.Object r3 = r12.f400479s
            kotlinx.coroutines.T r3 = (kotlinx.coroutines.T) r3
            kotlin.C42729a0.b(r13)     // Catch: java.lang.Throwable -> L35
            r8 = r3
            goto L56
        L35:
            r13 = move-exception
            goto Lac
        L38:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f400479s
            kotlinx.coroutines.T r13 = (kotlinx.coroutines.T) r13
        L3f:
            boolean r3 = r7.x()     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L9e
            r12.f400479s = r13     // Catch: java.lang.Throwable -> L35
            r12.f400477q = r6     // Catch: java.lang.Throwable -> L35
            r12.f400478r = r0     // Catch: java.lang.Throwable -> L35
            r8 = 4096(0x1000, double:2.0237E-320)
            java.lang.Object r3 = r7.I(r8, r12)     // Catch: java.lang.Throwable -> L35
            if (r3 != r2) goto L54
            return r2
        L54:
            r8 = r13
            r13 = r3
        L56:
            r3 = r13
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L35
            r13 = r3
            io.ktor.utils.io.core.n r13 = (io.ktor.utils.io.core.C41641n) r13     // Catch: java.lang.Throwable -> L21
            io.ktor.util.k$a r9 = new io.ktor.util.k$a     // Catch: java.lang.Throwable -> L21
            r9.<init>(r5, r13, r6)     // Catch: java.lang.Throwable -> L21
            r10 = 3
            kotlinx.coroutines.a0 r9 = kotlinx.coroutines.C43259k.b(r8, r6, r9, r10)     // Catch: java.lang.Throwable -> L21
            io.ktor.util.k$b r11 = new io.ktor.util.k$b     // Catch: java.lang.Throwable -> L21
            r11.<init>(r4, r13, r6)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.a0 r13 = kotlinx.coroutines.C43259k.b(r8, r6, r11, r10)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.a0[] r10 = new kotlinx.coroutines.InterfaceC43076a0[r1]     // Catch: java.lang.Throwable -> L21
            r11 = 0
            r10[r11] = r9     // Catch: java.lang.Throwable -> L21
            r10[r0] = r13     // Catch: java.lang.Throwable -> L21
            java.util.List r13 = kotlin.collections.C42745f0.U(r10)     // Catch: java.lang.Throwable -> L21
            java.util.Collection r13 = (java.util.Collection) r13     // Catch: java.lang.Throwable -> L21
            r12.f400479s = r8     // Catch: java.lang.Throwable -> L21
            r9 = r3
            java.io.Closeable r9 = (java.io.Closeable) r9     // Catch: java.lang.Throwable -> L21
            r12.f400477q = r9     // Catch: java.lang.Throwable -> L21
            r12.f400478r = r1     // Catch: java.lang.Throwable -> L21
            java.lang.Object r13 = kotlinx.coroutines.C43225h.a(r13, r12)     // Catch: java.lang.Throwable -> L21
            if (r13 != r2) goto L8c
            return r2
        L8c:
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L21
            r3.close()     // Catch: java.lang.Throwable -> L35
            r13 = r8
            goto L3f
        L93:
            r3.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r0 = move-exception
            io.ktor.utils.io.core.C41646t.a(r13, r0)     // Catch: java.lang.Throwable -> L9c
        L9b:
            throw r13     // Catch: java.lang.Throwable -> L9c
        L9c:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L35
        L9e:
            java.lang.Throwable r13 = r7.g()     // Catch: java.lang.Throwable -> L35
            if (r13 != 0) goto Lab
        La4:
            r5.h(r6)
            r4.h(r6)
            goto Lb6
        Lab:
            throw r13     // Catch: java.lang.Throwable -> L35
        Lac:
            r7.f(r13)     // Catch: java.lang.Throwable -> Lb9
            r5.h(r13)     // Catch: java.lang.Throwable -> Lb9
            r4.h(r13)     // Catch: java.lang.Throwable -> Lb9
            goto La4
        Lb6:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        Lb9:
            r13 = move-exception
            r5.h(r6)
            r4.h(r6)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.C41604k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
