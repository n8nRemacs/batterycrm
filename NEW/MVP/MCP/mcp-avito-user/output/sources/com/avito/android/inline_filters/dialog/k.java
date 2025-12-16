package com.avito.android.inline_filters.dialog;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.select.group_clearance_select.GroupClearanceFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineFilterDialogOpener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/k;", "Lcom/avito/android/select/A;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements com.avito.android.select.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f171658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Filter f171659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupClearanceFragment f171660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f171661d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter, GroupClearanceFragment groupClearanceFragment, Y41.a<G0> aVar) {
        this.f171658a = (N) pVar;
        this.f171659b = filter;
        this.f171660c = groupClearanceFragment;
        this.f171661d = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // com.avito.android.select.A
    public final void a(@Y61.k InlineFilterValue inlineFilterValue) {
        this.f171658a.invoke(this.f171659b, inlineFilterValue);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, java.lang.Object] */
    @Override // com.avito.android.select.A
    public final void onDialogClose() {
        this.f171660c.dismiss();
        this.f171661d.invoke();
    }
}
