package com.avito.android.inline_filters.dialog.numeric_range_select;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/numeric_range_select/x;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/inline_filters/dialog/numeric_range_select/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.l<x, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f171898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f171899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f171900n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f171901o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Filter f171902p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f171903q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f171904r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(Y41.a aVar, Context context, FragmentManager fragmentManager, v vVar, x xVar, Filter filter, ArrayList arrayList) {
        super(1);
        this.f171898l = xVar;
        this.f171899m = vVar;
        this.f171900n = context;
        this.f171901o = fragmentManager;
        this.f171902p = filter;
        this.f171903q = (N) aVar;
        this.f171904r = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(x xVar) {
        Context context = this.f171900n;
        ?? r12 = this.f171903q;
        x xVar2 = this.f171898l;
        ArrayList arrayList = this.f171904r;
        xVar2.f171938e.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(10, new h(r12, context, this.f171901o, this.f171899m, xVar2, this.f171902p, arrayList)));
        return G0.f406611a;
    }
}
