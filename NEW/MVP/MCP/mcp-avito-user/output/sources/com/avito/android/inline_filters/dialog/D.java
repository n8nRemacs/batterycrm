package com.avito.android.inline_filters.dialog;

import Ba.ViewOnClickListenerC13121a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersHeaderView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/D;", "Lcom/avito/android/inline_filters/dialog/B;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class D implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f171134a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f171135b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f171136c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171137d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171138e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f171139f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Drawable f171140g;

    public D(@Y61.k View view) {
        this.f171134a = (TextView) view.findViewById(R.id.inline_filter_dialog_title);
        View viewFindViewById = view.findViewById(R.id.reset_action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171135b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.close_inline_filter_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f171136c = viewFindViewById2;
        this.f171137d = C35835l0.d(R.attr.blue, view.getContext());
        this.f171138e = C35835l0.d(R.attr.gray28, view.getContext());
        this.f171139f = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.ic_close_24_black);
        this.f171140g = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.ic_back_24_black);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f171136c.setOnClickListener(new C(0, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Rd(boolean z12) {
        D6.G(this.f171135b, z12);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@Y61.k Y41.a<G0> aVar) {
        this.f171135b.setOnClickListener(new ViewOnClickListenerC13121a(29, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Td(@Y61.k String str) {
        this.f171135b.setText(str);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        TextView textView = this.f171135b;
        textView.setClickable(z12);
        if (z12) {
            textView.setTextColor(this.f171137d);
        } else {
            textView.setTextColor(this.f171138e);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@Y61.k String str) {
        this.f171134a.setText(str);
    }
}
