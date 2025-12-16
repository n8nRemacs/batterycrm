package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/f;", "Lz80/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34783f implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C34797u f271167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271168b;

    public C34783f(AdvertItem advertItem, C34797u c34797u) {
        this.f271167a = c34797u;
        this.f271168b = advertItem;
    }

    @Override // z80.e
    public final void a(@Y61.l Integer num) {
        C34797u c34797u = this.f271167a;
        com.avito.android.account.E e12 = c34797u.f271221l;
        String strA = e12 != null ? e12.a() : null;
        AdvertItem advertItem = this.f271168b;
        c34797u.f271214e.c(new C50082a(strA, advertItem.f268420a0, advertItem.f268425c, num, advertItem.f268455p0, PinchToZoomSource.f219964c));
    }

    @Override // z80.e
    public final void b() {
        C34797u c34797u = this.f271167a;
        com.avito.android.account.E e12 = c34797u.f271221l;
        String strA = e12 != null ? e12.a() : null;
        AdvertItem advertItem = this.f271168b;
        c34797u.f271214e.c(new C50083b(strA, advertItem.f268420a0, advertItem.f268425c, advertItem.f268455p0, PinchToZoomSource.f219964c));
    }
}
