package com.avito.android.photo_gallery.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: GalleryAiDesignIconViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/b;", "Lcom/avito/android/photo_gallery/ui/e;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public View f217707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f217708b = new LinkedHashMap();

    public b(@Y61.k LinearLayout linearLayout) {
        this.f217707a = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.ai_design_icon, (ViewGroup) linearLayout, false);
        linearLayout.addView(this.f217707a);
    }

    public final boolean a(int i12) {
        boolean zBooleanValue = ((Boolean) this.f217708b.getOrDefault(Integer.valueOf(i12), Boolean.FALSE)).booleanValue();
        if (zBooleanValue) {
            D6.H(this.f217707a);
        } else {
            D6.w(this.f217707a);
        }
        return zBooleanValue;
    }
}
