package com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderDescriptionViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/headerDescription/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/headerDescription/f;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f148810b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f148811c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f148810b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f148811c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.f
    public final void b(@k String str) {
        this.f148810b.setText(str);
    }

    @Override // com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.f
    public final void q(@k AttributedText attributedText) {
        TextView textView = this.f148811c;
        j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
