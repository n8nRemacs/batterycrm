package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.C22501m2;
import com.avito.android.R;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: MessageFromAvito.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l Image image, @Y61.l String str, @Y61.l String str2, @Y61.l T1.c cVar, @Y61.l androidx.compose.ui.v vVar, boolean z12, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar, @Y61.l T1.d.a aVar, @Y61.l Y41.a aVar2, @Y61.l Y41.a aVar3, @Y61.l Y41.p pVar, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13, int i14) {
        String strC;
        int i15;
        androidx.compose.runtime.B bE2 = a12.E(-1235393930);
        boolean z13 = (i14 & 32) != 0 ? false : z12;
        String str6 = (i14 & 64) != 0 ? null : str3;
        if ((i14 & 128) != 0) {
            i15 = i12 & (-29360129);
            strC = u0.i.c(bE2, R.string.messenger_from_avito_message_name);
        } else {
            strC = str4;
            i15 = i12;
        }
        String str7 = (i14 & 256) != 0 ? null : str5;
        com.avito.android.messenger.conversation.mvi.messages.composables.other.icons.k kVar2 = (i14 & 512) != 0 ? null : kVar;
        T1.d.a aVar4 = (i14 & 1024) != 0 ? null : aVar;
        Y41.a aVar5 = (i14 & 2048) != 0 ? null : aVar2;
        Y41.a aVar6 = (i14 & 4096) != 0 ? null : aVar3;
        Y41.p pVar2 = (i14 & 8192) != 0 ? null : pVar;
        int i16 = i15 >> 6;
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.common.m.a(image, str, str2, cVar, C22501m2.a(vVar, "MessageFromAvito"), strC, str7, kVar2, aVar4, aVar6, androidx.compose.runtime.internal.r.c(809783821, new o(z13, str6, cVar, aVar5, pVar2, c22096n), bE2), bE2, (i15 & 112) | 8 | (i15 & 896) | (i15 & 7168) | (458752 & i16) | (3670016 & i16) | (i16 & 29360128));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new p(image, str, str2, cVar, vVar, z13, str6, strC, str7, kVar2, aVar4, aVar5, aVar6, pVar2, c22096n, i12, i13, i14);
        }
    }
}
