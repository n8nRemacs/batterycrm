package com.avito.android.advert.item.ownership_cost.items.input_form.views;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.input.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DistanceInputView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/input_form/views/e;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/views/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f78021b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f78022c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public s f78023d;

    /* compiled from: DistanceInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f78024l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f78025m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar, e eVar) {
            super(1);
            this.f78024l = lVar;
            this.f78025m = eVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f78024l.invoke(this.f78025m.f78022c.getDeformattedText());
            return G0.f406611a;
        }
    }

    public e(@k View view) {
        View viewFindViewById = view.findViewById(R.id.distance_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f78021b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.distance_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f78022c = (Input) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void AF() {
        ComponentContainer componentContainer = this.f78021b;
        componentContainer.q(componentContainer.f178848i);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void I0(int i12) {
        this.f78022c.setMaxLength(i12);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void Y30(@l String str, @l Y41.l<? super String, G0> lVar) {
        s sVar = this.f78023d;
        Input input = this.f78022c;
        if (sVar != null) {
            input.h(sVar);
        }
        Input.t(input, str, false, 6);
        this.f78023d = n.c(input, new a(lVar, this));
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void sY(@l String str) {
        ComponentContainer.l(this.f78021b, new int[]{this.f78022c.getId()}, str, 4);
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.views.d
    public final void xy(@k String str) {
        this.f78021b.setTitle(str);
    }
}
