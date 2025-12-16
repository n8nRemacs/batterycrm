package com.avito.android.gig_apply.mvi;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_apply.ui.GigApplyOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import mH.C43962a;
import nH.C44252a;
import pH.AbstractC46954b;
import pH.AbstractC46955c;

/* compiled from: GigApplyOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_apply/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LpH/b;", "LpH/c;", "_avito_gig_apply-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements com.avito.android.arch.mvi.t<AbstractC46954b, AbstractC46955c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigApplyOpenParams f159730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f159731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f159732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43962a f159733e;

    @Inject
    public h(@Y61.k GigApplyOpenParams gigApplyOpenParams, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k C43962a c43962a) {
        this.f159730b = gigApplyOpenParams;
        this.f159731c = aVar;
        this.f159732d = xVar;
        this.f159733e = c43962a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC46955c b(AbstractC46954b abstractC46954b) {
        AbstractC46954b abstractC46954b2 = abstractC46954b;
        if (abstractC46954b2 instanceof AbstractC46954b.a) {
            AbstractC46954b.a aVar = (AbstractC46954b.a) abstractC46954b2;
            Long lValueOf = Long.valueOf(this.f159730b.f159857b);
            C43962a c43962a = this.f159733e;
            c43962a.getClass();
            c43962a.f414441a.c(new C44252a(lValueOf, aVar.f428305b));
            b.a.a(this.f159731c, aVar.f428304a, null, null, 6);
            return AbstractC46955c.a.f428312a;
        }
        if (!(abstractC46954b2 instanceof AbstractC46954b.d)) {
            if (abstractC46954b2 instanceof AbstractC46954b.f) {
                return AbstractC46955c.C12260c.f428317a;
            }
            return null;
        }
        AbstractC46954b.d dVar = (AbstractC46954b.d) abstractC46954b2;
        AF.b bVar = dVar.f428308a;
        String title = bVar.getTitle();
        String description = bVar.getDescription();
        AF.a aVar2 = dVar.f428309b;
        String label = aVar2.getLabel();
        String uri = aVar2.getUri();
        return new AbstractC46955c.b(title, description, label, uri != null ? this.f159732d.b(uri) : null);
    }
}
