package com.avito.android.early_access.adapter.image;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.d;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {
    @InterfaceC22132o
    public static final void a(@k EarlyAccessImageItem earlyAccessImageItem, @l v.a aVar, @l A a12, int i12) {
        B bE2 = a12.E(149132047);
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        d dVar = (d) bE2.o(Q0.f41199h);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(earlyAccessImageItem.f145136c, com.avito.android.lib.util.darkTheme.c.b(context));
        h.a aVar2 = h.f42849c;
        coil.compose.v.b(C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(dVar.M0(156)), kotlin.math.b.b(dVar.M0(75)), 0.0f, 1, 44).c(b.f145139b), null, aVar, null, null, null, bE2, 440, 4088);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(earlyAccessImageItem, aVar, i12);
        }
    }
}
