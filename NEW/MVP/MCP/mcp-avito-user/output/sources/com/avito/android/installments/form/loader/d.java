package com.avito.android.installments.form.loader;

import android.os.CountDownTimer;
import com.avito.android.lib.design.circular_counter.CircularCounter;
import kotlin.Metadata;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: FormLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/loader/d;", "Landroid/os/CountDownTimer;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public long f172717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f172718b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, long j12, long j13) {
        super(j12, j13);
        this.f172718b = cVar;
        long j14 = cVar.f172710d;
        e.a aVar = e.f410651c;
        this.f172717a = e.l(j14, DurationUnit.f410634f);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j12) {
        long j13 = j12 / 1000;
        long j14 = this.f172717a;
        c cVar = this.f172718b;
        if (j14 != j13) {
            this.f172717a = j13;
            CircularCounter circularCounter = cVar.f172711e;
            if (circularCounter != null) {
                circularCounter.setCounter(Integer.valueOf((int) j13));
            }
        }
        float fE2 = j12 / e.e(cVar.f172710d);
        CircularCounter circularCounter2 = cVar.f172711e;
        if (circularCounter2 != null) {
            circularCounter2.setProgress(Float.valueOf(fE2));
        }
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
    }
}
