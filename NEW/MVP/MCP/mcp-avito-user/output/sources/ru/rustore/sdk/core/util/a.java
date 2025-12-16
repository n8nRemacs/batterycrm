package ru.rustore.sdk.core.util;

import kotlin.Metadata;
import kotlin.Z;

/* compiled from: CancellableContinuationExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {
    public static final void a(@Y61.k kotlinx.coroutines.r rVar, Object obj) {
        if (rVar.isActive()) {
            int i12 = Z.f406624c;
            rVar.resumeWith(obj);
        }
    }
}
