package com.avito.android.master_plan.adapter.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/adapter/title/g;", "Lcom/avito/android/master_plan/adapter/title/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f186018b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f186019c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f186018b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f186019c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.master_plan.adapter.title.f
    public final void h(@l String str) {
        I5.a(this.f186019c, str, false);
    }

    @Override // com.avito.android.master_plan.adapter.title.f
    public final void setTitle(@k String str) {
        this.f186018b.setText(str);
    }
}
