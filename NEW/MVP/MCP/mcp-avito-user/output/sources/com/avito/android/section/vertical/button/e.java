package com.avito.android.section.vertical.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionVerticalButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/vertical/button/e;", "Lcom/avito/android/section/vertical/button/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f264957b;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f264957b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SectionVerticalButtonItem sectionVerticalButtonItem = (SectionVerticalButtonItem) aVar;
        ((g) eVar).l4(sectionVerticalButtonItem.f264949d, new d(this, sectionVerticalButtonItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void r0(com.avito.konveyor.adapter.b bVar, int i12) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.recycler.responsive.g
    public final /* bridge */ /* synthetic */ void t0(com.avito.konveyor.adapter.b bVar, int i12) {
    }
}
