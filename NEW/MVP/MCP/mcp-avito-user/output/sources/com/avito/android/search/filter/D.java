package com.avito.android.search.filter;

import com.avito.android.search.filter.E;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261751b;

    public D(E e12) {
        this.f261751b = e12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((P2) obj) instanceof P2.c) {
            return;
        }
        this.f261751b.f261758G.accept(E.a.f261791c);
    }
}
