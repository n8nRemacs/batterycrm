package com.avito.android.inline_filters.dialog.select;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioSelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class t extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Filter f172192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f172193m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172194n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f172195o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.inline_filters.dialog.select.adapter.i> f172196p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D f172197q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Filter filter, B b12, ArrayList arrayList, Y41.p pVar, List list, D d12) {
        super(0);
        this.f172192l = filter;
        this.f172193m = b12;
        this.f172194n = arrayList;
        this.f172195o = (kotlin.jvm.internal.N) pVar;
        this.f172196p = list;
        this.f172197q = d12;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        Filter filter = this.f172192l;
        boolean zF2 = kotlin.jvm.internal.L.f(filter.getId(), SearchParamsConverterKt.SORT);
        ArrayList<com.avito.android.inline_filters.dialog.select.adapter.i> arrayList = this.f172194n;
        B b12 = this.f172193m;
        if (zF2) {
            b12.f172005j = "default";
            for (com.avito.android.inline_filters.dialog.select.adapter.i iVar : arrayList) {
                iVar.f172094e = false;
                if (kotlin.jvm.internal.L.f(iVar.f172092c, b12.f172005j)) {
                    iVar.f172094e = true;
                }
            }
            this.f172195o.invoke(filter, new InlineFilterValue.InlineFilterSelectValue(b12.f172005j));
            B.e(b12, this.f172196p, arrayList);
            b12.c();
        } else {
            String str = b12.f172006k;
            if (str == null) {
                str = "";
            }
            b12.f172005j = str;
            for (com.avito.android.inline_filters.dialog.select.adapter.i iVar2 : arrayList) {
                iVar2.f172094e = false;
                if (kotlin.jvm.internal.L.f(iVar2.f172092c, b12.f172006k)) {
                    iVar2.f172094e = true;
                }
            }
            D d12 = this.f172197q;
            d12.k(arrayList, null);
            b12.f(d12);
        }
        return G0.f406611a;
    }
}
