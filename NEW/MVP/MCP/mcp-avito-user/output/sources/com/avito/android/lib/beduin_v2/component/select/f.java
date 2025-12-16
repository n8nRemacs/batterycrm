package com.avito.android.lib.beduin_v2.component.select;

import Y61.k;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.select.style.d;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.select.state.r;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.render.android_view.D;
import com.avito.beduin.v2.theme.m;
import j.InterfaceC42150f;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: SelectStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/select/f;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/select/state/r;", "Lcom/avito/android/lib/design/select/style/d;", "_design-modules_beduin-v2_renderer_component_select"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends AbstractC42628a<r, com.avito.android.lib.design.select.style.d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.select.style.d f175889c;

    public f(@k androidx.appcompat.view.d dVar, @InterfaceC42150f int i12) throws Resources.NotFoundException {
        super(dVar);
        d.a aVar = com.avito.android.lib.design.select.style.d.f180318f;
        int iJ2 = C35835l0.j(i12, this.f406282b);
        aVar.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, d.n.f179001w0);
        com.avito.android.lib.design.select.style.d dVarB = d.a.b(typedArrayObtainStyledAttributes, dVar);
        typedArrayObtainStyledAttributes.recycle();
        this.f175889c = dVarB;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175889c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        AbstractC42628a.C11616a c11616a = (AbstractC42628a.C11616a) c10471a;
        com.avito.android.lib.design.select.style.d dVar = (com.avito.android.lib.design.select.style.d) obj;
        r rVar = (r) mVar;
        com.avito.android.lib.design.select.style.c cVar = (com.avito.android.lib.design.select.style.c) D.b(rVar.f335032c, c11616a.f337938b, dVar.f180319a);
        String strA = rVar.f335035f.a();
        return new com.avito.android.lib.design.select.style.d(cVar, dVar.f180320b, dVar.f180321c, strA != null ? (Drawable) c11616a.f337938b.f338363a.c(strA, null) : dVar.f180322d, dVar.f180323e);
    }
}
