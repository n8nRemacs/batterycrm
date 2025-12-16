package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f135458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f135459c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f135460d;

    public n(Input input, l lVar) {
        this.f135459c = input;
        this.f135460d = lVar;
        this.f135458b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String deformattedText = this.f135459c.getDeformattedText();
        if (L.f(deformattedText, this.f135458b)) {
            return;
        }
        l lVar = this.f135460d;
        p pVar = lVar.f135445u;
        if (pVar != null) {
            pVar.a(C43066x.z0(deformattedText), lVar.f135448x);
        }
        this.f135458b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
