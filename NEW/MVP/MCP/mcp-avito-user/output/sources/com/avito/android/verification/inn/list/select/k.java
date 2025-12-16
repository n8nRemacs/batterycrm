package com.avito.android.verification.inn.list.select;

import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/inn/list/select/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f324093e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f324094b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f324095c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f324096d;

    public k(@Y61.k View view) {
        super(view);
        this.f324094b = (Input) view.findViewById(R.id.item_verification_select_input);
        this.f324095c = (ComponentContainer) view.findViewById(R.id.item_verification_select_container);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f324096d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
