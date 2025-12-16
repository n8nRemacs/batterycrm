package com.avito.android.blueprints.district;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateDistrictItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/district/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/district/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f105898g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f105899b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f105900c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f105901d;

    /* renamed from: e, reason: collision with root package name */
    public final int f105902e;

    /* renamed from: f, reason: collision with root package name */
    public final int f105903f;

    public i(@k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.select_district);
        this.f105899b = input;
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.container);
        this.f105900c = componentContainer;
        this.f105902e = componentContainer.getPaddingTop();
        this.f105903f = componentContainer.getPaddingBottom();
        input.setClearButtonVisibleUnfocused(true);
        input.setClearButtonIgnoresRightIcon(true);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void H(@l CharSequence charSequence) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f105900c;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(componentContainer.f178848i);
        }
        Input.f179303W.getClass();
        this.f105899b.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void K(@l Y41.l<? super String, G0> lVar) {
        a aVar = this.f105901d;
        Input input = this.f105899b;
        if (aVar != null) {
            input.h(aVar);
        }
        a aVar2 = new a(input, lVar);
        input.b(aVar2);
        this.f105901d = aVar2;
    }

    @Override // com.avito.android.blueprints.district.h
    public final void Pa() {
        ComponentContainer.n(this.f105900c, "", 2);
        Input.f179303W.getClass();
        this.f105899b.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f105899b.setOnClickListener(new j(7, aVar));
    }

    @Override // com.avito.android.blueprints.district.h
    public final void k0(@l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        D6.f(this.f105900c, 0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? this.f105902e : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? this.f105903f : y6.d(bottom.intValue()), 5);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void m(@l String str) {
        Input.t(this.f105899b, str, false, 6);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void o(@l String str) {
        this.f105899b.setHint(str);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void p2(boolean z12) {
        this.f105899b.setClearButton(z12);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void setEnabled(boolean z12) {
        this.f105899b.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void setTitle(@k CharSequence charSequence) {
        this.f105900c.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.district.h
    public final void u(@l CharSequence charSequence) {
        this.f105900c.q(charSequence);
        Input.f179303W.getClass();
        this.f105899b.setState(Input.f179304a0);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f105904b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f105905c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f105906d;

        public a(Input input, Y41.l lVar) {
            this.f105905c = input;
            this.f105906d = lVar;
            this.f105904b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f105905c.getDeformattedText();
            if (L.f(deformattedText, this.f105904b)) {
                return;
            }
            this.f105906d.invoke(deformattedText);
            this.f105904b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
