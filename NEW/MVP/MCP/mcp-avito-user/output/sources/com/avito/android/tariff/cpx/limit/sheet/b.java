package com.avito.android.tariff.cpx.limit.sheet;

import NB0.a;
import NB0.c;
import Y41.l;
import Y61.k;
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
/* loaded from: classes4.dex */
public final class b implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f297259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f297260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f297261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NB0.c f297262e;

    public b(Input input, l lVar, NB0.c cVar) {
        this.f297260c = input;
        this.f297261d = lVar;
        this.f297262e = cVar;
        this.f297259b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        Integer num;
        String deformattedText = this.f297260c.getDeformattedText();
        if (L.f(deformattedText, this.f297259b)) {
            return;
        }
        Integer numY0 = C43066x.y0(deformattedText);
        int iIntValue = 0;
        int iIntValue2 = numY0 != null ? numY0.intValue() : 0;
        NB0.c cVar = this.f297262e;
        c.C0724c c0724c = cVar.f11311e;
        if (c0724c != null && (num = c0724c.f11323a) != null) {
            iIntValue = num.intValue();
        }
        ((a) this.f297261d).invoke(new a.C0722a(iIntValue2, iIntValue, cVar.f11313g));
        this.f297259b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
