package com.avito.android.tariff.cpx.info.advance;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import com.avito.android.tariff.cpx.info.advance.TariffCpxInfoAdvanceDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import tB0.InterfaceC48530a;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f296287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f296288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TariffCpxInfoAdvanceDialogFragment f296289d;

    public c(Input input, TariffCpxInfoAdvanceDialogFragment tariffCpxInfoAdvanceDialogFragment) {
        this.f296288c = input;
        this.f296289d = tariffCpxInfoAdvanceDialogFragment;
        this.f296287b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@l Editable editable) {
        String deformattedText = this.f296288c.getDeformattedText();
        if (L.f(deformattedText, this.f296287b)) {
            return;
        }
        TariffCpxInfoAdvanceDialogFragment.a aVar = TariffCpxInfoAdvanceDialogFragment.f296263n0;
        ((e) this.f296289d.f296267k0.getValue()).accept(new InterfaceC48530a.C12662a(deformattedText));
        this.f296287b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
