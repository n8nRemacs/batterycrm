package com.avito.android.str_insurance.items.title;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/items/title/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_insurance/items/title/a;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f288598b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f288599c;

    public b(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f288598b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f288599c = (LinearLayout) viewFindViewById2;
    }

    @Override // com.avito.android.str_insurance.items.title.a
    public final void O1(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        j.a(this.f288598b, attributedText, aVar);
    }

    @Override // com.avito.android.str_insurance.items.title.a
    public final void Z5(int i12) {
        LinearLayout linearLayout = this.f288599c;
        linearLayout.setBackgroundColor(C35835l0.d(i12, linearLayout.getContext()));
    }
}
