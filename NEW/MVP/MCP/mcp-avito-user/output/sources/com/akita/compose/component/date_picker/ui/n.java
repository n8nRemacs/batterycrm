package com.akita.compose.component.date_picker.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: MonthTitle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"date-picker_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k K k12, @Y61.k com.akita.compose.foundation.r rVar, @Y61.k com.akita.compose.component.skeleton.d dVar, @Y61.k F.b bVar, @Y61.l v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(121305016);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(k12) ? 32 : 16) | (bE2.B(rVar) ? 256 : 128) | (bE2.B(dVar) ? 2048 : 1024) | (bE2.B(bVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else if (((Boolean) ((C22082i3) k12.f61178i).getF42167b()).booleanValue()) {
            bE2.C(-509810276);
            long j12 = bVar.f61163c;
            C20632w.a(com.akita.compose.component.skeleton.b.c(C20588k2.t(C20588k2.f(vVar, androidx.compose.ui.unit.l.c(j12)), androidx.compose.ui.unit.l.d(j12)), androidx.compose.foundation.shape.o.a(bVar.f61161a), dVar, true, bE2, 3072 | ((i13 >> 3) & 896), 0), bE2, 0);
            bE2.X(false);
        } else {
            bE2.C(-509431084);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(str, rVar, vVar, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 >> 9) & 896), 984);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(str, k12, rVar, dVar, bVar, vVar, i12);
        }
    }
}
