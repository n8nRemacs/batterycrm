package aY;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.S;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.i;
import fY.InterfaceC40372a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PinAdvertsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LaY/b;", "LaY/a;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C19838b implements InterfaceC19837a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final i f20911a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40372a f20912b;

    @Inject
    public C19838b(@k i iVar, @k InterfaceC40372a interfaceC40372a) {
        this.f20911a = iVar;
        this.f20912b = interfaceC40372a;
    }

    @Override // aY.InterfaceC19837a
    @k
    public final ArrayList a(@k List list, @l SerpDisplayType serpDisplayType, @l List list2) {
        InterfaceC40372a interfaceC40372a = this.f20912b;
        if (serpDisplayType == null || !interfaceC40372a.b()) {
            serpDisplayType = SerpDisplayType.List;
        }
        List listA = i.a.a(this.f20911a, list, serpDisplayType, null, null, false, null, 124);
        interfaceC40372a.getClass();
        List<l1> listB = this.f20911a.b(1, listA);
        ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
        for (l1 l1Var : listB) {
            if (list2 != null && list2.contains(l1Var.getF72786b())) {
                ((S) l1Var).setFavorite(true);
            }
            arrayList.add(l1Var);
        }
        return arrayList;
    }
}
