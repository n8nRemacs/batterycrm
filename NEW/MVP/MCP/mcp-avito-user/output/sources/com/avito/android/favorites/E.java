package com.avito.android.favorites;

import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.favorites.Q;
import com.avito.android.util.K5;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f156213b;

    public E(A a12) {
        this.f156213b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        Q.b bVar = new Q.b(th2);
        A a12 = this.f156213b;
        a12.f156185d.b(bVar);
        if (K5.e(th2)) {
            return;
        }
        a12.f156184c.c(new NonFatalErrorEvent("Failed to upload favorites", th2, null, null, 12, null));
    }
}
