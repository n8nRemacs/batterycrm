package com.avito.android.tariff_lf.edit_info.viewmodel;

import aD0.C19758a;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/manager_call/c;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf/edit_info/item/manager_call/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f299158b;

    public y(r rVar) {
        this.f299158b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.tariff_lf.edit_info.item.manager_call.c cVar = (com.avito.android.tariff_lf.edit_info.item.manager_call.c) obj;
        r rVar = this.f299158b;
        rVar.f299132Y.postValue(new C19758a(cVar.f299015c, cVar.f299016d, cVar.f299017e, null, new x(rVar, cVar), null, R.attr.buttonAccentLarge, Integer.valueOf(R.attr.ic_call20), 32, null));
    }
}
