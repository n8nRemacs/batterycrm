package com.avito.android.user_favorites;

import kotlin.Metadata;
import zE0.C50450e;

/* compiled from: UserFavoritesPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f316946b;

    public z(B b12) {
        this.f316946b = b12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        B b12 = this.f316946b;
        int f316855f = b12.f316781o.get(iIntValue).getF316855f();
        if (f316855f != b12.f316782p) {
            b12.c(f316855f);
        }
        b12.f316782p = f316855f;
        if (f316855f == 6) {
            C50450e.f443982a.getClass();
            b12.f316776j.a(C50450e.f443983b);
        }
    }
}
