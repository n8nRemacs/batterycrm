package com.avito.android.clientEventBus.useCase;

import com.avito.android.clientEventBus.SubscribeToTopicException;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import l41.o;

/* compiled from: SubscribeToActiveTopicsUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFo/b;", "response", "Lio/reactivex/rxjava3/core/g;", "apply", "(LFo/b;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final e<T, R> f118576b = new e<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((Fo.b) obj).getOk() ? C41823n.f402260b : AbstractC41768a.o(new SubscribeToTopicException(null, 1, null));
    }
}
