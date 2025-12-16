package com.avito.android.section.title.with_action.redesign;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SectionTitleWithActionRedesignPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SectionTitleWithActionRedesignItem f264899l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f264900m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SectionTitleWithActionRedesignItem sectionTitleWithActionRedesignItem, h hVar) {
        super(0);
        this.f264899l = sectionTitleWithActionRedesignItem;
        this.f264900m = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Action action = this.f264899l.f264890f;
        G0 g02 = null;
        h hVar = this.f264900m;
        if (action != null) {
            b.a.a(hVar.f264901b, action.getDeepLink(), null, null, 6);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            hVar.f264902c.o();
        }
        return G0.f406611a;
    }
}
