package com.avito.android.comfortable_deal.deal.item.description;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DescriptionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/description/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/description/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f121367b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f121367b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.description.f
    public final void h(@k String str) {
        this.f121367b.setText(str);
    }
}
