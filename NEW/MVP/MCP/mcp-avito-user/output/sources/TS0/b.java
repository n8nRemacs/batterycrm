package ts0;

import android.os.CountDownTimer;
import kotlin.Metadata;

/* compiled from: Counter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lts0/b;", "Landroid/os/CountDownTimer;", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C48712a f439609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j12, C48712a c48712a, long j13) {
        super(j12, j13);
        this.f439609a = c48712a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.LinearLayout, ts0.g] */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C48712a c48712a = this.f439609a;
        ?? r12 = c48712a.f439607f;
        if (r12 != 0) {
            C48712a.a(c48712a, 0L, r12);
            r12.s0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.LinearLayout, ts0.g] */
    @Override // android.os.CountDownTimer
    public final void onTick(long j12) {
        C48712a c48712a = this.f439609a;
        ?? r12 = c48712a.f439607f;
        if (r12 != 0) {
            C48712a.a(c48712a, j12, r12);
            r12.a();
        }
    }
}
