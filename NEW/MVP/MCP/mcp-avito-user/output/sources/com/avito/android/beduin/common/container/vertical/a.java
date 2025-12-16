package com.avito.android.beduin.common.container.vertical;

import Y61.l;
import android.view.View;
import com.avito.android.lib.util.layout.ForegroundLinearLayout;
import j.U;
import kotlin.Metadata;

/* compiled from: BeduinForegroundLinearLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/container/vertical/a;", "Lcom/avito/android/lib/util/layout/ForegroundLinearLayout;", "", "d", "Ljava/lang/Integer;", "getMaxWidthInPx", "()Ljava/lang/Integer;", "setMaxWidthInPx", "(Ljava/lang/Integer;)V", "maxWidthInPx", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends ForegroundLinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @U
    @l
    public Integer maxWidthInPx;

    @l
    public final Integer getMaxWidthInPx() {
        return this.maxWidthInPx;
    }

    @Override // com.avito.android.lib.util.layout.ForegroundLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int iIntValue;
        super.onMeasure(i12, i13);
        Integer num = this.maxWidthInPx;
        if (num == null || (iIntValue = num.intValue()) >= getMeasuredWidth()) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), i13);
    }

    public final void setMaxWidthInPx(@l Integer num) {
        this.maxWidthInPx = num;
    }
}
