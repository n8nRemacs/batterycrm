package com.avito.android.util.rx3;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ShouldRetryException;
import kotlin.Metadata;

/* compiled from: Retries.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0005 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0002*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.util.rx3.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35931x0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, io.reactivex.rxjava3.core.O<? extends TypedResult<Object>>> {
    static {
        kotlin.jvm.internal.L.l();
        throw null;
    }

    public C35931x0() {
        super(1);
    }

    @Override // Y41.l
    public final io.reactivex.rxjava3.core.O<? extends TypedResult<Object>> invoke(Throwable th2) {
        Throwable th3 = th2;
        return th3 instanceof ShouldRetryException ? io.reactivex.rxjava3.core.I.q(((ShouldRetryException) th3).f318735b) : io.reactivex.rxjava3.core.I.l(th3);
    }
}
