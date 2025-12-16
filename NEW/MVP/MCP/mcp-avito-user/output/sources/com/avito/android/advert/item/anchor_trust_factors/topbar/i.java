package com.avito.android.advert.item.anchor_trust_factors.topbar;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import r4.C47486a;
import s4.C47993a;

/* compiled from: AdvertDetailsTopBarAnchorsStateHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/i;", "Lcom/avito/android/advert/item/anchor_trust_factors/topbar/h;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public C47486a f72866a = new C47486a(C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public C47993a f72867b = new C47993a("", "", null, y6.b(6));

    @Inject
    public i() {
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.h
    public final void a(@Y61.k AnchorTrustFactors anchorTrustFactors, @Y61.k Y41.l<? super C47486a.C12352a, G0> lVar) {
        List<AnchorTrustFactors.Item> items = anchorTrustFactors.getItems();
        if (items == null) {
            items = C42784z0.f406748b;
        }
        List<AnchorTrustFactors.Item> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (AnchorTrustFactors.Item item : list) {
            arrayList.add(new C47486a.C12352a(item.getBlockIdentifier(), item.getTitle(), false, lVar));
        }
        this.f72866a = new C47486a(arrayList);
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.h
    public final void b(@Y61.k AnchorTrustFactors anchorTrustFactors) {
        AnchorTrustFactors.Style style = anchorTrustFactors.getStyle();
        this.f72867b = new C47993a(style.getNormalButtonStyle(), style.getSelectedButtonStyle(), style.getTheme(), y6.b(6));
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.h
    public final void c(@Y61.k Set<String> set) {
        List<C47486a.C12352a> list = this.f72866a.f429574a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C47486a.C12352a c12352a : list) {
            String str = c12352a.f429575a;
            arrayList.add((str == null || !set.contains(str)) ? C47486a.C12352a.a(c12352a, false) : C47486a.C12352a.a(c12352a, true));
        }
        this.f72866a.getClass();
        this.f72866a = new C47486a(arrayList);
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.h
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final C47486a getF72866a() {
        return this.f72866a;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.h
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final C47993a getF72867b() {
        return this.f72867b;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.h
    public final void reset() {
        this.f72866a = new C47486a(C42784z0.f406748b);
        this.f72867b = new C47993a("", "", null, y6.b(6));
    }
}
