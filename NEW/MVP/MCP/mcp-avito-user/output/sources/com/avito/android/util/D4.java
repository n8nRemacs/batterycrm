package com.avito.android.util;

import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;

/* compiled from: Retries.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/avito/android/remote/model/TypedResult;", "invoke", "(Lcom/avito/android/remote/model/TypedResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* loaded from: classes5.dex */
public final class D4 extends kotlin.jvm.internal.N implements Y41.l {
    static {
        kotlin.jvm.internal.L.l();
        throw null;
    }

    public D4() {
        super(1);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((TypedResult) obj) instanceof TypedResult.Error);
    }
}
