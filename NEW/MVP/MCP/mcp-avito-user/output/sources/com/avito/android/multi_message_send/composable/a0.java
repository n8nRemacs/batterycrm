package com.avito.android.multi_message_send.composable;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiSendTitleItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_multi-message-send_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a0 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(-1975433050);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            float f12 = 16;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar3, f12, 0.0f, f12, 4, 2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65233d;
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63938l.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarM, false, jC2, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, i14 & 14, 968);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Y(str, aVar2, i12);
        }
    }
}
