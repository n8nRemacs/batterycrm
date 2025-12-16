package com.avito.android.search.filter;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.ResetAction;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00072#\u0010\u0006\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/remote/model/Category;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SearchParameters;", "LX41/o;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class U<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261905b;

    public U(E e12) {
        this.f261905b = e12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        io.reactivex.rxjava3.core.z zVarC0;
        kotlin.Q q12 = (kotlin.Q) obj;
        List list = (List) q12.f406619b;
        P2 p22 = (P2) q12.f406620c;
        E e12 = this.f261905b;
        e12.getClass();
        if (p22 instanceof P2.b) {
            P2.b bVar = (P2.b) p22;
            e12.f261784u = ((SearchParameters) bVar.f318720a).getSearchContext();
            SearchParameters searchParameters = (SearchParameters) bVar.f318720a;
            ResetAction resetAction = searchParameters.getResetAction();
            DeepLink itemsSearchLink = resetAction != null ? resetAction.getItemsSearchLink() : null;
            ItemsSearchLink itemsSearchLink2 = itemsSearchLink instanceof ItemsSearchLink ? (ItemsSearchLink) itemsSearchLink : null;
            e12.f261760I = itemsSearchLink2 != null ? itemsSearchLink2.f133403b : null;
            zVarC0 = io.reactivex.rxjava3.core.z.c0(new ParametersTreeWithAdditionalImpl(e12.G(searchParameters.getParameters(), list), searchParameters.getAdditionalParameters())).T(new I(e12), Integer.MAX_VALUE).d0(J.f261869b);
        } else {
            zVarC0 = io.reactivex.rxjava3.core.z.c0(p22);
        }
        return zVarC0.K(new G(e12));
    }
}
