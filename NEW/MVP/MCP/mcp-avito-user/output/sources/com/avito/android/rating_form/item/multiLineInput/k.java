package com.avito.android.rating_form.item.multiLineInput;

import Kh0.C14315a;
import Kh0.e;
import Y61.l;
import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiLineInputItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/item/multiLineInput/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/multiLineInput/j;", "LKh0/d;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j, Kh0.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C14315a f248486b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f248487c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public d f248488d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Kh0.c f248489e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f248490f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Input f248491g;

    /* renamed from: h, reason: collision with root package name */
    public final Resources f248492h;

    /* renamed from: i, reason: collision with root package name */
    public final int f248493i;

    /* compiled from: MultiLineInputItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/item/multiLineInput/k$a;", "", "<init>", "()V", "", "TEXT_LINE_SIZE", "I", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MultiLineInputItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f248494a;

        static {
            int[] iArr = new int[RatingFormField.DataType.values().length];
            try {
                iArr[RatingFormField.DataType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f248494a = iArr;
        }
    }

    /* compiled from: MultiLineInputItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f248495l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AttributedText attributedText) {
            super(1);
            this.f248495l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            com.avito.android.util.text.j.a(textView, this.f248495l, null);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public k(@Y61.k View view, @Y61.k C14315a c14315a) {
        super(view);
        this.f248486b = c14315a;
        View viewFindViewById = view.findViewById(R.id.multi_line_input_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f248490f = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.multi_line_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f248491g = (Input) viewFindViewById2;
        this.f248492h = view.getResources();
        this.f248493i = C35835l0.d(R.attr.gray54, view.getContext());
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void F9(@Y61.k RatingFormField.DataType dataType) {
        int i12 = b.f248494a[dataType.ordinal()];
        Input input = this.f248491g;
        if (i12 == 1) {
            input.setInputType(2);
        } else {
            input.setInputType(147457);
            Input.p(input, 0, 4, 1);
        }
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void Jo(int i12) {
        if (this.f248489e != null) {
            return;
        }
        Kh0.c cVar = new Kh0.c(i12, this);
        this.f248491g.b(cVar);
        this.f248489e = cVar;
    }

    @Override // Kh0.d
    public final void O10(@Y61.k Kh0.e eVar) throws Resources.NotFoundException {
        if (this.f248487c) {
            return;
        }
        boolean z12 = eVar instanceof e.b;
        ComponentContainer componentContainer = this.f248490f;
        Resources resources = this.f248492h;
        C14315a c14315a = this.f248486b;
        if (z12) {
            componentContainer.o(resources.getString(R.string.rating_text_counter_empty_state, c14315a.a(Integer.valueOf(((e.b) eVar).f9626a))), new int[]{R.id.multi_line_input});
            return;
        }
        if (eVar instanceof e.c) {
            e.c cVar = (e.c) eVar;
            componentContainer.o(resources.getString(R.string.rating_text_counter_progress, c14315a.a(Integer.valueOf(cVar.f9627a)), c14315a.a(Integer.valueOf(cVar.f9628b))), new int[]{R.id.multi_line_input});
        } else if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            String strA = c14315a.a(Integer.valueOf(aVar.f9624a));
            String string = resources.getString(R.string.rating_text_counter_progress, strA, c14315a.a(Integer.valueOf(aVar.f9625b)));
            int length = strA.length();
            int length2 = string.length();
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(this.f248493i), length, length2, 33);
            ComponentContainer.l(componentContainer, new int[]{R.id.design_container_message}, spannableString, 4);
        }
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void VG(@l String str) throws Resources.NotFoundException {
        Kh0.c cVar = this.f248489e;
        if (cVar != null) {
            O10(cVar.a(str));
        }
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void X0(@l Boolean bool) {
        this.f248490f.setEnabled(bool != null ? bool.booleanValue() : true);
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void Y1(@l AttributedText attributedText) {
        this.f248490f.i(new c(attributedText));
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void f(@l String str) {
        this.f248490f.setSubtitle(str);
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void m(@l String str) {
        d dVar = this.f248488d;
        Input input = this.f248491g;
        if (dVar != null) {
            input.h(dVar);
        }
        Input.t(input, str, false, 6);
        d dVar2 = this.f248488d;
        if (dVar2 != null) {
            input.b(dVar2);
        }
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void o(@l String str) {
        this.f248491g.setHint(str);
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void r0(@Y61.k Y41.l<? super String, G0> lVar) {
        d dVar = this.f248488d;
        Input input = this.f248491g;
        if (dVar != null) {
            input.h(dVar);
        }
        d dVar2 = new d(input, lVar);
        input.b(dVar2);
        this.f248488d = dVar2;
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void s0(@l PrintableText printableText) {
        if (printableText == null) {
            this.f248487c = false;
            return;
        }
        this.f248487c = true;
        int[] iArr = {R.id.multi_line_input};
        ComponentContainer componentContainer = this.f248490f;
        ComponentContainer.l(componentContainer, iArr, printableText.k0(componentContainer.getContext()), 4);
    }

    @Override // com.avito.android.rating_form.item.multiLineInput.j
    public final void setTitle(@l String str) {
        this.f248490f.setTitle(str);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f248496b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f248497c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f248498d;

        public d(Input input, Y41.l lVar) {
            this.f248497c = input;
            this.f248498d = lVar;
            this.f248496b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f248497c.getDeformattedText();
            if (L.f(deformattedText, this.f248496b)) {
                return;
            }
            this.f248498d.invoke(deformattedText);
            this.f248496b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
