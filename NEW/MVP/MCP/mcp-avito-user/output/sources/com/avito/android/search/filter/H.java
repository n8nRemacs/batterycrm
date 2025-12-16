package com.avito.android.search.filter;

import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "it", "Lcom/avito/android/search/filter/LocationInfo;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametersTreeWithAdditionalImpl f261865c;

    public H(E e12, ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl) {
        this.f261864b = e12;
        this.f261865c = parametersTreeWithAdditionalImpl;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f261864b.f261770g.a(this.f261865c, (LocationInfo) obj);
    }
}
