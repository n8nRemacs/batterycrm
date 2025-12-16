package com.avito.android.beduin.common.component.inline_filter;

import Y41.l;
import com.avito.android.beduin.common.component.inline_filter.a;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinInlineFilterComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/InlineFilterValue;", "filterValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<InlineFilterValue, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f101494l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f101495m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Filter filter) {
        super(1);
        this.f101494l = aVar;
        this.f101495m = filter;
    }

    @Override // Y41.l
    public final G0 invoke(InlineFilterValue inlineFilterValue) {
        a.C3041a c3041a = a.f101486k;
        this.f101494l.u(this.f101495m, inlineFilterValue);
        return G0.f406611a;
    }
}
