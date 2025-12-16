package com.avito.android.hotel_available_rooms.konveyor.promo_widget;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: HotelPromoWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/promo_widget/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/promo_widget/f;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f163061g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f163062b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f163063c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f163064d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f163065e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f163066f;

    public g(@k View view) {
        super(view);
        this.f163062b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163063c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163064d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f163065e = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f163066f = (ImageView) viewFindViewById4;
        view.setClipToOutline(true);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.promo_widget.f
    public final void M(@l UniversalImage universalImage) {
        Image imageDependsOnTheme;
        int i12 = universalImage != null ? 0 : 8;
        ImageView imageView = this.f163066f;
        imageView.setVisibility(i12);
        if (universalImage == null || (imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()))) == null) {
            return;
        }
        com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(imageDependsOnTheme));
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.promo_widget.f
    public final void pa(@l ButtonAction buttonAction, @k Y41.a<G0> aVar) {
        VU.b bVarC;
        int i12 = buttonAction != null ? 0 : 8;
        Button button = this.f163065e;
        button.setVisibility(i12);
        if (buttonAction == null) {
            return;
        }
        String style = buttonAction.getStyle();
        if (style != null) {
            b.a aVar2 = VU.b.f17147t;
            Context context = button.getContext();
            aVar2.getClass();
            bVarC = b.a.b(context, style);
        } else {
            b.a aVar3 = VU.b.f17147t;
            Context context2 = button.getContext();
            int iJ2 = C35835l0.j(R.attr.buttonPrimaryMedium, button.getContext());
            aVar3.getClass();
            bVarC = b.a.c(iJ2, context2);
        }
        button.setStyle(bVarC);
        com.avito.android.lib.design.button.b.a(button, buttonAction.getTitle(), false);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(3, aVar));
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.promo_widget.f
    public final void q(@l AttributedText attributedText) {
        j.a(this.f163064d, attributedText, null);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.promo_widget.f
    public final void v(@k UniversalColor universalColor) {
        View view = this.f163062b;
        Context context = view.getContext();
        C48063a.f437606a.getClass();
        view.setBackgroundTintList(C48063a.e(context, universalColor));
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.promo_widget.f
    public final void w(@l AttributedText attributedText) {
        j.a(this.f163063c, attributedText, null);
    }
}
