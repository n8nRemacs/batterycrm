package q71;

import Y41.l;
import Y61.k;
import kotlin.G0;
import kotlin.Metadata;
import o71.e;
import org.koin.core.error.KoinAppAlreadyStartedException;
import t71.InterfaceC48512a;

/* compiled from: DefaultContextExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: q71.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C47248a {
    @InterfaceC48512a
    @k
    public static final e a(@k l<? super e, G0> lVar) {
        e eVar;
        org.koin.mp.d.f421487a.getClass();
        synchronized (C47249b.f429044a) {
            e.f419400c.getClass();
            eVar = new e(null);
            if (C47249b.f429045b != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            C47249b.f429045b = eVar.f419401a;
            lVar.invoke(eVar);
            eVar.a();
        }
        return eVar;
    }
}
