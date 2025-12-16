package com.avito.android.mortgage.root.list.items.privacy;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.auction.details.i;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: PrivacyView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/privacy/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/privacy/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202736b;

    public g(@k View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.privacy_policy);
        this.f202736b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.mortgage.root.list.items.privacy.f
    public final void Yn(@k AttributedText attributedText, @k i iVar) {
        attributedText.setOnUrlClickListener(iVar);
        TextView textView = this.f202736b;
        j.a(textView, attributedText, null);
        FV.a aVar = FV.a.f4720a;
        int iB2 = y6.b(8);
        aVar.getClass();
        FV.a.j(textView, R.attr.textIconExclamationMarkOutline, iB2);
    }

    @Override // com.avito.android.mortgage.root.list.items.privacy.f
    public final void setEnabled(boolean z12) {
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
        } else {
            this.itemView.setAlpha(0.4f);
            this.itemView.setEnabled(false);
        }
    }
}
