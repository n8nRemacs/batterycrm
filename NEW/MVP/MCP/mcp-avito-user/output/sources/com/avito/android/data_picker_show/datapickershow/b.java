package com.avito.android.data_picker_show.datapickershow;

import Y41.l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.m;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: DataPickerShowFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu/c;", "it", "Lkotlin/G0;", "invoke", "(Lgu/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements l<gu.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DataPickerShowFragment f132494l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataPickerShowFragment dataPickerShowFragment) {
        super(1);
        this.f132494l = dataPickerShowFragment;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.l
    public final G0 invoke(gu.c cVar) {
        Object next;
        gu.c cVar2 = cVar;
        DataPickerShowFragment dataPickerShowFragment = this.f132494l;
        e eVar = dataPickerShowFragment.f132481p0;
        if (eVar == null) {
            eVar = null;
        }
        a aVar = new a(1, (j) dataPickerShowFragment.f132474i0.getValue(), j.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        d dVar = eVar.f132502c;
        ((Button) dVar.f132497c.getValue()).setState(new UU.a(cVar2.f396937f, null, false, false, false, new g(aVar), null, null, null, false, 990, null));
        List<List<com.avito.android.lib.design.picker.k<Integer>>> list = cVar2.f396933b;
        if (list != null) {
            ?? r22 = dVar.f132496b;
            if (!r22.isInitialized()) {
                Picker picker = (Picker) r22.getValue();
                picker.e();
                picker.f();
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    List<? extends com.avito.android.lib.design.picker.k<?>> list2 = (List) obj;
                    m mVar = new m(null, false, 0, 5, null);
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        String str = ((com.avito.android.lib.design.picker.k) next).f180047b;
                        List<String> list3 = cVar2.f396934c;
                        if (L.f(str, list3 != null ? (String) C42745f0.K(i12, list3) : null)) {
                            break;
                        }
                    }
                    picker.c(list2, mVar, (com.avito.android.lib.design.picker.k) next, new f(eVar, i12));
                    if (i12 < list.size() - 1) {
                        picker.a(cVar2.f396935d);
                    }
                    i12 = i13;
                }
            }
        }
        com.avito.android.lib.design.bottom_sheet.d.M(eVar.f132501b, cVar2.f396936e, true, true, 2);
        return G0.f406611a;
    }
}
