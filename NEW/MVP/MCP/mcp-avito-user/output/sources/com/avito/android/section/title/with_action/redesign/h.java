package com.avito.android.section.title.with_action.redesign;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.section.title.with_action.redesign.f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionTitleWithActionRedesignPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/title/with_action/redesign/h;", "Lcom/avito/android/section/title/with_action/redesign/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f264901b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f.b f264902c;

    @Inject
    public h(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k f.b bVar) {
        this.f264901b = aVar;
        this.f264902c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SectionTitleWithActionRedesignItem sectionTitleWithActionRedesignItem = (SectionTitleWithActionRedesignItem) aVar;
        ((c) eVar).mX(sectionTitleWithActionRedesignItem.f264888d, sectionTitleWithActionRedesignItem.f264889e, new g(sectionTitleWithActionRedesignItem, this));
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
