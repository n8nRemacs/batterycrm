package io.ktor.client.engine;

import com.avito.android.remote.model.AdvertStatus;
import io.ktor.client.request.e0;
import io.ktor.util.InterfaceC41603j0;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: HttpClientEngine.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u000b\u0010\r\u001a\u00020\f8BX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lio/ktor/client/engine/a;", "Lkotlinx/coroutines/T;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/e0;", "requestData", "Lkotlin/G0;", "checkExtensions", "(Lio/ktor/client/request/e0;)V", "Lio/ktor/client/request/k0;", "executeWithinCallContext", "(Lio/ktor/client/request/e0;)Lio/ktor/client/request/k0;", "", AdvertStatus.CLOSED, "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.engine.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC41434a extends T, Closeable {

    /* compiled from: HttpClientEngine.kt */
    @s0
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.client.engine.a$a, reason: collision with other inner class name */
    public static final class C11397a {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object a(io.ktor.client.engine.InterfaceC41434a r7, io.ktor.client.request.e0 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
            /*
                boolean r0 = r9 instanceof io.ktor.client.engine.C41435b
                if (r0 == 0) goto L13
                r0 = r9
                io.ktor.client.engine.b r0 = (io.ktor.client.engine.C41435b) r0
                int r1 = r0.f398889t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f398889t = r1
                goto L18
            L13:
                io.ktor.client.engine.b r0 = new io.ktor.client.engine.b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f398888s
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f398889t
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L3d
                if (r2 == r3) goto L35
                if (r2 != r4) goto L2d
                kotlin.C42729a0.b(r9)
                goto La2
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                io.ktor.client.request.e0 r8 = r0.f398887r
                io.ktor.client.engine.a r7 = r0.f398886q
                kotlin.C42729a0.b(r9)
                goto L80
            L3d:
                kotlin.C42729a0.b(r9)
                kotlinx.coroutines.N0 r9 = r8.f399718e
                r0.f398886q = r7
                r0.f398887r = r8
                r0.f398889t = r3
                kotlinx.coroutines.S r2 = io.ktor.client.engine.o.f398907a
                kotlinx.coroutines.P0 r2 = new kotlinx.coroutines.P0
                r2.<init>(r9)
                kotlin.coroutines.CoroutineContext r9 = r7.getF399773c()
                kotlin.coroutines.CoroutineContext r9 = r9.plus(r2)
                kotlinx.coroutines.S r5 = io.ktor.client.engine.o.f398907a
                kotlin.coroutines.CoroutineContext r9 = r9.plus(r5)
                kotlin.coroutines.CoroutineContext r5 = r0.getF401105b()
                kotlinx.coroutines.N0$b r6 = kotlinx.coroutines.N0.f410716u2
                kotlin.coroutines.CoroutineContext$Element r5 = r5.get(r6)
                kotlinx.coroutines.N0 r5 = (kotlinx.coroutines.N0) r5
                if (r5 != 0) goto L6c
                goto L7d
            L6c:
                io.ktor.client.engine.z r6 = new io.ktor.client.engine.z
                r6.<init>(r2)
                kotlinx.coroutines.o0 r3 = r5.Q(r3, r3, r6)
                io.ktor.client.engine.y r5 = new io.ktor.client.engine.y
                r5.<init>(r3)
                r2.k(r5)
            L7d:
                if (r9 != r1) goto L80
                goto La3
            L80:
                kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
                io.ktor.client.engine.u r2 = new io.ktor.client.engine.u
                r2.<init>(r9)
                kotlin.coroutines.CoroutineContext r9 = r9.plus(r2)
                io.ktor.client.engine.c r2 = new io.ktor.client.engine.c
                r3 = 0
                r2.<init>(r7, r8, r3)
                kotlinx.coroutines.a0 r7 = kotlinx.coroutines.C43259k.b(r7, r9, r2, r4)
                r0.f398886q = r3
                r0.f398887r = r3
                r0.f398889t = r4
                java.lang.Object r9 = r7.F(r0)
                if (r9 != r1) goto La2
                goto La3
            La2:
                r1 = r9
            La3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.InterfaceC41434a.C11397a.a(io.ktor.client.engine.a, io.ktor.client.request.e0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    @InterfaceC41603j0
    void G1(@Y61.k io.ktor.client.a aVar);

    @InterfaceC41603j0
    @Y61.l
    Object b1(@Y61.k e0 e0Var, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    Set<h<?>> m4();
}
