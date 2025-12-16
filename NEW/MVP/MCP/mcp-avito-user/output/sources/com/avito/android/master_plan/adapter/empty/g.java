package com.avito.android.master_plan.adapter.empty;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyInfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/adapter/empty/g;", "Lcom/avito/android/master_plan/adapter/empty/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f185995b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.empty_info_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f185995b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.master_plan.adapter.empty.f
    public final void setText(@k String str) {
        this.f185995b.setText(str);
    }
}
