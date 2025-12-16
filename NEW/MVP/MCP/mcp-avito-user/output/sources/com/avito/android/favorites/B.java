package com.avito.android.favorites;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.K5;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsServiceInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f156193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f156194c;

    public B(A a12, String str) {
        this.f156193b = a12;
        this.f156194c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (K5.e(th2)) {
            return;
        }
        InterfaceC28373a interfaceC28373a = this.f156193b.f156184c;
        String str = this.f156194c;
        if (str == null) {
            str = "";
        }
        interfaceC28373a.c(new NonFatalErrorEvent(str, th2, null, null, 12, null));
    }
}
