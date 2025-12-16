package dy0;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingDiffUtilCallback.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldy0/a;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39827a extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<InterfaceC39829c> f394183a;

    @Inject
    public C39827a(@k Set<InterfaceC39829c> set) {
        this.f394183a = set;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getF222258b() == aVar2.getF222258b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        Set<InterfaceC39829c> set = this.f394183a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Boolean boolA = ((InterfaceC39829c) it.next()).a(aVar3, aVar4);
            if (boolA != null) {
                arrayList.add(boolA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
