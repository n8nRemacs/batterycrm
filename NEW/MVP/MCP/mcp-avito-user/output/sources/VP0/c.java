package Vp0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.section.title.with_action.SectionTitleWithActionItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionTitleWithActionPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVp0/c;", "LVp0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.section.title.a f17406b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.section.action.b f17407c;

    @Inject
    public c(@k com.avito.android.section.title.a aVar, @k com.avito.android.section.action.b bVar) {
        this.f17406b = aVar;
        this.f17407c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        InterfaceC15706a interfaceC15706a = (InterfaceC15706a) eVar;
        SectionTitleWithActionItem sectionTitleWithActionItem = (SectionTitleWithActionItem) aVar;
        this.f17406b.O5(interfaceC15706a, sectionTitleWithActionItem, i12);
        this.f17407c.O5(interfaceC15706a, sectionTitleWithActionItem, i12);
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
