package com.avito.android.lib.design.input;

import Fc1.E0;
import androidx.appcompat.widget.AppCompatEditText;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.N;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n {
    @Y61.k
    public static final N a(@Y61.k Input input, @Y61.k int... iArr) {
        return new N(new C(new com.avito.android.gig_shift_action.ui.a(2, input, iArr)), new E0(input, 28));
    }

    @Y61.k
    public static final s b(@Y61.k AppCompatEditText appCompatEditText, @Y61.k Y41.l lVar) {
        s sVar = new s(appCompatEditText.getText(), lVar);
        appCompatEditText.addTextChangedListener(sVar);
        return sVar;
    }

    @Y61.k
    public static final s c(@Y61.k Input input, @Y61.k Y41.l lVar) {
        s sVar = new s(input.m53getText(), lVar);
        input.b(sVar);
        return sVar;
    }

    @Y61.k
    public static final B0 d(@Y61.k Input input) {
        return a(input, 6).d0(m.f179410b);
    }

    @Y61.k
    public static final com.jakewharton.rxbinding4.a<CharSequence> e(@Y61.k Input input) {
        return new p(input);
    }

    @Y61.k
    public static final com.jakewharton.rxbinding4.a<Q<String, String>> f(@Y61.k Input input) {
        return new q(input);
    }
}
