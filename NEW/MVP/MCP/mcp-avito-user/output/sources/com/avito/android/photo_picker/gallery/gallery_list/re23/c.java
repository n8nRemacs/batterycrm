package com.avito.android.photo_picker.gallery.gallery_list.re23;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.photo_picker.gallery.gallery_list.h;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishGalleryItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/gallery/gallery_list/re23/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_picker/gallery/gallery_list/h;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f219559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f219560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f219561d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f219562e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f219563f;

    public c(@k View view) {
        super(view);
        this.f219559b = view;
        View viewFindViewById = view.findViewById(R.id.photo_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f219560c = simpleDraweeView;
        View viewFindViewById2 = view.findViewById(R.id.number);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f219561d = (TextView) viewFindViewById2;
        simpleDraweeView.setOnClickListener(new com.avito.android.order.feature.c(this, 24));
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void M4(@k Uri uri) {
        ImageRequest.a aVarA = C35949t5.a(this.f219560c);
        aVarA.f(uri);
        aVarA.c();
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void Qf(int i12) {
        SimpleDraweeView simpleDraweeView = this.f219560c;
        View view = this.f219559b;
        TextView textView = this.f219561d;
        if (i12 <= 0) {
            D6.w(textView);
            simpleDraweeView.getHierarchy().s(RoundingParams.b(D6.j(view, 16)));
            return;
        }
        textView.setText(String.valueOf(i12));
        textView.setTextSize(2, i12 < 10 ? 11.0f : i12 < 100 ? 9.0f : 7.0f);
        D6.G(textView, true);
        RoundingParams roundingParamsB = RoundingParams.b(D6.j(view, 16));
        roundingParamsB.f340156f = D6.q(view, R.color.legacy_black);
        roundingParamsB.c(D6.j(view, 2));
        simpleDraweeView.getHierarchy().s(roundingParamsB);
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f219562e = aVar;
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void d(@k Y41.a<G0> aVar) {
        this.f219563f = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f219563f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void s(@k String str) {
        this.f219559b.setTag(str);
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void sO(boolean z12) {
        this.f219559b.setAlpha(z12 ? 0.24f : 1.0f);
    }
}
