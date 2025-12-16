package com.avito.android.vas_performance.screens.stickers.buy.item.stickers;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StickersItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/h;", "Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/e;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<a, G0> f320675b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<a, G0> f320676c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@com.avito.android.vas_performance.screens.stickers.buy.di.b @Y61.k Y41.l<? super a, G0> lVar, @com.avito.android.vas_performance.screens.stickers.buy.di.c @Y61.k Y41.l<? super a, G0> lVar2) {
        this.f320675b = lVar;
        this.f320676c = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        b bVar = (b) aVar;
        List<a> list = bVar.f320667d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Boolean bool = ((a) obj).f320663d;
            if (bool != null ? bool.booleanValue() : false) {
                arrayList.add(obj);
            }
        }
        jVar.ui(list, arrayList, bVar.f320666c, new f(bVar), new com.avito.android.gig_shift_action.ui.a(11, bVar, this), new g(bVar, this));
    }
}
