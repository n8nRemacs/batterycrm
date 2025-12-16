package com.avito.android.blueprint.multiselect;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PublishMultiselectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/multiselect/j;", "LHj/c;", "Lcom/avito/android/blueprint/multiselect/i;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends Hj.c implements i {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f105623o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Input f105624m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public a f105625n;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_multiselect_content, aVar);
        Input input = (Input) this.f7656e.findViewById(R.id.select);
        this.f105624m = input;
        Input.p(input, 0, 0, 3);
    }

    @Override // Hj.c
    public final void B80() {
        Input.f179303W.getClass();
        this.f105624m.setState(Input.f179305b0);
    }

    @Override // Hj.c
    public final void C80() {
        Input.f179303W.getClass();
        this.f105624m.setState(Input.f179304a0);
    }

    @Override // com.avito.android.blueprint.multiselect.i
    public final void K(@l Y41.l<? super String, G0> lVar) {
        a aVar = this.f105625n;
        Input input = this.f105624m;
        if (aVar != null) {
            input.h(aVar);
        }
        a aVar2 = new a(input, lVar);
        input.b(aVar2);
        this.f105625n = aVar2;
    }

    @Override // com.avito.android.blueprint.multiselect.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f105624m.setOnClickListener(new com.avito.android.blueprint.date.interval.j(4, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Input input = this.f105624m;
        input.setOnClickListener(null);
        a aVar = this.f105625n;
        if (aVar != null) {
            input.h(aVar);
        }
    }

    @Override // com.avito.android.blueprint.multiselect.i
    public final void m(@l String str) {
        Input.t(this.f105624m, str, false, 6);
    }

    @Override // com.avito.android.blueprint.multiselect.i
    public final void o(@l String str) {
        this.f105624m.setHint(str);
    }

    @Override // com.avito.android.blueprint.multiselect.i
    public final void p2(boolean z12) {
        this.f105624m.setClearButton(z12);
    }

    @Override // Hj.c, Hj.InterfaceC13997b
    public final void setEnabled(boolean z12) {
        super.setEnabled(z12);
        this.f105624m.setEnabled(z12);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @k
        public String f105626b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f105627c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f105628d;

        public a(Input input, Y41.l lVar) {
            this.f105627c = input;
            this.f105628d = lVar;
            this.f105626b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@l Editable editable) {
            String deformattedText = this.f105627c.getDeformattedText();
            if (L.f(deformattedText, this.f105626b)) {
                return;
            }
            this.f105628d.invoke(deformattedText);
            this.f105626b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
