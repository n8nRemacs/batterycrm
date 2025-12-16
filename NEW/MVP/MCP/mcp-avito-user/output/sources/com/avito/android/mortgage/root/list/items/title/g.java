package com.avito.android.mortgage.root.list.items.title;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/title/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202889b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202890c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202889b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f202890c = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.mortgage.root.list.items.title.f
    public final void PB(@l AttributedText attributedText, @k com.avito.android.cpt.pre_activation.ui.c cVar) {
        j.a(this.f202890c, attributedText, null);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(cVar);
    }

    @Override // com.avito.android.mortgage.root.list.items.title.f
    public final void e(@k AttributedText attributedText) {
        j.a(this.f202889b, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.title.f
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
