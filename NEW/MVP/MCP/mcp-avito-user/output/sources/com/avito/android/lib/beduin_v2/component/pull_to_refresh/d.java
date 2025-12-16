package com.avito.android.lib.beduin_v2.component.pull_to_refresh;

import Y61.k;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.akita.view.component.pull_to_refresh.i;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.beduin.v2.avito.component.pull_to_refresh.i;
import com.avito.beduin.v2.render.android_view.AbstractC36331a;
import com.avito.beduin.v2.theme.m;
import i3.C41216a;
import kT.AbstractC42628a;
import kotlin.Metadata;

/* compiled from: PullToRefreshStyleComposer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/pull_to_refresh/d;", "LkT/a;", "Lcom/avito/beduin/v2/avito/component/pull_to_refresh/i;", "Li3/a;", "_design-modules_beduin-v2_renderer_component_pull-to-refresh"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends AbstractC42628a<i, C41216a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41216a f175870c;

    public d(@k androidx.appcompat.view.d dVar) throws Resources.NotFoundException {
        super(dVar);
        C41216a.C11365a c11365a = C41216a.f398349d;
        int iJ2 = C35835l0.j(R.attr.pullToRefreshMedium, this.f406282b);
        c11365a.getClass();
        TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(iJ2, i.c.f66989a);
        C41216a c41216a = new C41216a(typedArrayObtainStyledAttributes.getColor(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.f175870c = c41216a;
    }

    @Override // com.avito.beduin.v2.theme.AbstractC36354b
    public final Object d() {
        return this.f175870c;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36331a
    public final Object h(AbstractC36331a.C10471a c10471a, Object obj, m mVar) {
        C41216a c41216a = (C41216a) obj;
        com.avito.beduin.v2.avito.component.pull_to_refresh.i iVar = (com.avito.beduin.v2.avito.component.pull_to_refresh.i) mVar;
        Integer numA = AbstractC36331a.C10471a.a((AbstractC42628a.C11616a) c10471a, iVar.f334874e);
        int iIntValue = numA != null ? numA.intValue() : c41216a.f398350a;
        Integer numC = AbstractC42628a.C11616a.c(iVar.f334872c);
        int iIntValue2 = numC != null ? numC.intValue() : c41216a.f398351b;
        Integer numC2 = AbstractC42628a.C11616a.c(iVar.f334873d);
        return new C41216a(iIntValue, iIntValue2, numC2 != null ? numC2.intValue() : c41216a.f398352c);
    }
}
