package com.avito.android.mortgage.person_form.suggestion;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestionScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/Input;", "input", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/input/Input;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x extends N implements Y41.l<Input, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H00.c f201519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<TextWatcher> f201520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(H00.c cVar, InterfaceC22204y1<TextWatcher> interfaceC22204y1) {
        super(1);
        this.f201519l = cVar;
        this.f201520m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(Input input) {
        Input input2 = input;
        Editable editableM53getText = input2.m53getText();
        String string = editableM53getText != null ? editableM53getText.toString() : null;
        H00.c cVar = this.f201519l;
        if (!L.f(string, cVar.f6916d)) {
            InterfaceC22204y1<TextWatcher> interfaceC22204y1 = this.f201520m;
            TextWatcher f42167b = interfaceC22204y1.getF42167b();
            if (f42167b != null) {
                input2.h(f42167b);
            }
            Input.t(input2, cVar.f6916d, false, 6);
            TextWatcher f42167b2 = interfaceC22204y1.getF42167b();
            if (f42167b2 != null) {
                input2.b(f42167b2);
            }
            input2.q();
        }
        return G0.f406611a;
    }
}
