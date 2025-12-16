package com.avito.android.short_term_rent.bookingform.items.input;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FormInputView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/input/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/input/m;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f281572f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f281573b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f281574c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f281575d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final s f281576e;

    /* compiled from: FormInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f281577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar) {
            super(1);
            this.f281577l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<String, G0> lVar = this.f281577l;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FormInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            n nVar = n.this;
            Y41.l<? super String, G0> lVar = nVar.f281575d;
            if (lVar != null) {
                lVar.invoke(nVar.f281573b.getDeformattedText());
            }
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f281573b = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f281574c = (ComponentContainer) viewFindViewById2;
        this.f281576e = new s(null, new b());
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void G() {
        ComponentContainer componentContainer = this.f281574c;
        componentContainer.q(componentContainer.f178848i);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void G1(@Y61.k PrintableText printableText) {
        ComponentContainer componentContainer = this.f281574c;
        ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void J1(int i12, int i13) {
        this.f281573b.o(i13, i12);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void Kb(@Y61.l String str, boolean z12) {
        Input input = this.f281573b;
        s sVar = this.f281576e;
        input.h(sVar);
        Input.t(input, str, z12, 2);
        input.b(sVar);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void h0() {
        this.f281573b.r();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Input input = this.f281573b;
        input.h(this.f281576e);
        this.f281575d = null;
        input.setOnFocusChangeListener(null);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void o0(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f281573b.setOnFocusChangeListener(new com.avito.android.advert.item.icebreakers.n(6, lVar));
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void s5(@Y61.k Y41.a<G0> aVar) {
        this.f281573b.setClearButtonListener(aVar);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void setEnabled(boolean z12) {
        Input input = this.f281573b;
        input.setEnabled(z12);
        this.f281574c.setEnabled(z12);
        input.setClearButton(z12);
        input.setFocusByClearButton(z12);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void setHint(@Y61.l String str) {
        this.f281573b.setHint(str);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void u0(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f281575d = new a(lVar);
        Input input = this.f281573b;
        s sVar = this.f281576e;
        input.h(sVar);
        input.b(sVar);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.input.m
    public final void v3(@Y61.k FormatterType formatterType) {
        this.f281573b.setFormatterType(formatterType);
    }
}
