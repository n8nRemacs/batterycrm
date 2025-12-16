package com.avito.android.edit_address.adapter.location;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/adapter/location/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_address/adapter/location/i;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f145790b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f145791c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f145792d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f145793e;

    /* compiled from: HeaderItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = j.this.f145791c;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.edit_address_location_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        input.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 5));
        input.b(new s(null, new a()));
        this.f145792d = input;
        View viewFindViewById2 = view.findViewById(R.id.edit_address_location_error);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145793e = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.edit_address.adapter.location.i
    public final void iV(@k com.avito.android.edit_address.adapter.location.a aVar, @k Y41.a<G0> aVar2, @k Y41.l<? super String, G0> lVar) {
        String str = aVar.f145778c;
        Input input = this.f145792d;
        Input.t(input, str, false, 6);
        boolean z12 = aVar.f145779d;
        Input.f179303W.getClass();
        input.setState(z12 ? Input.f179305b0 : Input.f179304a0);
        String str2 = aVar.f145778c;
        if (str2 == null || str2.length() == 0) {
            input.setRightIcon(C35835l0.h(R.attr.ic_pin20, input.getRootView().getContext()));
        } else {
            input.setRightIcon((Drawable) null);
        }
        D6.G(this.f145793e, z12);
        this.f145790b = aVar2;
        this.f145791c = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f145790b = null;
        this.f145791c = null;
    }
}
