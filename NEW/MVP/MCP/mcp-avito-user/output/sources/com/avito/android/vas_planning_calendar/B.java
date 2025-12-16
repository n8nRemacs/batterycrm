package com.avito.android.vas_planning_calendar;

import androidx.recyclerview.widget.C23424o;
import eM0.C40022a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PlanCalendarViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LTV0/a;", "newItems", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f322557b;

    public B(M m12) {
        this.f322557b = m12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List list = (List) obj;
        M m12 = this.f322557b;
        com.avito.konveyor.adapter.a aVar = m12.f322589c0;
        if (aVar != null) {
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
        }
        m12.f322585Y.setValue(G0.f406611a);
        m12.f322584X.setValue(C23424o.a(new C40022a(m12.f322590d0, list), true));
        m12.f322590d0 = C42745f0.M0(list);
    }
}
