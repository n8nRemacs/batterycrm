package com.avito.android.select.bottom_sheet;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f265320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f265321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f265322d;

    public m(Input input, g gVar) {
        this.f265321c = input;
        this.f265322d = gVar;
        this.f265320b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String deformattedText = this.f265321c.getDeformattedText();
        if (L.f(deformattedText, this.f265320b)) {
            return;
        }
        this.f265322d.f265292d.invoke(deformattedText);
        this.f265320b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
