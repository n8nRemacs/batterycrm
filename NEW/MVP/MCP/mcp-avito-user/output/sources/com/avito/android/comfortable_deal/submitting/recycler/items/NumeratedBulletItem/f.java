package com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: NumeratedBulletItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/recycler/items/NumeratedBulletItem/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/submitting/recycler/items/NumeratedBulletItem/e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f123217b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f123218c;

    public f(@k View view) {
        super(view);
        this.f123217b = (TextView) view.findViewById(R.id.number);
        this.f123218c = (TextView) view.findViewById(R.id.title);
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.e
    public final void K7(@k String str) {
        this.f123217b.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.submitting.recycler.items.NumeratedBulletItem.e
    public final void setTitle(@k String str) {
        this.f123218c.setText(str);
    }
}
