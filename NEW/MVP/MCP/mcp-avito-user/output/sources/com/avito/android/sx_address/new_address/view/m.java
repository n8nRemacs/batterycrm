package com.avito.android.sx_address.new_address.view;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.sx_address.new_address.analytics.FormInputFieldName;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.view.l;
import com.avito.android.sx_address.new_address.view.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScheduleView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/m;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f293924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FormInputFieldName, G0> f293925b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(l lVar, Y41.l<? super FormInputFieldName, G0> lVar2) {
        this.f293924a = lVar;
        this.f293925b = lVar2;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        l.a aVar = hVar instanceof l.a ? (l.a) hVar : null;
        l lVar = this.f293924a;
        if (aVar != null) {
            lVar.f293905c.K5(ScheduleType.f293619d);
        }
        lVar.f293914l.setLayoutTransition(lVar.f293915m);
        lVar.f293914l.getViewTreeObserver().addOnDrawListener(lVar.f293912j);
        ((r.l) this.f293925b).invoke(FormInputFieldName.f293569f);
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        l.a aVar = hVar instanceof l.a ? (l.a) hVar : null;
        l lVar = this.f293924a;
        if (aVar != null) {
            lVar.f293905c.K5(aVar.f293916b);
        }
        lVar.f293914l.setLayoutTransition(lVar.f293915m);
        lVar.f293914l.getViewTreeObserver().addOnDrawListener(lVar.f293912j);
        ((r.l) this.f293925b).invoke(FormInputFieldName.f293569f);
    }
}
