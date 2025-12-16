package com.avito.android.profile_phones.phones_list.phones_list_screen_ui;

import androidx.compose.foundation.a2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: PhonesListScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k PhonesListMviState phonesListMviState, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k Y41.a aVar4, @Y61.k Y41.a aVar5, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar6, @Y61.k Y41.a aVar7, @Y61.k Y41.a aVar8, @Y61.k Y41.a aVar9, @Y61.k Y41.l lVar2, @Y61.l v.a aVar10, @Y61.l A a12, int i12, int i13) {
        int i14;
        v.a aVar11;
        B bE2 = a12.E(1974602147);
        int i15 = (bE2.B(phonesListMviState) ? 4 : 2) | i12;
        if ((i12 & 112) == 0) {
            i15 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i15 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i15 |= bE2.u(aVar3) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i15 |= bE2.u(aVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i15 |= bE2.u(aVar5) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i15 |= bE2.u(lVar) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i15 |= bE2.u(aVar6) ? 8388608 : 4194304;
        }
        if ((234881024 & i12) == 0) {
            i15 |= bE2.u(aVar7) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i15 |= bE2.u(aVar8) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i14 = i13 | (bE2.u(aVar9) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.u(lVar2) ? 32 : 16;
        }
        int i16 = i14 | 384;
        if ((i15 & 1533916891) == 306783378 && (i16 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar11 = aVar10;
        } else {
            v.a aVar12 = v.f42878y1;
            com.akita.compose.theme.re23.c.a(false, r.c(1382894846, new c(aVar12, aVar, phonesListMviState, a2.a(bE2), aVar2, aVar3, aVar4, aVar5, lVar, aVar6, aVar7, aVar8, aVar9, lVar2), bE2), bE2, 48, 1);
            aVar11 = aVar12;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(phonesListMviState, aVar, aVar2, aVar3, aVar4, aVar5, lVar, aVar6, aVar7, aVar8, aVar9, lVar2, aVar11, i12, i13);
        }
    }
}
