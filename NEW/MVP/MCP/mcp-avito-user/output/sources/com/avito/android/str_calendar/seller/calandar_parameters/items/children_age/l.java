package com.avito.android.str_calendar.seller.calandar_parameters.items.children_age;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChildrenAgeSelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/children_age/l;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/children_age/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f287077k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f287078b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f287079c;

    /* renamed from: d, reason: collision with root package name */
    public final BaseSelect f287080d;

    /* renamed from: e, reason: collision with root package name */
    public final BaseSelect f287081e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public TextWatcher f287082f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f287083g;

    /* renamed from: h, reason: collision with root package name */
    public final ComponentContainer f287084h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Input f287085i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f287086j;

    /* compiled from: ChildrenAgeSelectView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f287087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f287087l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f287087l.invoke();
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f287078b = (TextView) view.findViewById(R.id.title_tv);
        this.f287079c = (ImageView) view.findViewById(R.id.delete_icon_iv);
        this.f287080d = (BaseSelect) view.findViewById(R.id.from_age_select);
        this.f287081e = (BaseSelect) view.findViewById(R.id.to_age_select);
        this.f287084h = (ComponentContainer) view.findViewById(R.id.price_input_container);
        View viewFindViewById = view.findViewById(R.id.price_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f287085i = (Input) viewFindViewById;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void BK(@Y61.l String str) {
        Input.t(this.f287080d, str, false, 6);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Bp(@Y61.k Y41.a<G0> aVar) {
        this.f287081e.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(5, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void CY(@Y61.k String str) {
        this.f287081e.setHint(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Hl(@Y61.l String str) {
        this.f287085i.setHint(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void M00(@Y61.k Y41.a<G0> aVar) {
        this.f287080d.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(4, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Ou(int i12, @Y61.k FormatterType formatterType, @Y61.l String str, @Y61.l String str2) {
        Input input = this.f287085i;
        input.setFormatterType(formatterType);
        input.setInputType(i12);
        if (str != null) {
            input.setPrefix(str);
        }
        if (str2 != null) {
            input.setPostfix(str2);
        }
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Pp(@Y61.l String str) {
        boolean z12 = str == null || str.length() == 0;
        ComponentContainer componentContainer = this.f287084h;
        if (z12) {
            componentContainer.q(null);
        } else {
            ComponentContainer.n(componentContainer, str, 2);
        }
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Q20(@Y61.k Y41.a<G0> aVar) {
        this.f287079c.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(6, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Vq(@Y61.k String str) {
        this.f287080d.setHint(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Wh(@Y61.l String str) {
        Input.t(this.f287081e, str, false, 6);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void Xy(boolean z12) {
        this.f287079c.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void YS(boolean z12) {
        int[] iArr;
        if (z12) {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        }
        this.f287080d.setState(iArr);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void ay(boolean z12) {
        int[] iArr;
        if (z12) {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        }
        this.f287081e.setState(iArr);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f287086j;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void nB(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f287083g = lVar;
        TextWatcher textWatcher = this.f287082f;
        Input input = this.f287085i;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        c cVar = new c(input, lVar);
        input.b(cVar);
        this.f287082f = cVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f287078b, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f287086j = aVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void w40() {
        this.f287083g = null;
        TextWatcher textWatcher = this.f287082f;
        if (textWatcher != null) {
            this.f287085i.h(textWatcher);
        }
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void x30(@Y61.k Y41.a<G0> aVar) {
        this.f287085i.setClearButtonListener(new a(aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.children_age.k
    public final void y10(@Y61.l String str) {
        b bVar;
        TextWatcher textWatcher = this.f287082f;
        Input input = this.f287085i;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        Input.t(input, str, true, 2);
        Y41.l<? super String, G0> lVar = this.f287083g;
        if (lVar != null) {
            bVar = new b(input, lVar);
            input.b(bVar);
        } else {
            bVar = null;
        }
        this.f287082f = bVar;
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f287088b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f287089c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f287090d;

        public b(Input input, Y41.l lVar) {
            this.f287089c = input;
            this.f287090d = lVar;
            this.f287088b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f287089c.getDeformattedText();
            if (L.f(deformattedText, this.f287088b)) {
                return;
            }
            this.f287090d.invoke(deformattedText);
            this.f287088b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f287091b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f287092c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f287093d;

        public c(Input input, Y41.l lVar) {
            this.f287092c = input;
            this.f287093d = lVar;
            this.f287091b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f287092c.getDeformattedText();
            if (L.f(deformattedText, this.f287091b)) {
                return;
            }
            this.f287093d.invoke(deformattedText);
            this.f287091b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
