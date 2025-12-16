package com.avito.android.rating_form.item.singleLineInput;

import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SingleLineInputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/singleLineInput/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/singleLineInput/j;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f248631b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f248632c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public c f248633d;

    /* compiled from: SingleLineInputItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f248634a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f248635b;

        static {
            int[] iArr = new int[RatingFormField.DataType.values().length];
            try {
                iArr[RatingFormField.DataType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f248634a = iArr;
            int[] iArr2 = new int[RatingFormField.MaskType.values().length];
            try {
                iArr2[RatingFormField.MaskType.ROUBLES.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f248635b = iArr2;
        }
    }

    /* compiled from: SingleLineInputItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f248636l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AttributedText attributedText) {
            super(1);
            this.f248636l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            com.avito.android.util.text.j.a(textView, this.f248636l, null);
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.single_line_input_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f248631b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.single_line_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f248632c = (Input) viewFindViewById2;
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void F9(@Y61.k RatingFormField.DataType dataType) {
        int i12 = a.f248634a[dataType.ordinal()];
        Input input = this.f248632c;
        if (i12 == 1) {
            input.setInputType(2);
        } else {
            input.setInputType(16385);
        }
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void Ts(@l String str) {
        this.f248631b.setMessage(str);
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void X0(@l Boolean bool) {
        this.f248631b.setEnabled(bool != null ? bool.booleanValue() : true);
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void Y1(@l AttributedText attributedText) {
        this.f248631b.i(new b(attributedText));
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void YD(@l Integer num) {
        if (num != null) {
            this.f248632c.setMaxLength(num.intValue());
        }
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void aw(@l RatingFormField.MaskType maskType) {
        if (maskType != null) {
            if (a.f248635b[maskType.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            FormatterType.f179288e.getClass();
            this.f248632c.setFormatterType(FormatterType.f179291h);
        }
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void f(@l String str) {
        this.f248631b.setSubtitle(str);
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void i0() {
        this.f248632c.post(new com.avito.android.publish.screen.objects.view.actions.h(this, 3));
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void m(@l String str) {
        c cVar = this.f248633d;
        Input input = this.f248632c;
        if (cVar != null) {
            input.h(cVar);
        }
        Input.t(input, str, false, 6);
        c cVar2 = this.f248633d;
        if (cVar2 != null) {
            input.b(cVar2);
        }
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void o(@l String str) {
        this.f248632c.setHint(str);
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void r0(@Y61.k Y41.l<? super String, G0> lVar) {
        c cVar = this.f248633d;
        Input input = this.f248632c;
        if (cVar != null) {
            input.h(cVar);
        }
        c cVar2 = new c(input, lVar);
        input.b(cVar2);
        this.f248633d = cVar2;
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void s0(@l PrintableText printableText) {
        ComponentContainer componentContainer = this.f248631b;
        if (printableText != null) {
            ComponentContainer.l(componentContainer, new int[]{R.id.single_line_input}, printableText.k0(componentContainer.getContext()), 4);
        } else {
            componentContainer.k();
        }
    }

    @Override // com.avito.android.rating_form.item.singleLineInput.j
    public final void setTitle(@l String str) {
        this.f248631b.setTitle(str);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f248637b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f248638c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f248639d;

        public c(Input input, Y41.l lVar) {
            this.f248638c = input;
            this.f248639d = lVar;
            this.f248637b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f248638c.getDeformattedText();
            if (L.f(deformattedText, this.f248637b)) {
                return;
            }
            this.f248639d.invoke(deformattedText);
            this.f248637b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
