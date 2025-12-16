package cO0;

import android.os.CountDownTimer;
import cO0.InterfaceC27080d;
import kotlin.Metadata;

/* compiled from: TimerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcO0/a;", "Landroid/os/CountDownTimer;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cO0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CountDownTimerC27077a extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC27078b<Object> f57847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC27077a(AbstractC27078b<Object> abstractC27078b, long j12, long j13) {
        super(j12, j13);
        this.f57847a = abstractC27078b;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        onTick(0L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j12) {
        InterfaceC27080d.a aVarA = InterfaceC27080d.a.a(j12);
        AbstractC27078b<Object> abstractC27078b = this.f57847a;
        abstractC27078b.f57850c.K5(abstractC27078b.a(aVarA));
    }
}
