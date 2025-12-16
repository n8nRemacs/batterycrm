package com.avito.android.code_confirmation.code_confirmation.timer;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.flowable.G0;
import io.reactivex.rxjava3.internal.operators.flowable.P1;
import io.reactivex.rxjava3.internal.operators.observable.C41960j0;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;

/* compiled from: RxTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/timer/d;", "Lcom/avito/android/code_confirmation/code_confirmation/timer/a;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f119636a;

    @Inject
    public d(@k InterfaceC35745a5 interfaceC35745a5) {
        this.f119636a = interfaceC35745a5;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.timer.a
    @k
    public final C41960j0 a(long j12) {
        G0 g0K = z.q(z.c0(0L), z.a0(300L, 300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).x0(this.f119636a.c())).G0(BackpressureStrategy.f401954c).k(new b(j12, this));
        r rVar = c.f119635b;
        Objects.requireNonNull(rVar, "predicate is null");
        return new C41960j0(new P1(g0K, rVar));
    }
}
