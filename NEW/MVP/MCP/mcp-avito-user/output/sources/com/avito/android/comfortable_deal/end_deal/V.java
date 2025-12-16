package com.avito.android.comfortable_deal.end_deal;

import android.content.Context;
import androidx.compose.foundation.text.C20981p1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.transformation.k;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EndDealScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class V extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EndDealField.RoubleInput f122127l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f122128m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V(EndDealField.RoubleInput roubleInput, Y41.l<? super String, G0> lVar) {
        super(3);
        this.f122127l = roubleInput;
        this.f122128m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            EndDealField.RoubleInput roubleInput = this.f122127l;
            String str = roubleInput.f122271b;
            if (str == null) {
                str = "";
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.input.v f66388c = com.akita.compose.theme.re23.b.l(a13).getF66388c();
            k.C2089k c2089k = k.C2089k.f61827d;
            C20981p1.f31763h.getClass();
            C20981p1 c20981p1 = C20981p1.f31764i;
            androidx.compose.ui.text.input.C.f42345b.getClass();
            C20981p1 c20981p1A = C20981p1.a(c20981p1, androidx.compose.ui.text.input.C.f42348e, 0, 123);
            InputState inputState = roubleInput.getF122253f() ? InputState.f61669c : InputState.f61668b;
            Y41.l<String, G0> lVar = this.f122128m;
            com.akita.compose.component.input.u.b(str, f66388c, lVar, null, "₽", false, inputState, false, c20981p1A, null, c2089k, 0, false, 0, null, null, androidx.compose.runtime.internal.r.c(-1954007006, new U(roubleInput, lVar), a13), null, a13, 24576, 1572864, 195240);
            PrintableText printableText = roubleInput.f122274e;
            if (printableText != null) {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.foundation.ui.g.a(6, null, a13, 6);
                com.akita.compose.foundation.ui.p.b(printableText.k0((Context) a13.o(AndroidCompositionLocals_androidKt.f41069b)), com.akita.compose.theme.re23.b.f63988f.f65244o, null, false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(a13), null, 0, 0, false, null, a13, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            }
        }
        return G0.f406611a;
    }
}
