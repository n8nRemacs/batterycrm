package com.avito.android.comfortable_deal.date_time_pickers.date;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DatePickerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/date/d;", "Lcom/avito/android/comfortable_deal/date_time_pickers/date/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f120915a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Integer, Integer, Boolean> f120916b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public View f120917c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f120918d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f120919e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k Y41.a<G0> aVar, @k p<? super Integer, ? super Integer, Boolean> pVar) {
        this.f120915a = aVar;
        this.f120916b = pVar;
        kotlin.ranges.l lVar = new kotlin.ranges.l(1, 31, 1);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVar, 10));
        kotlin.ranges.k it = lVar.iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(iA2), String.valueOf(iA2)));
        }
        this.f120918d = arrayList;
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList2 = com.avito.android.lib.design.picker.k.f180044e;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        int i12 = 0;
        for (Object obj : arrayList2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList3.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), ((com.avito.android.lib.design.picker.k) obj).f180047b));
            i12 = i13;
        }
        this.f120919e = arrayList3;
    }
}
