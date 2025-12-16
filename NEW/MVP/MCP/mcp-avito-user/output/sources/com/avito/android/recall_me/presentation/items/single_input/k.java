package com.avito.android.recall_me.presentation.items.single_input;

import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SingleInputView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recall_me/presentation/items/single_input/k;", "Lcom/avito/android/recall_me/presentation/items/single_input/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f251969b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f251970c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public TextWatcher f251971d;

    /* compiled from: SingleInputView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f251975l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a<G0> aVar) {
            super(1);
            this.f251975l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            num.intValue();
            this.f251975l.invoke();
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        ComponentContainer componentContainer = (ComponentContainer) view;
        this.f251969b = componentContainer;
        View viewFindViewById = componentContainer.findViewById(R.id.recall_me_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f251970c = (Input) viewFindViewById;
    }

    @Override // com.avito.android.recall_me.presentation.items.single_input.j
    public final void Kb(@l String str, boolean z12) {
        this.f251970c.u(z12, str);
    }

    @Override // com.avito.android.recall_me.presentation.items.single_input.j
    public final void U3(boolean z12) {
        ComponentContainer componentContainer = this.f251969b;
        if (z12) {
            ComponentContainer.l(componentContainer, new int[]{R.id.recall_me_input}, null, 6);
        } else {
            componentContainer.o(componentContainer.f178848i, new int[]{R.id.recall_me_input});
        }
    }

    @Override // com.avito.android.recall_me.presentation.items.single_input.j
    public final void WR(@Y61.k FormatterType formatterType, @l String str, @Y61.k Y41.l<? super String, G0> lVar) {
        TextWatcher aVar;
        Integer num = formatterType.f179301c;
        int iIntValue = num != null ? num.intValue() : 1;
        TextWatcher textWatcher = this.f251971d;
        Input input = this.f251970c;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        if (str == null) {
            input.setFormatterType(formatterType);
            aVar = new a(input, lVar);
            input.b(aVar);
        } else {
            input.setInputType(iIntValue);
            com.avito.android.recall_me.presentation.items.single_input.b bVar = new com.avito.android.recall_me.presentation.items.single_input.b(input, new com.avito.android.recall_me.presentation.items.single_input.a(str), lVar);
            input.b(bVar);
            aVar = bVar;
        }
        this.f251971d = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f251969b.setComponentsResetListener(null);
        TextWatcher textWatcher = this.f251971d;
        Input input = this.f251970c;
        if (textWatcher != null) {
            input.h(textWatcher);
        }
        input.u(false, "");
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179289f);
    }

    @Override // com.avito.android.recall_me.presentation.items.single_input.j
    public final void q9(@Y61.k String str) {
        this.f251969b.setTitle(str);
    }

    @Override // com.avito.android.recall_me.presentation.items.single_input.j
    public final void setHint(@l String str) {
        this.f251970c.setHint(str);
    }

    @Override // com.avito.android.recall_me.presentation.items.single_input.j
    public final void tn(@Y61.k Y41.a<G0> aVar) {
        this.f251969b.setComponentsResetListener(new b(aVar));
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f251972b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f251973c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f251974d;

        public a(Input input, Y41.l lVar) {
            this.f251973c = input;
            this.f251974d = lVar;
            this.f251972b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f251973c.getDeformattedText();
            if (L.f(deformattedText, this.f251972b)) {
                return;
            }
            this.f251974d.invoke(deformattedText);
            this.f251972b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
