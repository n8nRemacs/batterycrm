package g00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import g00.InterfaceC40507d;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: TimerInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lg00/b;", "InternalAction", "Lg00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g00.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC40505b<InternalAction> implements InterfaceC40506c<InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40507d f396211a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public CountDownTimerC40504a f396212b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f396213c = f2.b(0, 1, null, 5);

    public AbstractC40505b(@k InterfaceC40507d interfaceC40507d) {
        this.f396211a = interfaceC40507d;
    }

    public abstract Object a(@k InterfaceC40507d.a aVar);

    public final void b(@k InterfaceC40507d.b bVar) {
        CountDownTimerC40504a countDownTimerC40504a = this.f396212b;
        if (countDownTimerC40504a != null) {
            countDownTimerC40504a.cancel();
        }
        CountDownTimerC40504a countDownTimerC40504a2 = new CountDownTimerC40504a(this, C40508e.a(bVar), C40508e.a(this.f396211a));
        this.f396212b = countDownTimerC40504a2;
        countDownTimerC40504a2.start();
    }
}
