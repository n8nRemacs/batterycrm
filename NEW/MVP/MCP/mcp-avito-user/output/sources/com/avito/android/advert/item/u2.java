package com.avito.android.advert.item;

import android.graphics.Rect;
import com.avito.konveyor.adapter.b;
import kotlin.Metadata;

/* compiled from: StickyButtonVisibilityBeduinTuner.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/u2;", "Lcom/avito/konveyor/adapter/b;", "T", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class u2<T extends com.avito.konveyor.adapter.b> {
    public abstract int a(@Y61.k T t12);

    public final int b(@Y61.k T t12) {
        Rect rect = new Rect();
        t12.itemView.getGlobalVisibleRect(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        return a(t12);
    }
}
