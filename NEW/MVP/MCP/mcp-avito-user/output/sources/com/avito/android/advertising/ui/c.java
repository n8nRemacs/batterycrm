package com.avito.android.advertising.ui;

import android.graphics.Rect;
import kotlin.Metadata;

/* compiled from: AdStylableViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/c;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: AdStylableViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(@Y61.k c cVar) {
            return cVar.getStyle() == AdStyle.f88545j;
        }

        public static boolean b(@Y61.k c cVar) {
            return cVar.getStyle().b();
        }
    }

    boolean DH();

    @Y61.k
    Rect Ns();

    @Y61.k
    AdStyle getStyle();

    boolean yi();
}
