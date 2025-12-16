package com.avito.android.extended_profile_widgets.adapter.info;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/info/e;", "Lcom/avito/android/extended_profile_widgets/adapter/info/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154477b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super oB.k, G0> lVar) {
        this.f154477b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        TextItem textItem = (TextItem) aVar;
        d dVar = new d(gVar, textItem, this);
        if (!textItem.f154466h) {
            dVar = null;
        }
        gVar.lf(textItem, dVar);
    }
}
