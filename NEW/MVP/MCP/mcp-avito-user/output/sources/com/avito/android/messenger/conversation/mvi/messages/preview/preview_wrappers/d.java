package com.avito.android.messenger.conversation.mvi.messages.preview.preview_wrappers;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: IncomingMessagePreviewWrapper.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l v vVar, boolean z12, boolean z13, @Y61.k C22096n c22096n, @Y61.l A a12, int i12, int i13) {
        int i14;
        v vVar2;
        boolean z14;
        boolean z15;
        B bE2 = a12.E(1968519629);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if (((i14 | 3504) & 46811) == 9362 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            z14 = z12;
            z15 = z13;
        } else {
            if (i15 != 0) {
                vVar = v.f42878y1;
            }
            com.akita.compose.theme.re23.c.a(false, r.c(-1303694126, new b(vVar, c22096n), bE2), bE2, 48, 1);
            vVar2 = vVar;
            z14 = true;
            z15 = true;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(vVar2, z14, z15, c22096n, i12, i13);
        }
    }
}
