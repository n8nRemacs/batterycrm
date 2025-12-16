package com.avito.android.inline_filters;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/Q;", "Lcom/avito/android/remote/model/search/Filter;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "filters", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<List<? extends kotlin.Q<? extends Filter, ? extends InlineFilterValue>>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f171001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchParams f171002m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PresentationType f171003n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f171004o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(z zVar, SearchParams searchParams, PresentationType presentationType, String str) {
        super(1);
        this.f171001l = zVar;
        this.f171002m = searchParams;
        this.f171003n = presentationType;
        this.f171004o = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(List<? extends kotlin.Q<? extends Filter, ? extends InlineFilterValue>> list) {
        List<? extends kotlin.Q<? extends Filter, ? extends InlineFilterValue>> list2 = list;
        List<? extends kotlin.Q<? extends Filter, ? extends InlineFilterValue>> list3 = list2;
        boolean z12 = list3 instanceof Collection;
        z zVar = this.f171001l;
        if (z12 && list3.isEmpty()) {
            zVar.f172415i.k();
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (InlineFilterValueKt.isNotEmpty((InlineFilterValue) ((kotlin.Q) it.next()).f406620c)) {
                    break;
                }
            }
            zVar.f172415i.k();
        }
        if (!z12 || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                kotlin.Q q12 = (kotlin.Q) it2.next();
                if (!kotlin.jvm.internal.L.f(((Filter) q12.f406619b).getValue(), q12.f406620c)) {
                    z.f(this.f171001l, list2, this.f171002m, this.f171003n, this.f171004o, false, null, 48);
                    break;
                }
            }
        }
        zVar.f172398O = null;
        return G0.f406611a;
    }
}
