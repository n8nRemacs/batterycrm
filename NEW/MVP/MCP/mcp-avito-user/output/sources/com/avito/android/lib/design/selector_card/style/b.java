package com.avito.android.lib.design.selector_card.style;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import com.akita.compose.theme.re23.style.C0;
import j.InterfaceC42156l;
import kotlin.Metadata;

/* compiled from: SelectorCardColorStateListProps.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    @l
    public static final a a(@l a aVar, @l @InterfaceC42156l Integer num, @l @InterfaceC42156l Integer num2, @l @InterfaceC42156l Integer num3, @l @InterfaceC42156l Integer num4) {
        if (aVar == null) {
            if (num == null) {
                return null;
            }
            return new a(num.intValue(), num2, num3, num4);
        }
        int iIntValue = aVar.f180429a;
        int iIntValue2 = num != null ? num.intValue() : iIntValue;
        Integer numValueOf = Integer.valueOf((num2 == null && (num2 = aVar.f180430b) == null) ? iIntValue : num2.intValue());
        Integer numValueOf2 = Integer.valueOf((num3 == null && (num3 = aVar.f180431c) == null) ? iIntValue : num3.intValue());
        if (num4 != null) {
            iIntValue = num4.intValue();
        } else {
            Integer num5 = aVar.f180432d;
            if (num5 != null) {
                iIntValue = num5.intValue();
            }
        }
        return new a(iIntValue2, numValueOf, numValueOf2, Integer.valueOf(iIntValue));
    }

    @k
    public static final a b(@k ColorStateList colorStateList) {
        return new a(colorStateList.getDefaultColor(), C0.e(colorStateList, a.f180427i), C0.e(colorStateList, a.f180425g), C0.e(colorStateList, a.f180426h));
    }
}
