package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import kotlin.Metadata;
import y80.C50082a;
import y80.C50083b;

/* compiled from: DevelopmentRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/p;", "Lz80/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34771p implements z80.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C34773s f271001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DevelopmentItem f271002b;

    public C34771p(DevelopmentItem developmentItem, C34773s c34773s) {
        this.f271001a = c34773s;
        this.f271002b = developmentItem;
    }

    @Override // z80.e
    public final void a(@Y61.l Integer num) {
        C34773s c34773s = this.f271001a;
        c34773s.f271006c.c(new C50082a(c34773s.f271008e.a(), null, this.f271002b.f270894c, num, null, PinchToZoomSource.f219964c));
    }

    @Override // z80.e
    public final void b() {
        C34773s c34773s = this.f271001a;
        c34773s.f271006c.c(new C50083b(c34773s.f271008e.a(), null, this.f271002b.f270894c, null, PinchToZoomSource.f219964c));
    }
}
