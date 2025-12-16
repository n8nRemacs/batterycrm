package com.yandex.div.core.tooltip;

import Y41.q;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivTooltipController.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "c", "", "w", "h", "Lcom/yandex/div/core/util/h;", "invoke", "(Landroid/view/View;II)Lcom/yandex/div/core/util/h;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class c extends N implements q<View, Integer, Integer, com.yandex.div.core.util.h> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f367749l = new c();

    public c() {
        super(3);
    }

    @Override // Y41.q
    public final com.yandex.div.core.util.h invoke(View view, Integer num, Integer num2) {
        return new j(view, num.intValue(), num2.intValue(), false, 8, null);
    }
}
