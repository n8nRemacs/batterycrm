package com.avito.android.mortgage.landing.list.items.select;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/select/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/select/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f199968d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f199969b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BaseSelect f199970c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f199969b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.BaseSelect");
        }
        this.f199970c = (BaseSelect) viewFindViewById2;
    }

    @Override // com.avito.android.mortgage.landing.list.items.select.f
    public final void m(@l String str) {
        BaseSelect baseSelect = this.f199970c;
        Input.t(baseSelect, str, false, 6);
        baseSelect.setTextColor(C35835l0.d(R.attr.black, baseSelect.getContext()));
    }

    @Override // com.avito.android.mortgage.landing.list.items.select.f
    public final void pJ(@l Integer num) {
        G0 g02;
        BaseSelect baseSelect = this.f199970c;
        if (num != null) {
            baseSelect.setHint(num.intValue());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            baseSelect.setHint((CharSequence) null);
        }
    }

    @Override // com.avito.android.mortgage.landing.list.items.select.f
    public final void setTitle(int i12) {
        this.f199969b.setTitle(i12);
    }

    @Override // com.avito.android.mortgage.landing.list.items.select.f
    public final void wl(@k Y41.a<G0> aVar) {
        this.f199970c.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(8, aVar));
    }
}
