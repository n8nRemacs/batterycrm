package g00;

import android.os.CountDownTimer;
import g00.InterfaceC40507d;
import kotlin.Metadata;

/* compiled from: TimerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg00/a;", "Landroid/os/CountDownTimer;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CountDownTimerC40504a extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC40505b<Object> f396210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC40504a(AbstractC40505b<Object> abstractC40505b, long j12, long j13) {
        super(j12, j13);
        this.f396210a = abstractC40505b;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        onTick(0L);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j12) {
        InterfaceC40507d.a aVarA = InterfaceC40507d.a.a(j12);
        AbstractC40505b<Object> abstractC40505b = this.f396210a;
        abstractC40505b.f396213c.K5(abstractC40505b.a(aVarA));
    }
}
