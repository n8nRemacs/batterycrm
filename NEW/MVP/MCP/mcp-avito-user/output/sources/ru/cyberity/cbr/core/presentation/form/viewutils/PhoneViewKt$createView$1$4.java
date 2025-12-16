package ru.cyberity.cbr.core.presentation.form.viewutils;

import Y41.a;
import android.content.Context;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.widget.PhoneKit;

/* compiled from: PhoneView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
final class PhoneViewKt$createView$1$4 extends N implements a<G0> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PhoneKit $phoneNumberKit;

    @Override // Y41.a
    public /* bridge */ /* synthetic */ G0 invoke() {
        invoke2();
        return G0.f406611a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$phoneNumberKit.detach(this.$context);
    }
}
