package com.avito.android.guests_selector.items.adults_stepper;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdultsStepperView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/guests_selector/items/adults_stepper/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/guests_selector/items/adults_stepper/f;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Context f161465b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f161466c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f161467d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Stepper f161468e;

    /* compiled from: AdultsStepperView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f161469l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Integer, G0> lVar) {
            super(1);
            this.f161469l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f161469l.invoke(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public g(@k View view) {
        super(view);
        this.f161465b = view.getContext();
        this.f161466c = (TextView) view.findViewById(R.id.title);
        this.f161467d = (TextView) view.findViewById(R.id.description);
        this.f161468e = (Stepper) view.findViewById(R.id.stepper);
    }

    @Override // com.avito.android.guests_selector.items.adults_stepper.f
    public final void AI(int i12) {
        Stepper stepper = this.f161468e;
        if (stepper == null) {
            return;
        }
        stepper.setMaxValue(i12);
    }

    @Override // com.avito.android.guests_selector.items.adults_stepper.f
    public final void Br(int i12) {
        Stepper stepper = this.f161468e;
        if (stepper == null) {
            return;
        }
        stepper.setValue(i12);
    }

    @Override // com.avito.android.guests_selector.items.adults_stepper.f
    public final void K(@k Y41.l<? super Integer, G0> lVar) {
        Stepper stepper = this.f161468e;
        if (stepper != null) {
            stepper.setOnValueChangeListener(new a(lVar));
        }
    }

    @Override // com.avito.android.guests_selector.items.adults_stepper.f
    public final void S10(int i12) {
        Stepper stepper = this.f161468e;
        if (stepper == null) {
            return;
        }
        stepper.setMinValue(i12);
    }

    @Override // com.avito.android.guests_selector.items.adults_stepper.f
    public final void e2(@k PrintableText printableText) {
        TextView textView = this.f161467d;
        if (textView != null) {
            I5.a(textView, printableText.k0(this.f161465b), false);
        }
    }

    @Override // com.avito.android.guests_selector.items.adults_stepper.f
    public final void p1(@k PrintableText printableText) {
        TextView textView = this.f161466c;
        if (textView != null) {
            I5.a(textView, printableText.k0(this.f161465b), false);
        }
    }
}
