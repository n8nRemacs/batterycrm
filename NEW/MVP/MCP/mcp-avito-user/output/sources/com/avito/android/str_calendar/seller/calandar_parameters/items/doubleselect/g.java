package com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DoubleSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/doubleselect/g;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/doubleselect/DoubleSelectItemView;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements DoubleSelectItemView {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f287151f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f287152b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f287153c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f287154d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f287155e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.first_title_tv);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287152b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.first_carousel);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f287153c = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.second_title_tv);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287154d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.second_carousel);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f287155e = (Input) viewFindViewById4;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void Ak(@k Y41.a<G0> aVar) {
        this.f287155e.setOnClickListener(new h(8, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void F20(@l String str) {
        I5.a(this.f287154d, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void ID(@k Y41.a<G0> aVar) {
        this.f287153c.setOnClickListener(new h(7, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void Vp(@k DoubleSelectItemView.InputState inputState) {
        this.f287153c.setState(inputState.f287140b);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void Zg(@l String str) {
        I5.a(this.f287152b, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void dt(@k String str) {
        Input.t(this.f287153c, str, false, 6);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void pN(@k String str) {
        Input.t(this.f287155e, str, false, 6);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.doubleselect.DoubleSelectItemView
    public final void q40(@k DoubleSelectItemView.InputState inputState) {
        this.f287155e.setState(inputState.f287140b);
    }
}
