package com.avito.android.str_insurance.items.insight;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrInsuranceInsightView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/items/insight/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_insurance/items/insight/f;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f288596b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f288597c;

    public g(@k View view) {
        super(view);
        this.f288596b = view;
        View viewFindViewById = view.findViewById(R.id.insight);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f288597c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.str_insurance.items.insight.f
    public final void c4(@k AttributedText attributedText, @k com.avito.android.util.text.a aVar) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f288597c;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, aVar);
    }
}
