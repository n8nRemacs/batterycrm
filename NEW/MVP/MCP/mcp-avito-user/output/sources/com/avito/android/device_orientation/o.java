package com.avito.android.device_orientation;

import android.content.Context;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.internal.operators.flowable.C41831a0;
import io.reactivex.rxjava3.internal.operators.flowable.C41888t1;
import io.reactivex.rxjava3.internal.operators.flowable.O;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StoppableRotationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/device_orientation/o;", "Lcom/avito/android/device_orientation/i;", "_avito_device-orientation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f139246a;

    @Inject
    public o(@Y61.k Context context) {
        this.f139246a = new b(context);
    }

    @Override // com.avito.android.device_orientation.e
    @Y61.k
    public final C41831a0 a() {
        C41888t1 c41888t1 = new C41888t1(this.f139246a.f139235a.G0(BackpressureStrategy.f401954c).b(j.f139241b).k(k.f139242b), io.reactivex.rxjava3.internal.functions.a.h(-10), new l(this));
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        Objects.requireNonNull(oVar, "keySelector is null");
        return new O(c41888t1, oVar, io.reactivex.rxjava3.internal.functions.b.f402016a).k(m.f139244b).b(n.f139245b);
    }

    @Override // com.avito.android.device_orientation.i
    public final void start() {
        this.f139246a.f139236b.enable();
    }

    @Override // com.avito.android.device_orientation.i
    public final void stop() {
        this.f139246a.f139236b.disable();
    }
}
