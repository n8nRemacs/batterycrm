package Ma;

import La.h;
import La.j;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertItemActions;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MoreActionsItemProcessorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMa/a;", "LLa/j;", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ma.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14462a implements j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert_item_actions.actions.c f10828a;

    @Inject
    public C14462a(@k com.avito.android.advert_item_actions.actions.c cVar) {
        this.f10828a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [La.b, com.avito.conveyor_item.a] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // La.j
    @k
    public final List a(@k ArrayList arrayList, @l AdvertItemActions advertItemActions) {
        if (advertItemActions == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ?? C02 = (com.avito.conveyor_item.a) it.next();
            if (C02 instanceof h) {
                h hVar = (h) C02;
                AdvertItemActions f268418z = hVar.getF268418Z();
                C02 = hVar;
                if (f268418z == null) {
                    C02 = hVar.C0(advertItemActions);
                }
                C02.setHidden(this.f10828a.f85829b.b(C02.getF96738b()));
            }
            arrayList2.add(C02);
        }
        return arrayList2;
    }
}
