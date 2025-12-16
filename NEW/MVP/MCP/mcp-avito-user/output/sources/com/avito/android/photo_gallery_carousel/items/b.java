package com.avito.android.photo_gallery_carousel.items;

import Y61.k;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryItemRoundCornersDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f217882b = C42727D.c(a.f217883l);

    /* compiled from: GalleryItemRoundCornersDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f217883l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(Build.VERSION.SDK_INT >= 33);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Drawable drawableU;
        RecyclerView.m layoutManager;
        view.setClipToOutline(true);
        if (((Boolean) this.f217882b.getValue()).booleanValue()) {
            if ((RecyclerView.U(view) == 0) && (layoutManager = recyclerView.getLayoutManager()) != null && RecyclerView.U(view) == layoutManager.o0() - 1) {
                drawableU = D6.u(view, R.drawable.bg_single_gallery_item);
            } else if (RecyclerView.U(view) == 0) {
                drawableU = D6.u(view, R.drawable.bg_first_gallery_item);
            } else {
                RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                drawableU = (layoutManager2 != null && RecyclerView.U(view) == layoutManager2.o0() - 1) ? D6.u(view, R.drawable.bg_last_gallery_item) : D6.u(view, R.drawable.bg_middle_gallery_item);
            }
        } else {
            drawableU = D6.u(view, R.drawable.bg_middle_gallery_item);
        }
        view.setBackground(drawableU);
    }
}
