package com.avito.android.short_term_rent.bookingform.items.input;

import Y41.p;
import com.avito.android.short_term_rent.bookingform.items.input.FormInputState;
import com.avito.android.short_term_rent.bookingform.items.input.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AbsFormInputPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/input/e;", "LTV0/f;", "Lcom/avito/android/short_term_rent/bookingform/items/input/m;", "Lcom/avito/android/short_term_rent/bookingform/items/input/FormInputItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e implements TV0.f<m, FormInputItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<String, String, G0> f281559b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k p<? super String, ? super String, G0> pVar) {
        this.f281559b = pVar;
    }

    public static void O(m mVar, Integer num, Integer num2) {
        if (num == null && num2 == null) {
            mVar.h0();
            return;
        }
        if (L.f(num, num2) && num != null && num.intValue() == 1) {
            mVar.h0();
        } else {
            mVar.J1(num != null ? num.intValue() : 1, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((m) eVar, (FormInputItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        m mVar = (m) eVar;
        FormInputItem formInputItem = (FormInputItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        List<h> list2 = (List) (obj instanceof List ? obj : null);
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(mVar, formInputItem);
            return;
        }
        for (h hVar : list2) {
            if (hVar instanceof h.a) {
                mVar.setHint(((h.a) hVar).f281562a);
            } else if (hVar instanceof h.e) {
                mVar.Kb(((h.e) hVar).f281567a, true);
            } else if (hVar instanceof h.b) {
                mVar.setEnabled(((h.b) hVar).f281563a);
            } else if (hVar instanceof h.d) {
                FormInputState formInputState = ((h.d) hVar).f281566a;
                if (formInputState instanceof FormInputState.Normal) {
                    mVar.G();
                } else if (formInputState instanceof FormInputState.Error) {
                    mVar.G1(((FormInputState.Error) formInputState).f281548b);
                }
            } else if (hVar instanceof h.c) {
                h.c cVar = (h.c) hVar;
                O(mVar, cVar.f281564a, cVar.f281565b);
            }
        }
        mVar.o0(new c(mVar, this, formInputItem));
        mVar.s5(new d(this, formInputItem));
    }

    public final void k(@Y61.k m mVar, @Y61.k FormInputItem formInputItem) {
        mVar.v3(formInputItem.f281543f);
        mVar.Kb(formInputItem.f281541d, false);
        mVar.setHint(formInputItem.f281542e);
        O(mVar, formInputItem.f281545h, formInputItem.f281544g);
        mVar.setEnabled(formInputItem.f281546i);
        FormInputState formInputState = formInputItem.f281547j;
        if (formInputState instanceof FormInputState.Normal) {
            mVar.G();
        } else if (formInputState instanceof FormInputState.Error) {
            mVar.G1(((FormInputState.Error) formInputState).f281548b);
        }
        mVar.o0(new c(mVar, this, formInputItem));
        mVar.s5(new d(this, formInputItem));
    }
}
