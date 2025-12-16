package com.avito.android.lib.beduin_v2.component.banner;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.banner.a;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.button.banner.m;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: BannerStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/banner/c;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/button/banner/m;", "Lcom/avito/android/lib/design/banner/a;", "_design-modules_beduin-v2_renderer_component_banner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC42628a<m, com.avito.android.lib.design.banner.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.banner.a f175510c;

    public c(@k Context context, @InterfaceC42150f int i12) {
        super(context);
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c5258a.getClass();
        this.f175510c = a.C5258a.b(iJ2, context);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175510c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, com.avito.beduin.v2.theme.m mVar) {
        com.avito.android.lib.design.banner.a aVar = (com.avito.android.lib.design.banner.a) obj;
        Boolean boolA = ((m) mVar).f333931c.a();
        return com.avito.android.lib.design.banner.a.a(aVar, null, null, null, 0, 0, 0, 0, boolA != null ? boolA.booleanValue() : aVar.f178458j, 0.0f, false, false, 8388095);
    }
}
