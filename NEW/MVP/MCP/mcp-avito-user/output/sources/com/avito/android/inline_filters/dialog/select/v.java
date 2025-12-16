package com.avito.android.inline_filters.dialog.select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RadioSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v extends kotlin.jvm.internal.N implements Y41.l<List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f172201l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f172202m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B f172203n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.inline_filters.dialog.select.adapter.i> f172204o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f172205p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(Y41.p pVar, Filter filter, B b12, List list, ArrayList arrayList) {
        super(1);
        this.f172201l = (kotlin.jvm.internal.N) pVar;
        this.f172202m = filter;
        this.f172203n = b12;
        this.f172204o = list;
        this.f172205p = arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(List<? extends String> list) {
        B b12 = this.f172203n;
        this.f172201l.invoke(this.f172202m, new InlineFilterValue.InlineFilterSelectValue(b12.f172005j));
        B.e(b12, this.f172204o, this.f172205p);
        b12.c();
        return G0.f406611a;
    }
}
