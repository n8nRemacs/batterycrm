package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: AdvertXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/M;", "Lz80/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class M implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f271078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271079b;

    public M(AdvertXlItem advertXlItem, Z z12) {
        this.f271078a = z12;
        this.f271079b = advertXlItem;
    }

    @Override // z80.e
    public final void a(@Y61.l Integer num) {
        Z z12 = this.f271078a;
        com.avito.android.account.E e12 = z12.f271119m;
        String strA = e12 != null ? e12.a() : null;
        AdvertXlItem advertXlItem = this.f271079b;
        z12.f271112f.c(new C50082a(strA, advertXlItem.f268776b0, advertXlItem.f268777c, num, advertXlItem.f268774a0, PinchToZoomSource.f219964c));
    }

    @Override // z80.e
    public final void b() {
        Z z12 = this.f271078a;
        com.avito.android.account.E e12 = z12.f271119m;
        String strA = e12 != null ? e12.a() : null;
        AdvertXlItem advertXlItem = this.f271079b;
        z12.f271112f.c(new C50083b(strA, advertXlItem.f268776b0, advertXlItem.f268777c, advertXlItem.f268774a0, PinchToZoomSource.f219964c));
    }
}
