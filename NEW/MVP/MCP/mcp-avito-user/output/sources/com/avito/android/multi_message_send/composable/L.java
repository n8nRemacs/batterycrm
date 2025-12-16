package com.avito.android.multi_message_send.composable;

import android.content.Context;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiSendErrorItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_multi-message-send_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class L {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar) {
        androidx.compose.runtime.B bE2 = a12.E(-2034886434);
        if ((((bE2.u(lVar) ? 4 : 2) | i12 | (bE2.B(vVar) ? 32 : 16)) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            M.f206485a.getClass();
            Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(M.f206486b, com.avito.android.lib.util.darkTheme.c.b(context));
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(136735865, new I(vVar, lVar, C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(dVar.M0(214)), kotlin.math.b.b(dVar.M0(144)), 0.0f, 0, 60).c(K.f206484b)), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new J(i12, lVar, vVar);
        }
    }
}
