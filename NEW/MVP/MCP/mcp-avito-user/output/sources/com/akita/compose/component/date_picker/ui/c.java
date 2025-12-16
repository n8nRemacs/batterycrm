package com.akita.compose.component.date_picker.ui;

import androidx.compose.foundation.lazy.A0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.S;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DatePickerContent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"date-picker_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k K k12, @Y61.k F f12, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.l lVar3, @Y61.l v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-351259281);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(k12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(f12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(lVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar2) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(lVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i13 & 374491) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            P2.b bVar = (P2.b) ((C22082i3) k12.f61184o).getF42167b();
            int i14 = bVar.f12787b;
            P2.b bVar2 = k12.f61180k;
            S.a(com.akita.compose.foundation.n.f63625a.b(com.akita.compose.foundation.n.a(f12.f61127a.f61158n, bE2)), androidx.compose.runtime.internal.r.c(-174208849, new a(vVar, f12, k12, A0.a((bVar.f12788c - bVar2.f12788c) + ((i14 - bVar2.f12787b) * 12), 0, 2, bE2), lVar2, lVar3, lVar), bE2), bE2, 56);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(k12, f12, lVar, lVar2, lVar3, vVar, i12);
        }
    }
}
