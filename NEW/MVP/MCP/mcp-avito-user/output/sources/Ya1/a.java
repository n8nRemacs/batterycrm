package Ya1;

import Y61.k;
import a21.InterfaceC19670a;
import a21.InterfaceC19671b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;

/* loaded from: classes9.dex */
public final class a implements InterfaceC19671b, InterfaceC19670a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f19523a = new ArrayList();

    @Override // a21.InterfaceC19670a
    public final void a(@k String str) {
        synchronized (this) {
            try {
                Iterator it = this.f19523a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC19670a) it.next()).a(str);
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
