package com.avito.android.photo_gallery.grid_gallery.items.navbar_block.item;

import Y41.l;
import Y61.k;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.util.C35835l0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GridGalleryNavbarChipPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/f;", "LTV0/f;", "Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/h;", "Lcom/avito/android/photo_gallery/grid_gallery/items/navbar_block/item/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<T70.c, G0> f217275b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super T70.c, G0> lVar) {
        this.f217275b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.f217279c.setText(cVar.f217270c);
        View view = hVar.f217278b;
        ((GradientDrawable) view.getBackground()).setStroke(cVar.f217271d ? 4 : 0, C35835l0.d(R.attr.constantWhite, view.getContext()));
        view.setOnClickListener(new i(21, new e(this, cVar)));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        Object next;
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof d) {
                    break;
                }
            }
        }
        d dVar = (d) (next instanceof d ? next : null);
        if (dVar == null) {
            return;
        }
        Boolean bool = dVar.f217272a;
        if (bool.equals(Boolean.valueOf(cVar.f217271d))) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        View view = hVar.f217278b;
        ((GradientDrawable) view.getBackground()).setStroke(zBooleanValue ? 4 : 0, C35835l0.d(R.attr.constantWhite, view.getContext()));
    }
}
