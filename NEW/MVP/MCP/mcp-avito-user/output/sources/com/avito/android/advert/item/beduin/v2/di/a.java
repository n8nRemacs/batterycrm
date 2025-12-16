package com.avito.android.advert.item.beduin.v2.di;

import C11.b;
import Y61.k;
import cU.q;
import com.avito.android.advert.item.C27814a2;
import com.avito.android.advertising.loaders.beduin.G;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.beduin_v2.feature.di.C0;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.serp.adapter.InterfaceC34863v;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AdvertDetailsBeduinLocalComponents.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/di/a;", "Lcom/avito/android/lib/beduin_v2/feature/di/C0;", "LcU/q;", "a", "b", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a extends C0, q {

    /* compiled from: AdvertDetailsBeduinLocalComponents.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/di/a$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.beduin.v2.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2202a {
        @k
        a a(@h31.b @k Y41.a<com.avito.konveyor.a> aVar, @h31.b @k Y41.a<? extends Map<AdvertDetailsBlockId, com.avito.android.advert_core.blocks.a>> aVar2, @h31.b @k Y41.a<C27814a2> aVar3, @h31.b @k Y41.a<? extends InterfaceC34863v> aVar4, @h31.b @k Y41.a<? extends com.avito.android.advert.viewed.d> aVar5, @h31.b @k Y41.a<? extends com.avito.android.advert_core.analytics.a> aVar6, @h31.b @k Y41.a<G> aVar7);
    }

    /* compiled from: AdvertDetailsBeduinLocalComponents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/di/a$b;", "Lcom/avito/android/di/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC2202a Bg();
    }

    @k
    com.avito.android.advert.item.beduin.v2.i d();
}
