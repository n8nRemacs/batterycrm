package com.avito.android.short_term_rent.bookingform.items.select;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FormSelectView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/select/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/select/m;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f281659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f281660c;

    /* compiled from: FormSelectView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f281661l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f281661l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f281661l.invoke();
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f281659b = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f281660c = (ComponentContainer) viewFindViewById2;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.select.m
    public final void G() {
        ComponentContainer componentContainer = this.f281660c;
        componentContainer.q(componentContainer.f178848i);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.select.m
    public final void G1(@Y61.k PrintableText printableText) {
        ComponentContainer componentContainer = this.f281660c;
        ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.select.m
    public final void S(@Y61.l Y41.a<G0> aVar) {
        D6.a(new a(aVar), this.f281659b);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.select.m
    public final void setEnabled(boolean z12) {
        this.f281659b.setEnabled(z12);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.select.m
    public final void setHint(@Y61.l String str) {
        this.f281659b.setHint(str);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.select.m
    public final void setText(@Y61.l String str) {
        Input.t(this.f281659b, str, false, 6);
    }
}
