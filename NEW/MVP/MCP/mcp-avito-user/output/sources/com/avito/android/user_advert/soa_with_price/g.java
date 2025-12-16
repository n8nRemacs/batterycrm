package com.avito.android.user_advert.soa_with_price;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PriceSheetDialogViewImplRe23.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/g;", "Lcom/avito/android/user_advert/soa_with_price/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements InterfaceC35551e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f311917a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f311918b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f311919c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f311920d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Boolean, String>> f311921e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f311922f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f311923g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f311924h;

    public g(@Y61.k ViewGroup viewGroup, @Y61.k String str, boolean z12) {
        this.f311917a = (TextView) viewGroup.findViewById(R.id.price_input_message);
        Input input = (Input) viewGroup.findViewById(R.id.price_input);
        this.f311918b = input;
        Button button = (Button) viewGroup.findViewById(R.id.close_button);
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f311919c = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f311920d = cVar2;
        com.jakewharton.rxrelay3.c<Q<Boolean, String>> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f311921e = cVar3;
        this.f311922f = new C41981q0(cVar);
        this.f311923g = new C41981q0(cVar2);
        this.f311924h = new C41981q0(cVar3);
        button.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 27));
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 17));
        input.b(new a(input, this));
        input.setPostfix(z12 ? " ".concat(str) : viewGroup.getContext().getString(R.string.price_ruble_postfix));
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.a.c());
        input.setMaxLength(12);
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    public final void P2(@Y61.l CharSequence charSequence) {
        if (charSequence != null) {
            this.f311917a.setText(charSequence);
        }
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C41981q0 getF311923g() {
        return this.f311923g;
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41981q0 getF311924h() {
        return this.f311924h;
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C41981q0 getF311922f() {
        return this.f311922f;
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    public final void y0(@Y61.l String str) {
        if (str != null) {
            Input.t(this.f311918b, str, false, 6);
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f311925b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f311926c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f311927d;

        public a(Input input, g gVar) {
            this.f311926c = input;
            this.f311927d = gVar;
            this.f311925b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f311926c.getDeformattedText();
            if (L.f(deformattedText, this.f311925b)) {
                return;
            }
            this.f311927d.f311919c.accept(deformattedText);
            this.f311925b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
