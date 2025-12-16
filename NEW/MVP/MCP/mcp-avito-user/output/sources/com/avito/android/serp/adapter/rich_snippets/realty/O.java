package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: DevelopmentXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/O;", "Lz80/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class O implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f270953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DevelopmentXlItem f270954b;

    public O(DevelopmentXlItem developmentXlItem, S s5) {
        this.f270953a = s5;
        this.f270954b = developmentXlItem;
    }

    @Override // z80.e
    public final void a(@Y61.l Integer num) {
        S s5 = this.f270953a;
        s5.f270958c.c(new C50082a(s5.f270960e.a(), null, this.f270954b.f270913c, num, null, PinchToZoomSource.f219964c));
    }

    @Override // z80.e
    public final void b() {
        S s5 = this.f270953a;
        s5.f270958c.c(new C50083b(s5.f270960e.a(), null, this.f270954b.f270913c, null, PinchToZoomSource.f219964c));
    }
}
