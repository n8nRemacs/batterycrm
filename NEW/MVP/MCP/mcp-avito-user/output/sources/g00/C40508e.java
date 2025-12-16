package g00;

import Y61.k;
import g00.InterfaceC40507d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TimerTime.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: g00.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C40508e {
    public static final long a(@k InterfaceC40507d interfaceC40507d) {
        if (interfaceC40507d instanceof InterfaceC40507d.b) {
            return kotlin.math.b.c(((InterfaceC40507d.b) interfaceC40507d).f396215a * 1000);
        }
        if (interfaceC40507d instanceof InterfaceC40507d.a) {
            return ((InterfaceC40507d.a) interfaceC40507d).f396214a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float b(@k InterfaceC40507d interfaceC40507d) {
        if (interfaceC40507d instanceof InterfaceC40507d.b) {
            return ((InterfaceC40507d.b) interfaceC40507d).f396215a;
        }
        if (interfaceC40507d instanceof InterfaceC40507d.a) {
            return ((InterfaceC40507d.a) interfaceC40507d).f396214a / 1000.0f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
