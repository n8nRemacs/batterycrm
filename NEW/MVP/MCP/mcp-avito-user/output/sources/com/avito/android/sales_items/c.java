package com.avito.android.sales_items;

import com.avito.android.remote.model.FavoriteSalesItemsCount;
import io.reactivex.rxjava3.core.z;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.rx3.y;

/* compiled from: FavoriteSalesCounterInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isAuthorized", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/FavoriteSalesItemsCount;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f258223b;

    public c(b bVar) {
        this.f258223b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            b bVar = this.f258223b;
            if (bVar.f258213g.f439744a.f439749b.a() && bVar.f258209c.b() && L.f(bVar.f258210d.a(), InterfaceC42451b.a.f405966a)) {
                return y.b(bVar.f258211e.a());
            }
        }
        return z.c0(FavoriteSalesItemsCount.INSTANCE.empty());
    }
}
