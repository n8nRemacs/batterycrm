package com.avito.android.multigeo_flow.full_list.list;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddressItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/list/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/multigeo_flow/full_list/list/g;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f206918d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f206919b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f206920c;

    public h(@k View view) {
        super(view);
        this.f206919b = view;
        View viewFindViewById = view.findViewById(R.id.address_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f206920c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.multigeo_flow.full_list.list.g
    public final void G3(@l Y41.a<G0> aVar) {
        this.f206919b.setOnClickListener(new i(8, aVar));
    }

    @Override // com.avito.android.multigeo_flow.full_list.list.g
    public final void setTitle(@l String str) {
        I5.a(this.f206920c, str, false);
    }
}
