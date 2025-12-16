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
final class m extends N implements Y41.l<x, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f171915l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f171916m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f171917n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f171918o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Filter f171919p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f171920q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f171921r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Y41.a aVar, Context context, FragmentManager fragmentManager, v vVar, x xVar, Filter filter, ArrayList arrayList) {
        super(1);
        this.f171915l = xVar;
        this.f171916m = vVar;
        this.f171917n = context;
        this.f171918o = fragmentManager;
        this.f171919p = filter;
        this.f171920q = (N) aVar;
        this.f171921r = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(x xVar) {
        Context context = this.f171917n;
        ?? r12 = this.f171920q;
        x xVar2 = this.f171915l;
        ArrayList arrayList = this.f171921r;
        xVar2.f171939f.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(13, new l(r12, context, this.f171918o, this.f171916m, xVar2, this.f171919p, arrayList)));
        return G0.f406611a;
    }
}
