package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportSelectBusinessSingleReqItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/z;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/y;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z extends com.avito.konveyor.adapter.b implements y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f213536b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f213537c;

    public z(@Y61.k View view) {
        super(view);
        this.f213536b = view;
        View viewFindViewById = this.itemView.findViewById(R.id.passport_select_business_vrf_single_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f213537c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.passport.profile_add.merge.select_business_vrf.recycler.y
    public final void setTitle(@Y61.k String str) {
        this.f213537c.setText(str);
    }
}
