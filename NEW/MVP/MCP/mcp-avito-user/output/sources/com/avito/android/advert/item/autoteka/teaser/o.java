package com.avito.android.advert.item.autoteka.teaser;

import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaTeaserFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/o;", "LWV0/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f73048e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f73049f;

    @Inject
    public o(@Y61.k com.avito.android.autoteka.data.a aVar, @Y61.k @InterfaceC30174s String str) {
        super(true, true, 0.0f, 2000L, 4, null);
        this.f73048e = aVar;
        this.f73049f = str;
    }

    @Override // WV0.a
    public final boolean a(@Y61.k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof AdvertDetailsAutotekaTeaserItem;
    }

    @Override // WV0.a
    public final void b(int i12, @Y61.k b.InterfaceC10495b interfaceC10495b) {
        if (interfaceC10495b instanceof AdvertDetailsAutotekaTeaserItem) {
            this.f73048e.j(this.f73049f);
        }
    }
}
