package com.avito.android.lib.design.select;

import LV.d;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.style.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BaseSelect.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/select/BaseSelect;", "Lcom/avito/android/lib/design/input/Input;", "LLV/d;", "Lcom/avito/android/lib/design/select/style/d;", "newStyle", "Lkotlin/G0;", "setStyle", "(Lcom/avito/android/lib/design/select/style/d;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class BaseSelect extends Input implements d<com.avito.android.lib.design.select.style.d> {

    /* renamed from: e0, reason: collision with root package name */
    @l
    public c f180248e0;

    @j
    public BaseSelect(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public /* synthetic */ BaseSelect(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.baseSelect : i12, (i14 & 8) != 0 ? R.style.Design_Widget_BaseSelect : i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.select.style.d r18) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.select.BaseSelect.setStyle(com.avito.android.lib.design.select.style.d):void");
    }

    @j
    public BaseSelect(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        setClearButtonIgnoresRightIcon(true);
    }
}
