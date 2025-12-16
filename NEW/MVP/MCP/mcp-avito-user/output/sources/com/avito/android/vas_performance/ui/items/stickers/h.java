package com.avito.android.vas_performance.ui.items.stickers;

import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StickersItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers/h;", "Lcom/avito/android/vas_performance/ui/items/stickers/e;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f321735b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f321736c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f321737d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f321738e;

    @Inject
    public h() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f321735b = cVar;
        this.f321736c = cVar;
        com.jakewharton.rxrelay3.c<a> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f321737d = cVar2;
        this.f321738e = cVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        b bVar = (b) aVar;
        ArrayList arrayList = bVar.f321727c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Boolean bool = ((a) obj).f321724d;
            if (bool != null ? bool.booleanValue() : false) {
                arrayList2.add(obj);
            }
        }
        jVar.Yx(arrayList, arrayList2, bVar.f321726b, new f(bVar), new com.avito.android.gig_shift_action.ui.a(12, bVar, this), new g(bVar, this));
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers.e
    @Y61.k
    public final z<a> h() {
        return this.f321736c;
    }

    @Override // com.avito.android.vas_performance.ui.items.stickers.e
    @Y61.k
    /* renamed from: x6, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF321738e() {
        return this.f321738e;
    }
}
