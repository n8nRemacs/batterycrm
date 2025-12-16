package li;

import Y61.k;
import Y61.l;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22983P;
import com.google.common.collect.H1;
import gj.InterfaceC40691b;
import gj.i;
import gj.j;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompositeBeduinScreenConnector.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lli/a;", "Lgj/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: li.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43776a implements j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H1 f414153a;

    @Inject
    public C43776a(@k H1 h12) {
        this.f414153a = h12;
    }

    @Override // gj.j
    public final void a(@k InterfaceC40691b interfaceC40691b, @l gj.l lVar, @k i iVar, @k InterfaceC22983P interfaceC22983P, @k ActivityC22955m activityC22955m) {
        Iterator<E> it = this.f414153a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a(interfaceC40691b, lVar, iVar, interfaceC22983P, activityC22955m);
        }
    }
}
