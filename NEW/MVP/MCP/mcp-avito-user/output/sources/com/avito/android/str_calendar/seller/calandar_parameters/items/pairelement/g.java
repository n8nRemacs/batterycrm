package com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import com.avito.android.str_calendar.seller.calandar_parameters.items.input.j;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PairElementView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/g;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/pairelement/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f287246f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f287247b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f287248c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BaseSelect f287249d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f287250e;

    public g(@k View view) {
        super(view);
        this.f287247b = new j(view, R.id.input_container, R.id.input);
        View viewFindViewById = view.findViewById(R.id.title_tv);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287248c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.BaseSelect");
        }
        this.f287249d = (BaseSelect) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f287250e = (Input) viewFindViewById3;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f
    public final void AC() {
        Input.f179303W.getClass();
        this.f287249d.setState(Input.f179305b0);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void G() {
        this.f287247b.G();
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void K(@l Y41.l<? super String, G0> lVar) {
        this.f287247b.K(lVar);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void K00(int i12, @l CharSequence charSequence, @l CharSequence charSequence2) {
        this.f287247b.K00(i12, charSequence, charSequence2);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f
    public final void LT() {
        Input.f179303W.getClass();
        this.f287249d.setState(Input.f179304a0);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void W() {
        this.f287247b.W();
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f
    public final void aZ(@k String str) {
        Input.t(this.f287249d, str, false, 6);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f
    public final void ds(@k Y41.a<G0> aVar) {
        this.f287249d.setOnClickListener(new h(10, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f287247b.j5();
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f
    public final void ji(@l String str) {
        I5.a(this.f287248c, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void lB(@k Y41.a<G0> aVar) {
        this.f287247b.lB(aVar);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void m(@l String str) {
        this.f287247b.m(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void o0(@k Y41.l<? super Boolean, G0> lVar) {
        this.f287247b.o0(lVar);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void setHint(@l String str) {
        this.f287247b.setHint(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void setTitle(@k CharSequence charSequence) {
        this.f287247b.setTitle(charSequence);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void t(@k Y41.a<G0> aVar) {
        this.f287247b.f287217f = aVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void v9(@l String str) {
        this.f287247b.v9(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.pairelement.f
    public final void vv() {
        this.f287250e.clearFocus();
    }
}
