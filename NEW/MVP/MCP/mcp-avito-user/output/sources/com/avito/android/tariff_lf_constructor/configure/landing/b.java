package com.avito.android.tariff_lf_constructor.configure.landing;

import Y41.l;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.tariff_lf_constructor.configure.landing.ConstructorLandingFragment;
import com.avito.konveyor.adapter.j;
import jD0.C42238c;
import kD0.C42572a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ConstructorLandingFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class b extends H implements l<C42238c, G0> {
    @Override // Y41.l
    public final G0 invoke(C42238c c42238c) {
        C42238c c42238c2 = c42238c;
        ConstructorLandingFragment constructorLandingFragment = (ConstructorLandingFragment) this.receiver;
        ConstructorLandingFragment.a aVar = ConstructorLandingFragment.f299624s0;
        constructorLandingFragment.getClass();
        if (c42238c2.f405520b) {
            com.avito.android.progress_overlay.l lVar = constructorLandingFragment.f299633p0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else {
            C42572a c42572a = c42238c2.f405521c;
            if (c42572a != null) {
                com.avito.konveyor.adapter.a aVar2 = constructorLandingFragment.f299628k0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.c(new UV0.c(c42572a.f406203a));
                j jVar = constructorLandingFragment.f299629l0;
                if (jVar == null) {
                    jVar = null;
                }
                jVar.notifyDataSetChanged();
                Button button = constructorLandingFragment.f299634q0;
                if (button == null) {
                    button = null;
                }
                com.avito.android.lib.design.button.b.a(button, c42572a.f406204b.getTitle(), false);
                Button button2 = constructorLandingFragment.f299634q0;
                if (button2 == null) {
                    button2 = null;
                }
                button2.setOnClickListener(new i(constructorLandingFragment, 9));
                com.avito.android.progress_overlay.l lVar2 = constructorLandingFragment.f299633p0;
                (lVar2 != null ? lVar2 : null).j();
            } else {
                com.avito.android.progress_overlay.l lVar3 = constructorLandingFragment.f299633p0;
                (lVar3 != null ? lVar3 : null).a(z.l(c42238c2.f405522d));
            }
        }
        return G0.f406611a;
    }
}
