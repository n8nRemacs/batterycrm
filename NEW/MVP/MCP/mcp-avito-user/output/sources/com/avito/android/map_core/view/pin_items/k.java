package com.avito.android.map_core.view.pin_items;

import com.avito.android.floating_views.j;
import io.reactivex.rxjava3.core.B;
import kotlin.Metadata;

/* compiled from: ScrollChangesObservable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/pin_items/k;", "Lcom/avito/android/floating_views/j$a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f185824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B<Boolean> f185825b;

    public k(j jVar, B<Boolean> b12) {
        this.f185824a = jVar;
        this.f185825b = b12;
    }

    @Override // com.avito.android.floating_views.j.a
    public final void f(int i12, int i13, int i14, int i15, int i16) {
        boolean zBooleanValue = this.f185824a.f185822a.invoke().booleanValue();
        B<Boolean> b12 = this.f185825b;
        if (!zBooleanValue && i15 + i12 >= i16) {
            b12.onNext(Boolean.TRUE);
        } else if (i13 < i12) {
            b12.onNext(Boolean.FALSE);
        } else if (i13 > i12) {
            b12.onNext(Boolean.TRUE);
        }
    }
}
