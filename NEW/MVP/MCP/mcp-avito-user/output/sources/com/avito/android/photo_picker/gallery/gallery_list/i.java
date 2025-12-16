package com.avito.android.photo_picker.gallery.gallery_list;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/gallery/gallery_list/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_picker/gallery/gallery_list/h;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f219539b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f219540c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f219541d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f219542e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f219543f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f219544g;

    public i(@Y61.k View view) {
        super(view);
        this.f219539b = view;
        View viewFindViewById = view.findViewById(R.id.photo_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
        this.f219540c = simpleDraweeView;
        View viewFindViewById2 = view.findViewById(R.id.number);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f219541d = (TextView) viewFindViewById2;
        simpleDraweeView.setOnClickListener(new com.avito.android.order.feature.c(this, 23));
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void M4(@Y61.k Uri uri) {
        ImageRequest.a aVarA = C35949t5.a(this.f219540c);
        aVarA.f(uri);
        aVarA.c();
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void Qf(int i12) {
        SimpleDraweeView simpleDraweeView = this.f219540c;
        TextView textView = this.f219541d;
        if (i12 <= 0) {
            D6.w(textView);
            if (this.f219544g) {
                simpleDraweeView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
            }
            this.f219544g = false;
            return;
        }
        textView.setText(String.valueOf(i12));
        textView.setTextSize(2, i12 < 10 ? 16.0f : i12 < 100 ? 14.0f : 11.0f);
        D6.G(textView, true);
        if (!this.f219544g) {
            simpleDraweeView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(200L).start();
        }
        this.f219544g = true;
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f219542e = aVar;
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f219543f = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f219543f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void s(@Y61.k String str) {
        this.f219539b.setTag(str);
    }

    @Override // com.avito.android.photo_picker.gallery.gallery_list.h
    public final void sO(boolean z12) {
    }
}
