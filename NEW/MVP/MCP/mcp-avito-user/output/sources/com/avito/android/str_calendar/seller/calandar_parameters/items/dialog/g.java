package com.avito.android.str_calendar.seller.calandar_parameters.items.dialog;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DialogFormItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/dialog/g;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/dialog/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f287123e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f287124b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f287125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f287126d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.description_tv);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287124b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f287125c = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error_tv);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f287126d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.f
    public final void G2(@l PrintableText printableText) {
        TextView textView = this.f287126d;
        I5.a(textView, printableText != null ? printableText.k0(textView.getContext()) : null, false);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.f
    public final void NX(@k PrintableText printableText) {
        Button button = this.f287125c;
        button.setText(printableText.k0(button.getContext()));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f287125c.setOnClickListener(new A(17, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.dialog.f
    public final void h(@k String str) {
        this.f287124b.setText(str);
    }
}
