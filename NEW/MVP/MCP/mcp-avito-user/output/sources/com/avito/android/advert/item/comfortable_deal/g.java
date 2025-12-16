package com.avito.android.advert.item.comfortable_deal;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExpertBlockItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/comfortable_deal/g;", "Lcom/avito/android/advert/item/comfortable_deal/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f74301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f74302c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f74303d;

    @Inject
    public g(@Y61.k l lVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @InterfaceC30174s String str) {
        this.f74301b = lVar;
        this.f74302c = interfaceC28373a;
        this.f74303d = str;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ExpertBlockItem expertBlockItem = (ExpertBlockItem) aVar;
        jVar.setTitle(expertBlockItem.f74286g);
        jVar.zK(expertBlockItem.f74287h, new d(this, expertBlockItem));
        jVar.MW(new e(this, expertBlockItem), expertBlockItem.f74288i);
        jVar.Ry(expertBlockItem.f74289j, new f(this, expertBlockItem));
    }
}
