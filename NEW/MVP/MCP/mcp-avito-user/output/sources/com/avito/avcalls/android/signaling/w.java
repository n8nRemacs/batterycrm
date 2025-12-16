package com.avito.avcalls.android.signaling;

import com.avito.avcalls.android.signaling.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SignalingResult.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w {
    @Y61.k
    public static final <T, R> v<R> a(@Y61.k v<T> vVar, @Y61.k Y41.l<? super T, ? extends R> lVar) {
        if (vVar instanceof v.c) {
            return new v.c(lVar.invoke(((v.c) vVar).f332215a));
        }
        if (vVar instanceof v.b) {
            return new v.b(((v.b) vVar).f332214a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
