package com.avito.android.advert.item.autoteka.teaser_v2;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaTeaserV2Filter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v2/i;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.autoteka.data.a f73117e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f73118f;

    @Inject
    public i(@k com.avito.android.autoteka.data.a aVar, @k @InterfaceC30174s String str) {
        super(true, true, 0.0f, 2000L, 4, null);
        this.f73117e = aVar;
        this.f73118f = str;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof AdvertDetailsAutotekaTeaserV2Item;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        if (interfaceC10495b instanceof AdvertDetailsAutotekaTeaserV2Item) {
            this.f73117e.j(this.f73118f);
        }
    }
}
