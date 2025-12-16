package com.avito.android.str_calendar.seller.calandar_parameters.items.carousel;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/carousel/h;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/carousel/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f287042g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f287043b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f287044c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f287045d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f287046e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f287047f;

    public h(@k View view) {
        super(view);
        this.f287043b = view;
        View viewFindViewById = view.findViewById(R.id.carousel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f287044c = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287045d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.hint);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287046e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tooltip);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f287047f = (ImageView) viewFindViewById4;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void J7(@l Y41.a<G0> aVar) {
        this.f287047f.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(2, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void a(@l Y41.a<G0> aVar) {
        this.f287044c.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(1, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void d6(@k String str) {
        Input.t(this.f287044c, str, false, 6);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void iA(@l TipIconParameters tipIconParameters) {
        D6.G(this.f287047f, tipIconParameters != null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void k0(@k CustomPaddings customPaddings) {
        Integer top = customPaddings.getTop();
        Integer numValueOf = Integer.valueOf(top != null ? top.intValue() : 0);
        Integer bottom = customPaddings.getBottom();
        D6.c(this.f287043b, null, numValueOf, null, Integer.valueOf(bottom != null ? bottom.intValue() : 0), 5);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void rb(@l AttributedText attributedText) {
        j.a(this.f287046e, attributedText, null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void setEnabled(boolean z12) {
        TextView textView = this.f287045d;
        textView.setEnabled(z12);
        textView.setTextColor(C35835l0.d(z12 ? R.attr.black : R.attr.gray54, textView.getContext()));
        this.f287044c.setEnabled(z12);
        this.f287046e.setEnabled(z12);
        this.f287047f.setEnabled(z12);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.carousel.g
    public final void setTitle(@k String str) {
        this.f287045d.setText(str);
    }
}
