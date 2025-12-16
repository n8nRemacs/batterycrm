package com.avito.android.tariff_lf.edit_info.viewmodel;

import androidx.view.C23038g0;
import cD0.C27012f;
import com.avito.android.remote.error.ApiError;
import com.avito.android.tariff_lf.edit_info.viewmodel.k;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditInfoViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LcD0/f;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f299080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f299081c;

    public D(r rVar, boolean z12) {
        this.f299080b = rVar;
        this.f299081c = z12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        r rVar = this.f299080b;
        rVar.getClass();
        boolean z12 = p22 instanceof P2.b;
        C23038g0<List<com.avito.conveyor_item.a>> c23038g0 = rVar.f299126S;
        if (z12) {
            ArrayList arrayListLe = r.le(rVar.f299121N, ((C27012f) ((P2.b) p22).f318720a).getAutoProlong(), true);
            c23038g0.postValue(arrayListLe);
            rVar.f299121N = arrayListLe;
        } else {
            if (!(p22 instanceof P2.a)) {
                L.f(p22, P2.c.f318721a);
                return;
            }
            C23038g0<k.a> c23038g02 = rVar.f299128U;
            ApiError apiError = ((P2.a) p22).f318719a;
            c23038g02.postValue(new k.a(apiError, apiError.getF244063c()));
            ArrayList arrayListLe2 = r.le(rVar.f299121N, !this.f299081c, true);
            c23038g0.postValue(arrayListLe2);
            rVar.f299121N = arrayListLe2;
        }
    }
}
