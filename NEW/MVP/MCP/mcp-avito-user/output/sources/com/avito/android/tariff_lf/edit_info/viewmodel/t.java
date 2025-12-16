package com.avito.android.tariff_lf.edit_info.viewmodel;

import com.avito.android.tariff_lf.edit_info.item.button.k;
import kotlin.Metadata;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/button/k;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/tariff_lf/edit_info/item/button/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f299152b;

    public t(r rVar) {
        this.f299152b = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.tariff_lf.edit_info.item.button.k kVar = (com.avito.android.tariff_lf.edit_info.item.button.k) obj;
        boolean z12 = kVar instanceof k.a;
        r rVar = this.f299152b;
        if (z12) {
            rVar.f299130W.setValue(null);
        } else if (kVar instanceof k.b) {
            rVar.getClass();
        }
    }
}
