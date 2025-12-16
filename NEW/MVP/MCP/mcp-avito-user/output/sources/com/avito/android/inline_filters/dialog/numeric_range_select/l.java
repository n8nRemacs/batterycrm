package com.avito.android.inline_filters.dialog.numeric_range_select;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f171908l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f171909m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f171910n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Filter f171911o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f171912p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f171913q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f171914r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Y41.a aVar, Context context, FragmentManager fragmentManager, v vVar, x xVar, Filter filter, ArrayList arrayList) {
        super(0);
        this.f171908l = vVar;
        this.f171909m = context;
        this.f171910n = fragmentManager;
        this.f171911o = filter;
        this.f171912p = (N) aVar;
        this.f171913q = xVar;
        this.f171914r = arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        String string = this.f171909m.getString(R.string.numeric_range_select_bottom_sheet_title_to);
        x xVar = this.f171913q;
        ArrayList arrayList = this.f171914r;
        k kVar = new k(this.f171908l, xVar, arrayList);
        String strK = x.k(xVar.x(), arrayList);
        String strX = xVar.x();
        v.g(this.f171908l, string, this.f171910n, this.f171911o, this.f171912p, kVar, xVar, strK, strX);
        return G0.f406611a;
    }
}
