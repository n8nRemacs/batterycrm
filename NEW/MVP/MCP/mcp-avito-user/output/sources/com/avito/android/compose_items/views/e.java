package com.avito.android.compose_items.views;

import Y41.p;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComposeItemViewWithContainer.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/compose_items/views/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/compose_items/views/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f125431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f125432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ComposeView f125433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f125434e;

    /* compiled from: ComposeItemViewWithContainer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p<A, Integer, G0> f125435l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super A, ? super Integer, G0> pVar) {
            super(2);
            this.f125435l = pVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(1002427854, new d(this.f125435l), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public e(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f125431b = view;
        this.f125432c = aVar;
        new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f125433d = (ComposeView) view.findViewById(R.id.compose_view);
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.container);
        this.f125434e = componentContainer;
        componentContainer.getPaddingTop();
        componentContainer.getPaddingBottom();
    }

    @Override // com.avito.android.compose_items.views.b
    public final void K1(@l CharSequence charSequence, @l CharSequence charSequence2) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f125434e;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(charSequence2);
        }
    }

    @Override // com.avito.android.compose_items.views.b
    public final void i4(@l Y41.a<G0> aVar) {
        ComponentContainer componentContainer = this.f125434e;
        if (aVar != null) {
            componentContainer.setTitleTipListener(aVar);
        } else {
            componentContainer.setTitleTipListener(null);
        }
    }

    @Override // com.avito.android.compose_items.views.b
    public final void setTitle(@Y61.k CharSequence charSequence) {
        this.f125434e.setTitle(charSequence);
    }

    @Override // com.avito.android.compose_items.views.b
    public final void u(@l CharSequence charSequence) {
        this.f125434e.q(charSequence);
    }

    @Override // com.avito.android.compose_items.views.b
    @InterfaceC22137p
    public final void z7(@Y61.k p<? super A, ? super Integer, G0> pVar) {
        this.f125433d.setContent(new C22096n(218780915, new a(pVar), true));
    }
}
