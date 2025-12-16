package com.avito.android.advert_stats.preloading;

import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import l41.g;
import nb.InterfaceC44368a;

/* compiled from: AdvertStatsPreloadable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lkb/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f86833b;

    public c(d dVar) {
        this.f86833b = dVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        d dVar = this.f86833b;
        dVar.getClass();
        boolean z12 = p22 instanceof P2.a;
        InterfaceC44368a interfaceC44368a = dVar.f86836c;
        if (z12) {
            if (interfaceC44368a != null) {
                interfaceC44368a.i(((P2.a) p22).f318719a);
            }
        } else if (!(p22 instanceof P2.b)) {
            L.f(p22, P2.c.f318721a);
        } else if (interfaceC44368a != null) {
            interfaceC44368a.h();
        }
    }
}
