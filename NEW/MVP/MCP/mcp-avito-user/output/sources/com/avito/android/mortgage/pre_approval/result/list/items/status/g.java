package com.avito.android.mortgage.pre_approval.result.list.items.status;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: StatusView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/status/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/result/list/items/status/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f202071b;

    public g(@k View view) {
        super(view);
        this.f202071b = (ImageView) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.mortgage.pre_approval.result.list.items.status.f
    public final void setImage(int i12) {
        this.f202071b.setImageResource(i12);
    }
}
