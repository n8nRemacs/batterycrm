package com.avito.android.messenger.channels.mvi.interactor;

import com.avito.android.messenger.channels.mvi.interactor.l;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.h0;
import ru.avito.messenger.api.entity.FoldersCountersResponse;

/* compiled from: FoldersInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "", "", "", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f187668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f187669c;

    public w(l lVar, LinkedHashMap linkedHashMap) {
        this.f187668b = lVar;
        this.f187669c = linkedHashMap;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        l lVar = this.f187668b;
        if (!lVar.f187653J.e()) {
            return io.reactivex.rxjava3.core.I.q(P0.c());
        }
        return lVar.f187652E.B(this.f187669c, null).r(new l.b(new h0() { // from class: com.avito.android.messenger.channels.mvi.interactor.v
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj2) {
                return ((FoldersCountersResponse) obj2).getCounters();
            }
        })).u(new com.avito.android.analytics.clickstream.I(27));
    }
}
