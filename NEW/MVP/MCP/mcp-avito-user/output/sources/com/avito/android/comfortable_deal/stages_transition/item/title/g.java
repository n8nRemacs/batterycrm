package com.avito.android.comfortable_deal.stages_transition.item.title;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: TitleView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/stages_transition/item/title/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f122945b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f122946c;

    public g(@k View view) {
        super(view);
        this.f122945b = view.getContext();
        this.f122946c = (TextView) view.findViewById(R.id.title);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.title.f
    public final void D(@k PrintableText printableText) {
        this.f122946c.setText(printableText.k0(this.f122945b));
    }
}
