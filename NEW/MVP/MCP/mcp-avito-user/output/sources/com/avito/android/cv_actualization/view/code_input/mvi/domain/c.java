package com.avito.android.cv_actualization.view.code_input.mvi.domain;

import Y61.k;
import h31.j;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.rx3.y;

/* compiled from: JsxCvActualizationTimerInteractor.kt */
@j
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/mvi/domain/c;", "", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.code_confirmation.code_confirmation.timer.a f131200a;

    @Inject
    public c(@k com.avito.android.code_confirmation.code_confirmation.timer.a aVar) {
        this.f131200a = aVar;
    }

    @k
    public final X a(long j12) {
        return new X(new a(y.a(this.f131200a.a(TimeUnit.SECONDS.toMillis(j12)))), new b(3, null));
    }
}
