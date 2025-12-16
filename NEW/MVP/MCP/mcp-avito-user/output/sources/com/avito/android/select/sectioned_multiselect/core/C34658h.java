package com.avito.android.select.sectioned_multiselect.core;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.select.sectioned_multiselect.core.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34658h implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f266667b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f266668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C34656f f266669d;

    public C34658h(Input input, C34656f c34656f) {
        this.f266668c = input;
        this.f266669d = c34656f;
        this.f266667b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String deformattedText = this.f266668c.getDeformattedText();
        if (kotlin.jvm.internal.L.f(deformattedText, this.f266667b)) {
            return;
        }
        this.f266669d.f266656q.accept(deformattedText);
        this.f266667b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
