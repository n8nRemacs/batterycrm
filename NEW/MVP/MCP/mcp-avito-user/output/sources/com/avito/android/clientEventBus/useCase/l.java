package com.avito.android.clientEventBus.useCase;

import Go.InterfaceC13901a;
import Hq0.C14020b;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.completable.M;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SubscribeToEventUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/clientEventBus/useCase/l;", "", "_avito_client-event-bus_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.repository.clientEventBus.a f118588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13901a f118589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f118590c;

    @Inject
    public l(@Y61.k com.avito.android.clientEventBus.repository.clientEventBus.a aVar, @Y61.k InterfaceC13901a interfaceC13901a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f118588a = aVar;
        this.f118589b = interfaceC13901a;
        this.f118590c = interfaceC35745a5;
    }

    @Y61.k
    public final M a(@Y61.k mx0.e eVar) {
        List listSingletonList = Collections.singletonList(eVar);
        return new C42007e(new C14020b(6, this, listSingletonList)).o(j.f118586b).s(k.f118587b).k(new GL.a(9, this, listSingletonList)).x(this.f118590c.a());
    }
}
