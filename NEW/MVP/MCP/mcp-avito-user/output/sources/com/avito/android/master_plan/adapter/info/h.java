package com.avito.android.master_plan.adapter.info;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/master_plan/adapter/info/h;", "Lcom/avito/android/master_plan/adapter/info/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f186008c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f186009b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.info_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        this.f186009b = (ListItem) viewFindViewById;
    }

    @Override // com.avito.android.master_plan.adapter.info.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f186009b.setOnClickListener(new com.avito.android.lib.design.list_item.a(22, aVar));
    }

    @Override // com.avito.android.master_plan.adapter.info.g
    public final void j(@l String str) {
        this.f186009b.setSubtitle(str);
    }

    @Override // com.avito.android.master_plan.adapter.info.g
    public final void setTitle(@k String str) {
        this.f186009b.setTitle(str);
    }
}
