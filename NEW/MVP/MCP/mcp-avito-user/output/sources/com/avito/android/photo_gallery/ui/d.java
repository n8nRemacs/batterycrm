package com.avito.android.photo_gallery.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.GalleryButton;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryButtonsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/d;", "Lcom/avito/android/photo_gallery/ui/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f217709a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public List<GalleryButton> f217710b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f217711c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super GalleryButton, G0> f217712d;

    public d(@Y61.k LinearLayout linearLayout) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.gallery_buttons, (ViewGroup) linearLayout, false);
        this.f217709a = viewGroup;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f217711c = P0.c();
        linearLayout.addView(viewGroup);
    }
}
