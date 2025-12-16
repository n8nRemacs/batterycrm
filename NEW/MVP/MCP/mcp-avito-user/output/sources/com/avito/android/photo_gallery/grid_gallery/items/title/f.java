package com.avito.android.photo_gallery.grid_gallery.items.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: GridGalleryTitleView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/title/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery/grid_gallery/items/title/e;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f217309b;

    public f(@k View view) {
        super(view);
        this.f217309b = (TextView) view;
    }

    @Override // com.avito.android.photo_gallery.grid_gallery.items.title.e
    public final void b(@k String str) {
        I5.a(this.f217309b, str, false);
    }
}
