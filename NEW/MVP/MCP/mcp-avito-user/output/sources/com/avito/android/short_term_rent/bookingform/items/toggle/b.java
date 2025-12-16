package com.avito.android.short_term_rent.bookingform.items.toggle;

import Y41.r;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.short_term_rent.bookingform.items.toggle.g;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: AbsToggleOptionsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/toggle/b;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle/l;", "Lcom/avito/android/short_term_rent/bookingform/items/toggle/ToggleOptionsItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b implements TV0.f<l, ToggleOptionsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r<String, String, a.r.InterfaceC8403a, Boolean, G0> f281707b;

    /* compiled from: AbsToggleOptionsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ToggleOptionsDisplayType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleOptionsDisplayType toggleOptionsDisplayType = ToggleOptionsDisplayType.f281696b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleOptionsDisplayType toggleOptionsDisplayType2 = ToggleOptionsDisplayType.f281696b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ToggleOptionsDisplayType toggleOptionsDisplayType3 = ToggleOptionsDisplayType.f281696b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k r<? super String, ? super String, ? super a.r.InterfaceC8403a, ? super Boolean, G0> rVar) {
        this.f281707b = rVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (ToggleOptionsItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        l lVar = (l) eVar;
        ToggleOptionsItem toggleOptionsItem = (ToggleOptionsItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<g> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(lVar, toggleOptionsItem);
            return;
        }
        for (g gVar : list2) {
            if (gVar instanceof g.a) {
                lVar.pd(((g.a) gVar).f281714a);
            } else if (gVar instanceof g.b) {
                lVar.jO(((g.b) gVar).f281715a);
            }
        }
        lVar.i5(new c(this, toggleOptionsItem));
    }

    public final void k(@Y61.k l lVar, @Y61.k ToggleOptionsItem toggleOptionsItem) {
        Chips.DisplayType displayType;
        int iOrdinal = toggleOptionsItem.f281701d.ordinal();
        if (iOrdinal == 0) {
            displayType = Chips.DisplayType.f178701b;
        } else if (iOrdinal == 1) {
            displayType = Chips.DisplayType.f178702c;
        } else if (iOrdinal == 2) {
            displayType = Chips.DisplayType.f178703d;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            displayType = Chips.DisplayType.f178704e;
        }
        lVar.m2(displayType);
        lVar.pd(toggleOptionsItem.f281702e);
        lVar.jO(toggleOptionsItem.f281703f);
        lVar.i5(new d(this, toggleOptionsItem));
    }
}
