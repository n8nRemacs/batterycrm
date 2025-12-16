package com.akita.compose.component.date_picker;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22132o;
import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DatePickerState.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"date-picker_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E {
    @InterfaceC22132o
    @Y61.k
    public static final C a(@Y61.l List list, @Y61.l Long l12, int i12, @Y61.l Long l13, @Y61.l DatePickerSelectionType datePickerSelectionType, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l androidx.compose.runtime.A a12, int i13) {
        a12.C(-1144496070);
        boolean z16 = (i13 & 256) != 0 ? false : z15;
        Object[] objArr = {l12, Integer.valueOf(i12), l13, datePickerSelectionType, Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z16)};
        C.f61115b.getClass();
        A a13 = A.f61113l;
        B b12 = B.f61114l;
        androidx.compose.runtime.saveable.w wVar = androidx.compose.runtime.saveable.v.f38606a;
        C c12 = (C) androidx.compose.runtime.saveable.j.c(objArr, new androidx.compose.runtime.saveable.w(b12, a13), new D(list, l12, i12, l13, datePickerSelectionType, z12, z13, z14, z16), a12, 72, 4);
        ((C22082i3) c12.f61116a.f61183n).setValue(list);
        ((C22082i3) c12.f61116a.f61178i).setValue(Boolean.valueOf(z14));
        a12.h();
        return c12;
    }
}
