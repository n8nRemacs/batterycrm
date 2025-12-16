package com.avito.android.lib.design.tooltip;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: TailPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tooltip/c;", "Lcom/avito/android/lib/design/tooltip/h;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public Integer f181190a;

    @Override // com.avito.android.lib.design.tooltip.h
    public final int a() {
        Integer num = this.f181190a;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.avito.android.lib.design.tooltip.h
    @Y61.k
    @SuppressLint({"RtlHardcoded"})
    public final Q b(@Y61.k View view, @Y61.k n nVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        s.f181270a.getClass();
        Rect rectC = s.c(view);
        Rect rectC2 = s.c(nVar);
        int iA2 = s.a(rectC2, rectC);
        Rect rect = new Rect(nVar.getPaddingLeft() + rectC2.left, nVar.getPaddingTop() + rectC2.top, rectC2.right - nVar.getPaddingRight(), rectC2.bottom - nVar.getPaddingBottom());
        if (iA2 == 48 || iA2 == 80) {
            i12 = rectC.left;
            i13 = rectC.right;
        } else {
            i12 = rectC.top;
            i13 = rectC.bottom;
        }
        if (iA2 == 48 || iA2 == 80) {
            i14 = rectC2.left;
            i15 = rect.left;
            i16 = rect.right;
        } else {
            i14 = rectC2.top;
            i15 = rect.top;
            i16 = rect.bottom;
        }
        int iMax = Math.max(i15, i12);
        int iMin = Math.min(i16, i13);
        int iD2 = d(i15, i16);
        if (iMax > iD2 || iD2 > iMin) {
            iD2 = androidx.appcompat.app.r.f(iMin, iMax, 2, iMax);
        }
        int i17 = iD2 - i14;
        return iA2 != 3 ? iA2 != 5 ? iA2 != 48 ? new Q(Integer.valueOf(i17), Integer.valueOf(a())) : new Q(Integer.valueOf(i17), Integer.valueOf(rectC2.height() - a())) : new Q(Integer.valueOf(a()), Integer.valueOf(i17)) : new Q(Integer.valueOf(rectC2.width() - a()), Integer.valueOf(i17));
    }

    @Override // com.avito.android.lib.design.tooltip.h
    public final int c() {
        return (int) Math.sqrt(Math.pow(a() * 2.0d, 2.0d) / 2);
    }

    @Override // com.avito.android.lib.design.tooltip.a
    public void e(@Y61.k KV.a aVar) {
        if (this.f181190a == null) {
            this.f181190a = Integer.valueOf(aVar.f9477m);
        }
    }
}
