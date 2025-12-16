package io.ktor.utils.io;

import io.ktor.utils.io.core.C41640m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ByteWriteChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41655f1 {
    @Y61.l
    public static final Object a(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k byte[] bArr, @Y61.k ContinuationImpl continuationImpl) {
        Object objD = interfaceC41649d1.D(bArr, 0, bArr.length, continuationImpl);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : kotlin.G0.f406611a;
    }

    @Y61.l
    public static final Object b(@Y61.k X x12, @Y61.k String str, @Y61.k Continuation continuation) {
        C41640m c41640m = new C41640m(null, 1, null);
        try {
            io.ktor.utils.io.core.S.d(c41640m, str);
            Object objT = x12.t(c41640m.y(), (ContinuationImpl) continuation);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : kotlin.G0.f406611a;
        } catch (Throwable th2) {
            c41640m.close();
            throw th2;
        }
    }
}
