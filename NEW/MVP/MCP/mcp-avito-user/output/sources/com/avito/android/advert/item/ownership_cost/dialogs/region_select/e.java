package com.avito.android.advert.item.ownership_cost.dialogs.region_select;

import Y61.k;
import Y61.l;
import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @k
    public String f77912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f77913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f77914d;

    public e(Input input, f fVar) {
        this.f77913c = input;
        this.f77914d = fVar;
        this.f77912b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@l Editable editable) {
        String deformattedText = this.f77913c.getDeformattedText();
        if (L.f(deformattedText, this.f77912b)) {
            return;
        }
        this.f77914d.f77919e.accept(deformattedText);
        this.f77912b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
