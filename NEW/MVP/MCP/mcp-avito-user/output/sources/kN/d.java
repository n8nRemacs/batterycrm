package KN;

import Y61.k;
import Y61.l;
import com.avito.android.inline_filters.calendar.FlexDatesConfig;
import com.avito.android.inline_filters.di.t;
import com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState;
import com.avito.android.lib.design.chips.state.ItemChipable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerFlexDatesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKN/d;", "LKN/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f9437a;

    @Inject
    public d(@t @l Integer num) {
        this.f9437a = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState d(com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState r8, int r9) {
        /*
            r0 = 0
            int r1 = r8.f171273d
            r2 = 0
            java.util.List<com.avito.android.lib.design.chips.state.ItemChipable> r3 = r8.f171271b
            if (r9 == r1) goto L29
            java.util.Iterator r1 = r3.iterator()
            r4 = r2
        Ld:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L21
            java.lang.Object r5 = r1.next()
            com.avito.android.lib.design.chips.state.ItemChipable r5 = (com.avito.android.lib.design.chips.state.ItemChipable) r5
            int r5 = r5.f178762b
            if (r5 != r9) goto L1e
            goto L22
        L1e:
            int r4 = r4 + 1
            goto Ld
        L21:
            r4 = -1
        L22:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            if (r4 < 0) goto L29
            goto L2a
        L29:
            r1 = r0
        L2a:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L3b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r3.next()
            com.avito.android.lib.design.chips.state.ItemChipable r5 = (com.avito.android.lib.design.chips.state.ItemChipable) r5
            int r6 = r5.f178762b
            if (r6 != r9) goto L4d
            r6 = 1
            goto L4e
        L4d:
            r6 = r2
        L4e:
            r7 = 495(0x1ef, float:6.94E-43)
            com.avito.android.lib.design.chips.state.ItemChipable r5 = com.avito.android.lib.design.chips.state.ItemChipable.a(r5, r6, r0, r7)
            r4.add(r5)
            goto L3b
        L58:
            com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState r0 = new com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState
            int r8 = r8.f171272c
            r0.<init>(r8, r9, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: KN.d.d(com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState, int):com.avito.android.inline_filters.dialog.calendar.models.FlexDatesState");
    }

    @Override // KN.c
    @k
    public final FlexDatesState a(@k FlexDatesState flexDatesState, int i12) {
        return i12 == flexDatesState.f171273d ? d(flexDatesState, flexDatesState.f171272c) : d(flexDatesState, i12);
    }

    @Override // KN.c
    @k
    public final FlexDatesState b(@k FlexDatesState flexDatesState) {
        return d(flexDatesState, flexDatesState.f171272c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // KN.c
    @l
    public final FlexDatesState c(@l FlexDatesConfig flexDatesConfig) {
        int i12;
        if (flexDatesConfig == null) {
            return null;
        }
        Integer num = this.f9437a;
        int iIntValue = num != null ? num.intValue() : flexDatesConfig.f171058c;
        ArrayList arrayList = flexDatesConfig.f171057b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            FlexDatesConfig.Option option = (FlexDatesConfig.Option) it.next();
            int i13 = option.f171060b;
            if (i13 == iIntValue) {
                i12 = 1;
            }
            arrayList2.add(new ItemChipable(i13, null, null, null, i12, null, option.f171061c, false, false, 430, null));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            }
            if (((FlexDatesConfig.Option) it2.next()).f171060b == iIntValue) {
                break;
            }
            i12++;
        }
        return new FlexDatesState(flexDatesConfig.f171059d, iIntValue, Integer.valueOf(i12), arrayList2);
    }
}
