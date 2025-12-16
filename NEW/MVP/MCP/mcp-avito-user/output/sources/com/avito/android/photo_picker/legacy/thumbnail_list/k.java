package com.avito.android.photo_picker.legacy.thumbnail_list;

import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ThumbnailItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/legacy/thumbnail_list/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_picker/legacy/thumbnail_list/j;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f219899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f219900c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f219901d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f219902e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f219903f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f219904g;

    public k(@Y61.k View view) {
        super(view);
        this.f219899b = view;
        View viewFindViewById = view.findViewById(R.id.photo_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f219900c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.progress_overlay);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219901d = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.selection_overlay);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f219902e = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new com.avito.android.order.feature.c(this, 25));
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void FW(@Y61.k com.avito.android.device_orientation.c cVar, boolean z12) {
        int i12 = cVar.f139238a;
        View view = this.f219899b;
        if (z12) {
            D6.A(view, i12);
        } else {
            view.clearAnimation();
            view.setRotation(i12);
        }
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void J3(boolean z12) {
        D6.G(this.f219901d, z12);
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void M4(@Y61.k Uri uri) {
        SimpleDraweeView simpleDraweeView = this.f219900c;
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uri);
        aVarA.c();
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f219903f = aVar;
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f219904g = aVar;
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return true;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f219904g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void p0() {
        D6.g(this.f219900c);
    }

    @Override // com.avito.android.photo_picker.legacy.thumbnail_list.j
    public final void setSelected(boolean z12) {
        this.f219902e.setSelected(z12);
    }
}
