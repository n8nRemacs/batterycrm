package com.avito.android.str_calendar.seller.calandar_parameters.items.switcher;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StyledSwitcherItemViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/switcher/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/switcher/i;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f287269f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Switcher f287270b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f287271c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f287272d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.publish.screen.objects.view.actions.h f287273e;

    public c(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.switcher_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.switcher);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        this.f287270b = (Switcher) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287271c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.motivation);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287272d = (TextView) viewFindViewById4;
        this.f287273e = new com.avito.android.publish.screen.objects.view.actions.h(this, 20);
        linearLayout.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 9));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void Jg() {
        this.f287270b.setOnCheckedChangeListener(null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void O0(@k String str, @l String str2) {
        Integer numQ;
        int iIntValue = (str2 == null || (numQ = com.avito.android.lib.util.f.q(str2)) == null) ? R.attr.textM20 : numQ.intValue();
        TextView textView = this.f287271c;
        textView.setTextAppearance(C35835l0.j(iIntValue, textView.getContext()));
        textView.setText(str);
        textView.post(this.f287273e);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void V4(@k Y41.l<? super Boolean, G0> lVar) {
        this.f287270b.setOnCheckedChangeListener(new com.avito.android.blueprints.publish.select.inline.j(5, lVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void a50(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f287272d, attributedText, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f287271c.removeCallbacks(this.f287273e);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.switcher.i
    public final void setChecked(boolean z12) throws Resources.NotFoundException {
        this.f287270b.setChecked(z12);
    }
}
