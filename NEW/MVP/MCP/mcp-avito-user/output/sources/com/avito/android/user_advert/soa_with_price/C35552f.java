package com.avito.android.user_advert.soa_with_price;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PriceSheetDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/f;", "Lcom/avito/android/user_advert/soa_with_price/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.soa_with_price.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35552f implements InterfaceC35551e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f311906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f311907b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f311908c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f311909d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Boolean, String>> f311910e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f311911f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f311912g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f311913h;

    public C35552f(@Y61.k ViewGroup viewGroup) {
        View viewFindViewById = viewGroup.findViewById(R.id.price_input_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f311906a = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.price_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f311907b = input;
        View viewFindViewById3 = viewGroup.findViewById(R.id.close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f311908c = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f311909d = cVar2;
        com.jakewharton.rxrelay3.c<Q<Boolean, String>> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f311910e = cVar3;
        this.f311911f = new C41981q0(cVar);
        this.f311912g = new C41981q0(cVar2);
        this.f311913h = new C41981q0(cVar3);
        ((Button) viewFindViewById3).setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 26));
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 16));
        input.b(new a(input, this));
        input.setPostfix(viewGroup.getContext().getString(R.string.price_ruble_postfix));
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.a.c());
        input.setMaxLength(12);
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    public final void P2(@Y61.l CharSequence charSequence) {
        this.f311906a.setMessage(charSequence);
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C41981q0 getF311912g() {
        return this.f311912g;
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41981q0 getF311913h() {
        return this.f311913h;
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C41981q0 getF311911f() {
        return this.f311911f;
    }

    @Override // com.avito.android.user_advert.soa_with_price.InterfaceC35551e
    public final void y0(@Y61.l String str) {
        Input.t(this.f311907b, str, false, 6);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.soa_with_price.f$a */
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f311914b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f311915c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C35552f f311916d;

        public a(Input input, C35552f c35552f) {
            this.f311915c = input;
            this.f311916d = c35552f;
            this.f311914b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f311915c.getDeformattedText();
            if (L.f(deformattedText, this.f311914b)) {
                return;
            }
            this.f311916d.f311908c.accept(deformattedText);
            this.f311914b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
