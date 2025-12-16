package com.avito.android.rating_ui.utils;

import com.avito.android.floating_views.j;
import io.reactivex.rxjava3.core.B;
import kotlin.Metadata;

/* compiled from: FloatingViews.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/utils/b;", "Lcom/avito/android/floating_views/j$a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f250481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B<Boolean> f250482b;

    public b(Y41.a<Boolean> aVar, B<Boolean> b12) {
        this.f250481a = aVar;
        this.f250482b = b12;
    }

    @Override // com.avito.android.floating_views.j.a
    public final void f(int i12, int i13, int i14, int i15, int i16) {
        boolean zBooleanValue = this.f250481a.invoke().booleanValue();
        B<Boolean> b12 = this.f250482b;
        if (!zBooleanValue && i15 + i12 >= i16) {
            b12.onNext(Boolean.TRUE);
        } else if (i13 < i12) {
            b12.onNext(Boolean.FALSE);
        } else if (i13 > i12) {
            b12.onNext(Boolean.TRUE);
        }
    }
}
