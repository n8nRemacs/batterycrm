package com.avito.android.hotel_booking.konveyor.input;

import android.text.Editable;
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

/* compiled from: BookingFormInputView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/input/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/input/k;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f163691b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f163692c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f163693d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f163694e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f163695f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final s f163696g;

    /* compiled from: BookingFormInputView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = l.this.f163695f;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BookingFormInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            l lVar = l.this;
            Y41.l<? super String, G0> lVar2 = lVar.f163693d;
            if (lVar2 != null) {
                Editable editableM53getText = lVar.f163691b.m53getText();
                String string = editableM53getText != null ? editableM53getText.toString() : null;
                if (string == null) {
                    string = "";
                }
                lVar2.invoke(string);
            }
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f163691b = input;
        View viewFindViewById2 = view.findViewById(R.id.input_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f163692c = (ComponentContainer) viewFindViewById2;
        s sVar = new s(null, new b());
        this.f163696g = sVar;
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 10));
        input.b(sVar);
        input.setClearButtonListener(new a());
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void G() {
        ComponentContainer componentContainer = this.f163692c;
        componentContainer.q(componentContainer.f178848i);
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void G1(@Y61.k PrintableText printableText) {
        ComponentContainer componentContainer = this.f163692c;
        ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void J1(int i12, int i13) {
        this.f163691b.o(i13, i12);
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void h0() {
        this.f163691b.r();
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void o0(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f163694e = lVar;
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void s5(@Y61.k Y41.a<G0> aVar) {
        this.f163695f = aVar;
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void setEnabled(boolean z12) {
        this.f163691b.setEnabled(z12);
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void setHint(@Y61.l String str) {
        this.f163691b.setHint(str);
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void setText(@Y61.l String str) {
        Input input = this.f163691b;
        s sVar = this.f163696g;
        input.h(sVar);
        Input.t(input, str, false, 4);
        input.b(sVar);
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void u0(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f163693d = lVar;
    }

    @Override // com.avito.android.hotel_booking.konveyor.input.k
    public final void v3(@Y61.k FormatterType formatterType) {
        this.f163691b.setFormatterType(formatterType);
    }
}
