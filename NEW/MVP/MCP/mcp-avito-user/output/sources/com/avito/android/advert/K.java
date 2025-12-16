package com.avito.android.advert;

import com.avito.android.B2;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFavorite", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f68553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28245z f68554c;

    public K(C28245z c28245z, d0 d0Var) {
        this.f68553b = d0Var;
        this.f68554c = c28245z;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d0 d0Var = this.f68553b;
        d0Var.setFavorite(zBooleanValue);
        C28245z c28245z = this.f68554c;
        if (!c28245z.f81099r.b()) {
            InterfaceC28240u interfaceC28240u = c28245z.f81092k;
            if (zBooleanValue) {
                d0Var.wc(interfaceC28240u.l());
            } else {
                d0Var.wc(interfaceC28240u.m());
            }
        }
        B2 b22 = c28245z.f81102u;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[46];
        if (((Boolean) b22.f67203S.a().invoke()).booleanValue() && zBooleanValue) {
            d0Var.Zc();
        }
    }
}
