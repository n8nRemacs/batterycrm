package com.avito.android.image_loader;

import android.content.Context;
import com.avito.android.R;
import j.InterfaceC42158n;
import kotlin.Metadata;

/* compiled from: ForegroundConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/image_loader/g;", "Lcom/avito/android/image_loader/d;", "<init>", "()V", "_avito_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements d {
    @Override // com.avito.android.image_loader.d
    @Y61.l
    public final BM.a a(@Y61.k Context context, @Y61.k From from, @Y61.l Integer num, @InterfaceC42158n int i12) {
        int iIntValue = num != null ? num.intValue() : context.getResources().getDimensionPixelSize(R.dimen.foreground_default_corners);
        if (from == From.f169443c || from == From.f169442b) {
            return null;
        }
        return new BM.a(androidx.core.content.d.getColor(context, i12), iIntValue);
    }
}
