package com.avito.android.photo_gallery.ui;

import androidx.compose.foundation.text.selection.C21030p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.util.R0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoGallery2.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/l;", "Lz80/f;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends z80.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.photo_gallery.adapter.l f217724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PhotoGallery2 f217725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f217726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(R0 r02, com.avito.android.pinch_to_zoom.b bVar, PinchToZoomSource pinchToZoomSource, com.avito.android.photo_gallery.adapter.l lVar, PhotoGallery2 photoGallery2, FragmentManager fragmentManager) {
        super(r02, bVar, pinchToZoomSource);
        this.f217724e = lVar;
        this.f217725f = photoGallery2;
        this.f217726g = fragmentManager;
    }

    @Override // z80.f
    @Y61.l
    public final Fragment a() {
        Object next;
        String strA = C21030p.a(this.f217724e.getItemId(this.f217725f.getPager().getCurrentItem()), "f");
        Iterator<T> it = this.f217726g.P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Fragment) next).getTag(), strA)) {
                break;
            }
        }
        return (Fragment) next;
    }
}
