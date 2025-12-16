package com.avito.android.str_seller_orders_important_to_note.ui.item;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_seller_orders_important_to_note.ui.item.h;
import com.avito.android.util.C35829k2;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/ui/item/i;", "Lcom/avito/android/str_seller_orders_important_to_note/ui/item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f291463k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f291464b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f291465c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f291466d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f291467e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f291468f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f291469g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f291470h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f291471i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f291472j;

    public i(@k View view) {
        super(view);
        this.f291464b = view;
        this.f291465c = (TextView) view.findViewById(R.id.order_title_tv);
        this.f291466d = (TextView) view.findViewById(R.id.order_subtitle_tv);
        this.f291467e = (TextView) view.findViewById(R.id.estate_info_tv);
        this.f291468f = (TextView) view.findViewById(R.id.address_tv);
        this.f291469g = (ImageView) view.findViewById(R.id.estate_pic_iv);
        this.f291470h = (ImageView) view.findViewById(R.id.buyer_pic_iv);
        this.f291471i = (Button) view.findViewById(R.id.first_button);
        this.f291472j = (Button) view.findViewById(R.id.second_button);
    }

    public static int B80(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -817598092) {
            if (iHashCode != -314765822) {
                if (iHashCode == -213768444 && str.equals("overlaySecondary")) {
                    return R.attr.buttonOverlaySecondaryMedium;
                }
            } else if (str.equals("primary")) {
                return R.attr.buttonPrimaryMedium;
            }
        } else if (str.equals("secondary")) {
            return R.attr.buttonSecondaryMedium;
        }
        return com.avito.android.lib.util.f.d(str);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void CN(@l AttributedText attributedText) {
        j.a(this.f291467e, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void N70(@k h.a aVar, @l Y41.a<G0> aVar2) {
        com.avito.android.str_calendar.booking_calendar.items.day.h hVar = new com.avito.android.str_calendar.booking_calendar.items.day.h(25, aVar2);
        Button button = this.f291471i;
        button.setOnClickListener(hVar);
        button.setVisibility(aVar.f291460a ? 0 : 8);
        button.setText(aVar.f291461b);
        button.setAppearanceFromAttr(B80(aVar.f291462c));
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void R(@l AttributedText attributedText) {
        j.a(this.f291466d, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void V2() {
        this.f291464b.setOnClickListener(null);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void VL(@k h.a aVar, @l Y41.a<G0> aVar2) {
        com.avito.android.str_calendar.booking_calendar.items.day.h hVar = new com.avito.android.str_calendar.booking_calendar.items.day.h(27, aVar2);
        Button button = this.f291472j;
        button.setOnClickListener(hVar);
        button.setVisibility(aVar.f291460a ? 0 : 8);
        button.setText(aVar.f291461b);
        button.setAppearanceFromAttr(B80(aVar.f291462c));
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f291464b.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(26, aVar));
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void e(@k AttributedText attributedText) {
        j.a(this.f291465c, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void q(@l AttributedText attributedText) {
        j.a(this.f291468f, attributedText, null);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void r10(@l Image image) {
        ImageView imageView = this.f291470h;
        if (image == null) {
            imageView.setVisibility(8);
            return;
        }
        Uri uriD = C35829k2.c(image, imageView, 1, 22).d();
        if (uriD == null) {
            return;
        }
        imageView.setVisibility(0);
        com.avito.android.image_loader.glide.utils.b.b(imageView, uriD, 0, kotlin.math.b.b(imageView.getContext().getResources().getDimension(R.dimen.str_seller_orders_important_to_note_buyer_avatar_image_radius)));
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.ui.item.h
    public final void tF(@l Image image) {
        if (image == null) {
            return;
        }
        ImageView imageView = this.f291469g;
        Uri uriD = C35829k2.c(image, imageView, 1, 22).d();
        if (uriD == null) {
            return;
        }
        com.avito.android.image_loader.glide.utils.b.b(imageView, uriD, 0, kotlin.math.b.b(imageView.getContext().getResources().getDimension(R.dimen.str_seller_orders_important_to_note_order_image_radius)));
    }
}
