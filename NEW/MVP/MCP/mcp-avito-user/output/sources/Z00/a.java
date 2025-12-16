package Z00;

import Y61.k;
import a10.InterfaceC19665b;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootDiffCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LZ00/a;", "Landroidx/recyclerview/widget/o$f;", "La10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends C23424o.f<InterfaceC19665b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<e> f19756a;

    @Inject
    public a(@k Set<e> set) {
        this.f19756a = set;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(InterfaceC19665b interfaceC19665b, InterfaceC19665b interfaceC19665b2) {
        return interfaceC19665b.equals(interfaceC19665b2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(InterfaceC19665b interfaceC19665b, InterfaceC19665b interfaceC19665b2) {
        return interfaceC19665b.getF182874b() == interfaceC19665b2.getF182874b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(InterfaceC19665b interfaceC19665b, InterfaceC19665b interfaceC19665b2) {
        InterfaceC19665b interfaceC19665b3 = interfaceC19665b;
        InterfaceC19665b interfaceC19665b4 = interfaceC19665b2;
        Set<e> set = this.f19756a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Object objA = ((e) it.next()).a(interfaceC19665b3, interfaceC19665b4);
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
