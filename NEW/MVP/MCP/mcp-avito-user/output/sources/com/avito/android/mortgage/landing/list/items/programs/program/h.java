package com.avito.android.mortgage.landing.list.items.programs.program;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProgramView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/program/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/programs/program/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f199944i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f199945b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f199946c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f199947d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Checkmark f199948e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f199949f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f199950g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h f199951h;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.program_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199945b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.program_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199946c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.program_rate);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199947d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.program_checkmark);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        Checkmark checkmark = (Checkmark) viewFindViewById4;
        this.f199948e = checkmark;
        View viewFindViewById5 = view.findViewById(R.id.program_alert);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f199949f = (Button) viewFindViewById5;
        com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h hVar = new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 5);
        this.f199951h = hVar;
        checkmark.setOnCheckedChangeListener(hVar);
        view.setOnClickListener(new ViewOnClickListenerC31873b(this, 16));
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void HM(@k Y41.a<G0> aVar) {
        this.f199949f.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(7, aVar));
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void I(boolean z12) {
        this.f199948e.setEnabled(z12);
        this.f199949f.setEnabled(z12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void f(@l String str) {
        I5.a(this.f199946c, str, false);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void fd(@k Y41.a<G0> aVar) {
        this.f199950g = aVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void gX(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f199949f, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f199950g = null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void setChecked(boolean z12) {
        Checkmark checkmark = this.f199948e;
        if (checkmark.isChecked() == z12) {
            return;
        }
        checkmark.setOnCheckedChangeListener(null);
        checkmark.setChecked(z12);
        checkmark.setOnCheckedChangeListener(this.f199951h);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void setTitle(@k String str) {
        this.f199945b.setText(str);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void uB() {
        this.f199949f.setVisibility(4);
    }

    @Override // com.avito.android.mortgage.landing.list.items.programs.program.g
    public final void vs(@k String str) {
        this.f199947d.setText(str);
    }
}
