package com.avito.android.mortgage.person_form.list.items.select;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/select/i;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/select/h;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class i extends C00.a implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f200772d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f200773b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f200774c;

    /* compiled from: SelectView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<TextView, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AttributedText f200775l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AttributedText attributedText) {
            super(1);
            this.f200775l = attributedText;
        }

        @Override // Y41.l
        public final G0 invoke(TextView textView) {
            j.a(textView, this.f200775l, null);
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f200773b = (ComponentContainer) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f200774c = (Input) viewFindViewById2;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.select.h
    public final void ML(@k String str) {
        this.f200774c.setHint(str);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.select.h
    public final void Qh(@k String str) {
        this.f200773b.setTitle(str);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.select.h
    public final void We(@Y61.l Y41.a<G0> aVar) {
        Input input = this.f200774c;
        if (aVar == null) {
            input.setOnClickListener(null);
        } else {
            input.setOnClickListener(new C(12, aVar));
        }
    }

    @Override // com.avito.android.mortgage.person_form.list.items.select.h
    public final void Yp(@Y61.l String str) {
        Input.t(this.f200774c, str, false, 6);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.select.h
    public final void ar(@Y61.l PrintableText printableText) {
        ComponentContainer componentContainer = this.f200773b;
        if (printableText == null) {
            componentContainer.k();
        } else {
            ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f200774c.setOnClickListener(null);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.select.h
    public final void v10(@Y61.l AttributedText attributedText, @Y61.l String str) {
        ComponentContainer componentContainer = this.f200773b;
        if (attributedText != null) {
            componentContainer.i(new a(attributedText));
        } else if (str != null) {
            componentContainer.setSubtitle(str);
        } else {
            componentContainer.setSubtitle((CharSequence) null);
        }
    }
}
