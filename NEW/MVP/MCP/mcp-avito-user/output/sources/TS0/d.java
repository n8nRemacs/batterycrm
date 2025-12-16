package ts0;

import android.os.CountDownTimer;
import kotlin.Metadata;

/* compiled from: CounterUp.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts0/d;", "Landroid/os/CountDownTimer;", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f439610a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j12) {
        super(31536000000L, j12);
        this.f439610a = eVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        e eVar = this.f439610a;
        com.avito.android.gig_timer_widget.a aVar = eVar.f439614d;
        if (aVar != null) {
            e.a(eVar, 0L, aVar);
            aVar.s0();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j12) {
        e eVar = this.f439610a;
        com.avito.android.gig_timer_widget.a aVar = eVar.f439614d;
        if (aVar != null) {
            e.a(eVar, j12, aVar);
            aVar.a();
        }
    }
}
