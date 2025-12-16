package com.avito.android.analytics.clickstream;

import androidx.work.impl.utils.CallableC23597g;
import kotlin.Metadata;

/* compiled from: ClickStreamSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "eventsBatchCount", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/analytics/clickstream/H$c;", "apply", "(I)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class L<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f89753b;

    public L(Q q12) {
        this.f89753b = q12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Q q12 = this.f89753b;
        q12.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC23597g(iIntValue, 1, q12)).n(new K(q12));
    }
}
