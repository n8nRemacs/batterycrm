package com.avito.android.lib.design.gallery;

import Y61.l;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageRequests.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/h2", "Lcom/avito/android/image_loader/i;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.image_loader.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f179210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f179211c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f179212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ShapeableImageView f179213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f179214f;

    public e(ShapeableImageView shapeableImageView, boolean z12, h hVar, ShapeableImageView shapeableImageView2, h hVar2) {
        this.f179210b = shapeableImageView;
        this.f179211c = z12;
        this.f179212d = hVar;
        this.f179213e = shapeableImageView2;
        this.f179214f = hVar2;
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        float measuredWidth;
        float f12 = i12 / i13;
        h hVar = this.f179212d;
        boolean z12 = this.f179211c;
        if (z12) {
            measuredWidth = (hVar.getMeasuredWidth() - (hVar.getPaddingHorizontal() * 2)) / hVar.getMeasuredHeight();
        } else {
            measuredWidth = 1.3333334f;
            if (f12 <= 1.3333334f) {
                measuredWidth = 0.75f;
                if (f12 >= 0.75f) {
                    measuredWidth = f12;
                }
            }
        }
        h.f179215T0.getClass();
        ImageView.ScaleType scaleType = ((measuredWidth > f12 ? 1 : (measuredWidth == f12 ? 0 : -1)) > 0 ? f12 / measuredWidth : measuredWidth / f12) < 0.73f ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP;
        ShapeableImageView shapeableImageView = this.f179213e;
        shapeableImageView.setScaleType(scaleType);
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.n nVar = (RecyclerView.n) layoutParams;
        ((ViewGroup.MarginLayoutParams) nVar).width = z12 ? -1 : (int) (shapeableImageView.getMeasuredHeight() * measuredWidth);
        shapeableImageView.setLayoutParams(nVar);
        int i14 = hVar.f179223M0 - 1;
        hVar.f179223M0 = i14;
        if (i14 == 0) {
            hVar.M0();
        }
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
        this.f179210b.setImageDrawable(null);
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@l Throwable th2) {
        h hVar = this.f179214f;
        int i12 = hVar.f179223M0 - 1;
        hVar.f179223M0 = i12;
        if (i12 == 0) {
            hVar.M0();
        }
    }
}
