package com.avito.android.advertising.ui.buzzoola;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import kotlin.Metadata;

/* compiled from: AdBuzzoolaPremium.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/c;", "Lcom/avito/android/advertising/ui/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c extends com.avito.android.advertising.ui.c {

    /* compiled from: AdBuzzoolaPremium.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@Y61.k c cVar, boolean z12) {
            boolean z13;
            if (z12) {
                cVar.V6().setVisibility(0);
                TextView textViewV6 = cVar.V6();
                com.avito.android.advertising.ui.h hVar = com.avito.android.advertising.ui.h.f88704a;
                Resources resources = cVar.getView().getResources();
                String string = cVar.getView().getContext().getString(R.string.advertising_badge_name);
                z13 = cVar.getF4090c() != AdStyle.f88542g;
                hVar.getClass();
                textViewV6.setText(com.avito.android.advertising.ui.h.c(resources, string, null, z13));
                return;
            }
            TextView textViewV62 = cVar.V6();
            AdStyle f4090c = cVar.getF4090c();
            AdStyle adStyle = AdStyle.f88542g;
            textViewV62.setVisibility(f4090c == adStyle ? 8 : 0);
            TextView textViewV63 = cVar.V6();
            com.avito.android.advertising.ui.h hVar2 = com.avito.android.advertising.ui.h.f88704a;
            Resources resources2 = cVar.getView().getResources();
            z13 = cVar.getF4090c() != adStyle;
            hVar2.getClass();
            textViewV63.setText(com.avito.android.advertising.ui.h.c(resources2, null, null, z13));
        }
    }

    void Q10(boolean z12);

    @Y61.k
    TextView V6();

    @Y61.k
    View getView();
}
