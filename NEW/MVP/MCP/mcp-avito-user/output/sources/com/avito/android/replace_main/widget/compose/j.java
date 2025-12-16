package com.avito.android.replace_main.widget.compose;

import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.shape.n;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReplaceMainPageWidgetUI.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_replace-main_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k ReplaceMainItem.ReplaceMain replaceMain, @Y61.k Y41.a aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-649023062);
        v.a aVar2 = v.f42878y1;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.component.banner.h hVarA = com.akita.compose.component.banner.h.a(f66889a, R1.a(0), null, null, null, 16382);
        v vVarA = C22501m2.a(C20588k2.d(aVar2, 1.0f), "replace_main_widget");
        n nVarA = o.a(20);
        com.akita.compose.theme.re23.b.f63987e.getClass();
        com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
        com.akita.compose.component.banner.g.c(hVarA, vVarA, null, nVarA, X2.b.f18131j, 0.0f, null, r.c(-1854877462, new f(replaceMain, aVar), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582912, 100);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(replaceMain, aVar, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k ReplaceMainItem.ShowAvito showAvito, @Y61.k Y41.a aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-72355212);
        v.a aVar2 = v.f42878y1;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.component.banner.h hVarA = com.akita.compose.component.banner.h.a(f66889a, R1.a(0), null, null, null, 16382);
        v vVarA = C22501m2.a(C21086w0.c(C20588k2.d(aVar2, 1.0f), false, null, null, aVar, 7), "replace_main_widget");
        n nVarA = o.a(20);
        com.akita.compose.theme.re23.b.f63987e.getClass();
        com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
        com.akita.compose.component.banner.g.c(hVarA, vVarA, null, nVarA, X2.b.f18131j, 0.0f, null, r.c(1564586420, new h(showAvito), bE2), bE2, com.akita.compose.component.banner.h.f60462o | 12582912, 100);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(showAvito, aVar, aVar2, i12);
        }
    }
}
