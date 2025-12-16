package com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GridGalleryNavbarChipView.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/h;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f217277d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f217278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f217279c;

    /* compiled from: GridGalleryNavbarChipView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/h$a;", "", "<init>", "()V", "", "DEFAULT_STROKE_WIDTH", "I", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h(@k View view) {
        super(view);
        this.f217278b = view;
        this.f217279c = (TextView) view.findViewById(R.id.chip_title);
    }
}
