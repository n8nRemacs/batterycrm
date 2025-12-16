package com.avito.android.crm_candidates.view.list_items.applications_list.error_item;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmErrorView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/applications_list/error_item/h;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f130079c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f130080b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.refresh);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130080b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.crm_candidates.view.list_items.applications_list.error_item.h
    public final void Mo(@k Y41.a<G0> aVar) {
        com.avito.android.component.user_hat.items.k kVar = new com.avito.android.component.user_hat.items.k(14, aVar);
        Button button = this.f130080b;
        button.setOnClickListener(kVar);
        FV.a aVar2 = FV.a.f4720a;
        Context context = button.getContext();
        aVar2.getClass();
        button.setState(new UU.a(FV.a.i("", context, R.attr.textIconRepeat, FV.a.f4721b), null, false, false, false, null, null, null, null, false, 1022, null));
    }
}
