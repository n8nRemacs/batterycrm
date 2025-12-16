package com.avito.android.short_term_rent.bookingform.items.booking_preview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingPreviewView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/booking_preview/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/booking_preview/m;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImageView f281463b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f281464c;

    /* compiled from: BookingPreviewView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f281465l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f281465l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f281465l.invoke();
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f281463b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281464c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.booking_preview.m
    public final void F(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f281464c, attributedText, null);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.booking_preview.m
    public final void S(@Y61.l Y41.a<G0> aVar) {
        D6.a(new a(aVar), this.itemView);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.booking_preview.m
    public final void z2(@Y61.l Image image) {
        ImageView imageView = this.f281463b;
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.d(com.avito.android.image_loader.b.b(image));
        aVar.f169491i = true;
        aVar.f169494l = true;
        aVar.f169485c = Integer.valueOf(R.drawable.bg_image_placeholder_radius_12);
        aVar.f169492j = D6.u(imageView, R.drawable.bg_image_placeholder_radius_12);
        aVar.f169493k = null;
        aVar.e(D6.t(imageView, R.dimen.booking_form_preview_item_icon_corners));
        aVar.f169486d = true;
        aVar.c();
    }
}
