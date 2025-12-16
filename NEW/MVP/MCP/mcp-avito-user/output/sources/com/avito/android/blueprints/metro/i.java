package com.avito.android.blueprints.metro;

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

/* compiled from: MultiStateMetroItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/metro/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/metro/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f106068g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f106069b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f106070c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f106071d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106072e;

    /* renamed from: f, reason: collision with root package name */
    public final int f106073f;

    public i(@k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.select_metro);
        this.f106069b = input;
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.container);
        this.f106070c = componentContainer;
        this.f106072e = componentContainer.getPaddingTop();
        this.f106073f = componentContainer.getPaddingBottom();
        input.setClearButtonVisibleUnfocused(true);
        input.setClearButtonIgnoresRightIcon(true);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void H(@l CharSequence charSequence) {
        boolean zA2 = InterfaceC36016k.a.a(charSequence);
        ComponentContainer componentContainer = this.f106070c;
        if (zA2) {
            ComponentContainer.n(componentContainer, charSequence, 2);
        } else {
            componentContainer.q(componentContainer.f178848i);
        }
        Input.f179303W.getClass();
        this.f106069b.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void K(@l Y41.l<? super String, G0> lVar) {
        a aVar = this.f106071d;
        Input input = this.f106069b;
        if (aVar != null) {
            input.h(aVar);
        }
        a aVar2 = new a(input, lVar);
        input.b(aVar2);
        this.f106071d = aVar2;
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void Pa() {
        ComponentContainer.n(this.f106070c, "", 2);
        Input.f179303W.getClass();
        this.f106069b.setState(Input.f179305b0);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f106069b.setOnClickListener(new j(13, aVar));
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void k0(@l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        D6.f(this.f106070c, 0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? this.f106072e : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? this.f106073f : y6.d(bottom.intValue()), 5);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void m(@l String str) {
        Input.t(this.f106069b, str, false, 6);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void o(@l String str) {
        this.f106069b.setHint(str);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void p2(boolean z12) {
        this.f106069b.setClearButton(z12);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void setEnabled(boolean z12) {
        this.f106069b.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void setTitle(@k CharSequence charSequence) {
        this.f106070c.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.metro.h
    public final void u(@l CharSequence charSequence) {
        this.f106070c.q(charSequence);
        Input.f179303W.getClass();
        this.f106069b.setState(Input.f179304a0);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f106074b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f106075c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f106076d;

        public a(Input input, Y41.l lVar) {
            this.f106075c = input;
            this.f106076d = lVar;
            this.f106074b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f106075c.getDeformattedText();
            if (L.f(deformattedText, this.f106074b)) {
                return;
            }
            this.f106076d.invoke(deformattedText);
            this.f106074b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
