package com.avito.android.lib.beduin_v2.component.date_picker;

import com.avito.android.lib.beduin_v2.component.date_picker.a;
import com.avito.beduin.v2.avito.component.date_picker.state.AvitoDatePickerState;
import com.avito.beduin.v2.avito.component.date_picker.state.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.o;

/* compiled from: DatePickerComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/ranges/o;", "selectedDates", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.l<List<? extends o>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AvitoDatePickerState f175537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f175538m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AvitoDatePickerState avitoDatePickerState, a aVar) {
        super(1);
        this.f175537l = avitoDatePickerState;
        this.f175538m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends o> list) {
        List<? extends o> list2 = list;
        Y41.l<List<x>, G0> lVar = this.f175537l.f334162m;
        if (lVar != null) {
            List<? extends o> list3 = list2;
            ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (o oVar : list3) {
                a.C5183a c5183a = a.f175531q;
                this.f175538m.getClass();
                arrayList.add(new x(new ST0.d(String.valueOf(oVar.f406915b)), new ST0.d(String.valueOf(oVar.f406916c))));
            }
            lVar.invoke(arrayList);
        }
        return G0.f406611a;
    }
}
