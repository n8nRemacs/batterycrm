package com.avito.android.lib.beduin_v2.component.tooltip;

import KV.a;
import Y61.k;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.tooltip.state.n;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: TooltipStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/tooltip/f;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/tooltip/state/n;", "LKV/a;", "_design-modules_beduin-v2_renderer_component_tooltip"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends AbstractC42628a<n, KV.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final KV.a f175963c;

    public f(@k androidx.appcompat.view.d dVar, @InterfaceC42150f int i12) {
        super(dVar);
        a.C0572a c0572a = KV.a.f9464v;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        c0572a.getClass();
        this.f175963c = a.C0572a.b(iJ2, dVar);
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175963c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        return (KV.a) obj;
    }
}
