package com.avito.android.tns_gallery;

import android.graphics.drawable.GradientDrawable;
import com.avito.android.R;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: TnsGalleryItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/o;", "Lcom/avito/android/image_loader/i;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements com.avito.android.image_loader.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f301548b;

    public o(q qVar) {
        this.f301548b = qVar;
    }

    @Override // com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        q qVar = this.f301548b;
        SimpleDraweeView simpleDraweeView = qVar.f301552c;
        int color = simpleDraweeView.getContext().getColor(R.color.expected_constant_black_alpha_4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(qVar.f301554e);
        simpleDraweeView.setForeground(gradientDrawable);
    }

    @Override // com.avito.android.image_loader.i
    public final void S2() {
        this.f301548b.f301552c.setForeground(null);
    }

    @Override // com.avito.android.image_loader.i
    public final void b2(@Y61.l Throwable th2) {
        this.f301548b.f301552c.setForeground(null);
    }
}
