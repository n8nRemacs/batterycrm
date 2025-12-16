package com.avito.android.image_loader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import j.InterfaceC42158n;
import kotlin.Metadata;

/* compiled from: ForegroundConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/image_loader/d;", "", "_avito_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {

    /* compiled from: ForegroundConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Drawable a(d dVar, Context context, k kVar, From from, Integer num, int i12) {
            if ((i12 & 4) != 0) {
                from = From.f169444d;
            }
            if ((i12 & 8) != 0) {
                num = null;
            }
            return dVar.a(context, from, num, (i12 & 16) != 0 ? R.color.black_alpha_4 : R.color.user_adverts_views_item_image_foreground_color);
        }
    }

    @Y61.l
    BM.a a(@Y61.k Context context, @Y61.k From from, @Y61.l Integer num, @InterfaceC42158n int i12);
}
