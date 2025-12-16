package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_btob-business-trip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, @k String str2, @k UniversalImage universalImage, @k String str3, int i12, int i13, @k Y41.a aVar, @l v vVar, @l A a12, int i14) {
        B bE2 = a12.E(-1952299614);
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context));
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.component.scaffold.g.a(vVar, null, r.c(1241342909, new a(str3, aVar), bE2), null, null, null, null, r.c(-1003793931, new e(i13, i12, C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(dVar.M0(i13)), kotlin.math.b.b(dVar.M0(i12)), 0.0f, 1, 44).c(g.f108081b), str, str2), bE2), bE2, ((i14 >> 21) & 14) | 12583296, 122);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(str, str2, universalImage, str3, i12, i13, aVar, vVar, i14);
        }
    }
}
