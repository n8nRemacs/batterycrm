package com.avito.android.auto_evidence_request.items.attributed_text_item;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;

/* compiled from: AttributedTextItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_evidence_request/items/attributed_text_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/auto_evidence_request/items/attributed_text_item/f;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f95187b;

    public g(@k View view) {
        super(view);
        TextView textView = (TextView) view;
        this.f95187b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.auto_evidence_request.items.attributed_text_item.f
    public final void r(@k AttributedText attributedText) {
        j.a(this.f95187b, attributedText, null);
    }
}
