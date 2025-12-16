package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.persistence.messenger.Z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocallyDeletedChannelsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/persistence/messenger/Z;", "metaInfo", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/messenger/channels/mvi/interactor/z;", "apply", "(Lcom/avito/android/persistence/messenger/Z;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final E<T, R> f187625b = new E<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Z z12 = (Z) obj;
        Long l12 = z12.f215385e;
        if (l12 == null) {
            return U.f403867b;
        }
        return io.reactivex.rxjava3.core.z.c0(new z(l12.longValue(), z12.f215382b, com.avito.android.messenger.util.i.d(z12.f215381a, z12.f215387g, z12.f215386f)));
    }
}
