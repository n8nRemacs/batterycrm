package com.avito.android.inline_filters.dialog.select;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: QuarterSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "selectedItem", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/select/adapter/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f172181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Filter, InlineFilterValue, G0> f172182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Filter f172183d;

    public p(Y41.p pVar, r rVar, Filter filter) {
        this.f172181b = rVar;
        this.f172182c = pVar;
        this.f172183d = filter;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = ((com.avito.android.inline_filters.dialog.select.adapter.i) obj).f172092c;
        r rVar = this.f172181b;
        this.f172182c.invoke(this.f172183d, r.e(rVar, str));
        rVar.c();
    }
}
