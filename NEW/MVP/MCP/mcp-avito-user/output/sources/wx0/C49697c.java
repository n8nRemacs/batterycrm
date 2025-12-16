package wx0;

import Y61.l;
import com.avito.android.di.C;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.remote.models.SparePartsSpecification;
import com.avito.android.util.O2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SparePartsFormatter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwx0/c;", "Lwx0/b;", "<init>", "()V", "_avito-discouraged_avito-libs_spare-parts-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C
/* renamed from: wx0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49697c implements InterfaceC49696b {
    @Inject
    public C49697c() {
    }

    @Override // wx0.InterfaceC49696b
    @l
    public final ArrayList a(@l List list, @l List list2) {
        if (O2.a(list)) {
            List<SparePartsGroup> list3 = list == null ? C42784z0.f406748b : list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (SparePartsGroup sparePartsGroup : list3) {
                arrayList.add(new g(sparePartsGroup.getText(), sparePartsGroup.getButtonText(), !L.f(sparePartsGroup.getIsButtonDisabled(), Boolean.TRUE), sparePartsGroup));
            }
            return arrayList;
        }
        if (!O2.a(list2)) {
            return null;
        }
        List list4 = list2 == null ? C42784z0.f406748b : list2;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(new g(C42745f0.O(((SparePartsSpecification) it.next()).c(), " · ", null, null, null, 62), null, false, null, 10, null));
        }
        return arrayList2;
    }
}
