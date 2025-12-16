package com.avito.android.str_calendar.seller.calandar_parameters.items.input;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.icebreakers.n;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.K2;
import j.D;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RdsInputItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/input/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/input/i;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f287212g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f287213b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f287214c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public TextWatcher f287215d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f287216e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f287217f;

    /* compiled from: RdsInputItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f287218l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f287218l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f287218l.invoke();
            return G0.f406611a;
        }
    }

    public j(@k View view, @D int i12, @D int i13) {
        super(view);
        View viewFindViewById = view.findViewById(i12);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f287213b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(i13);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f287214c = input;
        input.r();
        input.setClearButtonVisibleUnfocused(true);
        input.setFocusByClearButton(true);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void G() {
        this.f287213b.q(null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void K(@l Y41.l<? super String, G0> lVar) {
        b bVar;
        this.f287216e = lVar;
        TextWatcher textWatcher = this.f287215d;
        Input input = this.f287214c;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        if (lVar != null) {
            bVar = new b(input, lVar);
            input.b(bVar);
        } else {
            bVar = null;
        }
        this.f287215d = bVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void K00(int i12, @l CharSequence charSequence, @l CharSequence charSequence2) {
        String string;
        String string2;
        FormatterType.f179288e.getClass();
        FormatterType formatterTypeC = FormatterType.a.c();
        Input input = this.f287214c;
        input.setFormatterType(formatterTypeC);
        input.setInputType(i12);
        if (charSequence != null && (string2 = charSequence.toString()) != null) {
            input.setPrefix(string2);
        }
        if (charSequence2 == null || (string = charSequence2.toString()) == null) {
            return;
        }
        input.setPostfix(string);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void W() {
        K2.d(this.f287214c, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f287217f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void lB(@k Y41.a<G0> aVar) {
        this.f287214c.setClearButtonListener(new a(aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void m(@l String str) {
        c cVar;
        TextWatcher textWatcher = this.f287215d;
        Input input = this.f287214c;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        Input.t(input, str, true, 2);
        Y41.l<? super String, G0> lVar = this.f287216e;
        if (lVar != null) {
            cVar = new c(input, lVar);
            input.b(cVar);
        } else {
            cVar = null;
        }
        this.f287215d = cVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void o0(@k Y41.l<? super Boolean, G0> lVar) {
        this.f287214c.setOnFocusChangeListener(new n(7, lVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void setHint(@l String str) {
        this.f287214c.setHint(str);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void setTitle(@k CharSequence charSequence) {
        this.f287213b.setTitle(charSequence);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void t(@k Y41.a<G0> aVar) {
        this.f287217f = aVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.input.i
    public final void v9(@l String str) {
        ComponentContainer.n(this.f287213b, str, 2);
    }

    public /* synthetic */ j(View view, int i12, int i13, int i14, C42822w c42822w) {
        this(view, (i14 & 2) != 0 ? R.id.input_container : i12, (i14 & 4) != 0 ? R.id.input : i13);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f287219b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f287220c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f287221d;

        public b(Input input, Y41.l lVar) {
            this.f287220c = input;
            this.f287221d = lVar;
            this.f287219b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f287220c.getDeformattedText();
            if (L.f(deformattedText, this.f287219b)) {
                return;
            }
            this.f287221d.invoke(deformattedText);
            this.f287219b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f287222b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f287223c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f287224d;

        public c(Input input, Y41.l lVar) {
            this.f287223c = input;
            this.f287224d = lVar;
            this.f287222b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f287223c.getDeformattedText();
            if (L.f(deformattedText, this.f287222b)) {
                return;
            }
            this.f287224d.invoke(deformattedText);
            this.f287222b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
