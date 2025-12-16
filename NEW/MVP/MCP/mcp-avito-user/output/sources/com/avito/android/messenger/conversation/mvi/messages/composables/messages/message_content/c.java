package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeletedMessageContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l A a12, int i12) {
        int i13;
        B b12;
        androidx.compose.ui.v vVar2;
        B bE2 = a12.E(1730055470);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | 48;
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65240k;
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, C22501m2.a(R1.i(aVar, 16), "DeletedMessageText"), false, jC2, null, 0, 0, false, null, bE2, (i14 & 14) | 3072, 992);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, vVar2, str);
        }
    }
}
