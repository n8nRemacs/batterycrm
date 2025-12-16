package com.avito.android.publish.slots.car_info_short.item;

import Me.m;
import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CarInfoShortItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/car_info_short/item/h;", "Lcom/avito/android/publish/slots/car_info_short/item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f243129b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f243130c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f243131d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FrameLayout f243132e;

    /* renamed from: f, reason: collision with root package name */
    public final int f243133f;

    /* renamed from: g, reason: collision with root package name */
    public final int f243134g;

    public h(@k View view) {
        super(view);
        this.f243129b = (TextView) view.findViewById(R.id.title);
        this.f243130c = (TextView) view.findViewById(R.id.progress_text);
        this.f243131d = (ProgressBarRe23) view.findViewById(R.id.progress_value);
        this.f243132e = (FrameLayout) view.findViewById(R.id.images_container);
        this.f243133f = y6.b(80);
        this.f243134g = y6.b(120);
    }

    @Override // com.avito.android.publish.slots.car_info_short.item.g
    public final void G0(@l List<CarImage> list) {
        SimpleDraweeView simpleDraweeView;
        FrameLayout frameLayout = this.f243132e;
        frameLayout.removeAllViews();
        if (list != null && list.isEmpty()) {
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.car_info_short_image, (ViewGroup) frameLayout, false);
            simpleDraweeView2.getHierarchy().p(null);
            frameLayout.addView(simpleDraweeView2);
            return;
        }
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Image image = ((CarImage) obj).getImage();
                if (image == null || image.getVariants().isEmpty()) {
                    simpleDraweeView = null;
                } else {
                    simpleDraweeView = (SimpleDraweeView) LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.car_info_short_image, (ViewGroup) frameLayout, false);
                    C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(image), null, null, null, 14);
                }
                int i14 = this.f243134g;
                int i15 = this.f243133f;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i14, i15);
                layoutParams.height = i15 - (y6.b(10) * i12);
                layoutParams.width = i14 - (y6.b(16) * i12);
                layoutParams.bottomMargin = y6.b(15) * i12;
                layoutParams.gravity = 81;
                if (simpleDraweeView != null) {
                    simpleDraweeView.setElevation(-i12);
                }
                if (simpleDraweeView != null) {
                    simpleDraweeView.setLayoutParams(layoutParams);
                }
                if (simpleDraweeView != null) {
                    frameLayout.addView(simpleDraweeView);
                }
                i12 = i13;
            }
        }
    }

    @Override // com.avito.android.publish.slots.car_info_short.item.g
    public final void O0(@l String str, @l String str2) {
        TextView textView = this.f243129b;
        textView.setText(str);
        textView.post(new m(this, str2, str, 24));
    }

    @Override // com.avito.android.publish.slots.car_info_short.item.g
    public final void n30(@l String str, @l Float f12) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g((ConstraintLayout) this.itemView);
        ProgressBarRe23 progressBarRe23 = this.f243131d;
        TextView textView = this.f243130c;
        if (f12 != null) {
            I5.a(textView, str, false);
            progressBarRe23.setProgress(f12.floatValue());
        } else {
            dVar.i(this.f243129b.getId(), 4, 0, 4);
            dVar.c((ConstraintLayout) this.itemView);
            D6.w(textView);
            D6.w(progressBarRe23);
        }
    }
}
