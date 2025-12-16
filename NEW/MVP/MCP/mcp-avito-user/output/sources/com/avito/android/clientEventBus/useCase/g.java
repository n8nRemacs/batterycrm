package com.avito.android.clientEventBus.useCase;

import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.List;
import kotlin.Metadata;
import l41.o;

/* compiled from: SubscribeToActiveTopicsUseCase.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lmx0/e;", "kotlin.jvm.PlatformType", "eventTypes", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f118578b;

    public g(h hVar) {
        this.f118578b = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return C41823n.f402260b;
        }
        h hVar = this.f118578b;
        return hVar.f118579a.a(list).o(e.f118576b).l(new f(hVar)).x(hVar.f118581c.a());
    }
}
