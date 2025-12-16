package com.avito.android.bbl.screens.configure.v4.ui.compose.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: BblConfigureV4Title.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_bbl_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@l AttributedText attributedText, @k Y41.l lVar, @l v vVar, @l A a12, int i12) {
        B bE2 = a12.E(1597576425);
        if (attributedText == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new e(attributedText, lVar, vVar, i12);
                return;
            }
            return;
        }
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, C22501m2.a(vVar, "BblConfigureV4TitleTestTag"), R.attr.textH10, null, new f(lVar, attributedText), 0, bE2, 8, 40);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new g(attributedText, lVar, vVar, i12);
        }
    }
}
