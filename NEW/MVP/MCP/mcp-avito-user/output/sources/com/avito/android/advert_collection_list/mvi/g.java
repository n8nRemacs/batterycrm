package com.avito.android.advert_collection_list.mvi;

import Q7.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.advert_collection_list.adapter.advert_collection.skeleton.AdvertCollectionSkeletonItem;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListState;
import com.avito.android.advert_collection_toast.analytics.FromPageSource;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.AddToCollectionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.H;
import com.avito.conveyor_item.ParcelableItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: AdvertCollectionListActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LQ7/a;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState;", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements com.avito.android.arch.mvi.a<Q7.a, AdvertCollectionListInternalAction, AdvertCollectionListState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_list.f f82224a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f82225b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f82226c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_list.i f82227d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x f82228e;

    @Inject
    public g(@Y61.k com.avito.android.advert_collection_list.f fVar, @Y61.k E e12, @Y61.k H h12, @Y61.k com.avito.android.advert_collection_list.i iVar, @Y61.k x xVar) {
        this.f82224a = fVar;
        this.f82225b = e12;
        this.f82226c = h12;
        this.f82227d = iVar;
        this.f82228e = xVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AdvertCollectionListInternalAction> b(Q7.a aVar, AdvertCollectionListState advertCollectionListState) {
        X x12;
        InterfaceC43160i<AdvertCollectionListInternalAction> c43137a0;
        AdvertCollectionItem next;
        AdvertCollectionItem.Actions actions;
        DeepLink deepLink;
        Q7.a aVar2 = aVar;
        AdvertCollectionListState advertCollectionListState2 = advertCollectionListState;
        boolean zEquals = aVar2.equals(a.b.f13509a);
        E e12 = this.f82225b;
        if (zEquals) {
            DeepLink deepLink2 = advertCollectionListState2.f82221d;
            return new C43210w(deepLink2 == null ? new AdvertCollectionListInternalAction.OpenDeeplink(new AddToCollectionLink(C42784z0.f406748b, FromPageSource.AdvertCollectionList.f82324c.f82321b), "create_collection") : e12.b() ? new AdvertCollectionListInternalAction.OpenDeeplink(deepLink2, "create_collection") : new AdvertCollectionListInternalAction.OpenAuthorizationBottomSheet(deepLink2));
        }
        ?? r22 = 0;
        ?? r23 = 0;
        if (aVar2 instanceof a.e) {
            c43137a0 = new C43210w(new AdvertCollectionListInternalAction.OpenDeeplink(((a.e) aVar2).f13512a, r23 == true ? 1 : 0, 2, r22 == true ? 1 : 0));
        } else {
            if (!(aVar2 instanceof a.h)) {
                boolean z12 = aVar2 instanceof a.C0888a;
                List<ParcelableItem> list = advertCollectionListState2.f82219b;
                com.avito.android.advert_collection_list.f fVar = this.f82224a;
                if (!z12) {
                    if (aVar2 instanceof a.c) {
                        return fVar.c(((a.c) aVar2).f13510a);
                    }
                    if (aVar2.equals(a.f.f13513a)) {
                        return c();
                    }
                    if (!(aVar2 instanceof a.g)) {
                        if (aVar2 instanceof a.d) {
                            return C43175k.G(new d(aVar2, this, null));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    List<ParcelableItem> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((ParcelableItem) it.next()) instanceof AdvertCollectionSkeletonItem) {
                                return C43175k.w();
                            }
                        }
                    }
                    return new C43210w(new AdvertCollectionListInternalAction.SendCollectionListViewEvent(e12.a(), this.f82226c.getF253025a(), list.size()));
                }
                a.C0888a c0888a = (a.C0888a) aVar2;
                String str = c0888a.f13507a;
                int iHashCode = str.hashCode();
                String str2 = c0888a.f13508b;
                switch (iHashCode) {
                    case -162603328:
                        if (str.equals("actionUnpublish")) {
                            x12 = new X(fVar.d(str2, false), new c(this, null));
                            return x12;
                        }
                        return C43175k.w();
                    case 1064628097:
                        if (str.equals("actionDelete")) {
                            return new C43210w(new AdvertCollectionListInternalAction.OpenDeleteCollectionDialog(str2));
                        }
                        return C43175k.w();
                    case 1152871929:
                        if (str.equals("actionPublish")) {
                            x12 = new X(fVar.d(str2, true), new b(this, null));
                            return x12;
                        }
                        return C43175k.w();
                    case 1572295497:
                        if (str.equals("actionShare")) {
                            c43137a0 = new C43137a0(new a(aVar2, null), fVar.b(str2));
                            break;
                        }
                        return C43175k.w();
                    case 1851413856:
                        if (str.equals("actionEdit")) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (L.f(((ParcelableItem) next).getF281447b(), str2)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            AdvertCollectionItem advertCollectionItem = next instanceof AdvertCollectionItem ? next : null;
                            if (advertCollectionItem != null && (actions = advertCollectionItem.f82036j) != null && (deepLink = actions.f82039d) != null) {
                                c43137a0 = new C43210w(new AdvertCollectionListInternalAction.OpenDeeplink(deepLink, "editCollection"));
                                break;
                            } else {
                                return C43175k.w();
                            }
                        }
                        return C43175k.w();
                    default:
                        return C43175k.w();
                }
            }
            AdvertCollectionItem advertCollectionItem2 = ((a.h) aVar2).f13515a;
            String str3 = advertCollectionItem2.f82028b;
            kotlin.collections.builders.b bVarT = C42745f0.t();
            AdvertCollectionItem.Actions actions2 = advertCollectionItem2.f82036j;
            boolean z13 = actions2.f82040e;
            com.avito.android.advert_collection_list.i iVar = this.f82227d;
            if (z13) {
                bVarT.add(new com.avito.android.advert_collection_list.actions.a("actionPublish", iVar.getF82170d(), "visibility"));
            }
            if (actions2.f82041f) {
                bVarT.add(new com.avito.android.advert_collection_list.actions.a("actionUnpublish", iVar.getF82171e(), "visibilityOff"));
            }
            if (actions2.f82038c) {
                bVarT.add(new com.avito.android.advert_collection_list.actions.a("actionShare", iVar.getF82173g(), "upload"));
            }
            if (actions2.f82039d != null) {
                bVarT.add(new com.avito.android.advert_collection_list.actions.a("actionEdit", iVar.getF82172f(), "edit"));
            }
            if (actions2.f82037b) {
                bVarT.add(new com.avito.android.advert_collection_list.actions.a("actionDelete", iVar.getF82168b(), "delete"));
            }
            c43137a0 = new C43210w(new AdvertCollectionListInternalAction.OpenSelectBottomSheet(str3, C42745f0.p(bVarT)));
        }
        return c43137a0;
    }

    public final X c() {
        return new X(new C43137a0(new e(2, null), this.f82224a.a()), new f(3, null));
    }
}
