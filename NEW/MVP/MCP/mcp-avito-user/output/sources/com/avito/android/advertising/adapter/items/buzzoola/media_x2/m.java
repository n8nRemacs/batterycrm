package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;

/* compiled from: BuzzoolaMediaX2ViewHolderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/m;", "Lcom/facebook/drawee/drawable/s$a;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class m extends s.a {
    @Override // com.facebook.drawee.drawable.s.a
    public final void b(@Y61.k Matrix matrix, @Y61.k Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
        float fWidth;
        float fHeight;
        if (f15 > f14) {
            fWidth = ((rect.width() - (i12 * f15)) * 0.5f) + rect.left;
            fHeight = rect.top;
            f14 = f15;
        } else {
            fWidth = rect.left;
            fHeight = ((rect.height() - (i13 * f14)) * f13) + rect.top;
        }
        matrix.setScale(f14, f14);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }
}
