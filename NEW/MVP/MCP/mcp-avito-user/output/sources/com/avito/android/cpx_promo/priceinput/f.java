package com.avito.android.cpx_promo.priceinput;

import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Input f127318b;

    public f(Input input, Input input2) {
        this.f127318b = input2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Input input = this.f127318b;
        input.requestFocus();
        g gVar = new g(input);
        input.postDelayed(gVar, 300L);
        input.addOnAttachStateChangeListener(new h(input, gVar));
    }
}
