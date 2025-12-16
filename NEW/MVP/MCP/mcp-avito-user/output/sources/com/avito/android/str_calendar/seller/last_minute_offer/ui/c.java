package com.avito.android.str_calendar.seller.last_minute_offer.ui;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.progress_overlay.l;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: LastMinuteOfferViewHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/ui/c;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f288002a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f288003b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f288004c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f288005d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ListItemSwitcher f288006e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f288007f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f288008g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Input f288009h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ComponentContainer f288010i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Chips f288011j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final l f288012k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ImageView f288013l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Button f288014m;

    public c(@k View view) {
        this.f288002a = view.findViewById(R.id.discount_settings_group);
        this.f288003b = (TextView) view.findViewById(R.id.title_tv);
        this.f288004c = (TextView) view.findViewById(R.id.description_tv);
        this.f288005d = (SimpleDraweeView) view.findViewById(R.id.image_iv);
        this.f288006e = (ListItemSwitcher) view.findViewById(R.id.discount_enabled_switcher);
        this.f288007f = (TextView) view.findViewById(R.id.discount_title_tv);
        this.f288008g = (TextView) view.findViewById(R.id.limits_title_tv);
        this.f288009h = (Input) view.findViewById(R.id.discount_input);
        this.f288010i = (ComponentContainer) view.findViewById(R.id.discount_input_container);
        this.f288011j = (Chips) view.findViewById(R.id.discount_options_chips);
        this.f288012k = new l((ViewGroup) view.findViewById(R.id.progress_placeholder), 0, null, 0, 0, 30, null);
        this.f288013l = (ImageView) view.findViewById(R.id.close_btn);
        this.f288014m = (Button) view.findViewById(R.id.save_btn);
    }
}
