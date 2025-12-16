package com.avito.android.select.bottom_sheet;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDiffItemCallback.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/n;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends C23424o.f<TV0.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.a f265323a;

    public n(@Y61.k com.avito.android.recycler.data_aware.a aVar) {
        this.f265323a = aVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof com.avito.android.select.variant.a) && (aVar4 instanceof com.avito.android.select.variant.a)) {
            com.avito.android.select.variant.a aVar5 = (com.avito.android.select.variant.a) aVar3;
            com.avito.android.select.variant.a aVar6 = (com.avito.android.select.variant.a) aVar4;
            if (L.f(aVar5.f266835c, aVar6.f266835c) && aVar5.f266842j == aVar6.f266842j && L.f(aVar5.f266836d, aVar6.f266836d) && aVar5.f266847o == aVar6.f266847o) {
                return true;
            }
        } else if ((aVar3 instanceof com.avito.android.select.bottom_sheet.blueprints.group.a) && (aVar4 instanceof com.avito.android.select.bottom_sheet.blueprints.group.a)) {
            com.avito.android.select.bottom_sheet.blueprints.group.a aVar7 = (com.avito.android.select.bottom_sheet.blueprints.group.a) aVar3;
            com.avito.android.select.bottom_sheet.blueprints.group.a aVar8 = (com.avito.android.select.bottom_sheet.blueprints.group.a) aVar4;
            if (L.f(aVar7.f265090c, aVar8.f265090c) && aVar7.f265092e == aVar8.f265092e && aVar7.f265094g == aVar8.f265094g) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        return aVar.getF248508b() == aVar2.getF248508b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        return this.f265323a.a(aVar, aVar2);
    }
}
