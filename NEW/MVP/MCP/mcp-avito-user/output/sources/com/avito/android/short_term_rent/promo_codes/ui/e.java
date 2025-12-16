package com.avito.android.short_term_rent.promo_codes.ui;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.radio.RadioGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kw0.C43505a;
import nw0.InterfaceC44484a;

/* compiled from: StrSoftBookingPromoCodesDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/e;", "Lcom/avito/android/short_term_rent/promo_codes/ui/d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f282522a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f282523b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43505a f282524c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FragmentManager f282525d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RadioGroup f282526e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Input f282527f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ComponentContainer f282528g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f282529h;

    public e(@k View view, @k com.avito.android.lib.design.bottom_sheet.d dVar, @k C43505a c43505a, @k FragmentManager fragmentManager) {
        this.f282522a = view;
        this.f282523b = dVar;
        this.f282524c = c43505a;
        this.f282525d = fragmentManager;
        Input input = (Input) view.findViewById(R.id.promo_code_input);
        input.b(new a(input, this));
        this.f282527f = input;
        this.f282528g = (ComponentContainer) view.findViewById(R.id.promo_code_input_container);
        this.f282526e = (RadioGroup) view.findViewById(R.id.promo_codes_container);
        this.f282529h = (Button) view.findViewById(R.id.promo_code_apply_btn);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f282530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f282531c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e f282532d;

        public a(Input input, e eVar) {
            this.f282531c = input;
            this.f282532d = eVar;
            this.f282530b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f282531c.getDeformattedText();
            if (L.f(deformattedText, this.f282530b)) {
                return;
            }
            this.f282532d.f282524c.accept(new InterfaceC44484a.e(deformattedText));
            this.f282530b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
