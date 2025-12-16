package com.avito.avcalls.signaling;

import com.avito.avcalls.signaling.x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SignalingResult.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y {
    @Y61.k
    public static final <T, R> x<R> a(@Y61.k x<T> xVar, @Y61.k Y41.l<? super T, ? extends R> lVar) {
        if (xVar instanceof x.c) {
            return new x.c(lVar.invoke(((x.c) xVar).f333443a));
        }
        if (xVar instanceof x.b) {
            return new x.b(((x.b) xVar).f333442a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
